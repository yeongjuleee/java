package javaPractice.ch_06;

import java.util.Scanner;

public class Method06 {
	
	// return ���� ���� �޼ҵ� 
	// ���Ϻ��� ������ ���ﰢ���� ǥ�� 
	
	static void putStars(int n) { // void �޼ҵ� : return �� X 
		// ���� '*' �� n�� ���� ǥ��
		
		while (n-- > 0)
			System.out.print('*');
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���Ϻ��� ������ �����ﰢ���� ǥ���մϴ�.");
		System.out.print("�� ��: ");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println( );
		}
		

	}

}
