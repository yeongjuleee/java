package javaPractice.ch_06;

public class Method03 {
	// 매개변수가 있는 메소드
	// 매개 변수는 메소드 호출시 메모리가 생성되고, 호출 후 복귀 시 소멸
	
	public void print(int a) { // void = return이 없음을 알 수 있음. 매개변수 int a 가 있음을 알 수 있음
		System.out.println("결과값: " + a);
		
	}
	
	public static void main(String[] args) {
		//
		
		int a = 11;
		int b = 22;
		int result = 0;
		
		// 사용할 메소드가 있는 클래스의 인스턴스 선언
		Method03 method = new Method03();
		method.print(10);
		method.print(b);
		method.print(result);

	}

}
