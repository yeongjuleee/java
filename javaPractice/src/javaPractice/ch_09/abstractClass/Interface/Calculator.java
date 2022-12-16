package javaPractice.ch_09.abstractClass.Interface;

public abstract class Calculator implements Calc {
	// 인터페이스를 구현한 추상 클래스
	// 추상 클래스의 경우 인터페이스의 모든 추상 메소드를 구현하지 않아도 됨
	// => 자신에게 필요한 추상 메소드만 구현해도 됨
	
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substact(int num1, int num2) {
		return num1 - num2;
	}
	
	
	
}
