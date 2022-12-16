package javaPractice.ch_07;

public class Class11 {
	// 두 사람의 은행 계좌 데이터를 취급한느 프로그램
	// 어떤 경우에 클래스를  사용하는가 => 이 코드를 기반으로 Class 생성

	public static void main(String[] args) {
		String junkyuAccountName = "준규"; // 준규의 계좌명의
		String junkyuAccountNo = "20000909"; // 준규의 계좌번호
		long junkyuAccountBalance = 30000; // 준규의 예금 잔고
		
		String jihoonAccountName = "지훈"; // 지훈의 계좌명의
		String jihoonAccountNo = "20000314"; // 지훈의 계좌번호
		long jihoonAccountBalance = 29000; // 지훈의 예금 잔고
		
		junkyuAccountBalance -= 5000; // 준규가 5000원 인출
		jihoonAccountBalance += 1000; // 지훈이 1000원 예금
		
		System.out.println("■ 준규의 계좌");
		System.out.println("  계좌명의: " + junkyuAccountName); // 계좌명의: 준규
		System.out.println("  계좌번호: " + junkyuAccountNo); // 계좌번호: 20000909
		System.out.println("  예금잔고: " + junkyuAccountBalance); // 예금잔고: 25000
		
		System.out.println("■ 지훈의 계좌");
		System.out.println("  계좌명의: " + jihoonAccountName); // 계좌명의: 지훈
		System.out.println("  계좌번호: " + jihoonAccountNo); // 계좌번호: 20000314
		System.out.println("  예금잔고: " + jihoonAccountBalance); // 예금잔고: 30000
	}

}
