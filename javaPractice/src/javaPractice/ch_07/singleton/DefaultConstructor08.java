package javaPractice.ch_07.singleton;


class Account {
	// �Ӽ� ����
	private int balance; // �ܺο��� ������� ���� X, �ܰ�
	
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	// �޼ҵ� ����
	
	public void setBalance (int balance) { // balance�� ���� �����ؾ��� => �Ű����� O
		this.balance = (balance < MIN_BALANCE || balance > MAX_BALANCE) ? this.balance : balance;
	}
	// balance�� balance�� min_balance���� �۰ų�, max_balance���� ũ�� => min���� ������ this.balance, max ���� Ŭ �� balance
	
	public int getBalance() { // �ܾ� ���� �޾ƿ;��� => �Ű����� X
		return balance; 
	}
	/* ���侲
	public void setBalance(int setBalance) { // ���� �� ��
		if (balance > 0) balance += setBalance;
	}
	
	public void setBalanceOut(int outcome) { // ������ �� ��
		if (balance > MIN_BALANCE) balance -= outcome;
	}
	
	public int getBalance() { // �� �޴� �� => �Ű�����X
		return balance;
	}
	*/
	
}

public class DefaultConstructor08 {
	
	/*
	 ���� ���� ��ü�� Account ��ü�� �ܰ� (balance) �ʵ带 ������ �ִ�.
	 balance �ʵ�� �������� �� �� ����, �ִ� �鸸������ ������ �� �ִ�.
	 �ܺο��� balance �ʵ带 ������� �������� ���ϵ��� �ϰ�,
	 0 ~ 1,000,000 ������ ���� ���� �� �ֵ��� Account Ŭ������ �ۼ��϶�.
	 1. Setter �� Getter�� �̿��Ѵ�.
	 2. 0�� 1,000,000 �� MIN_BALANCE �� MAX_BALANCE ����� �����ؼ� �̿��Ѵ�.
	 3. Setter�� �Ű����� �����̰ų� �鸸���� �ʰ��ϸ� ���� balance ���� �����Ѵ�.
	*/
	
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("���� �ܰ�: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("���� �ܰ�: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("���� �ܰ�: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("���� �ܰ�: " + account.getBalance());

	}

}
