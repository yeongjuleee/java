package javaPractice.ch_05;

import java.util.Scanner;

public class Array01Example01 {

	public static void main(String[] args) {
		// �迭�� �̿��Ͽ� ���� �Է¹�������.
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		int[] alpha = new int[4];
		int sum;
		
		System.out.print("1��° ���ڸ� �Է��ϼ��� : ");
		alpha[0] = scanner.nextInt();
		
		System.out.print("2��° ���ڸ� �Է��ϼ��� : ");
		alpha[1] = scanner.nextInt();
		
		System.out.print("3��° ���ڸ� �Է��ϼ��� : ");
		alpha[2] = scanner.nextInt();
		
		System.out.print("4��° ���ڸ� �Է��ϼ��� : ");
		alpha[3] = scanner.nextInt();
		
		sum = alpha[0] + alpha[1] + alpha[2] + alpha[3];
		
		System.out.print("�հ�: " + sum);
		
		scanner.close();
		
	}

}
