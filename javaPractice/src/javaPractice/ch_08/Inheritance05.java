package javaPractice.ch_08;

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {
	// �Ӽ�(���, ����)
	int x = 20;
	
	// �޼ҵ�
	void method() {
		int x = 30; // ����������
		System.out.println("x= " + x); // x = 30. ������ �� X => ���� ����� ���� ����� �������� ������ ��
		System.out.println("this.x= " + this.x); // this.x = 20 => ��ü(class Child2)�� �������� ������
		System.out.println("super.x= " + super.x); // super.x = 10 => �θ� Ŭ���� �������� ������
	}
}


public class Inheritance05 {

	public static void main(String[] args) {
		Child2 c2 = new Child2();
		c2.method();

	}

}
