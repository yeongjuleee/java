package javaPractice.ch_17.db_school;

import java.util.Scanner;

public class SchoolManagerView {
	public static void printMenu() {
		System.out.println("====================Menu====================");
		System.out.println("1. �л� �߰�");
		System.out.println("2. �л� ����");
		System.out.println("3. ���� ��û");
		System.out.println("4. ���� �Է�");
		System.out.println("5. ���� ��ȸ");
		System.out.println("6. �������� ����");
		System.out.println("7. ���α׷� ����");
		System.out.println();
	}
	

	public static void main(String[] args) {
		System.out.println("�л� ���� ���α׷��� �����մϴ�.");
		StudentManage std = new StudentManage(); 
		StudentManage manager = new StudentManage();
		Scanner input = new Scanner(System.in);
		
		
		
		while(true) {
			printMenu();
			System.out.print("���� >> ");
			int menu = input.nextInt();
			
			switch(menu) {
				case 1 : // �л� �߰�
					System.out.println("�л� �߰� �� ���� �޴� �Դϴ�.");
					manager.addStudent();
					break;
					
				case 2 : 
					System.out.println("�л� ���� �޴� �Դϴ�.");
					manager.removeStudent();
					break;
					
				case 3 : 
					System.out.println("���� ��û �޴� �Դϴ�.");
					manager.addClass();
					break;
					
				case 4 : 
					System.out.println("���� �Է� �޴� �Դϴ�.");
					break;
					
				case 5 :
					System.out.println("���� ��ȸ �޴� �Դϴ�.");
					manager.infoStudent();
					break;
					
				case 6 : 
					System.out.println("�������� ���� �޴� �Դϴ�.");
					manager.subjectInfo();
					break;
					
				case 7 :
					manager.disConnect();
					System.out.println("���α׷��� �����մϴ�.");
					input.close();
					return;
					
				default :
					System.out.println("���� �޴��� �����Ͽ����ϴ�.");
			}
		}

	}

}
