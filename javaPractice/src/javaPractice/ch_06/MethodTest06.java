package javaPractice.ch_06;

import java.util.Scanner;

public class MethodTest06 {
	// 로그인, 로그아웃 메소드 2개 만들기
	
	// login() 메소드와 logout() 메소드를 선언하려고 한다.
	// login() 메소드를 호출할 때는 매개값으로 id와 password를 제공하고, 
	// logout() 메소드는 id만 매개값으로 제공
	
	// 1. login() 메소드는 매개값 id가 "admin", 매개값 password가 "1234" 일 경우에만 true로 리턴하고
	//	 그 외의 값일 경우 false를 리턴하도록 하시오
	// 2. logout() 메소드는 "로그아웃 되었습니다."가 출력되도록 하시오
	
	public static boolean login(String id, String password) {
		//문자열이 동일하다는 의미 : equals 
		if (id.equals("admin") && password.equals("1234")) {
			return true;
		}
		else {
			return false;
		}
		// if 더 깔끔하게 하는 방법
		// return (id.equals("admin")&& password.equals("1234"));
	}
	
	public static void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String id, password;
		System.out.print("아이디를 입력해 주세요: ");
		id = scanner.nextLine();
		System.out.print("비밀번호를 입력해 주세요: ");
		password = scanner.nextLine();
		
		boolean result = login(id, password);
		// 코드상 더 깔끔한 방법
		// boolean result = login(id, password) 를 없애고 바로 
		// if (login(id, password)) 
		if (result) {
			System.out.println("로그인 되었습니다");
			logout(id);
		}
		
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}

}
