package test_1st;

public class Member {	// ȸ�� ���� �� Ŭ����
	// �ʵ�
	private final String memberID;	// ���̵�
	private String password;		// ��й�ȣ
	private String name;			// �̸�
	private String address;			// �ּ�
	private String email;			// �̸���
	
	// ������
	public Member(String memberID, String password, String name) { // �����ڸ� ���� �Է�
		this.memberID = memberID;
		this.password = password;
		this.name = name;
	}


	// ���� ������ �޼ҵ�
	String getMemeberID() {
		return memberID;
	}
	
	String getPassword() {
		return password;
	}
	
	String getName() {
		return name;
	}
	
	// ���� ������ �޼ҵ�
	void setAddress(String address) {
		this.address = address;
	}
	
	void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		System.out.println("ȸ������ ������ �Ʒ��� �����ϴ�.");
		return "���̵� : " + memberID + ", �̸� : " + name + ", �ּ� : " + address + ", �̸��� : " + email;
	}
	
	
}
