package javaPractice.ch_04;

import java.util.Scanner;

public class Switch01Example01 {

	public static void main(String[] args) {
		// Switch���� �̿��Ͽ� �ش� ���� ���ϱ��� �ִ��� ���ϱ�
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է��� �ּ��� >>> ");
		int month = scanner.nextInt();
		int day;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
			
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
			
		case 2:
			day = 28;
			break;
			
		default:
			day = 0;
			System.out.println("�������� �ʴ� �� �Դϴ�.");
			
		}
		
		System.out.println(month + "����" + day + "���� �ֽ��ϴ�." );
		scanner.close();
	}

}
