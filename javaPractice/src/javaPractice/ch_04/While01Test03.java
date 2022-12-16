package javaPractice.ch_04;

import java.util.Scanner;

public class While01Test03 {

	public static void main(String[] args) {
		// 음수가 입력될 때까지,
		// 사용자가 입력한 정수의 합계를 계산하여 출력하는 프로그램을 작성하세요.
		// while문을 사용하되 break 문을 사용하지 말것!
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int value = 0; // while 문의 조건이 1. 처음엔 참이 되어야 하고, 2. 합에 영향을 미치지 않아야 함
		
		while (value >= 0) { // 입력한 값이 0보다 클 동안 반복
			sum += value;
			System.out.print("정수를 입력하세요: ");
			value = scanner.nextInt();
		}
		System.out.println("정수의 합계는 " + sum + "입니다.");

	}

}
