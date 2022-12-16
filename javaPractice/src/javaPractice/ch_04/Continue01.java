package javaPractice.ch_04;

public class Continue01 {

	public static void main(String[] args) {
		// Continue란, 현재의 반복을 뛰어넘고 반복을 진행.
		
		int total = 0;
		int num;
		
		for (num = 0; num <= 100; num++) {
			if (num % 2 == 0) { // num 을 2로 나눈 나머지가 0이면 (= 짝수이면)
				continue; // 짬뿌
			}
			total += num;
			
			/*
			 * if (num % 2 == 1) {
			 * 			total += num;
			 * }
			 * */
		}
		
		System.out.println("1부터 100까지의 홀수의 합은 : " + total +"입니다.");

	}

}
