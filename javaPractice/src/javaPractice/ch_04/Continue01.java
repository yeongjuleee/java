package javaPractice.ch_04;

public class Continue01 {

	public static void main(String[] args) {
		// Continue��, ������ �ݺ��� �پ�Ѱ� �ݺ��� ����.
		
		int total = 0;
		int num;
		
		for (num = 0; num <= 100; num++) {
			if (num % 2 == 0) { // num �� 2�� ���� �������� 0�̸� (= ¦���̸�)
				continue; // «��
			}
			total += num;
			
			/*
			 * if (num % 2 == 1) {
			 * 			total += num;
			 * }
			 * */
		}
		
		System.out.println("1���� 100������ Ȧ���� ���� : " + total +"�Դϴ�.");

	}

}
