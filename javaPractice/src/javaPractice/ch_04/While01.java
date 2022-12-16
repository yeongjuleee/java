package javaPractice.ch_04;

public class While01 {

	public static void main(String[] args) {
		// While 반복문: 조건식을 검사하고 true > 반복, false > while 전체를 탈출
		// 조건식 : 비교 또는 논리 연산자.
		// 문법: While ( 조건식 ) { 조건이 true일 때 실행문 }
		
		// 1부터 10까지 출력
		int i = 1;
		while (i <= 10) { // i가 10 이하라면,
			System.out.println(i); //i의 값을 출력하고
			i++; // i 를 1 증가시켜라.
		}

	}

}
