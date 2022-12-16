package javaPractice.ch_09.abstractClass;

import java.util.ArrayList;


/* ����!
Car �߻� Ŭ������ ��ӹ޴� Sonata, Grandeur, Avante, Genesis Ŭ������ �ִ�.
�� ���� �����ϱ� ���� ���� ������ �����δ�.

	run() {
		start();
		drive();
		stop();
		turnOff();
	}

CarTest Ŭ������ ���� ���� ��� ����� �������� 
Car, Sonata, Grandeur, Avante, Genesis Ŭ������ �����϶�.

��� : 
	Sonata �õ��� �մϴ�
	Sonata �޸��ϴ�
	Sonata ����ϴ�
	Sonata �õ��� ���ϴ� 
	
	+++ ���� �޼ҵ�� �״�� �ΰ� ��� ���� "������ �մϴ�" �� �߰��Ǿ� �������� �����϶�.
*/

abstract class Car { // �߻� Ŭ���� Car
	// �ʵ�
	public String name;
	
	// ������
	public Car() {	}
	
	public Car(String name) {
		this.name = name;
	}
	
	// �߻� �޼ҵ�
	abstract void start();
	abstract void drive();
	abstract void stop();
	abstract void turnOff();
	
	// �Ϲ� �޼ҵ�
	public void wash() {
		System.out.println("������ �մϴ�.");
	}
	
	public void run() {
	      start();
	      drive();
	      stop();
	      turnOff();
	      wash();
	    }
	
	
}

class Sonata extends Car {// �߻� Ŭ���� Car�� ��� �޴� Sonata

	Sonata() {
		super("Sonata");

	}

	@Override
	void start() {
		System.out.println(name + " �õ��� �մϴ�.");
		
	}

	@Override
	void drive() {
		System.out.println(name + " �޸��ϴ�.");
		
	}

	@Override
	void stop() {
		System.out.println(name + " ����ϴ�.");
		
	}

	@Override
	void turnOff() {
		System.out.println(name + " �õ��� ���ϴ�");
		
	} 
	

}

class Grandeur extends Car { // �߻� Ŭ���� Car�� ��� �޴� Grandeur

	
	public Grandeur() {
		super("Grandeur");
		
	}
	
	@Override
	void start() {
		System.out.println(name + " �õ��� �մϴ�.");
		
	}


	@Override
	void drive() {
		System.out.println(name + " �޸��ϴ�.");
		
	}

	@Override
	void stop() {
		System.out.println(name + " ����ϴ�.");
		
	}

	@Override
	void turnOff() {
		System.out.println(name + " �õ��� ���ϴ�.");
		
	} 

	
}

class Avante extends Car { // �߻� Ŭ���� Car�� ��� �޴� Avante

	public Avante() {
		super("Avante");
	}
	
	@Override
	void start() {
		System.out.println(name + " �õ��� �մϴ�.");
	}

	@Override
	void drive() {
		System.out.println(name + " �޸��ϴ�.");
		
	}

	@Override
	void stop() {
		System.out.println(name + " ����ϴ�.");
		
	}

	@Override
	void turnOff() {
		System.out.println(name + " �õ��� ���ϴ�.");
		
	} 
	
}

class Genesis extends Car { // �߻� Ŭ���� Car�� ��� �޴� Genesis

	public Genesis() {
		super("Genesis");
	}

	@Override
	void start() {
		System.out.println(name + " �õ��� �մϴ�.");
		
	}

	@Override
	void drive() {
		System.out.println(name + " �޸��ϴ�.");
		
	}

	@Override
	void stop() {
		System.out.println(name + " ����ϴ�.");
		
	}

	@Override
	void turnOff() {
		System.out.println(name + " �õ��� ���ϴ�.");
		
	} 
	
}

public class AbstractCarTest {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		// ArrayList<��ü(class)> ������
		// �Ϲ� �迭�� �ٸ��� : �迭�� ���̸� ����X
		// Car��� ��ü�� Ŭ������ �����ϰڴ�.
		
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		// ��ü�� �迭����Ʈ.�޼ҵ�();
		// �޼ҵ带 �̿��Ͽ� ������. 
		
		
		for(Car car: carList) { // forEach��(������Ÿ�� �Ű�����: �迭�̸�)
			car.run();
			System.out.println("==========================");
		}

	}

}
