package javaPractice.ch_06;

import java.util.Scanner;

public class Return01 {
	// return �� ���
	// 1. ���� ��ȯ
	// 2. �Լ��� ���� ( �ݺ����� break �� �����)
	
	static int max(int a, int b) { // a, b �ִ��� ��ȯ
		// return�� ������ ���͵� ��
		System.out.println("�Լ� ����");
		if (a > b)
			return a;
		else 
			return b;
		// System.out.println("�Լ� ����);
		
	}

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a: ");
		int a = stdIn.nextInt();
		System.out.print("���� b: ");
		int b = stdIn.nextInt();
		
		System.out.println("�ִ��� " + max(a, b) + "�Դϴ�.");
		// �޼ҵ� max�� ����ϸ� max�� �����ص� ���� ����ϰ� �Լ� ����... 
	}

}
