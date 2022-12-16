package javaPractice.ch_17.db_library;

import java.util.ArrayList;
import java.util.Scanner;

import javaPractice.ch_15.design_patton.mvc.account.Account;

public class LibraryManager {
	// �ʵ�(�Ӽ�) 
	private ArrayList<Book> list;
	private Scanner stdIn;
	
	// ������
	public LibraryManager() {
		list = new ArrayList<Book>();
		stdIn = new Scanner(System.in);
	}

	
	// �޼ҵ�
	
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
		
		list.add(book);
		
		System.out.println("å ����� �Ϸ�Ǿ����ϴ�.");
		System.out.println(list.toString() + "\t");
	}
	
	// 2. å �˻�
	public void srchB() {
		System.out.println("�˻��� å ������ �Է����ּ���.");
		System.out.print("å ����: ");
		String title = stdIn.next();
		
		// �ش� å ã��
		ArrayList<Book> searchlist = new ArrayList<>();
		for(Book book : list) {
			if(book.getName().contains(title)) {
				// contains : ���ڿ����� �����ϴ� �ܾ ������ true, ������ false
				searchlist.add(book);
			}
		}
		if (searchlist.size() < 1) {
			System.out.println("�˻��� å�� �����ϴ�.");
		}
		else {
			System.out.println("�˻��� å�� ������ �Ʒ��� �����ϴ�.");
			for(Book book : searchlist) {
				System.out.println(book);
			}
		}
		
	}
	
	// 3. å �뿩
	public void bkRnt() {
		System.out.print("�뿩�� å �ڵ�: ");
		int code = stdIn.nextInt();
		
		// �ش� å ã��
		for(Book book : list) {
			if(book.getCode() == code) { // ������ å�� �����ϸ�,
				if(book.getCount() == 0) {
					System.out.println("��� �����ϴ�.");
				}
				else {
					book.setCount(book.getCount() - 1);
					System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
				}
				return;
			}
		}
		bookErr();
	}
	
	// 4. å �ݳ�
	public void returnBook() {
		System.out.print("�ݳ��� å �ڵ�: ");
		int code = stdIn.nextInt();
		
		// �ش� å ã��
		for(Book book : list) {
			if(book.getCode() == code) {
				book.setCount(book.getCount() + 1);
				System.out.println("�ݳ��� �Ϸ� �Ǿ����ϴ�.");
				return;
			}
		}
		bookErr();
	}
	
	// 5. å ��ü ���
	public void display() {
		System.out.println("��ϵ� å�� ������ �Ʒ��� �����ϴ�.");
		for(Book book : list) {
			System.out.println(book);
		}
		
	}
}
