package javaPractice.ch_03;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		// Scanner Ŭ���� �� �̿��Ͽ� �ֿܼ��� �Է� �ޱ�. (ȥ���� ���� 95p)
		
		Scanner sc = new Scanner (System.in);
		
		int x, y, sum;
		
		System.out.print("ù ��° ���ڸ� �Է��Ͻÿ�: "); 
		x= sc.nextInt(); //���� �Է�
		
		System.out.print("�� ��° ���ڸ� �Է��Ͻÿ�: ");
		
		y = sc.nextInt(); // ���� �Է�
		
		sum = x + y;
		System.out.println(sum); // ���� ����Ѵ�.
	}

}
