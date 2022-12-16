package javaPractice.ch_06;

import java.util.Scanner;

public class Return01 {
	// return 의 기능
	// 1. 값을 반환
	// 2. 함수를 종료 ( 반복문의 break 와 비슷함)
	
	static int max(int a, int b) { // a, b 최댓값을 반환
		// return이 여러번 나와도 됨
		System.out.println("함수 시작");
		if (a > b)
			return a;
		else 
			return b;
		// System.out.println("함수 종료);
		
	}

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a: ");
		int a = stdIn.nextInt();
		System.out.print("정수 b: ");
		int b = stdIn.nextInt();
		
		System.out.println("최댓값은 " + max(a, b) + "입니다.");
		// 메소드 max를 사용하면 max에 저장해둔 것을 출력하고 함수 실행... 
	}

}
