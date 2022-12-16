package javaPractice.ch_08;

class Parent {
	int x = 10;
}

class Child extends Parent {
	void method() {
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x); // this : 멤버 변수(객체)를 말함.
		System.out.println("super.x= " + super.x); // super : 부모 클래스(상속받았던)의 x를 말함.
	}
}

public class Inheritance04 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		// x = 10;

	}

}
