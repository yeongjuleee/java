package javaPractice.ch_10.exceptionHandling;

import java.util.Scanner;

class ExceptionOccur {
	private static final Scanner in = new Scanner(System.in);
	private int kor;
	
	// 예외 던지기 예
	public void input() throws IndexOutOfBoundsException {
		System.out.print("국어 점수 = ");
		kor = in.nextInt();
		
		if(kor < 0 || kor > 100) {
			throw new IndexOutOfBoundsException("0~100점만 입력 가능");
		}
	}
	
	public void output() {
		System.out.println("국어 점수는 " + kor + "점 입니다. \n");
	}
}


public class MyException10 {
	
	public static void main(String[] args) {
		ExceptionOccur exceptionOccur = new ExceptionOccur();
		
		try {
			exceptionOccur.input();
			exceptionOccur.output();
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.print("0~100점만 입력 가능");
		}
		
	}

}
