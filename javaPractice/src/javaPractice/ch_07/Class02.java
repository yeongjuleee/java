package javaPractice.ch_07;

public class Class02 {
	// ���� ��Ű�� ���� ���� �Ѵٸ� ���� �ҷ����� ������ �ʿ� X
	// ���� ���� Class01 ���� ������� class ��� 

	public static void main(String[] args) {
		Car1 mycar;// Ŭ������ ��ü�� ������ �� �ִ� ���� ���� ���� (�ּҸ� ������ ��)
		mycar = new Car1(); // Ŭ������ ��ü�� �����ϰ� ��ü�� �ּҸ� ���������� ����
		
		// Car mycar = new Car();
		System.out.println("�õ� ó�� �ʱ�ȭ : " + mycar.powerOn);
		System.out.println("���� ���� �ʱ�ȭ :" + mycar.color);
		System.out.println("������ �� �ʱ�ȭ : " + mycar.wheel);
		System.out.println("�ӷ� �ʱ�ȭ : " + mycar.speed);
		System.out.println("������ �۵� �ʱ�ȭ : " + mycar.wiperOn);
		// �迭�� ����ϰ� ���� ���� �ʾƵ� �˾Ƽ� boolean ���� false, String ���� null, int ���� 0 ���� �����
		
		
		// �޼ҵ�(�Լ�) ����
		mycar.power(); // �õ� �޼ҵ� ����
		System.out.println("�õ� �޼ҵ� ���� : " + mycar.powerOn);
		mycar.power(); // �õ� �޼ҵ� ����
		System.out.println("�õ� �޼ҵ� �ٽ� ���� : " + mycar.powerOn);
		
		mycar.color = "blue"; // ���� ������ blue ����
		System.out.println("���� ���� ���� : " + mycar.color);
	}

}
