package javaPractice.ch_05;

import java.util.Scanner;

public class Array01Example01_2 {

	public static void main(String[] args) {
		// Array01Example01 for������ �ϱ�.
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[4];
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) { // int i�� 0 ���� �����ؼ� numbers�� �迭 ������ �ɶ�����, i�� ++��.
			System.out.print("���ڸ� �Է��ϼ��� : ");
			numbers[i] = scanner.nextInt(); // numbers�� �迭 i�� ���� �Է¹���.
			sum += numbers[i]; // sum = sum + numbers[i];
		}
		System.out.print("����: " + sum);
		
		scanner.close();
	}

}
