package javaPractice.ch_04;

import java.util.Scanner;

public class While01Test02 {

	public static void main(String[] args) {
		// While, break �� ����Ͽ� ����ڰ� �Է��� �������� ����� ���� ���α׷��� �ۼ�
		// ���� ����ڰ� ������ �Է��ϸ� break�� ���� �ݺ� ���� ����.
		
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int count = 0;
		
		while(true) {
			System.out.println("������ �Է��Ͻÿ�: ");
			int grade = scanner.nextInt();
			
			if (grade < 0) { // grade �� �Է°��� ������ ��� �ݺ��� ����.
				break;
			}
			total += grade; // grade �� ����� ��� total�� grade ���� ���Ͽ� ������.
			count ++; // �ݺ��� ���� ���� count �� ������Ŵ.
		}
		System.out.println("����� " + total / (double) count);

	}

}
