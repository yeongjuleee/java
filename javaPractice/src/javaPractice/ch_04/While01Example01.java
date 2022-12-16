package javaPractice.ch_04;

public class While01Example01 {

	public static void main(String[] args) {
		// for 문을 while문으로 변경하라
		// 변수는 그대로 사용하기.
		
		int num;
		int sum = 0;
		
		for (num = 1; num <= 10; num++) {
			sum += num;
		}
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
		
		num = 1;
		sum = 0;
		while (num <= 10) {
			sum += num;
			num ++; // for문에서 증감이 가장 마지막에 진행됨. 그래서 for문과 흐름이 똑..같게..한거... 라고 나는 생각해.
		}
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
	}

}
