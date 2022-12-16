package javaPractice.ch_04;

import java.util.Scanner;

public class While01Test01 {

	public static void main(String[] args) {
		
		// 1. 음수가 입력될 때까지, (= 음수를 받으면 while이 멈춰야함.)
		// 2. 사용자가 입력한 정수의 합계를 계산하여 프로그램을 작성하시오.
		// 단, While문을 사용하고 break는 사용하지 말 것.
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0; // 입력받은 정수 value를 담을 변수.
		int value = 0; // while문의 조건 1. 처음에 참이 되어야하고 2. 합에 영향을 미치지 않아야함.
		
		while(value >= 0) {
			sum += value;
			System.out.println("정수를 입력하세요: ");
			value = scanner.nextInt();
		}
		System.out.println("정수의 합계는 " + sum + "입니다.");
	}

}
