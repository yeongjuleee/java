package javaPractice.ch_17.db_school_yoon;

import java.util.Scanner;

public class StudentView {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("�л� ���� ���α׷��� �����մϴ�");
		StudentManage manage = new StudentManage();
		
		
		
		while(true) {
			System.out.println("�޴��� �����ϼ��� >> 1. �л� �߰� / 2. �л� ���� / 3.���� ��û ");
			System.out.println("\t\t 4. ���� �Է� / 5. ���� ��ȸ / 6.���� ���� ���� / 7.���α׷� ����");
			int menu = input.nextInt();
			
			
			
			switch(menu) {
			case 1:
				System.out.println("�л� �߰� �� ���� �޴�");
				manage.addStudent();
				break;
			case 2:
				System.out.println("�л� ���� �޴�");
				manage.removeStudent();
				break;
			case 3:
				System.out.println("���� ��û �޴�");
				manage.addClass();
				break;
			case 4:
				System.out.println("���� �Է� �޴�");
				//manage.setScore();
				break;
			case 5:
				System.out.println("���� ��ȸ �޴�");
				manage.informStudent();
				break;
			case 6:
				System.out.println("���� ���� ����");
				manage.subjectManage();
				break;
			case 7:
				System.out.println("���α׷� ����");
				input.close();
				return;
			default:
				System.out.println("���� �޴��Դϴ�.");
				
			}
		}
	}

}
