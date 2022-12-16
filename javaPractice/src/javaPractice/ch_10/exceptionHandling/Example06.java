package javaPractice.ch_10.exceptionHandling;
// 사용자 정의 예외처리

class AgeException extends Exception {
	// 모든 클래스는 Exception을 상속을 받을 수 있음
	
	// 생성자
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
	
	public void printStackTrace() {
		System.out.println(getMessage());
		super.printStackTrace();
	}
}


public class Example06 {
	public static void ticketing(int age) throws AgeException {
		// 티켓팅의 매개변수 int age 
		// AgeException(목적어)에 해당되는 예외를 throws(던짐)
		
		if(age < 0) {
			throw new AgeException("나이 입력이 잘못되었습니다.");
		}
	}
	
	public static void main(String[] args) {
		// throws 한 예외를 받는 애
		int age = -19;
		try {
			ticketing(age);
		}
		catch (AgeException e) {
			e.printStackTrace();
		}

	}

}
