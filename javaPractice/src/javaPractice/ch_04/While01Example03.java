package javaPractice.ch_04;

import java.util.Scanner;

public class While01Example03 {

	public static void main(String[] args) {
		// Scanner�� Ȱ���Ͽ� While���� for������ ����ϱ�
		
		Scanner scanner = new Scanner(System.in);
		String answer = "Y"; // while �� ���۵� �� �ֵ��� ���� ���� �ʱ�ȭ
		int count = 0;
		
		for (count = 1; count<=5; count++) {
			System.out.println("������ ����Ͻðڽ��ϱ�? (Y)");
			answer = scanner.nextLine(); // ������� ������ ����. Y�� �Է½� while�� ���๮ ����.
			
			if (answer.equals("Y") || answer.equals("y")) { // ����ڰ� Y�� �Է��Ѵٸ�
				System.out.println("������ " + count + "�� ����߽��ϴ�.");
			}
			System.out.println("�������"); // while���� Y�� ���� ������ ����
		}

		// count ������ ���ٸ�, ������� ��
		/* count = 0;
		 * 
		 * for (String answer = "Y"; answer.equals("Y") || answer.equals("y");) {
		 * System.out.println("������ ����Ͻðڽ��ϱ� (Y)");
		 * answer = scanner.nextLine(); // ������� ������ ����.
		 * 
		 * if (answer.equals("Y") || answer.equals("y")) {
		 * ++count;
		 * System.out.prinltn("������ " + count + "�� ����߽��ϴ�."); 
		 * 	}
		 * }
		 * System.out.println("�������");
		 * */
	}

}
