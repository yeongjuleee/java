package javaPractice.ch_04;

import java.util.Scanner;

public class While01Test01 {

	public static void main(String[] args) {
		
		// 1. ������ �Էµ� ������, (= ������ ������ while�� �������.)
		// 2. ����ڰ� �Է��� ������ �հ踦 ����Ͽ� ���α׷��� �ۼ��Ͻÿ�.
		// ��, While���� ����ϰ� break�� ������� �� ��.
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0; // �Է¹��� ���� value�� ���� ����.
		int value = 0; // while���� ���� 1. ó���� ���� �Ǿ���ϰ� 2. �տ� ������ ��ġ�� �ʾƾ���.
		
		while(value >= 0) {
			sum += value;
			System.out.println("������ �Է��ϼ���: ");
			value = scanner.nextInt();
		}
		System.out.println("������ �հ�� " + sum + "�Դϴ�.");
	}

}
