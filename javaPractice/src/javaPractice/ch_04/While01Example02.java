package javaPractice.ch_04;

import java.util.Scanner;

public class While01Example02 {

	public static void main(String[] args) {
		
		// Scanner�� Ȱ���Ͽ� While�� ����ϱ�
		
		Scanner scanner = new Scanner(System.in);
		String answer = "Y"; // while �� ���۵� �� �ֵ��� ���� ���� �ʱ�ȭ
		int count = 0;
		
		while (answer.equals("Y") || answer.equals("y")) {
			System.out.println("������ ����Ͻðڽ��ϱ�? (Y)");
			answer = scanner.nextLine(); // ������� ������ ����. Y�� �Է½� while�� ���๮ ����.
			
			if (answer.equals("Y") || answer.equals("y")) { // ����ڰ� Y�� �Է��Ѵٸ�
				++count; // count �� 1 ���� �ϰ� �Ʒ� System ����ϰ� �ٽ� ���� �ö�. (while �ݺ��� ����)
				System.out.println("������ " + count + "�� ����߽��ϴ�.");
			}
			System.out.println("�������"); // while���� Y�� ���� ������ ����
		}

	}

}
