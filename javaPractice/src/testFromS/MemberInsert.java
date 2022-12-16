package testFromS;

import java.util.Scanner;


/* 4.MemberInsert 클래스에는 
 * 1) 추가정보를 입력할지 물어서 "Y"를 입력 받으면 
 * 추가입력을 받고 "N"을 누르면 추가 입력을 받지 않는 기능이 있어야 합니다.
   2) 로그인 기능은 회원 가입을 한 정보를 기준으로 처리하고, 
   로그인 정보가 정확하지 않으면 계속 로그인 정보를 물어야 합니다.*/

public class MemberInsert extends Member{
	MemberInsert(String memberID, String password, String name) {
		super(memberID, password, name);
	}


	Scanner scanner = new Scanner(System.in);
	

	public void updateAddInfo() {
//		String aa = scanner.nextLine();
		while(true) {
		System.out.println("추가 정보를 입력하시겠습니까?");
		System.out.println("추가 정보를 입력하시려면 Y, 그만 하실려면 N을 입력해 주십시요.>>>");
		String aa = scanner.nextLine();
		
		
		if(aa.equals("Y")) {
			System.out.println("주소를 입력해 주십시오.>>>");
			scanner.nextLine();
			System.out.println("이메일을 입력해 주십시오.>>>");
			scanner.nextLine();
			
		}
		else if(aa.equals("N")) {
			break;
		}
		else {
			System.out.println("다시 입력해 주십시오.");
		}
	}
}
	public void printMemberInfo() {
		
	System.out.println(toString());
	}

	public void login(){
		String memberID, password;
		
		System.out.println("로그인 정보를 입력해 주세요");
		while(true) {
		
			System.out.println("아이디를 입력해 주세요 >>>");
			memberID=scanner.nextLine();
			System.out.println("비밀번호를 입력해 주세요 >>>");
			password = scanner.nextLine();
			
			if(getMemberID().equals(memberID) && getPassword().equals(password)) {
				System.out.println("로그인 되었습니다.");
				break;
			}
			else {
				System.out.println("로그인 정보가 정확하지 않습니다.");
				continue;
			}
		}
	}
	
	
}
