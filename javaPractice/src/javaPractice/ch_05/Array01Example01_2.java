package javaPractice.ch_05;

import java.util.Scanner;

public class Array01Example01_2 {

	public static void main(String[] args) {
		// Array01Example01 for문으로 하기.
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[4];
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) { // int i가 0 부터 시작해서 numbers의 배열 개수가 될때까지, i를 ++함.
			System.out.print("숫자를 입력하세요 : ");
			numbers[i] = scanner.nextInt(); // numbers의 배열 i의 값을 입력받음.
			sum += numbers[i]; // sum = sum + numbers[i];
		}
		System.out.print("총합: " + sum);
		
		scanner.close();
	}

}
