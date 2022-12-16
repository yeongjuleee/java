package javaPractice.ch_04;

import java.util.Scanner;

public class While01Example03 {

	public static void main(String[] args) {
		// Scanner를 활용하여 While문을 for문으로 사용하기
		
		Scanner scanner = new Scanner(System.in);
		String answer = "Y"; // while 이 시작될 수 있도록 응답 값을 초기화
		int count = 0;
		
		for (count = 1; count<=5; count++) {
			System.out.println("음악을 재생하시겠습니까? (Y)");
			answer = scanner.nextLine(); // 사용자의 응답을 받음. Y를 입력시 while문 실행문 실행.
			
			if (answer.equals("Y") || answer.equals("y")) { // 사용자가 Y를 입력한다면
				System.out.println("음악을 " + count + "번 재생했습니다.");
			}
			System.out.println("재생종료"); // while에서 Y를 하지 않으면 실행
		}

		// count 제한이 없다면, 강사님의 답
		/* count = 0;
		 * 
		 * for (String answer = "Y"; answer.equals("Y") || answer.equals("y");) {
		 * System.out.println("음악을 재생하시겠습니까 (Y)");
		 * answer = scanner.nextLine(); // 사용자의 응답을 받음.
		 * 
		 * if (answer.equals("Y") || answer.equals("y")) {
		 * ++count;
		 * System.out.prinltn("음악을 " + count + "번 재생했습니다."); 
		 * 	}
		 * }
		 * System.out.println("재생종료");
		 * */
	}

}
