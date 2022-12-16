package javaPractice.ch_08;

class Person { // 사람 클래스
	void breath() {
		System.out.println("숨쉬기");
	}
	
	void eat() {
		System.out.println("밥먹기");
	}
	
	void say() {
		System.out.println("말하기");
	}
}

class Student extends Person { // 사람 클래스를 상속한 학생 클래스
	void learn() {
		System.out.println("배우기");
	}
	
}

class Teacher extends Person { // 사람 클래스를 상속한 선생 클래스
	void teach() {
		System.out.println("가르치기");
	}
}


public class Inheritance01 {

	public static void main(String[] args) {
		Student s1 = new Student(); // 학생 인스턴스 s1 생성
		s1.breath(); // 사람 클래스의 breath 메소드를 상속받음
		s1.learn();
		s1.say();
		
		Teacher t1 = new Teacher(); // 선생 인스턴스 t1 생성
		t1.eat();
		t1.teach();
		t1.say();
		
		Person person = new Person();
		person.breath();
		// person.learn(); => 자식 클래스의 메소드나 멤버 변수는 사용하지 못함.

	}

}
