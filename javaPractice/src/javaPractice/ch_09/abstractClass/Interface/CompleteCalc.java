package javaPractice.ch_09.abstractClass.Interface;

public class CompleteCalc extends Calculator {
	// 인터페이스를 구현한 추상 클래스를 상속 받은 일반 클래스
	// 추상 클래스에서 add(), substact()을 구현했기 때문에 times(), divide()만 구현하면 됨

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1 / num2;
		else 
			return Calc.ERROR;	// 어떤 수를 0으로 나누는 경우에 오류를 반환
	}
	
	public void showInfo( ) { // CompleteCalc 에서 추가로 정의한 메소드
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
	
	

}
