package javaPractice.ch_04;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		// break ���̶�, �ݺ����� ����Ǵٰ� break���� ������ ��ٷ� �ݺ����� ����� �ݺ��� ������ �ڵ带 ����.
		
		// �ݺ����� ���������� �ϴ� ���
		// 1. ���ǽ��� false 
		// 2. break �� ����
		
		Scanner scanner = new Scanner (System.in);
		int sum = 0;
		int num;
		
		while (true) {
			System.out.println("���� ���ڸ� �Է��ϼ���: (�����Ϸ��� 0 �Է�)");
			num = scanner.nextInt(); //���� �Է� �޾Ƽ� i�� ����. 
			if (num == 0) { // ���� 0�� �Է��ߴٸ� ����
				break;
			}
			sum += num; // �Է¹��� �� �����ֱ�
		}
		System.out.println("��������� ���� = " + sum);
	}

}
