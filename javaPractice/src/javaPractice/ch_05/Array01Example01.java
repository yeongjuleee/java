package javaPractice.ch_05;

import java.util.Scanner;

public class Array01Example01 {

	public static void main(String[] args) {
		// 배열을 이용하여 값을 입력받으세요.
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		int[] alpha = new int[4];
		int sum;
		
		System.out.print("1번째 숫자를 입력하세요 : ");
		alpha[0] = scanner.nextInt();
		
		System.out.print("2번째 숫자를 입력하세요 : ");
		alpha[1] = scanner.nextInt();
		
		System.out.print("3번째 숫자를 입력하세요 : ");
		alpha[2] = scanner.nextInt();
		
		System.out.print("4번째 숫자를 입력하세요 : ");
		alpha[3] = scanner.nextInt();
		
		sum = alpha[0] + alpha[1] + alpha[2] + alpha[3];
		
		System.out.print("합계: " + sum);
		
		scanner.close();
		
	}

}
