package javaPractice.ch_07;

public class Class02 {
	// 같은 패키지 내에 존재 한다면 따로 불러오는 과정이 필요 X
	// 이전 예제 Class01 에서 만들어진 class 사용 

	public static void main(String[] args) {
		Car1 mycar;// 클래스의 객체를 참조할 수 있는 참조 변수 선언 (주소만 가지고 옴)
		mycar = new Car1(); // 클래스의 객체를 생성하고 객체의 주소를 참조변수에 저장
		
		// Car mycar = new Car();
		System.out.println("시동 처음 초기화 : " + mycar.powerOn);
		System.out.println("차의 색상 초기화 :" + mycar.color);
		System.out.println("바퀴의 수 초기화 : " + mycar.wheel);
		System.out.println("속력 초기화 : " + mycar.speed);
		System.out.println("와이퍼 작동 초기화 : " + mycar.wiperOn);
		// 배열과 비슷하게 값을 넣지 않아도 알아서 boolean 값은 false, String 값은 null, int 값은 0 으로 저장됨
		
		
		// 메소드(함수) 실행
		mycar.power(); // 시동 메소드 실행
		System.out.println("시동 메소드 동작 : " + mycar.powerOn);
		mycar.power(); // 시동 메소드 실행
		System.out.println("시동 메소드 다시 동작 : " + mycar.powerOn);
		
		mycar.color = "blue"; // 색상 변수에 blue 대입
		System.out.println("현재 차의 색상 : " + mycar.color);
	}

}
