package javaPractice.ch_04;

public class For02 {

	public static void main(String[] args) {
		
		// For���� ���� �ð� ���ϱ�
		// ���α׷��� ���� �ð��� ���ϴ� ��� : 
		// 1. ���α׷� ���� ���� �κп��� ���� �ð��� ���ϰ�
		// 2. ���α׷��� ������ �κп��� ����ð��� ���� ��
		// 3. ���� �ð� - ���� �ð� = ���α׷��� ������ �ð�
		
		long startTime = System.currentTimeMillis(); // ���� �ð�
		for (int i = 0; i < 1000000000; i++) { // 10�� �� �ݺ�
			; // �� ���� ����
		}
		long endTime = System.currentTimeMillis(); // ���� �ð�
		
		System.out.println("���۽ð� : " + startTime);
		System.out.println("����ð� : " + endTime);
		System.out.println("�ҿ�ð� : " + (endTime - startTime));

	}

}
