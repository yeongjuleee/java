package javaPractice.ch_10.exceptionHandling;

public class Example04 {
	
	// throw : 고의로 예외를 만듦
	
	public static void main(String[] args) {
		// 예외 클래스의 인스턴스를 생성한 다음 키워드 throw를 이용하면 직접 예외를 발생시킬 수 있다
		try {
			Exception e = new Exception ("고의 예외");	// 예외 클래스의 인스턴스 새엇ㅇ. 생성자에 예외 문구 전달
			throw e;	// 예외를 던짐
		// throw new Exception("고의 예외"); // 우의 두 줄을 한 줄로 줄여 쓸 수 O
			
		}
		catch (Exception e) {
			System.out.println("예외발생");
			System.out.println(e.getMessage());	
							// e.getMessage() : 생성자에게 전달한 예외 문구 출력
		
		}

	}

}
