package javaPractice.ch_08;

class Car2 {
	// �����ڰ� ������ �ڵ����� �Ű������� ���� �����ڰ� ���������,
	// �����ڸ� �����ϸ� �Ű������� ���� �����ڰ� ��������� �ʴ´�.
	int wheel;
	int speed;
	String color;


	
	public Car2(String color) {
		this.color = color;
	}
}

class SportsCar2 extends Car2 {
	int speedLimit; // ���Ѽӵ� km
	
	SportsCar2(String color, int speedLimit) {
		// �ڽ� Ŭ������ ��ü�� ��������� �ڽ� Ŭ������ �����ڰ� �ڵ����� ����ǰ�, 
		// �ڽ� Ŭ������ �����ڰ� ����Ǳ� ���� �θ� Ŭ������ �����ڰ� �ڵ����� ���� �ȴ�.
		// �θ� Ŭ������ �����ڸ� �ڵ����� ������, �θ� Ŭ������ �Ű������� ���� �����ڰ� �ڵ����� ����
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
