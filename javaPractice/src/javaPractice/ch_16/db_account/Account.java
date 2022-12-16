package javaPractice.ch_16.db_account;
/*
	DTO (Data Transfer Object), VO(Value Object)
	로직을 갖고 있지 X 순수한 데이터 객체이며 속성과 그 속성에 접근하기 위한 getter, setter 메소드만 가진 클래스
*/

public class Account {
	private int id;	// 계좌
	private String name;	// 이름
	private long balance;	// 잔액
	
	public Account() {
		
	}
	
	public Account (int id, String name, long balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "계좌정보 { " + 
				"계좌번호: " + id + 
				", 이름: " + name + "'\'" +
				", 잔액: " + balance + " }" ;
	}	
	
}
