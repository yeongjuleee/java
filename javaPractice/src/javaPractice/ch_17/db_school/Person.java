package javaPractice.ch_17.db_school;

public class Person {
	// 필드(속성)
	private String name;		// 이름
	private String phoneNumber;	// 전화번호
	private String memo;		// 메모
	private int studentNumber;	// 학번
	
	// 생성자
	public Person() {}
	
	public Person(int studentNumber, String name, String phoneNumber, String memo) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.memo = memo;
	}
	
	public String getName() { // 이름 생성자
		return name;
	}
	
	public Person(int studentNumber) { // Student 생성자
		this.studentNumber = studentNumber;
	}
	
	// 메소드(getter, setter > DTO에 옮기기)
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public int getStudentNumber() {
	return studentNumber;
	}
	
	public void setStudentNumber(int studentNumber) {
	this.studentNumber = studentNumber;
	}
	
}

