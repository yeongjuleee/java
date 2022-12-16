package javaPractice.ch_04;

import java.util.Scanner;

public class While01Test02 {

	public static void main(String[] args) {
		// While, break 를 사용하여 사용자가 입력한 점수들의 평균을 내는 프로그램을 작성
		// 만약 사용자가 음수를 입력하면 break에 의해 반복 루프 종료.
		
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int count = 0;
		
		while(true) {
			System.out.println("정수를 입력하시오: ");
			int grade = scanner.nextInt();
			
			if (grade < 0) { // grade 의 입력값이 음수일 경우 반복을 멈춤.
				break;
			}
			total += grade; // grade 가 양수일 경우 total에 grade 값을 더하여 저장함.
			count ++; // 반복을 위해 변수 count 를 증가시킴.
		}
		System.out.println("평균은 " + total / (double) count);

	}

}
