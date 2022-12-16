package javaPractice.ch_04;

public class Continue01Example01 {

	public static void main(String[] args) {
		// Continue01 을 더 간단하게 만들어보기.
		
		int total = 0;
		int num;
		
		for (num = 1; num <= 100; num += 2) { // num 이 1부터 +2씩 증가하여 num을 홀수로 만듦.
			
			total += num;
			
		}
		
		System.out.println("1부터 100까지의 홀수의 합은 : " + total +"입니다.");
	}

}
