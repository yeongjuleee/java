package javaPractice.ch_08.car;

public class Polymorphism02 {

	public static void main(String[] args) {
		// �������� ����ȯ
		// �ڽ� Ÿ�Կ��� �θ� Ÿ������ �ڵ� ����ȯ ������, �θ𿡼� �ڽ� Ÿ�����δ� ����� ����ȯ
		
		Car car;
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		
		fe.water();		
		car = fe;		// car = (Car)fe; ���� ����ȯ�� ������ ����
		// car.water() => Car Ÿ���� ���� �����δ� water() �� ȣ���� �� X
		
		
		fe2 = (FireEngine)car; // �θ� Ÿ�Կ��� �ڽ� Ÿ������ ������ ���� ����ȯ�� ����� ��
		fe2.water();
		
	}

}
