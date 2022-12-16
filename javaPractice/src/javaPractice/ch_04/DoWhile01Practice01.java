package javaPractice.ch_04;

import java.util.Scanner;

public class DoWhile01Practice01 {

	public static void main(String[] args) {
		
		// 수업에서는 문제만 보고 과제로 직접 해보기. 
		
		// do while 문을 사용하여 사용자로부터 월의 번호를 입력받는 프로그램을 작성.
		// 사용자가 올바른 월 번호를 입력할 때까지 반복을 계속함.
		// 사용자가 올바른 월 번호를 입력해야만 다음 문장으로 넘어감.
		
		Scanner scanner = new Scanner(System.in);
		int month;
		
		do {
			System.out.print("월을 입력하세요: ");
			month = scanner.nextInt();
		} while (month > 12 || month < 1); // month가 12보다 크거나 month가 1보다 작으면 반복. 
		System.out.println("사용자가 입력한 월은 " + month +"월 입니다.");
		scanner.close();

	}

}
