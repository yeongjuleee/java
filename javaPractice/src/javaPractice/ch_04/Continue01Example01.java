package javaPractice.ch_04;

public class Continue01Example01 {

	public static void main(String[] args) {
		// Continue01 �� �� �����ϰ� ������.
		
		int total = 0;
		int num;
		
		for (num = 1; num <= 100; num += 2) { // num �� 1���� +2�� �����Ͽ� num�� Ȧ���� ����.
			
			total += num;
			
		}
		
		System.out.println("1���� 100������ Ȧ���� ���� : " + total +"�Դϴ�.");
	}

}
