package javaPractice.ch_04;

import java.util.Scanner;

public class While01Example05 {

	public static void main(String[] args) {
		// 
		
		boolean run = true;
		int balance = 0; //�ܾ�
		Scanner scanner = new Scanner (System.in);
		
		while (run) { // run�� false�� �Ǿ�� while ����
			System.out.println("------------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("------------------------------------");
			System.out.print("���� > ");
			
			//�ڵ� ����
			int menuNum = Integer.parseInt(scanner.nextLine()); // �Է¹��� ���ڿ��� Integer.parseInt�� ���ڷ� �ٲ��� 
			switch (menuNum) {
				case 1:
					System.out.print("���ݾ�> ");
					balance += Integer.parseInt(scanner.nextLine());
					break;
				
				case 2:
					System.out.print("��ݾ�> ");
					balance -= Integer.parseInt(scanner.nextLine());
					break;
					
				case 3:
					System.out.print("�ܰ�> ");
					System.out.println(balance);
					break;
					
				case 4:
					run = false;
					break;
			}
			System.out.println();	
			//�ڵ� ����

		}
		System.out.println("���α׷� ����");

	}

}
