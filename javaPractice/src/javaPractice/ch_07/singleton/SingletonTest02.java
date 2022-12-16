package javaPractice.ch_07.singleton;


class Rocket {
	// �Ӽ�
	int x; // ���� ��ġ
	int y; // ���� ��ġ
	
	Rocket(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String printInfo() {
		return "x: " + x + ", y: " + y;
	}
	
	void moveUp() {
		y++;
	}
	
	
	// ��� (�޼ҵ�)
//	Rocket(int x, int y) { // ���� ������ ��ġ
//							// Ŭ������ �̸��� ����, �޼ҵ尡 �빮�ڷ� ���� = ��������
//		
//	}
//	
//	printInfo(String ) { // ���� ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
//		
//	}
//	
//	moveUp(int x, int y) { // ������ ��ǥ�� ����
//	
//	}
}

public class SingletonTest02 {
	
	// Ŭ���� �ۼ� �� ��ü ����
	// ������ ��Ÿ���� Rocket Ŭ������ �ۼ��϶�.
	// Rocket Ŭ������ ������ ���� �ʵ�� �޼ҵ带 ������.
	// #�ʵ�
	// x, y : ���� ������ ��ġ
	// # �޼ҵ�
	// Rocket(x, y) : ���� ������ ��ġ
	// pirntInfo() : ���� ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	// moveUp() : ������ y ��ǥ�� 1��ŭ ����
	
	public static void main(String[] args) {
		Rocket rocket = new Rocket (10, 20);
		System.out.println(rocket.printInfo()); // x: 10, y: 20
		rocket.moveUp();
		rocket.moveUp();
		System.out.println(rocket.printInfo()); // x: 10, y: 22

	}

}
