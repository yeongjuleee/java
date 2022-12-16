package javaPractice.ch_07;

class Area {
	static void manual() { // static이 있음 => 클래스 메소드
		System.out.println("현재 사용 가능한 함수 목록");
		System.out.println("triangle : 삼각형 넓이");
		System.out.println("rectangle : 사각형 넓이");
		System.out.println("입니다.");
	}
	
	double triangle(int a, int b) { // 삼각형 넓이를 반환하는 메소드
		return (double) a * b / 2;
	}
	
	int rectangle(int a, int b) { // 사각형 넓이를 반환하는 메소드
		return a * b;
	}
}

public class InstanceMethod01 {
	// 클래스 메소드는 객체를 생성하지 않아도 호출 가능
	// 인스턴스 메소드는 객체를 생성해야만 호출이 가능,
	// 왜냐하면 인스턴스 메소드 객체가 생성되아야 메모리상에 실제로 존재하고
	// 클래스 메소드는 클래스가 메모리에 올라갈 때 생성되기 때문

	public static void main(String[] args) {
		Area.manual(); // 클래스 메소드 접근 가능
		
		// Area.triangle(3, 5); // 에러 발생!
		// Area.rectangle(3, 5); // 에러 발생!
			// => 만약 이렇게 사용하고 싶다면, 
			// 1. 객체를 생성한 후에 사용하던가
			// 2. 클래스 메소드에서 삼각형/사각형 넓이를 반환하는 메소드 앞에 static 붙이기.
			
		Area cal = new Area();
		cal.manual();
		System.out.println(cal.triangle(3, 5));
		System.out.println(cal.rectangle(3, 5));

	}

}
