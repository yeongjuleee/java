package javaPractice.ch_08;

/* 문제
속성: 제조사(maker), 모델 이름(model), 색상(color), 현재 속도(carSpeed)
행위: 가속(speedUp), 감속(speedDown)

1. 이 속성과 행위 설명을 바탕으로 하는 Car 클래스를 정의하라
   단, 가속과 감속의 결과는 carSpeed와 연동되어야 한다

2. 정의한 Car 클래스에 파라미터로 모든 필드를 초기화하는 생성자를 추가하고, 속성이 다른 인스턴스 세 개를 생성하라

3. Car클래스를 상속받는 SportCar 클래스를 정의하고, 가속과 감속 메소드를 스포츠카에 맞게 오버라이딩 하라
*/

class Car{
	//속성(필드, 멤버변수)
	protected String maker; // 제조사
	protected String model; // 모델
	protected String color; // 색상
	protected int carSpeed; // 현재속도
	
	// 생성자 
	Car() {
		// 얘 존재 이유: 자손 생성자에서 실행할 빈 생성자 X => 에러 발생.
	}
	
	public Car(String maker, String model, String color, int carSpeed) {
		this.maker = maker;
		this.model = model;
		this.color = color;
		this.carSpeed = carSpeed;
	}
	
	// 기능(행위) 메소드
	public void carSpeedUp() { // 가속
		this.carSpeed++;
	}
	
	public void carSpeedDown() { // 감속
		this.carSpeed--;
	}
	
	public String toString() { 
		return "Car [maker =" + maker + ", model=" + model + ", color = " + color + ", carSpeed =" + carSpeed;
	}
	
}

class SportCar extends Car {
	// 자식 클래스에서 생성자를 만들면, 부모 클래스에 있는 생성자가 자동으로 실행.
	// 하지만, 사용자가 생성자의 매개변수를 하나라도 적으면 자동으로 만들기 X 
	// SuperCar 클래스로 했을 때, 부모 클래스 생성자를 일단 무조건 한번 실행함.
	// 그런데 부모 클래스에 빈 생성자 X => 가져올 것이 없어서 에러 발생!
	
	// 생성자
	
	// public SportCar() { super(); }
	
	public SportCar(String maker, String model, String color, int carSpeed) {
		super(maker, model, color, carSpeed);
		
	}

	
	// 오버라이딩
	@Override
	public void carSpeedUp() {
		this.carSpeed += 20;

	}

	@Override
	public void carSpeedDown() {
		this.carSpeed -= 20;
		
	}
	
	// print해보기
	public String toString() { 
		return "Car [maker =" + maker + ", model=" + model + ", color = " + color + ", carSpeed =" + carSpeed;
	}
	

	
}

public class InheritanceOverRideTest01 {

	public static void main(String[] args) {
		Car c1 = new Car("현대", "어쩌고", "white", 50);
		System.out.println(c1);
		
		SportCar sc1 = new SportCar("천상계", "어떤것", "blue", 120);
		System.out.println(sc1);
		
	}

}
