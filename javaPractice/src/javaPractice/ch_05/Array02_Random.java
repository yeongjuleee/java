package javaPractice.ch_05;

import java.util.Arrays;

public class Array02_Random {

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
			// { , , , 13 ,12 }
			for (int i=5;  i >= range; i--) { // ���� ����� �͸� Ȯ���� �ؾ���.
				if(temp == numbers[i]) {
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
