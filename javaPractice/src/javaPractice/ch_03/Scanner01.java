package javaPractice.ch_03;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		// Scanner 클래스 를 이용하여 콘솔에서 입력 받기. (혼공자 기준 95p)
		
		Scanner sc = new Scanner (System.in);
		
		int x, y, sum;
		
		System.out.print("첫 번째 숫자를 입력하시오: "); 
		x= sc.nextInt(); //정수 입력
		
		System.out.print("두 번째 숫자를 입력하시오: ");
		
		y = sc.nextInt(); // 정수 입력
		
		sum = x + y;
		System.out.println(sum); // 합을 출력한다.
	}

}
