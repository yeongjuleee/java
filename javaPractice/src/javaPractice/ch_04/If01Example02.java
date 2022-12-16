package javaPractice.ch_04;

import java.util.Scanner;

public class If01Example02 {

	public static void main(String[] args) {
		// If문을 이용하여 세 정수의 최대값 구하기
		// Scanner 클래스로 세 정수의 값 받기
		
		Scanner stdIn = new Scanner (System.in);

		System.out.print("정수 a: ");
		int a = stdIn.nextInt();
		
		System.out.print("정수 b: ");
		int b = stdIn.nextInt();
		
		System.out.print("정수 c: ");
		int c = stdIn.nextInt();
		
		// if문에 실행문이 한개일 경우 중괄호를 생략할 수 있음.
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		
		// 세미클론(;) 오류 조심! 프로그램은 잘 작동하는데(=프로그램상 허용) 오류가 안 나는 경우.
		//if (b > max);
		//	max = b;
		// 가 되면 b > max 의 ; => 빈문장 이 실행되고 max 에 b 값을 저장해버림. 	
		
		System.out.print("최대값은 "+ max +" 입니다.");
	}

}
