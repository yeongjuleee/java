package javaPractice.ch_04;

import java.util.Scanner;

public class IfElseIf01Example01 {

	public static void main(String[] args) {
		// If-else-if ��
		// Scanner�� �̿��Ͽ� ���� �Է¹޾� �����ϱ�
				
		Scanner input = new Scanner (System.in);
		
		System.out.println("���̸� �Է��ϼ��� >>> ");
		int age;
		
		// 1. ������ ����
		age = input.nextInt();
		
		// 2. ���ڿ��� �Է��� ���� �� ����ȭ
		//String tmp;
		//tmp = input.nextLine();
		//age = Integer.parseInt(tmp);
		
		//���ǹ� ����
		if (age < 9) { // 0~8
			System.out.println("�����Դϴ�.");
			System.out.println("���� ����� ����˴ϴ�.");
		}
		else if(age < 14) { // 9~13
			System.out.println("����Դϴ�.");
			System.out.println("��� ����� ����˴ϴ�.");
		}
		else if(age < 20) { // 14~19
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("û�ҳ� ����� ����˴ϴ�.");
		}
		else { // 20~
			System.out.println("�����Դϴ�.");
			System.out.println("���� ����� ����˴ϴ�.");
		}
		
		System.out.println("������ ������ �ּ���.");

	}

}
