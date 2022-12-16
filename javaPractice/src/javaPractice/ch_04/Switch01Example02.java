package javaPractice.ch_04;

import java.util.Scanner;

public class Switch01Example02 {

	public static void main(String[] args) {
		// 문제, IfElseIf01Example04를 Switch문으로 
		// 사용자에게 성적을 입력받아 해당 점수의 학점이 출력되는 코드를 완성하세요.
		// 입력은 0 ~ 100 까지 입력이 됩니다. 
		
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int grade = input.nextInt() / 10;
		
		switch(grade) {
		case 9: case 10:
			System.out.print("A입니다.");
			break;
		
		case 8:
			System.out.print("B입니다.");
			break;
		
		case 7:
			System.out.print("C입니다.");
			break;
			
		case 6:
			System.out.print("D입니다.");
			break;
			
		default:
			System.out.print("F입니다.");
		}
		input.close();
	}

}
