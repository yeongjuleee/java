package javaPractice.ch_07;

class Cars {
	static int wheel = 4; // static 데이터타입 변수명 = 값 => 클래스 변수 선언
						  // static 존재 => 클래스이름.클래스변수 출력 가능 (따로 객체 생성할 필요 X)
	int speed; // 데이터타입 변수명; => 인스턴스 변수
}

public class Instance01 {
	// 인스턴스 변수는 각각의 인스턴스마다 고유의 저장 공간을 가지고 O => 별개의 조정 가능
	// 클래스 변수 1. 하나의 저장 공간을 모든 인스턴스가 함께 공유 => 하나의 참조 변수로 값 변경 => 모든 인스턴스 값 변경됨
	// 			2. 인스턴스 생성전에 접근 O => 클래스 이름으로 접근이 됨.

	public static void main(String[] args) {
		
		System.out.println(Cars.wheel); // 클래스 변수 접근 가능
		// System.out.println(Cars.speed); // 에러 발생! 인스턴스 변수 접근 X
		
		Cars myCar1 = new Cars();
		
		System.out.println(Cars.wheel);
		System.out.println(myCar1.speed); // 인스턴스 생성 후에 접근 가능
		
		Cars myCar2 = new Cars();
		
		System.out.println();
		System.out.println("<변경 전>");
		System.out.println("myCar1.speed: " + myCar1.speed); // 0
		System.out.println("myCar2.speed: " + myCar2.speed); // 0
		System.out.println("myCar1.wheel: " + myCar1.wheel); // 4
		System.out.println("myCar2.wheel: " + myCar2.wheel); // 4
		
		myCar2.speed = 100;
		myCar2.wheel = 5; //클래스 변수로 바꾸면 모두가 바뀜
		
		System.out.println();
		System.out.println("<변경 후>");
		System.out.println("myCar1.speed: " + myCar1.speed); // 0
		System.out.println("myCar2.speed: " + myCar2.speed); // 100
		System.out.println("myCar1.wheel: " + myCar1.wheel); // 5
		System.out.println("myCar2.wheel: " + myCar2.wheel); // 5

	}

}
