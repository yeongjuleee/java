package javaPractice.ch_04;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		// break 문이란, 반복문이 진행되다가 break문을 만나면 곧바로 반복문을 벗어나서 반복문 다음의 코드를 수행.
		
		// 반복문을 빠져나오게 하는 방법
		// 1. 조건식이 false 
		// 2. break 문 실행
		
		Scanner scanner = new Scanner (System.in);
		int sum = 0;
		int num;
		
		while (true) {
			System.out.println("더할 숫자를 입력하세요: (종료하려면 0 입력)");
			num = scanner.nextInt(); //정수 입력 받아서 i에 저장. 
			if (num == 0) { // 만약 0을 입력했다면 종료
				break;
			}
			sum += num; // 입력받은 값 더해주기
		}
		System.out.println("현재까지의 총합 = " + sum);
	}

}
