package javaPractice.ch_08;

/*
���� ��Ÿ���� Circle Ŭ������ ��ӹ޾Ƽ� ���ڸ� ��Ÿ���� Pizza Ŭ������ �ۼ��غ���
*/

class Circle {
	protected int radius; // ������
	
	// ������
	public Circle (int radius) {
		this.radius = radius;
	}
	
	public Circle() {}
}

class Pizza extends Circle {
	// �ʵ�
	String kind;
	
	// ������
	public Pizza(String kind, int radius) {
		super(radius);
		
		this.kind = kind;
	}
	
	// �޼ҵ�
	void print() {
		System.out.println("������ ����: " + kind + ", ������ ����: " + (radius * 2));
	}
	
	
}

public class InheritanaceTest02 {

	public static void main(String[] args) {
		Pizza pizza = new Pizza("Pepperoni", 10);
		pizza.print(); 
		// ������ ����: Pepperoni, ������ ���� 20

	}

}
