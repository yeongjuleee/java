package javaPractice.ch_05;

import java.util.Random;
import java.util.Scanner;

public class Random04_2 {

	public static void main(String[] args) {
		// ������ ���������� ���� ���α׷��� �ۼ��϶�
		// 1. ����, ����, ���� ���� ������ 1, 2, 3 ���� ����
		// 2. ��ǻ�Ͱ� ������ ���������� �����͸� �����
		// 3. ������ �� 5ȸ �����ϸ�, ��ǻ�ʹ� �迭 �� �����͸� ���ʴ�� ����ϴ� ������ �Ѵ�
		// 4. ���� Ƚ�� / �� Ƚ���� �Բ� �Է� �޽����� ����Ѵ�
		// 5. Ű����� 1, 2, 3 �� �ϳ��� �Է��ϰ�, ��ǻ�Ϳ� Ű����� �Է��� ���� ���Ͽ� ���� �̰���� �˷��ش�
		// 6. ��� ��쿡�� Ƚ���� �������� �ʴ´�
		// 7. ������ ����Ǹ� ���� �̰���� ǥ���Ѵ�
		
		/* ����ڰ� �̱�� ���
		 * ��ǻ�� : �����
		 * 1 : 2
		 * 2 : 3
		 * 3 : 1
		 * 
		 * ����ڰ� ���� ���
		 * ��ǻ�� : �����
		 * 2 : 1
		 * 3: 2
		 * 1 : 3
		 */
		
		// 1. ��ǻ�Ͱ� ������ ���������� �����͸� �����.
		Random random = new Random();
		Scanner scanner = new Scanner (System.in);
		
		int[] numbers = new int[5]; // �� ���� �Ǽ� 5��
		String[] gameItems = {" ", "����", "����", "��" }; // ����� ���� ���ڿ��� �迭 ����
		int[] results = new int[2]; // ���� ����� ����. ������ �Ǽ��� �ƴ϶� ���� �̰������ ������. 0 : ����ڰ� �̱�
		String[] resultStrs = {"����ڰ� �̱�", "��ǻ�Ͱ� �̱�" }; // ����� ���� ���ڿ�
		
		for (int i=0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(3) + 1; // 1~3 ���� �����ϰ� ������ ��ȯ��
		}
		//System.out.println(Arrays.toString(numbers)); // [3, 3, 2, 2, 3]
		
		// ������ �� 5ȸ �����ϸ� ��ǻ�ʹ� �迭 �� �����͸� ���ʴ�� ����ϴ� ������ �� 
		// ���� Ƚ�� / �� Ƚ���� �Բ� �Է� �޽����� ���
		
		
		for (int i=0, answer; i < numbers.length; i++) {
			System.out.print((i + 1) + " /" + numbers.length + " �Դϴ�. ����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���");
			answer = scanner.nextInt();
			System.out.print(gameItems[answer -1] + "�Է��ϼ̰�, ��ǻ�ʹ� " + gameItems[numbers[i]-1] + "�� �½��ϴ�.");
			
			if (answer == numbers[i]) { // ��� ���
				System.out.println("�����ϴ�.");
				i--; // i �� ���� �ٲ��� �ʰ� ��. 
			} 
			else if ((answer + 1) % 3 == numbers[i] % 3) { // ����ڰ� ���� ���
				results[1]++;
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
			else {
				results[0]++;
				System.out.println("����ڰ� �̰���ϴ�.");
			}
		}
		
		int max = results[0];
		int maxIndex = 0;
		
		for (int i=0; i < results.length; i++) {
			if (max < results[i]) {
				max = results[i];
				maxIndex = i;
			}
		}
		System.out.println("���� ����� " + resultStrs[maxIndex]);
	}

}
