package javaPractice.ch_08;

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {
	// 속성(멤버, 변수)
	int x = 20;
	
	// 메소드
	void method() {
		int x = 30; // 지역변수임
		System.out.println("x= " + x); // x = 30. 지정된 것 X => 가장 가까운 곳에 선언된 지역변수 가지고 옴
		System.out.println("this.x= " + this.x); // this.x = 20 => 객체(class Child2)를 기준으로 가져옴
		System.out.println("super.x= " + super.x); // super.x = 10 => 부모 클래스 기준으로 가져옴
	}
}


public class Inheritance05 {

	public static void main(String[] args) {
		Child2 c2 = new Child2();
		c2.method();

	}

}
