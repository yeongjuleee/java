package javaPractice.ch_17.db_school_yoon;

import java.util.Scanner;

public class StudentView {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("학생 관리 프로그램을 시작합니다");
		StudentManage manage = new StudentManage();
		
		
		
		while(true) {
			System.out.println("메뉴를 선택하세요 >> 1. 학생 추가 / 2. 학생 삭제 / 3.수강 신청 ");
			System.out.println("\t\t 4. 성적 입력 / 5. 정보 조회 / 6.수강 과목 관리 / 7.프로그램 종료");
			int menu = input.nextInt();
			
			
			
			switch(menu) {
			case 1:
				System.out.println("학생 추가 및 수정 메뉴");
				manage.addStudent();
				break;
			case 2:
				System.out.println("학생 삭제 메뉴");
				manage.removeStudent();
				break;
			case 3:
				System.out.println("수강 신청 메뉴");
				manage.addClass();
				break;
			case 4:
				System.out.println("성적 입력 메뉴");
				//manage.setScore();
				break;
			case 5:
				System.out.println("정보 조회 메뉴");
				manage.informStudent();
				break;
			case 6:
				System.out.println("수강 과목 관리");
				manage.subjectManage();
				break;
			case 7:
				System.out.println("프로그램 종료");
				input.close();
				return;
			default:
				System.out.println("없는 메뉴입니다.");
				
			}
		}
	}

}
