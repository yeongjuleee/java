package javaPractice.ch_05;

import java.util.Arrays;

public class Random02HomeWork {

	public static void main(String[] args) {
		// �ζ� ��ȣ ���ϱ�
		// 1~45������ ������ �� ���ϱ�
		// �ߺ� �Ǵ� ���� ������
		
		
		int range = 6;
		int [] numbers = new int[range];// ���� range �� �� 6ĭ�̰� 0 �� ����Ǿ� ����
		
		while (range > 0) {
			int temp = (int)(Math.random() * 45) + 1; // 1~45�� ������ ���� ��´�. 
			
			// �ߺ� Ȯ��
			boolean result = true; // �ߺ� Ȯ�� ���� ���� �����ϱ� ���� ����. �ߺ��̸� false
			for (int n: numbers) { // forEach���� �̿�����. 
				if (n == temp) { //�ߺ��� �Ǹ� result�� ����
					System.out.println(temp + "�� �ߺ��� ���Դϴ�.");
					result = false;
				}
			}
			
			if (result) {
				numbers[range - 1] = temp;
				range--;
			}
		
		}
		System.out.println(Arrays.toString(numbers));

	}

}
