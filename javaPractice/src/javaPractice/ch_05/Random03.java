package javaPractice.ch_05;

import java.util.Random;
import java.util.Scanner;

public class Random03 {

	public static void main(String[] args) {
		// ���α׷��� ������ �ִ� ������ ����ڰ� �˾Ƹ����� ����
		// 1. 1���� 1000 ������ ���� �ϳ��� ����
		// 2. ����ڰ� ���� �����Ͽ� �Է�
		// 3. ������ �ƴ� ��� �Է��� ������ ū��, ������ �˷���
		// 4. ������ ���, ���� �޽��� �� �õ� Ƚ�� ����� ��
		
		// ����� �ڵ�
		// int nextInt(int n) int Ÿ���� 0 ~ �Ű��������� ������ ����
		// Random random = new Random();
		// int answer = random.netxInt(999) + 1; : � ���ڰ� ������ 0 ���� 999������ ���� �ϳ� ����. +1�� 1000 ������ ����.
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int answer = random.nextInt(999) + 1;
		int num = 0;
		int count = 0; // ��� �ݺ��ߴ��� �˱� ���� ����
		
		while(num != answer) { // num ���� answer�� �ٸ��� �ݺ�
			System.out.print("������ �Է��ϼ���: ");
			num = scanner.nextInt();
			count++;
			
			if (num > answer) {
				System.out.print("������ ���ں��� �۽��ϴ�.");
				
			}
			
			else if (num < answer) {
				System.out.print("������ ���ں��� Ů�ϴ�.");
				
			}
			
			else {
				System.out.print("�����մϴ�! " + count +"ȸ ���� ���߼̽��ϴ�.");
			}
		}
		
	}

}
