package javaPractice.ch_03;

import java.util.Scanner;

public class OperatorTest04 {

	public static void main(String[] args) {
		/* ����, 
		 * 1. ����ڷκ��� �� ���� ������ �Է� �޾Ƽ�
		 * 2. ������ ��, ������ ��, ������ ��, ������ ���, ū ��, ���� ���� ����Ͽ� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 3. ū ���� ���� ���� ���� ���� ���� ������(=���� ������)�� ����Ͻÿ�.
		*/
		
		int x, y;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�: ");
		x = sc.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�: ");
		y = sc.nextInt();
		
		System.out.println("�� ���� ��: " + (int)(x + y) );
		System.out.println("�� ���� ��: " +(int)( x - y));
		System.out.println("�� ���� ��: " + (int)(x * y));
		System.out.println("�� ���� ���:" + (x + y)/2);
		System.out.println("���� ����: " +( x<y ? x:y) );
		System.out.println("ū ����: " + (x > y ? x:y));
	}

}
