package javaPractice.ch_11.objcet;

/*
	Member 클래스에는 id와 이름, 연락처를 저장하는 필드가 있다.
	Member 클래스를 작성화되, Objcet의 toString() 메소드를 재정의해서 아래와 같이 나오도록 작성하라.

	실행결과 :
	blue : 이파란
*/


class Member {
	// 필드
	String id;		// 아이디
	String name; 	// 이름
	String phone;	// 휴대폰
	
	Member(String id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}


	@Override
	public String toString() {
		return  id +  " : " + name;
	}

	
}

public class Test {

	public static void main(String[] args) {
		Member member = new Member("blue", "이파란", "010-1234-5678");
		System.out.println(member);

	}

}
