package javaPractice.ch_08;

class Parent {
	int x = 10;
}

class Child extends Parent {
	void method() {
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x); // this : ��� ����(��ü)�� ����.
		System.out.println("super.x= " + super.x); // super : �θ� Ŭ����(��ӹ޾Ҵ�)�� x�� ����.
	}
}

public class Inheritance04 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		// x = 10;

	}

}
