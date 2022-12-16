package javaPractice.ch_07;
// 메소드 오버로딩 사용

public class ClassInstanceMethod02 {
	// Printer 객체를 생성하고, println() 메소드를 호출해서 매개값을 콘솔에 출력하려고 한다.
	// println() 메소드의 매개값으로 int, boolean, double, String 값을 줄 수 있다.
	// Printer 클래스에서 println() 메소드를 선언하라
	
	public static void main(String[] args) {
		// 객체 생성 후 출력 하기
//		Printer printer = new Printer();  => 인스턴스 메소드 사용을 위해 객체생성함. 클래스 변수명 = new 클래스명
//		printer.println(10);
//		printer.println(true);
//		printer.println(5.7);
//		printer.println("소정환");

		// 클래스로 바로 출력하기 : 클래스.클래스메소드(값)
		// class Printer 의 인스턴스 메소드를 다 클래스 메소드로 변경해야함 => static 붙이기.
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("김도영");
	}

}

class Printer { // Printer 객체 생성
	static void println(int a) { // 클래스 메소드 선언, 메소드 호출
		System.out.println(a);
	}
	static void println(boolean a) { // 클래스 메소드 선언
		System.out.println(a);
	}
	static void println(double a) { // 클래스 메소드 선언
		System.out.println(a);
	}
	static void println(String a) { // 클래스 메소드 선언
		System.out.println(a);
	}
	/*
	 void println(int a) { // 인스턴스 메소드 선언, 메소드 호출
		System.out.println(a);
	}
	 void println(boolean a) { // 인스턴스 메소드 선언
		System.out.println(a);
	}
	 void println(double a) { // 인스턴스 메소드 선언
		System.out.println(a);
	}
	 void println(String a) { // 인스턴스 메소드 선언
		System.out.println(a);
	}
	 */
}
