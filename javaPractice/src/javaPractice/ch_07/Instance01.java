package javaPractice.ch_07;

class Cars {
	static int wheel = 4; // static ������Ÿ�� ������ = �� => Ŭ���� ���� ����
						  // static ���� => Ŭ�����̸�.Ŭ�������� ��� ���� (���� ��ü ������ �ʿ� X)
	int speed; // ������Ÿ�� ������; => �ν��Ͻ� ����
}

public class Instance01 {
	// �ν��Ͻ� ������ ������ �ν��Ͻ����� ������ ���� ������ ������ O => ������ ���� ����
	// Ŭ���� ���� 1. �ϳ��� ���� ������ ��� �ν��Ͻ��� �Բ� ���� => �ϳ��� ���� ������ �� ���� => ��� �ν��Ͻ� �� �����
	// 			2. �ν��Ͻ� �������� ���� O => Ŭ���� �̸����� ������ ��.

	public static void main(String[] args) {
		
		System.out.println(Cars.wheel); // Ŭ���� ���� ���� ����
		// System.out.println(Cars.speed); // ���� �߻�! �ν��Ͻ� ���� ���� X
		
		Cars myCar1 = new Cars();
		
		System.out.println(Cars.wheel);
		System.out.println(myCar1.speed); // �ν��Ͻ� ���� �Ŀ� ���� ����
		
		Cars myCar2 = new Cars();
		
		System.out.println();
		System.out.println("<���� ��>");
		System.out.println("myCar1.speed: " + myCar1.speed); // 0
		System.out.println("myCar2.speed: " + myCar2.speed); // 0
		System.out.println("myCar1.wheel: " + myCar1.wheel); // 4
		System.out.println("myCar2.wheel: " + myCar2.wheel); // 4
		
		myCar2.speed = 100;
		myCar2.wheel = 5; //Ŭ���� ������ �ٲٸ� ��ΰ� �ٲ�
		
		System.out.println();
		System.out.println("<���� ��>");
		System.out.println("myCar1.speed: " + myCar1.speed); // 0
		System.out.println("myCar2.speed: " + myCar2.speed); // 100
		System.out.println("myCar1.wheel: " + myCar1.wheel); // 5
		System.out.println("myCar2.wheel: " + myCar2.wheel); // 5

	}

}
