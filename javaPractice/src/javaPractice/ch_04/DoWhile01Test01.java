package javaPractice.ch_04;

import java.util.Scanner;

public class DoWhile01Test01 {

	public static void main(String[] args) {
		// While01Test01 을 Do-while로 바꿔보기
		
		// 1. 음수가 입력될 때까지, (= 음수를 받으면 while이 멈춰야함.)
		// 2. 사용자가 입력한 정수의 합계를 계산하여 프로그램을 작성하시오.
		// 단, While문을 사용하고 break는 사용하지 말 것.
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0; // 입력받은 정수 value를 담을 변수.
		int value; // do while 문으로 한번은 실행되야하기 때문에 먼저 초기화값을 줄 필요가 X
		
		do {
			System.out.println("정수를 입력하세요: ");			
			value = scanner.nextInt();
			if (value >= 0) { // 음수가 되면 종료되어야 하기 때문에 if 조건문을 넣음.
				sum += value;				
			}
			
		} while(value >= 0); 
		System.out.println("정수의 합계는 " + sum + "입니다.");
	
	}

}
