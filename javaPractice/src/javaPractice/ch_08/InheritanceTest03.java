package javaPractice.ch_08;

/*
동물을 나타내는 Animal 클래스를 상속받아서 새를 나타내는 bird 클래스를 작성해보자.
*/

class Animal {
	void walk() {
		System.out.println("걸을 수 있어");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("날 수 있어");
	}
	
	void sing() {
		System.out.println("노래 부를 수 있어");
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
