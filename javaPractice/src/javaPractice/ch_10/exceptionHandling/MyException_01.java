package javaPractice.ch_10.exceptionHandling;

public class MyException_01 {

	public static void main(String[] args) {
		int num = 10;
		int num2 = 0;
		
		System.out.println("** 정수의 값을 0으로 나누는 연산 **");
		// 부적절한 연산 수행
		System.out.println("10/0 = " + (num / num2));
		System.out.println("try/catch 구문 밖 문장 수행");

	}

}
