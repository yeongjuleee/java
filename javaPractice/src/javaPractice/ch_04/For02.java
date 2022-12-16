package javaPractice.ch_04;

public class For02 {

	public static void main(String[] args) {
		
		// For문의 동작 시간 구하기
		// 프로그램의 동작 시간을 구하는 방법 : 
		// 1. 프로그램 시작 위의 부분에서 시작 시간을 구하고
		// 2. 프로그램이 끝나는 부분에서 종료시간을 구한 후
		// 3. 종료 시간 - 시작 시간 = 프로그램이 동작한 시간
		
		long startTime = System.currentTimeMillis(); // 시작 시간
		for (int i = 0; i < 1000000000; i++) { // 10억 번 반복
			; // 빈 문장 실행
		}
		long endTime = System.currentTimeMillis(); // 종료 시간
		
		System.out.println("시작시간 : " + startTime);
		System.out.println("종료시간 : " + endTime);
		System.out.println("소요시간 : " + (endTime - startTime));

	}

}
