package javaPractice.ch_04;

import java.util.Scanner;

public class If01Example02 {

	public static void main(String[] args) {
		// If���� �̿��Ͽ� �� ������ �ִ밪 ���ϱ�
		// Scanner Ŭ������ �� ������ �� �ޱ�
		
		Scanner stdIn = new Scanner (System.in);

		System.out.print("���� a: ");
		int a = stdIn.nextInt();
		
		System.out.print("���� b: ");
		int b = stdIn.nextInt();
		
		System.out.print("���� c: ");
		int c = stdIn.nextInt();
		
		// if���� ���๮�� �Ѱ��� ��� �߰�ȣ�� ������ �� ����.
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		
		// ����Ŭ��(;) ���� ����! ���α׷��� �� �۵��ϴµ�(=���α׷��� ���) ������ �� ���� ���.
		//if (b > max);
		//	max = b;
		// �� �Ǹ� b > max �� ; => ���� �� ����ǰ� max �� b ���� �����ع���. 	
		
		System.out.print("�ִ밪�� "+ max +" �Դϴ�.");
	}

}
