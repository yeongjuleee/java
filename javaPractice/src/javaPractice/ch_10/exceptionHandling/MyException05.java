package javaPractice.ch_10.exceptionHandling;

public class MyException05 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);	// 예외 발생!
			System.out.println(4);
		}
		catch (ArithmeticException ae) {
			// 참조변수 ae를 통해, 생성된 ArithmeticException 인스턴스에 접근할 수 O
			ae.printStackTrace();
			// StackTrace 부분: by zero
			//				   at javaPractice.ch_10.exceptionHandling.MyException05.main
			
			System.out.println("예외 메시지: " + ae.getMessage());
		}	// try-catch 끝
		System.out.println(6);

	}

}
