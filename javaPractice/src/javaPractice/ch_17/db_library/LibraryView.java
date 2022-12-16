package javaPractice.ch_17.db_library;

import java.util.Scanner;

public class LibraryView {
	
	public static void printMenu() {
		System.out.println("====================Menu====================");
		System.out.println("1. å ���");
		System.out.println("2. å �˻�");
		System.out.println("3. å �뿩");
		System.out.println("4. å �ݳ�");
		System.out.println("5. å ��ü ���");
		System.out.println("6. ���α׷� ����");
		System.out.println();
	}
	
	public static void main(String[] args) {
		LibraryManager manager = new LibraryManager();
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.print("���� >> ");
			int choice = stdIn.nextInt();
			
			switch(choice) {
				case 1: // å ���
					manager.bkRegister();
					break;
					
				case 2:	// å �˻�
					manager.srchB();
					break;
					
				case 3:	// å �뿩
					manager.bkRnt();
					break;
					
				case 4:	// å �ݳ�
					manager.returnBook();
					break;
					
				case 5:
					manager.display();
					break;
					
				case 6:
					System.out.println("�����մϴ�.");
					stdIn.close();
					return;
			}
		}

	}

}
