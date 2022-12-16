package javaPractice.ch_10.exceptionHandling;

public class MyException_02 {

	public static void main(String[] args) {
		int num = 10;
		int num2 = 10;
		
		try {
			System.out.println("** 정수의 값을 0으로 나누는 연산 **");
			// 부적절한 연산 수행
			System.out.println("10 / 0 = " + (num / num2));
			System.out.println("** 정수의 값을 0으로 나누는 연산 완료 **");
		} catch (Exception e) {
			// Exception e = println("10/0 ~ ) 의 객체 
			// 출력을 하면 Exception e => e 가 무슨 객체인지 출력됨. 
			System.out.println(e);
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램을 정상 수행합니다.");

	}

}
