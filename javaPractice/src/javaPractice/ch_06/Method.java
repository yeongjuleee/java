package javaPractice.ch_06;

import java.util.Scanner;

public class Method {
	
	/* ���� �����ڸ� ������ �������� �ʴ´ٸ� ���� �����ڰ� ���� ����,
	 * �޼ҵ�� default ���� �����ڰ� �Ǿ� �ش� ��Ű�� �������� ������ ������ */
	
	static int max(int a, int b, int c) { // a, b, c �ִ��� ��ȯ
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
		
	}

	public static void main(String[] args) {
		// 
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = stdIn.nextInt();
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		System.out.print("���� c : ");
		int c = stdIn.nextInt();
		
		System.out.println("�ִ��� " + max(a, b, c) + "�Դϴ�.");
	}

}
