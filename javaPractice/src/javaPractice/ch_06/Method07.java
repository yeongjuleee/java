package javaPractice.ch_06;

import java.util.Random;
import java.util.Scanner;

public class Method07 {
	
	//�μ�(�Ű�����)�� ���� �޼ҵ�
	
	//�ϻ꿬��
	
	static Scanner stdIn = new Scanner (System.in); // �� �޼ҵ忡�� ����ϱ� ���� Ŭ���� ������ ����
	
	// ���� ������ Ȯ��
	static boolean confirmRetry() { // �Ű� ������ ���޹��� �ʴ� �޼ҵ�
		int cont;
		
		do {
			System.out.print("�ٽ� �ѹ�? <Yes :1 / No : 0> : ");
			cont = stdIn.nextInt();
		} while (cont != 0 && cont != 1);
		return cont ==1; // cont�� 1�̸� true �ƴϸ� false
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("�ϻ� Ʈ���̴�!");
		
		do {
			// random.nextInt(n) : 0~ (n-1) ������ ������ �������� ��ȯ
			int x = rand.nextInt(900) + 100; // 2�ڸ� ��
			int y = rand.nextInt(900) + 100; // 2�ڸ� ��
			int z = rand.nextInt(900) + 100; // 2�ڸ� ��
			
			while (true) {
				System.out.print(x + " + " + y + " + " + z + " = ");
				int k = stdIn.nextInt(); // �Է��� ��
				if (k == x + y+ z) 		// ����
					break;
				System.out.println("��!");
			}
			
		} while (confirmRetry());

	}

}
