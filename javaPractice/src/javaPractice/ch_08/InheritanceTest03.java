package javaPractice.ch_08;

/*
������ ��Ÿ���� Animal Ŭ������ ��ӹ޾Ƽ� ���� ��Ÿ���� bird Ŭ������ �ۼ��غ���.
*/

class Animal {
	void walk() {
		System.out.println("���� �� �־�");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("�� �� �־�");
	}
	
	void sing() {
		System.out.println("�뷡 �θ� �� �־�");
	}
	
	
}

public class InheritanceTest03 {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

	}

}
