package javaPractice.ch_06;

import java.util.Scanner;

public class MethodTest04 {

	// ���Ϻ��� ������ �����ﰢ���� ǥ���ϼ���
	// ���� ��µǴ� �κ��� putStars() �޼ҵ带 �����ؼ������ϼ���
	// �� ��: 4
	
	public static void putStars(int n, int total) {
		//void �޼ҵ� -> return ���� ���� �޼ҵ�
		for (int i = 1; i <= total; i++) {
			if(i <= total - n) {
				System.out.print(' ');
			}
			else {
				System.out.print('*');
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���Ϻ��� ������ �����ﰢ���� ǥ���մϴ�");
		System.out.print("�� ��: ");
		int total = stdIn.nextInt();
		
		for (int i = 1; i <= total; i++) {
			//putStars()�޼ҵ� ȣ��
			putStars(i, total);
			System.out.println();
		}

	}

}
