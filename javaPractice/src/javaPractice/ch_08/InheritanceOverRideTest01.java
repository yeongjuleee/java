package javaPractice.ch_08;

/* ����
�Ӽ�: ������(maker), �� �̸�(model), ����(color), ���� �ӵ�(carSpeed)
����: ����(speedUp), ����(speedDown)

1. �� �Ӽ��� ���� ������ �������� �ϴ� Car Ŭ������ �����϶�
   ��, ���Ӱ� ������ ����� carSpeed�� �����Ǿ�� �Ѵ�

2. ������ Car Ŭ������ �Ķ���ͷ� ��� �ʵ带 �ʱ�ȭ�ϴ� �����ڸ� �߰��ϰ�, �Ӽ��� �ٸ� �ν��Ͻ� �� ���� �����϶�

3. CarŬ������ ��ӹ޴� SportCar Ŭ������ �����ϰ�, ���Ӱ� ���� �޼ҵ带 ������ī�� �°� �������̵� �϶�
*/

class Car{
	//�Ӽ�(�ʵ�, �������)
	protected String maker; // ������
	protected String model; // ��
	protected String color; // ����
	protected int carSpeed; // ����ӵ�
	
	// ������ 
	Car() {
		// �� ���� ����: �ڼ� �����ڿ��� ������ �� ������ X => ���� �߻�.
	}
	
	public Car(String maker, String model, String color, int carSpeed) {
		this.maker = maker;
		this.model = model;
		this.color = color;
		this.carSpeed = carSpeed;
	}
	
	// ���(����) �޼ҵ�
	public void carSpeedUp() { // ����
		this.carSpeed++;
	}
	
	public void carSpeedDown() { // ����
		this.carSpeed--;
	}
	
	public String toString() { 
		return "Car [maker =" + maker + ", model=" + model + ", color = " + color + ", carSpeed =" + carSpeed;
	}
	
}

class SportCar extends Car {
	// �ڽ� Ŭ�������� �����ڸ� �����, �θ� Ŭ������ �ִ� �����ڰ� �ڵ����� ����.
	// ������, ����ڰ� �������� �Ű������� �ϳ��� ������ �ڵ����� ����� X 
	// SuperCar Ŭ������ ���� ��, �θ� Ŭ���� �����ڸ� �ϴ� ������ �ѹ� ������.
	// �׷��� �θ� Ŭ������ �� ������ X => ������ ���� ��� ���� �߻�!
	
	// ������
	
	// public SportCar() { super(); }
	
	public SportCar(String maker, String model, String color, int carSpeed) {
		super(maker, model, color, carSpeed);
		
	}

	
	// �������̵�
	@Override
	public void carSpeedUp() {
		this.carSpeed += 20;

	}

	@Override
	public void carSpeedDown() {
		this.carSpeed -= 20;
		
	}
	
	// print�غ���
	public String toString() { 
		return "Car [maker =" + maker + ", model=" + model + ", color = " + color + ", carSpeed =" + carSpeed;
	}
	

	
}

public class InheritanceOverRideTest01 {

	public static void main(String[] args) {
		Car c1 = new Car("����", "��¼��", "white", 50);
		System.out.println(c1);
		
		SportCar sc1 = new SportCar("õ���", "���", "blue", 120);
		System.out.println(sc1);
		
	}

}
