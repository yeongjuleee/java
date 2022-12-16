package javaPractice.ch_04;

import java.util.Scanner;

public class IfElseIf01Example04 {

	public static void main(String[] args) {
		// 문제, If문을 활용하여
		// 사용자에게 성적을 입력받아 해당 점수의 학점이 출력되는 코드를 완성하세요.
		// 입력은 0 ~ 100 까지 입력이 됩니다. 
		
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int grade = input.nextInt();
		
		if (grade >= 90) { // 90 ~ 100
			System.out.println(grade +"점 입니다.");
			System.out.print("A 입니다.");
		}
		else if (grade >= 80) { // 80 ~ 89
			System.out.println(grade +"점 입니다.");
			System.out.print("B 입니다.");
		}
		else if (grade >=70) { // 70 ~ 79
			System.out.println(grade +"점 입니다.");
			System.out.print("C 입니다.");
		}
		else if (grade >=60) { // 60 ~ 69
			System.out.println(grade +"점 입니다.");
			System.out.print("D 입니다.");
		}
		else { // 0 ~ 59
			System.out.println(grade +"점 입니다.");
			System.out.print("F 입니다. \n분발하세요.");
		}
	}

}
