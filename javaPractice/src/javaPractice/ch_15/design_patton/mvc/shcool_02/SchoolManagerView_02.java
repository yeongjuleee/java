package javaPractice.ch_15.design_patton.mvc.shcool_02;

import java.util.Scanner;

public class SchoolManagerView_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("학생 관리 프로그램을 시작합니다.");
		
		StudentManage_02 std = new StudentManage_02(); 
		
		
		while(true) {
			System.out.println("메뉴를 선택하세요 >>> 1. 학생 추가 / 2. 학생 삭제 / 3. 수강신청 / " +
		"4. 성적 입력 / 5. 정보 조회 / 6. 프로그램 종료");
			
			int menu = input.nextInt();
			switch(menu) {
				case 1 : 
					System.out.println("학생 추가 및 수정 메뉴 입니다.");
					std.addStudent();
					break;
					
				case 2 : 
					System.out.println("학생 삭제 메뉴 입니다.");
					std.removeStudent();
					break;
					
				case 3 : 
					System.out.println("수강 신청 메뉴 입니다.");
					std.addClass();
					break;
					
				case 4 : 
					System.out.println("성적 입력 메뉴 입니다.");
					std.setScore();
					break;
					
				case 5 :
					System.out.println("정보 조회 메뉴 입니다.");
					std.informStudent();
					break;
					
				case 6 : 
					System.out.println("프로그램을 종료 합니다.");
					return;
					
				default :
					System.out.println("없는 메뉴를 선택하였습니다.");
			}
		}

	}

}
