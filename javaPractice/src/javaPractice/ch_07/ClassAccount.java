package javaPractice.ch_07;

class Account {
	// Account 속성(변수)
	String AccountName; // 계좌명의
	String AccountNo; // 계좌번호
	long AccountBalance; // 예금잔고
	
	final long MIN_BALANCE = 0;
	
	// Account 기능(메소드)
	void AccountBalancePut(int income) { // 예금을 할 때
		if (AccountBalance > 0) AccountBalance += income;
		
	}
	void AccountBalanceOut(int outcome) { // 인출을 할 때
		if (AccountBalance > MIN_BALANCE) AccountBalance -= outcome;
	}
	void printAccount() {
		System.out.println("■ " + AccountName + "의 계좌");
		System.out.println("  계좌명의: " + AccountName); // 계좌명의: 준규
		System.out.println("  계좌번호: " + AccountNo); // 계좌번호: 20000909
		System.out.println("  예금잔고: " + AccountBalance); // 예금잔고: 25000
	}
	
}

public class ClassAccount {

	public static void main(String[] args) {
		Account junkyu = new Account();
		
		junkyu.AccountName = "김준규";
		junkyu.AccountNo = "20000909";
		junkyu.AccountBalance = 30000;
		
		junkyu.printAccount();
		

	}

}
