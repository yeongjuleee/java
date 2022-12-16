package javaPractice.ch_06;

public class Method04 {
	
	// 매개 변수를 2개 사용하는 메소드
	public void print(int a, int b) { 
		// 매개변수 print 에 int a 와 int b 로 2개임
		// void 로 return 이 없음
		
		int c = a + b;
		System.out.println("결과값: " + c);
	}
	
	// 매개 변수로 문자열을 받는 메소드 선언
	public void print1(String str) { // 매개변수 print1 의 타입 String
		// 매개변수 타입이 String 
		System.out.println(str);
	}

	public static void main(String[] args) {
		// 변수 선언 
		int num1 = 11;
		int num2 = 22;
		int result = 0;
		
		// 사용할 메소드가 있는 클래스의 인스턴스 선언
		Method04 method = new Method04();
		
		// 메소드 호출
		method.print(10, 20); // a 의 값에 10을, b 값에 20을 넣음을 알 수 있다.
		
			//method.print(10, 30.0f); 
			//int 타임의 메소드이기 때문에 30.0은 float 타입으로 사용할 수 없다
		
		method.print(num1, num2); // a 자리에 num1 의 값 11을, b 자리에 num2의 값 22를 넣음을 알 수 있다.
		
		method.print1("안녕하세요"); // 같은 타입만 사용할 수 있음
		

	}

}
