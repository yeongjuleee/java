package javaPractice.ch_04;

import java.util.Scanner;

public class DoWhile01Practice01 {

	public static void main(String[] args) {
		
		// ���������� ������ ���� ������ ���� �غ���. 
		
		// do while ���� ����Ͽ� ����ڷκ��� ���� ��ȣ�� �Է¹޴� ���α׷��� �ۼ�.
		// ����ڰ� �ùٸ� �� ��ȣ�� �Է��� ������ �ݺ��� �����.
		// ����ڰ� �ùٸ� �� ��ȣ�� �Է��ؾ߸� ���� �������� �Ѿ.
		
		Scanner scanner = new Scanner(System.in);
		int month;
		
		do {
			System.out.print("���� �Է��ϼ���: ");
			month = scanner.nextInt();
		} while (month > 12 || month < 1); // month�� 12���� ũ�ų� month�� 1���� ������ �ݺ�. 
		System.out.println("����ڰ� �Է��� ���� " + month +"�� �Դϴ�.");
		scanner.close();

	}

}
