package javaPractice.ch_09.abstractClass;

/*
정수형 필드 num1, num2 가 있다.
num1, num2를 사용하여 특정 계산을 수행하는 int calc() 메소드를 추상 메소드로 정의한다.
void printResult() 메소드는 
일반 메소드로 calce() 메소드 실행 결과 리턴을 받아 출력하도록 미리 구현한다.

1. 이 요구 사항을 충족하는 추상 클래스 Calculator 를 작성하라.

2. Calculator 추상 클래스를 상속받는 MyCalculator 클래스를 구현하라.
*/

abstract class Calculator {
	// 필드
	int num1, num2;
	
	// 추상 메소드
	abstract int calc();
	
	// 일반 메소드
	void printResult() {
		System.out.println("calc() 연산 결과의 값은 " + calc() + "입니다." );
	}
}

class MyCalculator extends Calculator {

	@Override
	int calc() {
		return this.num1 + this.num2;
	}
	
}

public class AbstractMethod04 {

	public static void main(String[] args) {
		
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.num1 = 10;
		myCalculator.num2 = 20;
		myCalculator.printResult(); // calc() 연산의 결과는 30 입니다.
	}

}
