package javaPractice.ch_06;

import java.util.Scanner;

public class MethodTest06 {
	// �α���, �α׾ƿ� �޼ҵ� 2�� �����
	
	// login() �޼ҵ�� logout() �޼ҵ带 �����Ϸ��� �Ѵ�.
	// login() �޼ҵ带 ȣ���� ���� �Ű������� id�� password�� �����ϰ�, 
	// logout() �޼ҵ�� id�� �Ű������� ����
	
	// 1. login() �޼ҵ�� �Ű��� id�� "admin", �Ű��� password�� "1234" �� ��쿡�� true�� �����ϰ�
	//	 �� ���� ���� ��� false�� �����ϵ��� �Ͻÿ�
	// 2. logout() �޼ҵ�� "�α׾ƿ� �Ǿ����ϴ�."�� ��µǵ��� �Ͻÿ�
	
	public static boolean login(String id, String password) {
		//���ڿ��� �����ϴٴ� �ǹ� : equals 
		if (id.equals("admin") && password.equals("1234")) {
			return true;
		}
		else {
			return false;
		}
		// if �� ����ϰ� �ϴ� ���
		// return (id.equals("admin")&& password.equals("1234"));
	}
	
	public static void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String id, password;
		System.out.print("���̵� �Է��� �ּ���: ");
		id = scanner.nextLine();
		System.out.print("��й�ȣ�� �Է��� �ּ���: ");
		password = scanner.nextLine();
		
		boolean result = login(id, password);
		// �ڵ�� �� ����� ���
		// boolean result = login(id, password) �� ���ְ� �ٷ� 
		// if (login(id, password)) 
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�");
			logout(id);
		}
		
		else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}

	}

}
