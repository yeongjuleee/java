package javaPractice.ch_04;

public class For01Test01 {

	public static void main(String[] args) {
		// For���� �̿��Ͽ� 1 ���� 100 ������ ���� �� 3�� ����� ������ ���ϴ� �ڵ� �ۼ�
		
		int sum = 0;
		for (int i=1; i<=100; i++) {
			// sum�� i ������ 3 �� �������� 0�� ��. (���ǹ��� ����ؼ� �� �� ����)
			if (i % 3 == 0) {
				sum += i; // i�� 3���� ���� �������� 0�� i�� sum�� ������. 
			}
		}
		System.out.println("3�� ����� ��: " + sum);

		//�� �ٸ� ���
		//sum = 0;
		//for (j = 3; j <= 100; j += 3) {
		//	sum += j;
		// 	}
		// System.out.println("3�� ����� ��: " + sum);
		 
	}

}
