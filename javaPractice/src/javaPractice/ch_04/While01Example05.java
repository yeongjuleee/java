package javaPractice.ch_04;

import java.util.Scanner;

public class While01Example05 {

	public static void main(String[] args) {
		// 
		
		boolean run = true;
		int balance = 0; //잔액
		Scanner scanner = new Scanner (System.in);
		
		while (run) { // run이 false가 되어야 while 종료
			System.out.println("------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------------");
			System.out.print("선택 > ");
			
			//코드 시작
			int menuNum = Integer.parseInt(scanner.nextLine()); // 입력받은 문자열을 Integer.parseInt로 숫자로 바꿔줌 
			switch (menuNum) {
				case 1:
					System.out.print("예금액> ");
					balance += Integer.parseInt(scanner.nextLine());
					break;
				
				case 2:
					System.out.print("출금액> ");
					balance -= Integer.parseInt(scanner.nextLine());
					break;
					
				case 3:
					System.out.print("잔고> ");
					System.out.println(balance);
					break;
					
				case 4:
					run = false;
					break;
			}
			System.out.println();	
			//코드 종료

		}
		System.out.println("프로그램 종료");

	}

}
