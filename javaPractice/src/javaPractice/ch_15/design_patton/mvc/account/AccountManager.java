package javaPractice.ch_15.design_patton.mvc.account;

import java.util.ArrayList;
import java.util.Scanner;

//문제, 중복되는 내용들 (동일 계좌가 있다면~ / 계좌번호가 존재하지 않습니다~ ) 하나로 만들어서 메소드 호출하는 방법으로 하기

public class AccountManager {
	// 필드
	private ArrayList<Account> list;
	private Scanner stdIn;
	
	public AccountManager() {
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}
	
	// 메소드
	public int accountInput() {	// 계좌번호 적기
		System.out.print("계좌번호: ");
		int id = stdIn.nextInt();
		return id;
	}
	
	public void accountErr() {	// 계좌 존재 X
		System.out.println("해당 계좌가 존재하지 않습니다.");
	}
	
	public void accountInfo() {	// 계좌 정보 조회
		System.out.println(list.toString() + "\t");
	}
	
	public void makeAccount() {	// 계좌 개설
		Account account = new Account();
		
//		System.out.print("계좌번호: ");
//		account.setId(stdIn.nextInt());
		accountInput();
		
		System.out.print("이름: ");
		account.setName(stdIn.next());
		
		System.out.print("입금액: ");
		account.setBalance(stdIn.nextLong());
		
		list.add(account);
		
		System.out.println("계좌가 개설되었습니다.");
		System.out.println(list.toString() + "\t");
	}
	
	public void deposit() {	// 입금
		
		// 기존것 => 메소드로 바꾸기!
//		System.out.print("계좌번호: ");
//		int id = stdIn.nextInt();
		int id = accountInput();	// 메소드 바꾸기 완!
		
		System.out.print("입금액: ");
		long money = stdIn.nextLong();
		
		// 해당 계좌 찾기
		for(Account account : list) {
			//class Account 의 매개변수 account의 값을 list의 배열에 담음
			
			if(account.getId() == id) { // 동일한 계좌가 존재하면,
				account.setBalance(money + account.getBalance());
				// account에서 잔액을 조정함. 
				
				System.out.println("입금완료 되었습니다.");
				return;
			}
		}
		accountErr();
		
	}
	
	public void withdraw() { // 출금
		// 기존것 => 메소드로 바꾸기
//		System.out.println("계좌번호: ");
//		int id = stdIn.nextInt();
		int id = accountInput();	// 메소드 변경 완!
		
		System.out.print("출금액: ");
		long money = stdIn.nextLong();
		
		// 해당 계좌 찾기
		for (Account account : list) {
			if (account.getId() == id) { // 동일한 계좌가 있다면,
				if(account.getBalance() < money) { // 계좌 잔액이 출금액(money)보다 작으면
					System.out.println("잔액이 부족합니다.");
				}
				else {
					account.setBalance(account.getBalance() - money);
					System.out.println("출금완료 되었습니다.");
				}
				return;
			}
		}
		accountErr();
	}
	
	public void inquire() {	// 잔액 조회
		// 기존것 => 메소드로 바꾸기 
//		System.out.print("계좌번호: ");
//		int id = stdIn.nextInt(); 
		int id = accountInput();	// 메소드 변경 완!
		
		// 해당 계좌 찾기
		for (Account account : list) {
			if(account.getId() == id ) {
				//System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
				accountInfo(); // 메소드로 변경 완!
				return;
			}
		}
		accountErr();
	}
	
	public void display() {	// 전체 출력
		for(Account account : list) {
			//System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
			accountInfo();	// 메소드로 변경 완!
		}
	}
	
	private Account findAccountTraverse(int id) {
		// 해당 계좌 찾기
		for (Account account : list) {
			if(account.getId() == id) { // 동일한 계좌가 있으면
				return account;
			}
		}
		return null;
	}
	
	private Account findAccount(int id) { // 입금, 출금, 조회 시 계좌 찾기
		Account account = findAccountTraverse(id);
		if (account == null) {
			accountErr();
		}
		return account;
	}
	
	private boolean isAccount(int id) { // 계좌 중복 조회이기 때문에 account를 리턴 X boolean 값을 리턴
		return (findAccountTraverse(id) == null) ? false : true;
	}
	
}
