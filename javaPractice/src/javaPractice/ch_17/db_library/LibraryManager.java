package javaPractice.ch_17.db_library;

import java.util.ArrayList;
import java.util.Scanner;

import javaPractice.ch_15.design_patton.mvc.account.Account;

public class LibraryManager {
	// 필드(속성) 
	private ArrayList<Book> list;
	private Scanner stdIn;
	
	// 생성자
	public LibraryManager() {
		list = new ArrayList<Book>();
		stdIn = new Scanner(System.in);
	}

	
	// 메소드
	
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
		
		list.add(book);
		
		System.out.println("책 등록이 완료되었습니다.");
		System.out.println(list.toString() + "\t");
	}
	
	// 2. 책 검색
	public void srchB() {
		System.out.println("검색할 책 제목을 입력해주세요.");
		System.out.print("책 제목: ");
		String title = stdIn.next();
		
		// 해당 책 찾기
		ArrayList<Book> searchlist = new ArrayList<>();
		for(Book book : list) {
			if(book.getName().contains(title)) {
				// contains : 문자열에서 포함하는 단어가 있으면 true, 없으면 false
				searchlist.add(book);
			}
		}
		if (searchlist.size() < 1) {
			System.out.println("검색된 책이 없습니다.");
		}
		else {
			System.out.println("검색한 책의 정보는 아래와 같습니다.");
			for(Book book : searchlist) {
				System.out.println(book);
			}
		}
		
	}
	
	// 3. 책 대여
	public void bkRnt() {
		System.out.print("대여할 책 코드: ");
		int code = stdIn.nextInt();
		
		// 해당 책 찾기
		for(Book book : list) {
			if(book.getCode() == code) { // 동일한 책이 존재하면,
				if(book.getCount() == 0) {
					System.out.println("재고가 없습니다.");
				}
				else {
					book.setCount(book.getCount() - 1);
					System.out.println("대출이 완료 되었습니다.");
				}
				return;
			}
		}
		bookErr();
	}
	
	// 4. 책 반납
	public void returnBook() {
		System.out.print("반납할 책 코드: ");
		int code = stdIn.nextInt();
		
		// 해당 책 찾기
		for(Book book : list) {
			if(book.getCode() == code) {
				book.setCount(book.getCount() + 1);
				System.out.println("반납이 완료 되었습니다.");
				return;
			}
		}
		bookErr();
	}
	
	// 5. 책 전체 출력
	public void display() {
		System.out.println("등록된 책의 정보는 아래와 같습니다.");
		for(Book book : list) {
			System.out.println(book);
		}
		
	}
}
