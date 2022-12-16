package javaPractice.ch_10.exceptionHandling;

public class Example01 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		int a = 0;
		int b = 2;
		int c = b / a;		// 0 으로 나눌 수 없어서 예외 발생!
							// 실행시 해당 문구가 출력됨. 대충 할 수 없다.
							// Exception in thread "main" java.lang.ArithmeticException: / by zero
							// at javaPractice.ch_10.exceptionHandling.Example01.main(Example01.java:9)
		
		System.out.println("프로그램 종료");

	}

}
