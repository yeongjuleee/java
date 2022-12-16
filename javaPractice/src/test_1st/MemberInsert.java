package test_1st;

import java.util.Scanner;

/* ȸ�� ���� �� �α��� ����� ���ǵ� Ŭ����
		1.  �߰� ������ �Է����� ��� Y�� �Է¹����� �߰��Է�, N�� ������ �߰� �Է� X ���
		2.  �α��� ����� ȸ�� ������ �� ������ �������� ó��
			�α��� ������ ��Ȯ���� ������ ��� �α��� ������ ����
*/

public class MemberInsert extends Member {
	Scanner stdIn = new Scanner(System.in);
	Object obj; // �������� ��ü
	
	
	// ������
	public MemberInsert(String memberID, String password, String name) {
		super(memberID, password, name);
	}

	
	
	// �߰����� �޼ҵ�
	void updateAddInfo() {
		//1.  �߰� ������ �Է����� ��� Y�� �Է¹����� �߰��Է�, N�� ������ �߰� �Է� X ���
		System.out.print("�߰� ������ �Է��Ͻðڽ��ϱ�? �Է��Ͻ÷��� Y, �׸��Ͻ÷��� N�� �Է��� �ּ��� >>> ");
		String sel = stdIn.nextLine();
		String address;
		String email;
		if (sel.equals("Y") || sel.equals("y")) {
			System.out.print("�ּҸ� �Է��� �ּ���");
			address = stdIn.nextLine();
			System.out.print("�̸����� �Է��� �ּ���.");
			email = stdIn.nextLine();
			
			setAddress(address);
			setEmail(email);
		}
		else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}

	}
	
	// ȸ�� ���� ���� ��� �޼ҵ�
	void printMemberInfo() {
		System.out.println(toString());
	}
	
	// �α��� �޼ҵ� (����, ����)
	private boolean confirmLogin(String memberID, String password) {
		if (super.getMemeberID().equals(memberID) && super.getPassword().equals(password)) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			return true;
		}
		else {
			System.out.println("�α��� ������ ��Ȯ���� �ʽ��ϴ�.");
			return false;
		}
	}
	
	public void login() { // �α��� �޼ҵ�
		// �ʵ�
		String memberID, password;
		
		System.out.println("�α��� ������ �Է��� �ּ���.");
		
		do {
			System.out.println("���̵� �Է��� �ּ��� >>> ");
			memberID = stdIn.nextLine();
			System.out.println("��й�ȣ�� �Է��� �ּ��� >>> ");
			password = stdIn.nextLine();
		}
		while (!confirmLogin(memberID, password));
		
	}
	
}
