package javaPractice.ch_04;

public class IfElse01 {

	public static void main(String[] args) {
		// If-else 조건문을 사용하여 실행문 출력하기 예제
		
		int age = 15;
		
		if (age > 19 ) { //조건이 true 이면 실행되는 실행문
			System.out.println("성인입니다.");
			System.out.println("성인 요금이 적용됩니다.");
		}
		else { // 위의 조건식이 거짓일 경우 실행
			System.out.println("청소년입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		}

		System.out.println("결과를 진행해 주세요");
	}

}
