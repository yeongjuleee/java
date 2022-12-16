package javaPractice.ch_17.db_library2;

import java.util.ArrayList;
import java.util.Scanner;

import javaPractice.ch_15.design_patton.mvc.account.Account;

public class LibraryManager {
	// 필드(속성) 
	private ArrayList<Book> list;
	private Scanner stdIn;
	private BookDAO bookDAO;
	
	// 생성자
	public LibraryManager() {
		bookDAO = new BookDAO();
		list = new ArrayList<Book>();
		stdIn = new Scanner(System.in);
	}
	
	

	
	// 메소드
	
	// DB 종료
	public void disConnect() {
		bookDAO.disConnect();
	}
	
	
	// 0. 책 조회
	private Book findBookTraverse(int code) {
		// 해당 코드 찾기
		for(Book book : list) {
			if(book.getCode() == code) {
				return book;
			}
		}
		return null;
	}
	
	// 0. 중복 코드 찾기
	private boolean isBook(int code) {
		return (findBookTraverse(code) == null) ? false : true;
	}
	
	// 0. 책 검색 
	public void bookInfo() {
		System.out.println(list.toString() + "\t");
	}
	
	// 0. 책 존재 X
	public void bookErr() {
		System.out.println("해당하는 책이 존재하지 않습니다.");
	}
	
	// 1. 책 등록
	public void bkRegister() {
		Book book = new Book();
		
		System.out.print("책 코드: ");
		book.setCode(stdIn.nextInt());
		
		System.out.print("제목: ");
		book.setName(stdIn.next());
		
		System.out.print("작가: ");
		book.setWriter(stdIn.next());
		
		System.out.print("재고: ");
		book.setCount(stdIn.nextInt());
		
		if(bookDAO.insertBook(book)) {
			System.out.println("책이 등록되었습니다.");
			System.out.println(list.toString() + "\t");
		}
		else {
			System.out.println("책 등록에 실패했습니다.");
		}
		
	}
	
	// 2. 책 검색
	public void srchB() {
		System.out.println("검색할 책 제목을 입력해주세요.");
		System.out.print("책 제목: ");
		String name = stdIn.next();
		
		
		
		// 해당 책 찾기
		ArrayList<Book> searchlist = new ArrayList<>();
		searchlist = bookDAO.searchBook(name);
		
		if(searchlist.size() < 1) {
			System.out.println("검색된 책이 없습니다.");
		}
		else {
			System.out.println("검색된 책의 정보입니다.");
			for(Book book : searchlist) {
					System.out.println(book);	
			}
		}
		
	}
	
	// 3. 책 대여
	public void bkRnt() {
		System.out.print("대여할 책 코드: ");
		int code = stdIn.nextInt();
		
		System.out.print("대여할 책의 권수: ");
		int count = stdIn.nextInt();
		
		// 해당 책 찾기
		if(bookDAO.isBook(code)) {
			Book book = bookDAO.selectOne(code);
			if(book.getCount() < count) {
				System.out.println("재고가 없습니다.");
			}
			else {
				bookDAO.updateCount(code, count, false);
				System.out.println("대여가 되었습니다.");
			}
			return;
		}
		else {
			System.out.println("해당하는 책 코드가 존재하지 않습니다.");
		}
	}
	
	// 4. 책 반납
	public void returnBook() {
		System.out.print("반납할 책 코드: ");
		int code = stdIn.nextInt();
		
		System.out.print("반납할 책 수량: ");
		int count = stdIn.nextInt();
		
		// 해당 책 찾기
		if(bookDAO.isBook(code)) {
			bookDAO.updateCount(code, count, true);
		}
		else {
			System.out.println("해당 책 코드가 존재하지 않습니다.");
		}
	}
	
	// 5. 책 전체 출력
	public void display() {
		System.out.println("등록된 책의 정보는 아래와 같습니다.");
		ArrayList<Book> list = bookDAO.selectAll();
		
		for(Book book : list) {
			System.out.println(book);
		}
		
	}
}
