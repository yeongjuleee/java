package javaPractice.ch_04;

import java.util.Scanner;

public class While01Test03 {

	public static void main(String[] args) {
		// ������ �Էµ� ������,
		// ����ڰ� �Է��� ������ �հ踦 ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		// while���� ����ϵ� break ���� ������� ����!
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int value = 0; // while ���� ������ 1. ó���� ���� �Ǿ�� �ϰ�, 2. �տ� ������ ��ġ�� �ʾƾ� ��
		
		while (value >= 0) { // �Է��� ���� 0���� Ŭ ���� �ݺ�
			sum += value;
			System.out.print("������ �Է��ϼ���: ");
			value = scanner.nextInt();
		}
		System.out.println("������ �հ�� " + sum + "�Դϴ�.");

	}

}
