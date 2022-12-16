package javaPractice.ch_08;

class Car2 {
	// 생성자가 없으면 자동으로 매개변수가 없는 생성자가 만들어지고,
	// 생성자를 정의하면 매개변수가 없는 생성자가 만들어지지 않는다.
	int wheel;
	int speed;
	String color;


	
	public Car2(String color) {
		this.color = color;
	}
}

class SportsCar2 extends Car2 {
	int speedLimit; // 제한속도 km
	
	SportsCar2(String color, int speedLimit) {
		// 자식 클래스의 객체가 만들어지면 자식 클래스의 생성자가 자동으로 실행되고, 
		// 자식 클래스의 생성자가 실행되기 전에 부모 클래스의 생성자가 자동으로 실행 된다.
		// 부모 클래스의 생성자를 코딩하지 않으면, 부모 클래스의 매개변수가 없는 생성자가 자동으로 실행
		super(color);
		// this.color = color;
		
		this.speedLimit = speedLimit;
	}
}

public class InheritanceOverRide03 {

	public static void main(String[] args) {
		SportsCar2 sportsCar = new SportsCar2("red", 330);
		
		System.out.println(sportsCar.color);
		System.out.println(sportsCar.speedLimit);

	}

}
