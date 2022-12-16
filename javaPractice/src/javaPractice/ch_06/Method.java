package javaPractice.ch_06;

import java.util.Scanner;

public class Method {
	
	/* 접근 제어자를 별도로 설정하지 않는다면 접근 제어자가 없는 변수,
	 * 메소드는 default 접근 제어자가 되어 해당 패키지 내에서만 접근이 가능함 */
	
	static int max(int a, int b, int c) { // a, b, c 최댓값을 반환
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
		
	}

	public static void main(String[] args) {
		// 
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		System.out.print("정수 c : ");
		int c = stdIn.nextInt();
		
		System.out.println("최댓값은 " + max(a, b, c) + "입니다.");
	}

}
