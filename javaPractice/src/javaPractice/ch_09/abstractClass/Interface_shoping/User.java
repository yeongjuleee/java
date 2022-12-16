package javaPractice.ch_09.abstractClass.Interface_shoping;

public class User {
	/*
		쇼핑몰 사용자의 기본적인 정보를 설정하고 제공하는 기능
		실제 User 클래스는 다양한 회원 정보로 구성되어야 하지만,
		여기서는 이름과 결제 정보만을 멤버로 가짐
	*/
	
	private String name;		// 사용자 이름
	
	private PayType payType;	// 결제 유형 - enum
	
	// 이름과 결제 정보를 파라미터로 가지는 생성자
	// 생성자로 이름과 결제 정보를 받아 실행
	public User(String name, PayType payType) {
		this.name = name;
		this.payType = payType;
	}
	
	public String getName() { // 사용자의 이름 정보를 리턴
		return name;
	}
	
	public void setName(String name) { // 사용자의 이름 정보를 설정
		this.name = name;
	}
	
	public PayType getPayType() { // 사용자의 결제 정보를 리턴
		return payType;
	}
	
	public void setPayType(PayType payType) { // 사용자의 결제 정보를 설정
		this.payType = payType;
	}
}
