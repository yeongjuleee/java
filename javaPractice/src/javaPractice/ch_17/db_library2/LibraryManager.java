package javaPractice.ch_17.db_library2;

import java.util.ArrayList;
import java.util.Scanner;

import javaPractice.ch_15.design_patton.mvc.account.Account;

public class LibraryManager {
	// �ʵ�(�Ӽ�) 
	private ArrayList<Book> list;
	private Scanner stdIn;
	private BookDAO bookDAO;
	
	// ������
	public LibraryManager() {
		bookDAO = new BookDAO();
		list = new ArrayList<Book>();
		stdIn = new Scanner(System.in);
	}
	
	

	
	// �޼ҵ�
	
	// DB ����
	public void disConnect() {
		bookDAO.disConnect();
	}
	
	
	// 0. å ��ȸ
	private Book findBookTraverse(int code) {
		// �ش� �ڵ� ã��
		for(Book book : list) {
			if(book.getCode() == code) {
				return book;
			}
		}
		return null;
	}
	
	// 0. �ߺ� �ڵ� ã��
	private boolean isBook(int code) {
		return (findBookTraverse(code) == null) ? false : true;
	}
	
	// 0. å �˻� 
	public void bookInfo() {
		System.out.println(list.toString() + "\t");
	}
	
	// 0. å ���� X
	public void bookErr() {
		System.out.println("�ش��ϴ� å�� �������� �ʽ��ϴ�.");
	}
	
	// 1. å ���
	public void bkRegister() {
		Book book = new Book();
		
		System.out.print("å �ڵ�: ");
		book.setCode(stdIn.nextInt());
		
		System.out.print("����: ");
		book.setName(stdIn.next());
		
		System.out.print("�۰�: ");
		book.setWriter(stdIn.next());
		
		System.out.print("���: ");
		book.setCount(stdIn.nextInt());
		
		if(bookDAO.insertBook(book)) {
			System.out.println("å�� ��ϵǾ����ϴ�.");
			System.out.println(list.toString() + "\t");
		}
		else {
			System.out.println("å ��Ͽ� �����߽��ϴ�.");
		}
		
	}
	
	// 2. å �˻�
	public void srchB() {
		System.out.println("�˻��� å ������ �Է����ּ���.");
		System.out.print("å ����: ");
		String name = stdIn.next();
		
		
		
		// �ش� å ã��
		ArrayList<Book> searchlist = new ArrayList<>();
		searchlist = bookDAO.searchBook(name);
		
		if(searchlist.size() < 1) {
			System.out.println("�˻��� å�� �����ϴ�.");
		}
		else {
			System.out.println("�˻��� å�� �����Դϴ�.");
			for(Book book : searchlist) {
					System.out.println(book);	
			}
		}
		
	}
	
	// 3. å �뿩
	public void bkRnt() {
		System.out.print("�뿩�� å �ڵ�: ");
		int code = stdIn.nextInt();
		
		System.out.print("�뿩�� å�� �Ǽ�: ");
		int count = stdIn.nextInt();
		
		// �ش� å ã��
		if(bookDAO.isBook(code)) {
			Book book = bookDAO.selectOne(code);
			if(book.getCount() < count) {
				System.out.println("��� �����ϴ�.");
			}
			else {
				bookDAO.updateCount(code, count, false);
				System.out.println("�뿩�� �Ǿ����ϴ�.");
			}
			return;
		}
		else {
			System.out.println("�ش��ϴ� å �ڵ尡 �������� �ʽ��ϴ�.");
		}
	}
	
	// 4. å �ݳ�
	public void returnBook() {
		System.out.print("�ݳ��� å �ڵ�: ");
		int code = stdIn.nextInt();
		
		System.out.print("�ݳ��� å ����: ");
		int count = stdIn.nextInt();
		
		// �ش� å ã��
		if(bookDAO.isBook(code)) {
			bookDAO.updateCount(code, count, true);
		}
		else {
			System.out.println("�ش� å �ڵ尡 �������� �ʽ��ϴ�.");
		}
	}
	
	// 5. å ��ü ���
	public void display() {
		System.out.println("��ϵ� å�� ������ �Ʒ��� �����ϴ�.");
		ArrayList<Book> list = bookDAO.selectAll();
		
		for(Book book : list) {
			System.out.println(book);
		}
		
	}
}
