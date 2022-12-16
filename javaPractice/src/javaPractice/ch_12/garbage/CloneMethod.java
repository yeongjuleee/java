package javaPractice.ch_12.garbage;

/*
������ �������� �����ϸ� ���� ���簡 �Ǳ� ������ ���� ����� ����Ų��.
 �������� �纻�� ���� ������ clone() �޼ҵ带 ����Ѵ�
 ������ �纻�� ����� ���纻�� ����
*/

class Point { // ������ �ǹ��ϴ� Point Ŭ����
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + ", " + "y = " + y;
	}
	
}

class Circle implements Cloneable { // ��ü�� �����ص� �ȴٴ� �ǹ̷� Cloneable �������̽��� �Բ� ����
	// Colneable �� �����ؾ� ���� ����
	Point point;
	int radius;
	
	Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String toString () {
		return "������ " + point + "�̰�, �������� " + radius + "�Դϴ�.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException { // clone() �޼ҵ带 ����� �� �߻��� �� �ִ� ������ ���� ó����
		return super.clone();
	}
	
	
}

public class CloneMethod {

	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		Object clone() : ��ü�� �����Ͽ� ������ ��� ������ ���� �ν��Ͻ� ����
		��ü�� ������ �� �ٸ� ��ü�� ��ȯ
		��ü ������ ������ ���� ���纻�� ����Ѵٰų�, �⺻ Ʋ (prototype)�� ���纻�� �����
		������ �ν��Ͻ��� ����� ������ ���������� ������ �Ϸ��� ��� ���
		*/
		
		// clone() �޼ҵ�� �ν��Ͻ� �����ϱ�
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();	// clone() �޼ҵ带 ����� circle �ν��Ͻ��� copyCircle�� ������
		
		// ���� ����
		System.out.println(circle);		// ������ x= 10, y= 20 �̰�, �������� 30 �Դϴ�
		System.out.println(copyCircle);	// ������ x= 10, y= 20 �̰�, �������� 30 �Դϴ�.
		
		// �ּ� ���� �ٸ�
		System.out.println(System.identityHashCode(circle));		// 932583850
		System.out.println(System.identityHashCode(copyCircle));	// 212628335
	}

}
