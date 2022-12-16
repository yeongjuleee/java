package javaPractice.ch_06;

public class Method08 {
	// 메소드 오버로딩
	// 매개변수의 타입 혹은 개수가 다르면 같은 이름을 가진 메소드를 재정의 할 수 있다. 
	// 단, C와 파이썬에는 해당 기능이 없다.
	
	
	public static void main(String[] args) {
		printGreet(); //안녕하세요
		printGreet("안녕~!"); // 안녕~!
		printGreet("준규", "살아는 있지?"); // 준규야 살아는 있지?
		printGreet(3); // 안녕하세요 3번째 보는거네요.

	}
	
	public static void printGreet() {
		
		System.out.println("printGreet() 메소드가 실행됩니다.");
		System.out.println("안녕하세요");
	}
	
	public static void printGreet(String greeting) {
		// 같은 이름의 메소드가 있지만 매개변수가 없다
		System.out.println("printGreet(String greeting) 메소드가 실행됩니다.");
		System.out.println(greeting);
	}
	
	public static void printGreet(String name, String greeting) {
		// 매개변수가 문자열인 메소드가 있지만 개수가 다르다
		System.out.println("printGreet(String name, String greeting) 메소드가 실행됩니다.");
		System.out.println(name + "야 " + greeting);
	}
	
	public static void printGreet(int cnt) {
		// 매개변수가 하나인 메소드가 있으나 데이터 타입이 다름
		System.out.println("printGreet(int cat) 메소드가 실행됩니다.");
		System.out.println("안녕하세요" + cnt + "번째 보는게네요.");
	}

}
