package javaPractice.ch_04;

import java.util.Scanner;

public class DoWhile01Practice01Answer01 {

	public static void main(String[] args) {
	
		// do while 문을 사용하여 사용자로부터 월의 번호를 입력받는 프로그램을 작성.
		// 사용자가 올바른 월 번호를 입력할 때까지 반복을 계속함.
		// 사용자가 올바른 월 번호를 입력해야만 다음 문장으로 넘어감.
		
		// 정답:
		  Scanner scanner = new Scanner(System.in);
		  int month;
		  
		  do {
		  		System.out.print("올바른 월을 입력하세요 [1-12]");
		  		month = scanner.nextInt();
		  } while (month < 1 || month > 12);
		  System.out.println("사용자가 입력한 월은 " + month + "입니다."); 
		 

	}

}
