package testFromS;

import java.util.Scanner;


/* 4.MemberInsert Ŭ�������� 
 * 1) �߰������� �Է����� ��� "Y"�� �Է� ������ 
 * �߰��Է��� �ް� "N"�� ������ �߰� �Է��� ���� �ʴ� ����� �־�� �մϴ�.
   2) �α��� ����� ȸ�� ������ �� ������ �������� ó���ϰ�, 
   �α��� ������ ��Ȯ���� ������ ��� �α��� ������ ����� �մϴ�.*/

public class MemberInsert extends Member{
	MemberInsert(String memberID, String password, String name) {
		super(memberID, password, name);
	}


	Scanner scanner = new Scanner(System.in);
	

	public void updateAddInfo() {
//		String aa = scanner.nextLine();
		while(true) {
		System.out.println("�߰� ������ �Է��Ͻðڽ��ϱ�?");
		System.out.println("�߰� ������ �Է��Ͻ÷��� Y, �׸� �ϽǷ��� N�� �Է��� �ֽʽÿ�.>>>");
		String aa = scanner.nextLine();
		
		
		if(aa.equals("Y")) {
			System.out.println("�ּҸ� �Է��� �ֽʽÿ�.>>>");
			scanner.nextLine();
			System.out.println("�̸����� �Է��� �ֽʽÿ�.>>>");
			scanner.nextLine();
			
		}
		else if(aa.equals("N")) {
			break;
		}
		else {
			System.out.println("�ٽ� �Է��� �ֽʽÿ�.");
		}
	}
}
	public void printMemberInfo() {
		
	System.out.println(toString());
	}

	public void login(){
		String memberID, password;
		
		System.out.println("�α��� ������ �Է��� �ּ���");
		while(true) {
		
			System.out.println("���̵� �Է��� �ּ��� >>>");
			memberID=scanner.nextLine();
			System.out.println("��й�ȣ�� �Է��� �ּ��� >>>");
			password = scanner.nextLine();
			
			if(getMemberID().equals(memberID) && getPassword().equals(password)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				break;
			}
			else {
				System.out.println("�α��� ������ ��Ȯ���� �ʽ��ϴ�.");
				continue;
			}
		}
	}
	
	
}
