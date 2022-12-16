package javaPractice.ch_04;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		// If-else-if 문
		// Scanner를 이용하여 값을 입력받아 실행하기
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("나이를 입력하세요 >>> ");
		int age;
		
		// 1. 정수로 받음
		age = input.nextInt();
		
		// 2. 문자열로 입력을 받은 후 정수화
		//String tmp;
		//tmp = input.nextLine();
		//age = Integer.parseInt(tmp);
		
		//조건문 실행
		if (age > 19) { // 20~
			System.out.println("성인입니다.");
			System.out.println("성인 요금이 적용됩니다.");
		}
		else if(age > 13) { // 14~19
			System.out.println("청소년입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		}
		else if(age > 8) { // 9~13
			System.out.println("어린이입니다.");
			System.out.println("어린이 요금이 적용됩니다.");
		}
		else { // 0~8
			System.out.println("유아입니다.");
			System.out.println("유아 요금이 적용됩니다.");
		}
		
		System.out.println("결제를 진행해 주세요.");
	}

}
