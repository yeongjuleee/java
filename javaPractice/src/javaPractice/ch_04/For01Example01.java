package javaPractice.ch_04;

public class For01Example01 {

	public static void main(String[] args) {
		// for 문에서 초기화, 조건식, 증감식 모두 생략 가능한 예시
		
		int i = 0;
		
		for (; i<10;) { // 조건식이 없으면 반복 무한 루프의 굴레.
			System.out.println("i = " + i);
			i++;
		}

	}

}
