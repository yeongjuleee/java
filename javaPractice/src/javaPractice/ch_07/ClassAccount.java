package javaPractice.ch_07;

class Account {
	// Account �Ӽ�(����)
	String AccountName; // ���¸���
	String AccountNo; // ���¹�ȣ
	long AccountBalance; // �����ܰ�
	
	final long MIN_BALANCE = 0;
	
	// Account ���(�޼ҵ�)
	void AccountBalancePut(int income) { // ������ �� ��
		if (AccountBalance > 0) AccountBalance += income;
		
	}
	void AccountBalanceOut(int outcome) { // ������ �� ��
		if (AccountBalance > MIN_BALANCE) AccountBalance -= outcome;
	}
	void printAccount() {
		System.out.println("�� " + AccountName + "�� ����");
		System.out.println("  ���¸���: " + AccountName); // ���¸���: �ر�
		System.out.println("  ���¹�ȣ: " + AccountNo); // ���¹�ȣ: 20000909
		System.out.println("  �����ܰ�: " + AccountBalance); // �����ܰ�: 25000
	}
	
}

public class ClassAccount {

	public static void main(String[] args) {
		Account junkyu = new Account();
		
		junkyu.AccountName = "���ر�";
		junkyu.AccountNo = "20000909";
		junkyu.AccountBalance = 30000;
		
		junkyu.printAccount();
		

	}

}
