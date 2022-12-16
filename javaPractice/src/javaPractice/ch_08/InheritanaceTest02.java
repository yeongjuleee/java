package javaPractice.ch_08;

/*
원을 나타내는 Circle 클래스를 상속받아서 피자를 나타내는 Pizza 클래스를 작성해보기
*/

class Circle {
	protected int radius; // 반지름
	
	// 생성자
	public Circle (int radius) {
		this.radius = radius;
	}
	
	public Circle() {}
}

class Pizza extends Circle {
	// 필드
	String kind;
	
	// 생성자
	public Pizza(String kind, int radius) {
		super(radius);
		
		this.kind = kind;
	}
	
	// 메소드
	void print() {
		System.out.println("피자의 종류: " + kind + ", 피자의 지름: " + (radius * 2));
	}
	
	
}

public class InheritanaceTest02 {

	public static void main(String[] args) {
		Pizza pizza = new Pizza("Pepperoni", 10);
		pizza.print(); 
		// 피자의 종류: Pepperoni, 피자의 지름 20

	}

}
