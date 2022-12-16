package javaPractice.ch_16.db_account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

//문제, 중복되는 내용들 (동일 계좌가 있다면~ / 계좌번호가 존재하지 않습니다~ ) 하나로 만들어서 메소드 호출하는 방법으로 하기

public class AccountManager {
	// 필드
	private ArrayList<Account> list;
	private Scanner stdIn;
	private AccountDAO accountDAO;
	
	// 생성자
	public AccountManager() {
		accountDAO = new AccountDAO();
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}
	
	// DB관련 시작
	public void disConnect() {
		accountDAO.disConnect();
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

	public void makeAccount() { // 계좌 개설
		Account account = new Account();
		
		System.out.print("계좌 번호: ");
		account.setId(stdIn.nextInt());
		
		System.out.print("이름: ");
		account.setName(stdIn.next());
		
		System.out.print("입금액: ");
		account.setBalance(stdIn.nextLong());
		
		// list.add(account);
		if(accountDAO.insertAccount(account)) {
			System.out.println("계좌가 개설되었습니다.");
			// System.out.println(list.toString() + "\t");
		}
		else {
			System.out.println("계좌 생성에 실패했습니다.");
		}
	}
	
	
	
	
	public void deposit() {	// 입금
		
		int id = accountInput();	// 메소드 바꾸기 완!
		
		System.out.print("입금액: ");
		long money = stdIn.nextLong();
		
		// 해당 계좌 찾기
		if(accountDAO.isAccount(id)) {
			accountDAO.updateBalance(id, money, true);
		}
		else {
			System.out.println("해당 계좌번호가 존재하지 않습니다.");
		}
		
	}
	
	
	
	public void withdraw() { // 출금
		int id = accountInput();	// 메소드 변경 완!
		
		System.out.print("출금액: ");
		long money = stdIn.nextLong();
		
		// 해당 계좌 찾기
		if(accountDAO.isAccount(id)) {
			Account account = accountDAO.selectOne(id);
			if (account.getBalance() < money) {
				System.out.println("잔액이 부족합니다.");
			}
			else {
				accountDAO.updateBalance(id, money, false);
				System.out.println("출금완료 되었습니다.");
			}
			return;
		}
		else {
			System.out.println("해당 계좌번호가 존재하지 않습니다.");
		}
	}
	
	
	
	public void inquire() {	// 잔액 조회
		// 기존것 => 메소드로 바꾸기 
//		System.out.print("계좌번호: ");
//		int id = stdIn.nextInt(); 
		int id = accountInput();	// 메소드 변경 완!
		
		// 해당 계좌 찾기
		Account account = accountDAO.selectOne(id);
		if (account != null) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
		else {
			System.out.println("해당 계좌번호가 존재하지 않습니다.");
		}
	}
	
	
	// DB 종료
	
	public void display() {	// 전체 출력
		// private ArrayList<Account> selectAll() 이 display()에 호출됨
		ArrayList<Account> list = accountDAO.selectAll();
		for(Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
			//accountInfo();	// 메소드로 변경 완!
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
	
}
