package javaPractice.ch_04;

import java.util.Scanner;

public class IfElseIf01Example02 {

	public static void main(String[] args) {
		// If-else-if��
		// 1. Scanner Ŭ���� �̿��ϱ�
		// 2. �� ������ �̿��Ͽ��� ���ǽ� ¥��
		// System.out.println("~���� ~�Դϴ�."); �� �������� �ϱ�
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("������ ǥ���մϴ�. \n�� �� �Դϱ�? : ");
		int month = stdIn.nextInt();
		
		if (month >=3 && month <= 5) {
			System.out.println( month +"���� ���Դϴ�.");
		}
		else if (month >=6 && month <= 8) {
			System.out.println( month +"���� �����Դϴ�.");
		}
		else if (month >=9 && month <=11) {
			System.out.println( month +"���� �����Դϴ�.");
		}
		else if (month == 12 || month == 1 || month == 2) {
			System.out.println( month +"���� �ܿ��Դϴ�.");
		}
		else {
			System.out.println("�߸��� �Է� ���Դϴ�.");
		}
		stdIn.close();
	}

}
