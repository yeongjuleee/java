package javaPractice.ch_08.car;

// Polymorphism(������) ������ 

public class Car {
	String color;
	int door;
	
	void drive() { // �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}
	
	void stop() { // ���ߴ� ���
		System.out.println("stop!!!!");
	}
}

class FireEngine extends Car { // �ҹ���
	void water() { // �� �Ѹ��� ���
		System.out.println("water!!!");
	}
}