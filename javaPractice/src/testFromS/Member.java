package testFromS;

public class Member { //회원 관련 모델 클래스 
	private final String memberID; //아이디
	private String password; //비밀번호
	private String name; //이름
	private String address; //주소
	private String email; //이메일
	
	Member(String memberID,String password,String name){
		//생성자를 통해 입력
		this.memberID = memberID;
		this.password = password;
		this.name = name;
	}
	String getMemberID() {
		return memberID;
	}
	String getPassword() {
		return password;
	}
	void setAddress(String address) {
		this.address = address;
	}
	void setEmail(String email) {
		this.email=email;
	}
	@Override
	public String toString() {
		System.out.println("회원가입정보는 아래와 같습니다.");
		return "아이디: " + memberID + ", 이름: " + name + ", 주소: " + address +", 이메일: " + email;
	}

	
	
	
}
