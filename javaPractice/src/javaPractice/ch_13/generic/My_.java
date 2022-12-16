package javaPractice.ch_13.generic;

class MyClass01 {
	void sum (int a, int b) {	// 오버로딩. 값만 메인에서 입력하면 보고 출력함
		System.out.println(a);
		System.out.println(b);
	}
	
	void sum (float a, float b) {
		System.out.println(a);
		System.out.println(b);
	}
}

class MyClass02<T, V> {
	// 제네릭을 사용하는 sum() 메소드 작성하기
	void sum(T a, V b) {
		// void 변수(타입 매개변수, 타입 매개변수)
		System.out.println(a);
		System.out.println(b);
	}
}

public class My_ {

	public static void main(String[] args) {
		int a = 10, b = 20;
		float c = 11.1f, d = 12.1f;
		
		MyClass01 mc1 = new MyClass01();
		mc1.sum(a, b);
		mc1.sum(c, d);
		
		MyClass02 mc2 = new MyClass02();
		mc2.sum(a, b); // 매개변수만 보면 필요한 타입을 만들어 줌
		mc2.sum(c, d);
	}

}
