package javaPractice.ch_17.db_school;

public class Person {
	// �ʵ�(�Ӽ�)
	private String name;		// �̸�
	private String phoneNumber;	// ��ȭ��ȣ
	private String memo;		// �޸�
	private int studentNumber;	// �й�
	
	// ������
	public Person() {}
	
	public Person(int studentNumber, String name, String phoneNumber, String memo) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.memo = memo;
	}
	
	public String getName() { // �̸� ������
		return name;
	}
	
	public Person(int studentNumber) { // Student ������
		this.studentNumber = studentNumber;
	}
	
	// �޼ҵ�(getter, setter > DTO�� �ű��)
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

