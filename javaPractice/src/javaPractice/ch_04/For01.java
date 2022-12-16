package javaPractice.ch_04;

public class For01 {

	public static void main(String[] args) {
		
		// For문: 특정 횟수동안 작업을 반복하고 싶을 때 사용
		// 문법: for (초기화; 조건식; 증감식) { 조건이 참일 경우 실행되는 부분 }
		// 실행 순서: 초기화 > 조건식 > 실행부분 > 증감식 (조건식 만큼 반복)

		int sum = 0; // 총 합을 담을 변수 생성
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i + ", sum = " + (sum = sum + i));
			
		
			
		// for 문의 순서
		// 1. 초기값 실행
		// 2. 조건식 확인
		// 3. 조건식이 true > 명령문 실행
		// 4. 증감식 실행
		// 5. 조건식 확인
		// 6. 조건식이 true > 명령문 실행
		// 4 ~ 6번 반복.
			
		}
	}

}
