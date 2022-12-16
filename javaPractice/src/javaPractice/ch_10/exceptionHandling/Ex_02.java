package javaPractice.ch_10.exceptionHandling;

import java.util.Scanner;
/*
로그인 정보가 틀릴 경우에 사용할 사용자 정의 예외 클래스를 만들고
적용 (예외처리) 시킬것
*/
class LoginUncertainException extends Exception {
	// 로그인에 실패하였을 경우(예외사항)에 LoginUncertainException으로 예외를 던짐.
	public LoginUncertainException (String message) {
		super(message);
	}
	
	// 예외가 발생할 시 로그로 남기는 코드
	public LoginUncertainException(String message, String memberID, String password) {
		super(message);
		updateLog(memberID, password);
	}
	
	public void updateLog(String memberID, String password) {
		
	}
}

public class Ex_02 {

	String memberID = "abc";
	String password = "1234";
	Scanner stdIn = new Scanner(System.in);
	
	private boolean confirmLogin(String memberID, String password) throws LoginUncertainException {
		// confirmLogin 에서 예외가 발생하면, LoginUncertainException 으로 예외를 던짐.
		
		if (this.memberID.equals(memberID) && this.password.equals(password)) {
			System.out.println("로그인 되었습니다.");
			return true;
		}
		else {
			//System.out.println("로그인 정보가 정확하지 않습니다.");
			//return false;
			// 예외가 발생할 수 있는 구간.
				// 그런데 이곳에 catch를 넣을 경우, catch가 실행되고, System.out~ 은 실행X
				// 그렇다고 return false를 위에 먼저 실행할 경우 return false가 실행되어 System.out ~ 실행X
				// 그래서 둘 중 하나를 선택해야함.
				// => 예외를 발생시켜서 던짐
			throw new LoginUncertainException("로그인 정보가 정확하지 않습니다.");
		}
	}
	
	public void login() {
		String memberID, password;
		// try-catch 추가를 위해 논리값 answer 추가.
		Boolean answer;
		
		System.out.println("로그인 정보를 입력해 주세요.");
		
		do {
			System.out.println("아이디를 입력해 주세요 >>>");
			memberID = stdIn.nextLine();
			System.out.println("비밀번호를 입력해 주세요 >>>");
			password = stdIn.nextLine();
			
			// try-catch 추가
			try {
				answer = confirmLogin(memberID, password);
				// 예외 발생 구간
			}
			catch (LoginUncertainException e) {
				System.out.println(e.getMessage());
				answer = false;
				// answer 가 false여야 계속 반복을 함. 
				// 그래서 실패했을 경우에 answer에 false 값 저장.
			}
		}
		while ( 
				// try-catch가 없었을 때의 답
				//!confirmLogin(memberID, password)
				
				!answer
				// 반복을 하기 위해 while에 !answer 조건
				);
	}
	
	public static void main(String[] args) {
		Ex_02 ex = new Ex_02();
		ex.login();

	}

}
