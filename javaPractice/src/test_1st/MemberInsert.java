package test_1st;

import java.util.Scanner;

/* 회원 가입 및 로그인 기능이 정의된 클래스
		1.  추가 정보를 입력할지 물어서 Y를 입력받으면 추가입력, N을 누르면 추가 입력 X 기능
		2.  로그인 기능은 회원 가입을 한 정보를 기준으로 처리
			로그인 정보가 정확하지 않으면 계속 로그인 정보를 묻기
*/

public class MemberInsert extends Member {
	Scanner stdIn = new Scanner(System.in);
	Object obj; // 참조변수 객체
	
	
	// 생성자
	public MemberInsert(String memberID, String password, String name) {
		super(memberID, password, name);
	}

	
	
	// 추가정보 메소드
	void updateAddInfo() {
		//1.  추가 정보를 입력할지 물어서 Y를 입력받으면 추가입력, N을 누르면 추가 입력 X 기능
		System.out.print("추가 정보를 입력하시겠습니까? 입력하시려면 Y, 그만하시려면 N을 입력해 주세요 >>> ");
		String sel = stdIn.nextLine();
		String address;
		String email;
		if (sel.equals("Y") || sel.equals("y")) {
			System.out.print("주소를 입력해 주세요");
			address = stdIn.nextLine();
			System.out.print("이메일을 입력해 주세요.");
			email = stdIn.nextLine();
			
			setAddress(address);
			setEmail(email);
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}

	}
	
	// 회원 가입 정보 출력 메소드
	void printMemberInfo() {
		System.out.println(toString());
	}
	
	// 로그인 메소드 (성공, 실패)
	private boolean confirmLogin(String memberID, String password) {
		if (super.getMemeberID().equals(memberID) && super.getPassword().equals(password)) {
			System.out.println("로그인 되었습니다.");
			return true;
		}
		else {
			System.out.println("로그인 정보가 정확하지 않습니다.");
			return false;
		}
	}
	
	public void login() { // 로그인 메소드
		// 필드
		String memberID, password;
		
		System.out.println("로그인 정보를 입력해 주세요.");
		
		do {
			System.out.println("아이디를 입력해 주세요 >>> ");
			memberID = stdIn.nextLine();
			System.out.println("비밀번호를 입력해 주세요 >>> ");
			password = stdIn.nextLine();
		}
		while (!confirmLogin(memberID, password));
		
	}
	
}
