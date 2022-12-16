package javaPractice.ch_04;

import java.util.Scanner;

public class IfElseIf01Example03 {

	public static void main(String[] args) {
		// 문제, 조건문 If를 활용하여
		// 사용자에게 입력받은 정수가 양수인지,
		// 0인지, 음수인지 알려주는 코드를 완성하시오.

		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int num = stdIn.nextInt();
		
		if (num > 0) {
			System.out.print("양수입니다.");
		}
		else if (num < 0) {
			System.out.print("음수입니다.");
		}
		else {
			System.out.print("0 입니다.\n다른 값을 입력해 주세요.");
		}		
		
	}

}
