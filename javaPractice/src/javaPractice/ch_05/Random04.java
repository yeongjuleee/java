package javaPractice.ch_05;

import java.util.Scanner;

public class Random04 {

	public static void main(String[] args) {
		// ������ ���������� ���� ���α׷��� �ۼ��϶�
		// 1. ����, ����, ���� ���� ������ 1, 2, 3 ���� ����
		// 2. ��ǻ�Ͱ� ������ ���������� �����͸� �����
		// 3. ������ �� 5ȸ �����ϸ�, ��ǻ�ʹ� �迭 �� �����͸� ���ʴ�� ����ϴ� ������ �Ѵ�
		// 4. ���� Ƚ�� / �� Ƚ���� �Բ� �Է� �޽����� ����Ѵ�
		// 5. Ű����� 1, 2, 3 �� �ϳ��� �Է��ϰ�, ��ǻ�Ϳ� Ű����� �Է��� ���� ���Ͽ� ���� �̰���� �˷��ش�
		// 6. ��� ��쿡�� Ƚ���� �������� �ʴ´�
		// 7. ������ ����Ǹ� ���� �̰���� ǥ���Ѵ�
		
		Scanner scanner = new Scanner(System.in);
		
		//String[] gbb = { "����", "����", "��" }; // index ��ȣ 0 1 2 ����. 
		// String ���� �迭�� ���� �� �Ŀ� �� �ε��� ���� �Է��ؼ� ����, ����, ���� ������ �ؾ��� �� ����. 
		// �׷��� gbb�� �����ߴµ� �װ� int�� �ٲٴ� ����� �� > �� �� ���� �� ����. 
		
		
		int[] rsp = {1, 2, 3, 2, 3};
		int user = 0;
		int count = 0; // Ƚ�� ���
		
		for (int i=0; i < rsp.length; i++) {
			System.out.print("1 ~ 3 ������ ���ڸ� �Է��ϼ���: ");
			user = scanner.nextInt();
			
			if (user == rsp[i]) {
				System.out.print("�����ϴ�.");
				i--;
				continue;
				
			} else if (user > rsp[i]) {
				System.out.print("�̰���ϴ�.");
			} else if (user < rsp[i]) {
				System.out.print("�����ϴ�.");
			}
			
		}
		System.out.println("5���� ��� �߽��ϴ�.");
		 
		
		
	}
}
