package javaPractice.ch_07.account;

import java.util.Scanner;

class Account {
	// 계좌 정보를 저장하기 위한 클래스
	// 필드, 생성자, getter / setter 로만 구성
	
	private String ano; // 계좌번호
	private String owner; // 계좌주
	private int balance; // 잔액
	
	final int MIN_BALANCE = 0; // 0 이하는 예금 못 하게 하기 위해 만듦.
	
	// 기본생성자 생성
	public Account(String ano, String owner, int balance) { // 기본생성자임을 알 수 있음
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	
	// 기능(메소드) 선언
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
	
	// 계좌 생성 예제
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
 	
	public static void main(String[] args) {
		
		boolean run = true; 
		while(run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택=> ");
			
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
		System.out.println("시스템 종료");
		
	}
		// 계좌 생성하기
		private static void createAccout() {
			System.out.println("--------------");
			System.out.println("계좌생성");
			System.out.println("--------------");
			
			System.out.print("계좌번호: ");
			String ano = scanner.next();
			
			System.out.print("계좌주: ");
		      String owner = scanner.next();
		      
		      System.out.print("초기입금액: ");
		      int balance = scanner.nextInt();
		      
		      // Account newAccount = new Account(ano, owner, balance) : 새로운 계좌를 생성하는데 입력받은 값을 newAccount에 저장.
		      for(int i = 0; i<accountArray.length; i++) {
		         if(accountArray[i] == null) {   //배열의 빈 방 찾는 조건문
		            accountArray[i] = new Account(ano, owner, balance);   //배열이 비어있으면 거기에 집어넣겠다
		            System.out.println("결과: 계좌가 생성되었습니다.");
		            break;
		         }
		      }

		}
		
		// 계좌 목록 보기
		private static void accountList() { 
			//작성 위치 
			// for문을 이용? 왜? 
			
			System.out.println("--------------");
			System.out.println("계좌목록");
			System.out.println("--------------");
			for (int i = 0; i < accountArray.length; i++) { // 생성된 계좌의 배열만큼 반복
				Account account = accountArray[i]; // 각 번호의 계좌를 account에 저장(주소를 저장함)
				if (account != null) {  // 주소가 저장되어 있으면, 값을 불러오기.
					System.out.print(account.getAno());
					System.out.print("      ");
					System.out.print(account.getOwner());
					System.out.print("      ");
					System.out.print(account.getBalance());
					System.out.println();
					
				}
				else { // null 값이 저장된 경우에는 더 이상 순회 할 필요X
					break;
				}
			}
			
		
		}
			
		// 예금하기 : 통장을 확인하기 위해서 ano와 동일한 Account를 호출해야함. 
		private static void deposit() {
			//작성 위치 findAccount() 호출해서 사용
			
			System.out.println("---------------");
			System.out.println("예금");
			System.out.println("---------------");
			System.out.print("계좌번호: ");
			
			String ano = scanner.next();
			System.out.print("예금액: ");
			int money = scanner.nextInt();
			Account account = findAccount(ano);
			if (account == null) {
				System.out.println("결과: 계좌가 없습니다.");
				return;
			}
			account.setBalance(account.getBalance() + money);
			System.out.println("결과: 예금이 성공되었습니다.");
			
		}
		
		// 출금하기
		private static void withdraw() {
			//작성 위치 findAccount() 호출해서 사용
			System.out.println("---------------");
			System.out.println("출금");
			System.out.println("---------------");
			System.out.print("계좌번호: ");
			
			String ano = scanner.next();
			System.out.print("출금액: ");
			int money = scanner.nextInt();
			Account account = findAccount(ano);
			if (account == null) {
				System.out.println("결과: 계좌가 없습니다.");
				return;
			}
			
			if (money > account.getBalance()) {
				System.out.println("결과: 잔액보다 출금액이 커서 출금에 실패했습니다.");
			}
			else { 
				account.setBalance(account.getBalance() - money);
				System.out.println("결과: 출금이 성공되었습니다.");
			}
			
			
		}
		
		// Account 배열에서 ano와 동일한 Account 객체 찾기
		private static Account findAccount(String ano) { 
			Account account = null;
			for(int i=0; i<accountArray.length; i++) { 
				if (accountArray[i] != null) { // 만약 accountArray에 값이 저장X 라면,
					String dbAno = accountArray[i].getAno(); // dbAno에 accountArray[i]의 값(통장 번호)을 가져옴
					if (dbAno.equals(ano)) { // dbAno와 ano가 같은지 비교 => 같으면
						account = accountArray[i]; // account에 accountArray를 저장하고
						break; // for문 탈출 => return하러 감.
					}
				}
				else { // null 값이 저장된 경우는 더이상 순회할 필요X 
					break;
				}
			}
			return account; // 빠져나오기
		}
}
