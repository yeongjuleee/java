package javaPractice.ch_17.db_library;

import java.util.Scanner;

public class LibraryView {
	
	public static void printMenu() {
		System.out.println("====================Menu====================");
		System.out.println("1. 책 등록");
		System.out.println("2. 책 검색");
		System.out.println("3. 책 대여");
		System.out.println("4. 책 반납");
		System.out.println("5. 책 전체 출력");
		System.out.println("6. 프로그램 종료");
		System.out.println();
	}
	
	public static void main(String[] args) {
		LibraryManager manager = new LibraryManager();
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.print("선택 >> ");
			int choice = stdIn.nextInt();
			
			switch(choice) {
				case 1: // 책 등록
					manager.bkRegister();
					break;
					
				case 2:	// 책 검색
					manager.srchB();
					break;
					
				case 3:	// 책 대여
					manager.bkRnt();
					break;
					
				case 4:	// 책 반납
					manager.returnBook();
					break;
					
				case 5:
					manager.display();
					break;
					
				case 6:
					System.out.println("종료합니다.");
					stdIn.close();
					return;
			}
		}

	}

}
