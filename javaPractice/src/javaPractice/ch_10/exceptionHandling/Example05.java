package javaPractice.ch_10.exceptionHandling;

public class Example05 {
	
	/*
		예외 던지기란 예외가 발생했을 경우 현재 메소드가 예외를 처리하지 않고 자신을 호출한 쪽으로 예외 처리에 대한 책임을 넘기는 것
		예외 던지기는 호출한 쪽으로 책임을 넘기기 때문에 호출한 쪽에 대해 문법적 강제성이 발생
		예외를 넘겨받은 쪽은
		1. 반드시 직접 예외를 처리하거나
		2. 자신도 예외를 던져야함
	*/

	public static void methodA() throws Exception {
		methodB();
	}
	
	public static void methodB() throws Exception {
		methodC();
	
	
	// try {
	//		methodC();
	//	}
	//	catch (Exception e) {
	//		System.out.println("methodB에서 처리");
	//	}
	}
	
	public static void methodC() throws Exception {
		Exception e = new Exception();
		throw e;
	}
	
	public static void main(String[] args) {
		try {
			methodA();
		}
		catch (Exception e) {
			System.out.println("메인에서 처리");
		}

	}

}
