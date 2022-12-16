package javaPractice.ch_07.singleton;


class Account {
	// 속성 선언
	private int balance; // 외부에서 마음대로 변경 X, 잔고
	
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	// 메소드 선언
	
	public void setBalance (int balance) { // balance에 값을 저장해야함 => 매개변수 O
		this.balance = (balance < MIN_BALANCE || balance > MAX_BALANCE) ? this.balance : balance;
	}
	// balance에 balance가 min_balance보다 작거나, max_balance보다 크면 => min보다 작을땐 this.balance, max 보다 클 땐 balance
	
	public int getBalance() { // 잔액 값을 받아와야함 => 매개변수 X
		return balance; 
	}
	/* 오답쓰
	public void setBalance(int setBalance) { // 예금 할 때
		if (balance > 0) balance += setBalance;
	}
	
	public void setBalanceOut(int outcome) { // 인출을 할 때
		if (balance > MIN_BALANCE) balance -= outcome;
	}
	
	public int getBalance() { // 값 받는 애 => 매개변수X
		return balance;
	}
	*/
	
}

public class DefaultConstructor08 {
	
	/*
	 은행 계좌 객체인 Account 객체는 잔고 (balance) 필드를 가지고 있다.
	 balance 필드는 음수값이 될 수 없고, 최대 백만원까지 저장할 수 있다.
	 외부에서 balance 필드를 마음대로 변경하지 못하도록 하고,
	 0 ~ 1,000,000 범위의 값만 가질 수 있도록 Account 클래스를 작성하라.
	 1. Setter 의 Getter를 이용한다.
	 2. 0과 1,000,000 은 MIN_BALANCE 와 MAX_BALANCE 상수를 선언해서 이용한다.
	 3. Setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance 값을 유지한다.
	*/
	
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());

	}

}
