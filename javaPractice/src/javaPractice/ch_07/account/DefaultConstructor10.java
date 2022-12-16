package javaPractice.ch_07.account;

import java.util.Scanner;

class Account {
	// ���� ������ �����ϱ� ���� Ŭ����
	// �ʵ�, ������, getter / setter �θ� ����
	
	private String ano; // ���¹�ȣ
	private String owner; // ������
	private int balance; // �ܾ�
	
	final int MIN_BALANCE = 0; // 0 ���ϴ� ���� �� �ϰ� �ϱ� ���� ����.
	
	// �⺻������ ����
	public Account(String ano, String owner, int balance) { // �⺻���������� �� �� ����
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	
	// ���(�޼ҵ�) ����
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String Owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

public class DefaultConstructor10 {
	
	// ���� ���� ����
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
 	
	public static void main(String[] args) {
		
		boolean run = true; 
		while(run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("---------------------------------------------------------");
			System.out.print("����=> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccout();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("�ý��� ����");
		
	}
		// ���� �����ϱ�
		private static void createAccout() {
			System.out.println("--------------");
			System.out.println("���»���");
			System.out.println("--------------");
			
			System.out.print("���¹�ȣ: ");
			String ano = scanner.next();
			
			System.out.print("������: ");
		      String owner = scanner.next();
		      
		      System.out.print("�ʱ��Աݾ�: ");
		      int balance = scanner.nextInt();
		      
		      // Account newAccount = new Account(ano, owner, balance) : ���ο� ���¸� �����ϴµ� �Է¹��� ���� newAccount�� ����.
		      for(int i = 0; i<accountArray.length; i++) {
		         if(accountArray[i] == null) {   //�迭�� �� �� ã�� ���ǹ�
		            accountArray[i] = new Account(ano, owner, balance);   //�迭�� ��������� �ű⿡ ����ְڴ�
		            System.out.println("���: ���°� �����Ǿ����ϴ�.");
		            break;
		         }
		      }

		}
		
		// ���� ��� ����
		private static void accountList() { 
			//�ۼ� ��ġ 
			// for���� �̿�? ��? 
			
			System.out.println("--------------");
			System.out.println("���¸��");
			System.out.println("--------------");
			for (int i = 0; i < accountArray.length; i++) { // ������ ������ �迭��ŭ �ݺ�
				Account account = accountArray[i]; // �� ��ȣ�� ���¸� account�� ����(�ּҸ� ������)
				if (account != null) {  // �ּҰ� ����Ǿ� ������, ���� �ҷ�����.
					System.out.print(account.getAno());
					System.out.print("      ");
					System.out.print(account.getOwner());
					System.out.print("      ");
					System.out.print(account.getBalance());
					System.out.println();
					
				}
				else { // null ���� ����� ��쿡�� �� �̻� ��ȸ �� �ʿ�X
					break;
				}
			}
			
		
		}
			
		// �����ϱ� : ������ Ȯ���ϱ� ���ؼ� ano�� ������ Account�� ȣ���ؾ���. 
		private static void deposit() {
			//�ۼ� ��ġ findAccount() ȣ���ؼ� ���
			
			System.out.println("---------------");
			System.out.println("����");
			System.out.println("---------------");
			System.out.print("���¹�ȣ: ");
			
			String ano = scanner.next();
			System.out.print("���ݾ�: ");
			int money = scanner.nextInt();
			Account account = findAccount(ano);
			if (account == null) {
				System.out.println("���: ���°� �����ϴ�.");
				return;
			}
			account.setBalance(account.getBalance() + money);
			System.out.println("���: ������ �����Ǿ����ϴ�.");
			
		}
		
		// ����ϱ�
		private static void withdraw() {
			//�ۼ� ��ġ findAccount() ȣ���ؼ� ���
			System.out.println("---------------");
			System.out.println("���");
			System.out.println("---------------");
			System.out.print("���¹�ȣ: ");
			
			String ano = scanner.next();
			System.out.print("��ݾ�: ");
			int money = scanner.nextInt();
			Account account = findAccount(ano);
			if (account == null) {
				System.out.println("���: ���°� �����ϴ�.");
				return;
			}
			
			if (money > account.getBalance()) {
				System.out.println("���: �ܾ׺��� ��ݾ��� Ŀ�� ��ݿ� �����߽��ϴ�.");
			}
			else { 
				account.setBalance(account.getBalance() - money);
				System.out.println("���: ����� �����Ǿ����ϴ�.");
			}
			
			
		}
		
		// Account �迭���� ano�� ������ Account ��ü ã��
		private static Account findAccount(String ano) { 
			Account account = null;
			for(int i=0; i<accountArray.length; i++) { 
				if (accountArray[i] != null) { // ���� accountArray�� ���� ����X ���,
					String dbAno = accountArray[i].getAno(); // dbAno�� accountArray[i]�� ��(���� ��ȣ)�� ������
					if (dbAno.equals(ano)) { // dbAno�� ano�� ������ �� => ������
						account = accountArray[i]; // account�� accountArray�� �����ϰ�
						break; // for�� Ż�� => return�Ϸ� ��.
					}
				}
				else { // null ���� ����� ���� ���̻� ��ȸ�� �ʿ�X 
					break;
				}
			}
			return account; // ����������
		}
}
