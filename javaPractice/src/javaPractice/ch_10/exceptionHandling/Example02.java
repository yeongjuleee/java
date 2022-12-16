package javaPractice.ch_10.exceptionHandling;

public class Example02 {

	public static void main(String[] args) {
		try {
			int[] a = {2, 0};
			int b = 4;
			System.out.println("예외 처리 공부 중 1");
			int c= b / a [2];
			System.out.println("예외 처리 공부 중 2");
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			// 예외 종류 중 ArithmeticException 오류가 발생하면, 
			System.out.println("산술 오류 발생!");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 오류 발생!");
		}
		System.out.println("예외 처리 공부 중 3");
		
	}

}
