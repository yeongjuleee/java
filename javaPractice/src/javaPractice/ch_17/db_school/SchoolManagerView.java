package javaPractice.ch_17.db_school;

import java.util.Scanner;

public class SchoolManagerView {
	public static void printMenu() {
		System.out.println("====================Menu====================");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 삭제");
		System.out.println("3. 수강 신청");
		System.out.println("4. 성적 입력");
		System.out.println("5. 정보 조회");
		System.out.println("6. 수강과목 관리");
		System.out.println("7. 프로그램 종료");
		System.out.println();
	}
	

	public static void main(String[] args) {
		System.out.println("학생 관리 프로그램을 시작합니다.");
		StudentManage std = new StudentManage(); 
		StudentManage manager = new StudentManage();
		Scanner input = new Scanner(System.in);
		
		
		
		while(true) {
			printMenu();
			System.out.print("선택 >> ");
			int menu = input.nextInt();
			
			switch(menu) {
				case 1 : // 학생 추가
					System.out.println("학생 추가 및 수정 메뉴 입니다.");
					manager.addStudent();
					break;
					
				case 2 : 
					System.out.println("학생 삭제 메뉴 입니다.");
					manager.removeStudent();
					break;
					
				case 3 : 
					System.out.println("수강 신청 메뉴 입니다.");
					manager.addClass();
					break;
					
				case 4 : 
					System.out.println("성적 입력 메뉴 입니다.");
					break;
					
				case 5 :
					System.out.println("정보 조회 메뉴 입니다.");
					manager.infoStudent();
					break;
					
				case 6 : 
					System.out.println("수강과목 관리 메뉴 입니다.");
					manager.subjectInfo();
					break;
					
				case 7 :
					manager.disConnect();
					System.out.println("프로그램을 종료합니다.");
					input.close();
					return;
					
				default :
					System.out.println("없는 메뉴를 선택하였습니다.");
			}
		}

	}

}
