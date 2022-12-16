package javaPractice.ch_07;

class Cellphone {
	String model = "Galaxy 22";
	String color;
	int capacity;

	// 생성자 특징
	// 1. 클래스 이름과 같다
	// 2. 반환형 X
	// 3. 인스턴스 생성시 단 한번만 자동 실행됨

	// 생성자 정의 X => void 생성자가 기본으로 제공 = 기본생성자
	// 생성자 정의 O => 자바에서 제공되는 void 생성자 사라짐
	// void 생성자를 사용하려면 따로 정의를 내려줘야함.

	Cellphone(String color, int capacity) { // 매개 변수가 있는 생성자
											// 생성자는 통상적으로 상단에 적어줌.
		this.color = color; // this : 객체변수를 말함. 그래서 클래스 Cellphone 의 color를 지칭.
		this.capacity = capacity;
	}

}
public class DefaultConstructor01 {

	public static void main(String[] args) {
		//Cellphone myphone1 = new Cellphone(); // 에러 발생! => 해결 방법: 빈 생성자를 만들어 주기
		Cellphone myphone = new Cellphone("Silver", 64);
		
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);

	}

}
