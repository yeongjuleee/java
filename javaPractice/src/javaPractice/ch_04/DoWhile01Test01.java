package javaPractice.ch_04;

import java.util.Scanner;

public class DoWhile01Test01 {

	public static void main(String[] args) {
		// While01Test01 �� Do-while�� �ٲ㺸��
		
		// 1. ������ �Էµ� ������, (= ������ ������ while�� �������.)
		// 2. ����ڰ� �Է��� ������ �հ踦 ����Ͽ� ���α׷��� �ۼ��Ͻÿ�.
		// ��, While���� ����ϰ� break�� ������� �� ��.
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0; // �Է¹��� ���� value�� ���� ����.
		int value; // do while ������ �ѹ��� ����Ǿ��ϱ� ������ ���� �ʱ�ȭ���� �� �ʿ䰡 X
		
		do {
			System.out.println("������ �Է��ϼ���: ");			
			value = scanner.nextInt();
			if (value >= 0) { // ������ �Ǹ� ����Ǿ�� �ϱ� ������ if ���ǹ��� ����.
				sum += value;				
			}
			
		} while(value >= 0); 
		System.out.println("������ �հ�� " + sum + "�Դϴ�.");
	
	}

}
