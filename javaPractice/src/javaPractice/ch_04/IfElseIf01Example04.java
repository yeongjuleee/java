package javaPractice.ch_04;

import java.util.Scanner;

public class IfElseIf01Example04 {

	public static void main(String[] args) {
		// ����, If���� Ȱ���Ͽ�
		// ����ڿ��� ������ �Է¹޾� �ش� ������ ������ ��µǴ� �ڵ带 �ϼ��ϼ���.
		// �Է��� 0 ~ 100 ���� �Է��� �˴ϴ�. 
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int grade = input.nextInt();
		
		if (grade >= 90) { // 90 ~ 100
			System.out.println(grade +"�� �Դϴ�.");
			System.out.print("A �Դϴ�.");
		}
		else if (grade >= 80) { // 80 ~ 89
			System.out.println(grade +"�� �Դϴ�.");
			System.out.print("B �Դϴ�.");
		}
		else if (grade >=70) { // 70 ~ 79
			System.out.println(grade +"�� �Դϴ�.");
			System.out.print("C �Դϴ�.");
		}
		else if (grade >=60) { // 60 ~ 69
			System.out.println(grade +"�� �Դϴ�.");
			System.out.print("D �Դϴ�.");
		}
		else { // 0 ~ 59
			System.out.println(grade +"�� �Դϴ�.");
			System.out.print("F �Դϴ�. \n�й��ϼ���.");
		}
	}

}
