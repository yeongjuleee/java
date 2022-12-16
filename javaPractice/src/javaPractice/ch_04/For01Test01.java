package javaPractice.ch_04;

public class For01Test01 {

	public static void main(String[] args) {
		// For문을 이용하여 1 부터 100 까지의 정수 중 3의 배수의 총합을 구하는 코드 작성
		
		int sum = 0;
		for (int i=1; i<=100; i++) {
			// sum은 i 나누기 3 의 나머지가 0인 값. (조건문을 사용해서 할 수 있음)
			if (i % 3 == 0) {
				sum += i; // i를 3으로 나눈 나머지가 0인 i를 sum에 저장함. 
			}
		}
		System.out.println("3의 배수의 합: " + sum);

		//또 다른 방법
		//sum = 0;
		//for (j = 3; j <= 100; j += 3) {
		//	sum += j;
		// 	}
		// System.out.println("3의 배수의 합: " + sum);
		 
	}

}
