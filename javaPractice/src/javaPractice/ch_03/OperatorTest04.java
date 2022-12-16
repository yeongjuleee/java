package javaPractice.ch_03;

import java.util.Scanner;

public class OperatorTest04 {

	public static void main(String[] args) {
		/* 문제, 
		 * 1. 사용자로부터 두 개의 정수를 입력 받아서
		 * 2. 정수의 합, 정수의 차, 정수의 곱, 정수의 평균, 큰 수, 작은 수를 계산하여 화면에 출력하는 프로그램을 작성하시오.
		 * 3. 큰 수와 작은 수를 구할 때는 조건 연산자(=삼항 연산자)를 사용하시오.
		*/
		
		int x, y;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		x = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오: ");
		y = sc.nextInt();
		
		System.out.println("두 수의 합: " + (int)(x + y) );
		System.out.println("두 수의 차: " +(int)( x - y));
		System.out.println("두 수의 곱: " + (int)(x * y));
		System.out.println("두 수의 평균:" + (x + y)/2);
		System.out.println("작은 수는: " +( x<y ? x:y) );
		System.out.println("큰 수는: " + (x > y ? x:y));
	}

}
