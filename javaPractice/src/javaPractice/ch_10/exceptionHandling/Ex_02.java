package javaPractice.ch_10.exceptionHandling;

import java.util.Scanner;
/*
�α��� ������ Ʋ�� ��쿡 ����� ����� ���� ���� Ŭ������ �����
���� (����ó��) ��ų��
*/
class LoginUncertainException extends Exception {
	// �α��ο� �����Ͽ��� ���(���ܻ���)�� LoginUncertainException���� ���ܸ� ����.
	public LoginUncertainException (String message) {
		super(message);
	}
	
	// ���ܰ� �߻��� �� �α׷� ����� �ڵ�
	public LoginUncertainException(String message, String memberID, String password) {
		super(message);
		updateLog(memberID, password);
	}
	
	public void updateLog(String memberID, String password) {
		
	}
}

public class Ex_02 {

	String memberID = "abc";
	String password = "1234";
	Scanner stdIn = new Scanner(System.in);
	
	private boolean confirmLogin(String memberID, String password) throws LoginUncertainException {
		// confirmLogin ���� ���ܰ� �߻��ϸ�, LoginUncertainException ���� ���ܸ� ����.
		
		if (this.memberID.equals(memberID) && this.password.equals(password)) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			return true;
		}
		else {
			//System.out.println("�α��� ������ ��Ȯ���� �ʽ��ϴ�.");
			//return false;
			// ���ܰ� �߻��� �� �ִ� ����.
				// �׷��� �̰��� catch�� ���� ���, catch�� ����ǰ�, System.out~ �� ����X
				// �׷��ٰ� return false�� ���� ���� ������ ��� return false�� ����Ǿ� System.out ~ ����X
				// �׷��� �� �� �ϳ��� �����ؾ���.
				// => ���ܸ� �߻����Ѽ� ����
			throw new LoginUncertainException("�α��� ������ ��Ȯ���� �ʽ��ϴ�.");
		}
	}
	
	public void login() {
		String memberID, password;
		// try-catch �߰��� ���� ���� answer �߰�.
		Boolean answer;
		
		System.out.println("�α��� ������ �Է��� �ּ���.");
		
		do {
			System.out.println("���̵� �Է��� �ּ��� >>>");
			memberID = stdIn.nextLine();
			System.out.println("��й�ȣ�� �Է��� �ּ��� >>>");
			password = stdIn.nextLine();
			
			// try-catch �߰�
			try {
				answer = confirmLogin(memberID, password);
				// ���� �߻� ����
			}
			catch (LoginUncertainException e) {
				System.out.println(e.getMessage());
				answer = false;
				// answer �� false���� ��� �ݺ��� ��. 
				// �׷��� �������� ��쿡 answer�� false �� ����.
			}
		}
		while ( 
				// try-catch�� ������ ���� ��
				//!confirmLogin(memberID, password)
				
				!answer
				// �ݺ��� �ϱ� ���� while�� !answer ����
				);
	}
	
	public static void main(String[] args) {
		Ex_02 ex = new Ex_02();
		ex.login();

	}

}
