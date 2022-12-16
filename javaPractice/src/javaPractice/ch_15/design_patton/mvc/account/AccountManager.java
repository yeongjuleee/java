package javaPractice.ch_15.design_patton.mvc.account;

import java.util.ArrayList;
import java.util.Scanner;

//����, �ߺ��Ǵ� ����� (���� ���°� �ִٸ�~ / ���¹�ȣ�� �������� �ʽ��ϴ�~ ) �ϳ��� ���� �޼ҵ� ȣ���ϴ� ������� �ϱ�

public class AccountManager {
	// �ʵ�
	private ArrayList<Account> list;
	private Scanner stdIn;
	
	public AccountManager() {
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}
	
	// �޼ҵ�
	public int accountInput() {	// ���¹�ȣ ����
		System.out.print("���¹�ȣ: ");
		int id = stdIn.nextInt();
		return id;
	}
	
	public void accountErr() {	// ���� ���� X
		System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
	}
	
	public void accountInfo() {	// ���� ���� ��ȸ
		System.out.println(list.toString() + "\t");
	}
	
	public void makeAccount() {	// ���� ����
		Account account = new Account();
		
//		System.out.print("���¹�ȣ: ");
//		account.setId(stdIn.nextInt());
		accountInput();
		
		System.out.print("�̸�: ");
		account.setName(stdIn.next());
		
		System.out.print("�Աݾ�: ");
		account.setBalance(stdIn.nextLong());
		
		list.add(account);
		
		System.out.println("���°� �����Ǿ����ϴ�.");
		System.out.println(list.toString() + "\t");
	}
	
	public void deposit() {	// �Ա�
		
		// ������ => �޼ҵ�� �ٲٱ�!
//		System.out.print("���¹�ȣ: ");
//		int id = stdIn.nextInt();
		int id = accountInput();	// �޼ҵ� �ٲٱ� ��!
		
		System.out.print("�Աݾ�: ");
		long money = stdIn.nextLong();
		
		// �ش� ���� ã��
		for(Account account : list) {
			//class Account �� �Ű����� account�� ���� list�� �迭�� ����
			
			if(account.getId() == id) { // ������ ���°� �����ϸ�,
				account.setBalance(money + account.getBalance());
				// account���� �ܾ��� ������. 
				
				System.out.println("�ԱݿϷ� �Ǿ����ϴ�.");
				return;
			}
		}
		accountErr();
		
	}
	
	public void withdraw() { // ���
		// ������ => �޼ҵ�� �ٲٱ�
//		System.out.println("���¹�ȣ: ");
//		int id = stdIn.nextInt();
		int id = accountInput();	// �޼ҵ� ���� ��!
		
		System.out.print("��ݾ�: ");
		long money = stdIn.nextLong();
		
		// �ش� ���� ã��
		for (Account account : list) {
			if (account.getId() == id) { // ������ ���°� �ִٸ�,
				if(account.getBalance() < money) { // ���� �ܾ��� ��ݾ�(money)���� ������
					System.out.println("�ܾ��� �����մϴ�.");
				}
				else {
					account.setBalance(account.getBalance() - money);
					System.out.println("��ݿϷ� �Ǿ����ϴ�.");
				}
				return;
			}
		}
		accountErr();
	}
	
	public void inquire() {	// �ܾ� ��ȸ
		// ������ => �޼ҵ�� �ٲٱ� 
//		System.out.print("���¹�ȣ: ");
//		int id = stdIn.nextInt(); 
		int id = accountInput();	// �޼ҵ� ���� ��!
		
		// �ش� ���� ã��
		for (Account account : list) {
			if(account.getId() == id ) {
				//System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
				accountInfo(); // �޼ҵ�� ���� ��!
				return;
			}
		}
		accountErr();
	}
	
	public void display() {	// ��ü ���
		for(Account account : list) {
			//System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
			accountInfo();	// �޼ҵ�� ���� ��!
		}
	}
	
	private Account findAccountTraverse(int id) {
		// �ش� ���� ã��
		for (Account account : list) {
			if(account.getId() == id) { // ������ ���°� ������
				return account;
			}
		}
		return null;
	}
	
	private Account findAccount(int id) { // �Ա�, ���, ��ȸ �� ���� ã��
		Account account = findAccountTraverse(id);
		if (account == null) {
			accountErr();
		}
		return account;
	}
	
	private boolean isAccount(int id) { // ���� �ߺ� ��ȸ�̱� ������ account�� ���� X boolean ���� ����
		return (findAccountTraverse(id) == null) ? false : true;
	}
	
}
