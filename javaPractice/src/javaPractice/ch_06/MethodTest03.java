package javaPractice.ch_06;

import java.util.Scanner;

public class MethodTest03 {

	// 우하변이 직각인 직각삼각형을 표시하세요
	// 별이 출력되는 부분은 putStars() 메소드를 정의해서구현하세요
	// 몇 단: 4
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("좌하변이 직각인 직각삼각형을 표시합니다");
		System.out.print("몇 단: ");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			//putStars()메소드 호출
			putStars(i);
			System.out.println();
		}

	}
	
	public static void putStars(int n) {
		//공백이 필요함 공백~ * 찍히는 순서임 
		while(n-- > 0) {
			System.out.print('*');
		}
	}

}
