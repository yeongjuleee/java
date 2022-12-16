package javaPractice.ch_04;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// 중첩 If문
		// Scanner 클래스로 값을 받아 중첩문 실행하기
		
		String id, password;
		Scanner input = new Scanner(System.in);
		System.out.println("아이디를 입력해 주세요:");
		id = input.nextLine();
		
		if (id.equals("java")) {
			System.out.println("아이디 일치");
			System.out.println("비밀번호를 입력해 주세요");
			
			password = input.nextLine();
			if (password.equals("abc123")) {
				System.out.println("비밀번호 일치");
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("비밀번호 불일치");
			}

		}
		else { 
			System.out.println("아이디 불일치");
		}
		input.close();
	}
	
}
