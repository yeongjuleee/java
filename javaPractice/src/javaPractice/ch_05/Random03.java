package javaPractice.ch_05;

import java.util.Random;
import java.util.Scanner;

public class Random03 {

	public static void main(String[] args) {
		// 프로그램이 가지고 있는 정수를 사용자가 알아맞히는 게임
		// 1. 1부터 1000 사이의 정수 하나를 생성
		// 2. 사용자가 답을 추측하여 입력
		// 3. 정답이 아닐 경우 입력한 값보다 큰지, 작은지 알려줌
		// 4. 정답일 경우, 성공 메시지 및 시도 횟수 출력할 것
		
		// 사용할 코드
		// int nextInt(int n) int 타입의 0 ~ 매개값까지의 난수를 리턴
		// Random random = new Random();
		// int answer = random.netxInt(999) + 1; : 어떤 숫자가 들어오면 0 부터 999까지의 숫자 하나 나옴. +1은 1000 까지의 숫자.
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int answer = random.nextInt(999) + 1;
		int num = 0;
		int count = 0; // 몇번 반복했는지 알기 위한 변수
		
		while(num != answer) { // num 값이 answer과 다르면 반복
			System.out.print("정수를 입력하세요: ");
			num = scanner.nextInt();
			count++;
			
			if (num > answer) {
				System.out.print("제시한 숫자보다 작습니다.");
				
			}
			
			else if (num < answer) {
				System.out.print("제시한 숫자보다 큽니다.");
				
			}
			
			else {
				System.out.print("축하합니다! " + count +"회 만에 맞추셨습니다.");
			}
		}
		
	}

}
