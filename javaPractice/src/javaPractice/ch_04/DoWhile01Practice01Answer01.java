package javaPractice.ch_04;

import java.util.Scanner;

public class DoWhile01Practice01Answer01 {

	public static void main(String[] args) {
	
		// do while ���� ����Ͽ� ����ڷκ��� ���� ��ȣ�� �Է¹޴� ���α׷��� �ۼ�.
		// ����ڰ� �ùٸ� �� ��ȣ�� �Է��� ������ �ݺ��� �����.
		// ����ڰ� �ùٸ� �� ��ȣ�� �Է��ؾ߸� ���� �������� �Ѿ.
		
		// ����:
		  Scanner scanner = new Scanner(System.in);
		  int month;
		  
		  do {
		  		System.out.print("�ùٸ� ���� �Է��ϼ��� [1-12]");
		  		month = scanner.nextInt();
		  } while (month < 1 || month > 12);
		  System.out.println("����ڰ� �Է��� ���� " + month + "�Դϴ�."); 
		 

	}

}
