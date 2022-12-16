package javaPractice.ch_06;

public class Method05 {
	
	// 리턴 타입이 있는 메소드
	public int add(int a, int b) { // 변수 add의 매개변수 int a, b 
		int c = a + b;
		return c;
		// return 다음에 위치하는 데이터는 반드시 메소드의 리턴 타입과 일치해야함
		// return 3.5 > 리턴 타입과 다른 데이터형을 반환하면 오류 발생
	}
	

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		// 사용할 메소드가 있는 클래스의 인스턴스 선언
		Method05 method = new Method05();
		result = method.add(num1, num2);
		
		System.out.println("두 수의 합은 " + result); // 메소드의 반환 값을 저장해서 출력
		System.out.println("두 수의 합은 " + method.add(num1, num2)); // 메소드의 반환 값을 바로 출력 (이 방법을 더 선호함.)
		

	}

}
