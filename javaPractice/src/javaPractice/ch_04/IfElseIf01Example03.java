package javaPractice.ch_04;

import java.util.Scanner;

public class IfElseIf01Example03 {

	public static void main(String[] args) {
		// ����, ���ǹ� If�� Ȱ���Ͽ�
		// ����ڿ��� �Է¹��� ������ �������,
		// 0����, �������� �˷��ִ� �ڵ带 �ϼ��Ͻÿ�.

		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int num = stdIn.nextInt();
		
		if (num > 0) {
			System.out.print("����Դϴ�.");
		}
		else if (num < 0) {
			System.out.print("�����Դϴ�.");
		}
		else {
			System.out.print("0 �Դϴ�.\n�ٸ� ���� �Է��� �ּ���.");
		}		
		
	}

}
