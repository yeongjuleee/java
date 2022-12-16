package javaPractice.ch_16.db_account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

//����, �ߺ��Ǵ� ����� (���� ���°� �ִٸ�~ / ���¹�ȣ�� �������� �ʽ��ϴ�~ ) �ϳ��� ���� �޼ҵ� ȣ���ϴ� ������� �ϱ�

public class AccountManager {
	// �ʵ�
	private ArrayList<Account> list;
	private Scanner stdIn;
	private AccountDAO accountDAO;
	
	// ������
	public AccountManager() {
		accountDAO = new AccountDAO();
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}
	
	// DB���� ����
	public void disConnect() {
		accountDAO.disConnect();
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

	public void makeAccount() { // ���� ����
		Account account = new Account();
		
		System.out.print("���� ��ȣ: ");
		account.setId(stdIn.nextInt());
		
		System.out.print("�̸�: ");
		account.setName(stdIn.next());
		
		System.out.print("�Աݾ�: ");
		account.setBalance(stdIn.nextLong());
		
		// list.add(account);
		if(accountDAO.insertAccount(account)) {
			System.out.println("���°� �����Ǿ����ϴ�.");
			// System.out.println(list.toString() + "\t");
		}
		else {
			System.out.println("���� ������ �����߽��ϴ�.");
		}
	}
	
	
	
	
	public void deposit() {	// �Ա�
		
		int id = accountInput();	// �޼ҵ� �ٲٱ� ��!
		
		System.out.print("�Աݾ�: ");
		long money = stdIn.nextLong();
		
		// �ش� ���� ã��
		if(accountDAO.isAccount(id)) {
			accountDAO.updateBalance(id, money, true);
		}
		else {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
		}
		
	}
	
	
	
	public void withdraw() { // ���
		int id = accountInput();	// �޼ҵ� ���� ��!
		
		System.out.print("��ݾ�: ");
		long money = stdIn.nextLong();
		
		// �ش� ���� ã��
		if(accountDAO.isAccount(id)) {
			Account account = accountDAO.selectOne(id);
			if (account.getBalance() < money) {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			else {
				accountDAO.updateBalance(id, money, false);
				System.out.println("��ݿϷ� �Ǿ����ϴ�.");
			}
			return;
		}
		else {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
		}
	}
	
	
	
	public void inquire() {	// �ܾ� ��ȸ
		// ������ => �޼ҵ�� �ٲٱ� 
//		System.out.print("���¹�ȣ: ");
//		int id = stdIn.nextInt(); 
		int id = accountInput();	// �޼ҵ� ���� ��!
		
		// �ش� ���� ã��
		Account account = accountDAO.selectOne(id);
		if (account != null) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
		else {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
		}
	}
	
	
	// DB ����
	
	public void display() {	// ��ü ���
		// private ArrayList<Account> selectAll() �� display()�� ȣ���
		ArrayList<Account> list = accountDAO.selectAll();
		for(Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
			//accountInfo();	// �޼ҵ�� ���� ��!
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
	
}
