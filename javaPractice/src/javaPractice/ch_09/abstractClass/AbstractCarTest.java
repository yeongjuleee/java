package javaPractice.ch_09.abstractClass;

import java.util.ArrayList;


/* 문제!
Car 추상 클래스를 상속받는 Sonata, Grandeur, Avante, Genesis 클래스가 있다.
각 차는 주행하기 위해 다음 순서로 움직인다.

	run() {
		start();
		drive();
		stop();
		turnOff();
	}

CarTest 클래스를 보고 다음 출력 결과가 나오도록 
Car, Sonata, Grandeur, Avante, Genesis 클래스를 구현하라.

결과 : 
	Sonata 시동을 켭니다
	Sonata 달립니다
	Sonata 멈춥니다
	Sonata 시동을 끕니다 
	
	+++ 메인 메소드는 그대로 두고 결과 값이 "세차를 합니다" 가 추가되어 나오도록 수정하라.
*/

abstract class Car { // 추상 클래스 Car
	// 필드
	public String name;
	
	// 생성자
	public Car() {	}
	
	public Car(String name) {
		this.name = name;
	}
	
	// 추상 메소드
	abstract void start();
	abstract void drive();
	abstract void stop();
	abstract void turnOff();
	
	// 일반 메소드
	public void wash() {
		System.out.println("세차를 합니다.");
	}
	
	public void run() {
	      start();
	      drive();
	      stop();
	      turnOff();
	      wash();
	    }
	
	
}

class Sonata extends Car {// 추상 클래스 Car를 상속 받는 Sonata

	Sonata() {
		super("Sonata");

	}

	@Override
	void start() {
		System.out.println(name + " 시동을 켭니다.");
		
	}

	@Override
	void drive() {
		System.out.println(name + " 달립니다.");
		
	}

	@Override
	void stop() {
		System.out.println(name + " 멈춥니다.");
		
	}

	@Override
	void turnOff() {
		System.out.println(name + " 시동을 끕니다");
		
	} 
	

}

class Grandeur extends Car { // 추상 클래스 Car를 상속 받는 Grandeur

	
	public Grandeur() {
		super("Grandeur");
		
	}
	
	@Override
	void start() {
		System.out.println(name + " 시동을 켭니다.");
		
	}


	@Override
	void drive() {
		System.out.println(name + " 달립니다.");
		
	}

	@Override
	void stop() {
		System.out.println(name + " 멈춥니다.");
		
	}

	@Override
	void turnOff() {
		System.out.println(name + " 시동을 끕니다.");
		
	} 

	
}

class Avante extends Car { // 추상 클래스 Car를 상속 받는 Avante

	public Avante() {
		super("Avante");
	}
	
	@Override
	void start() {
		System.out.println(name + " 시동을 켭니다.");
	}

	@Override
	void drive() {
		System.out.println(name + " 달립니다.");
		
	}

	@Override
	void stop() {
		System.out.println(name + " 멈춥니다.");
		
	}

	@Override
	void turnOff() {
		System.out.println(name + " 시동을 끕니다.");
		
	} 
	
}

class Genesis extends Car { // 추상 클래스 Car를 상속 받는 Genesis

	public Genesis() {
		super("Genesis");
	}

	@Override
	void start() {
		System.out.println(name + " 시동을 켭니다.");
		
	}

	@Override
	void drive() {
		System.out.println(name + " 달립니다.");
		
	}

	@Override
	void stop() {
		System.out.println(name + " 멈춥니다.");
		
	}

	@Override
	void turnOff() {
		System.out.println(name + " 시동을 끕니다.");
		
	} 
	
}

public class AbstractCarTest {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		// ArrayList<객체(class)> 변수명
		// 일반 배열과 다른점 : 배열의 길이를 지정X
		// Car라는 객체의 클래스를 저장하겠다.
		
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		// 객체의 배열리스트.메소드();
		// 메소드를 이용하여 저장함. 
		
		
		for(Car car: carList) { // forEach문(데이터타입 매개변수: 배열이름)
			car.run();
			System.out.println("==========================");
		}

	}

}
