package javaPractice.ch_06;

import java.util.Scanner;

public class MethodTest03 {

	// ���Ϻ��� ������ �����ﰢ���� ǥ���ϼ���
	// ���� ��µǴ� �κ��� putStars() �޼ҵ带 �����ؼ������ϼ���
	// �� ��: 4
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���Ϻ��� ������ �����ﰢ���� ǥ���մϴ�");
		System.out.print("�� ��: ");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			//putStars()�޼ҵ� ȣ��
			putStars(i);
			System.out.println();
		}

	}
	
	public static void putStars(int n) {
		//������ �ʿ��� ����~ * ������ ������ 
		while(n-- > 0) {
			System.out.print('*');
		}
	}

}
