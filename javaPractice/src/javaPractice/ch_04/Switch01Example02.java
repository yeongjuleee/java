package javaPractice.ch_04;

import java.util.Scanner;

public class Switch01Example02 {

	public static void main(String[] args) {
		// ����, IfElseIf01Example04�� Switch������ 
		// ����ڿ��� ������ �Է¹޾� �ش� ������ ������ ��µǴ� �ڵ带 �ϼ��ϼ���.
		// �Է��� 0 ~ 100 ���� �Է��� �˴ϴ�. 
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int grade = input.nextInt() / 10;
		
		switch(grade) {
		case 9: case 10:
			System.out.print("A�Դϴ�.");
			break;
		
		case 8:
			System.out.print("B�Դϴ�.");
			break;
		
		case 7:
			System.out.print("C�Դϴ�.");
			break;
			
		case 6:
			System.out.print("D�Դϴ�.");
			break;
			
		default:
			System.out.print("F�Դϴ�.");
		}
		input.close();
	}

}
