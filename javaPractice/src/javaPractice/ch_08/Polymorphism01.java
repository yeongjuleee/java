package javaPractice.ch_08;

class A {
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A {
	void methodB() {
		System.out.println("methodB");
	}
}

public class Polymorphism01 {

	public static void main(String[] args) {
		A obj = new B();
		obj.methodA();
		//obj.methodB();  => 에러 발생. 부모의 것만 사용가능하기 때문
		
		B obj1 = new B();
		obj1.methodB(); // 실행 가능
		
		A obj2 = obj1; // A 데이터 타입인 obj2에 obj1 대입
		// obj2.methodB() => 에러 발생! A 데이터 타입에는 B 데이터 타입이 없기 때문(?) 으로 추측중인데오

	}

}
