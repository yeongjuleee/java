package javaPractice.ch_09.abstractClass.Interface;

/*
	인터페이스 interface는 클래스 혹은 프로그램이 제공하는 기능을 명시적으로 선언하는 역할
	인터페이스는 추상 메소드와 상수로만 이루어짐
	구현된 코드가 없기 때문에 당연히 인터페이스로 인스턴스를 생성할 수 X
*/

public class Test {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substact(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		System.out.println("====================================");
		calc.showInfo();
		calc.description();
		System.out.println("====================================");
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
	}
}
