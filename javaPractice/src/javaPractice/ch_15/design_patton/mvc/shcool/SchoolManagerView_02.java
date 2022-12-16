package javaPractice.ch_15.design_patton.mvc.shcool;

import java.util.Scanner;

public class SchoolManagerView_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�л� ���� ���α׷��� �����մϴ�.");
		
		StudentManage_02 std = new StudentManage_02(); 
		
		
		while(true) {
			System.out.println("�޴��� �����ϼ��� >>> 1. �л� �߰� / 2. �л� ���� / 3. ������û / " +
		"4. ���� �Է� / 5. ���� ��ȸ / 6. ���α׷� ����");
			
			int menu = input.nextInt();
			switch(menu) {
				case 1 : 
					System.out.println("�л� �߰� �� ���� �޴� �Դϴ�.");
					std.addStudent();
					break;
					
				case 2 : 
					System.out.println("�л� ���� �޴� �Դϴ�.");
					std.removeStudent();
					break;
					
				case 3 : 
					System.out.println("���� ��û �޴� �Դϴ�.");
					std.addClass();
					break;
					
				case 4 : 
					System.out.println("���� �Է� �޴� �Դϴ�.");
					std.setScore();
					break;
					
				case 5 :
					System.out.println("���� ��ȸ �޴� �Դϴ�.");
					std.informStudent();
					break;
					
				case 6 : 
					System.out.println("���α׷��� ���� �մϴ�.");
					return;
					
				default :
					System.out.println("���� �޴��� �����Ͽ����ϴ�.");
			}
		}

	}

}
