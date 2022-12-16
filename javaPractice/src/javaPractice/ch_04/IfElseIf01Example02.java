package javaPractice.ch_04;

import java.util.Scanner;

public class IfElseIf01Example02 {

	public static void main(String[] args) {
		// If-else-if문
		// 1. Scanner 클래스 이용하기
		// 2. 논리 연산자 이용하여기 조건식 짜기
		// System.out.println("~월은 ~입니다."); 가 나오도록 하기
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("계절을 표시합니다. \n몇 월 입니까? : ");
		int month = stdIn.nextInt();
		
		if (month >=3 && month <= 5) {
			System.out.println( month +"월은 봄입니다.");
		}
		else if (month >=6 && month <= 8) {
			System.out.println( month +"월은 여름입니다.");
		}
		else if (month >=9 && month <=11) {
			System.out.println( month +"월은 가을입니다.");
		}
		else if (month == 12 || month == 1 || month == 2) {
			System.out.println( month +"월은 겨울입니다.");
		}
		else {
			System.out.println("잘못된 입력 값입니다.");
		}
		stdIn.close();
	}

}
