package javaPractice.ch_05;

public class Array04 {

	public static void main(String[] args) {
		// �迭�� �̿��Ͽ� math.random ������
		// math.random: 0.0 �̻�, 1.0 �̸��� double ���� ������ ������ ������ ��ȯ
		
		int[] number = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = i; // �迭�� 0~9�� ���ڷ� �ʱ�ȭ.
			System.out.print(number[i] + " "); // 0 1 2 3 4 5 6 7 8 9 
		}
		
		System.out.println();
		
		for (int i = 0; i < 10000; i++) {
			int n = (int)(Math.random() * 10); // 0~9 ���� �� ���� ���Ƿ� ����.
			// System.out.println(Math.random());
			// System.out.println((int)(Math.random() * 11);
			
			// ������� ������ �迭�� ������ ���� ���� ���� ��
			int temp = number[0];  // ������ ������ number[0] �� ���� ����
			number[0] = number[n]; // number[0] �� ������ �迭 �� number[n] �� ����
			number[n] = temp; // number[n]�� temp(�ʱ� number[0]) �� ���� 
		}
		
		// Sysetm.out.println(temp);
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");; // �迭�� ������ ���.
		}
		
		
		}

	}


