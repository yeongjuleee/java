package javaPractice.ch_05;

import java.util.Scanner;

public class Array_WhileTest01 {

	public static void main(String[] args) {
		// while �� array�� �̿��Ͽ� ���α׷� �����
		
		// Ű����κ��� �л� ���� �� �л����� ������ �Է¹޾� 
		// �ְ� ������ ��� ������ ���ϴ� ���α׷��̴�.
		// ���� ����� ���� �˸°� �ۼ��϶�
		
		boolean run = true; // �ݺ����� �������� ���. ���� false�� �Ǹ� �ݺ��� ����
		int studentNum = 0; // �л� �� 
		int[] scores = null; // ������ �Է� ���� �� �迭 ����. ����ڿ��� �Է¹��� �л����� �������� �迭 ����
		
		Scanner scanner = new Scanner (System.in);
		
		while (run) { // run�� true�� ���� �ݺ� => ���� �ݺ�
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3. ���� ����Ʈ | 4. �м� | 5. ����");
			System.out.println("-----------------------------------------------------------");
			System.out.print("����> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if (selectNo == 1) {
				//�л� ���� �Է� �޾Ƽ� �迭 ����
				System.out.print("�л� ���� �Է��ϼ���: ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int [studentNum];
				
				
			} else if ( selectNo == 2) {
				// ������ �迭�� ������ŭ ���� �Է�
				System.out.print("������ �Է��ϼ���: ");
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[ " + i + "] > ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				
			} else if ( selectNo == 3) {
				// �Է¹��� �迭�� ���� ���
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				
			} else if ( selectNo == 4) {
				// �ְ� ����, ��� ���� ���
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				
				avg = (double) sum / studentNum;
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);
				
			} else if (selectNo == 5) {
				// run �� ����
				run = false;
			}
			
			
		}
		System.out.println("���α׷� ����");
	}

}
