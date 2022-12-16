package javaPractice.ch_08.car;

// Polymorphism(다형성) 관련임 

public class Car {
	String color;
	int door;
	
	void drive() { // 운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	
	void stop() { // 멈추는 기능
		System.out.println("stop!!!!");
	}
}

class FireEngine extends Car { // 소방차
	void water() { // 물 뿌리는 기능
		System.out.println("water!!!");
	}
}