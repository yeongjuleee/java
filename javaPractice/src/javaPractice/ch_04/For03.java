package javaPractice.ch_04;

public class For03 {

	public static void main(String[] args) {
		// 중첩 For문을 활용하여 구구단 만들기 
		// for문은 또 다른 for문을 내포할 수 있음 => 중첩 for문
		
		// 실행 순서
		// 1. 이 경우 바깥쪽 for문이 한 번 실행할 때마다 중첩된 for문은 지정된 횟수 만큼
		// 2. 반복해서 돌다 다시 바깥쪽 for문으로 돌아감.

		for(int dan = 2; dan <= 9; dan ++) { // 바깥 쪽 for 문으로 8번 반복 (시작 순서 2)
			System.out.println(" " + dan +"단 입니다.");
			for (int times = 1; times <= 9; times++) { // 중첩 for문으로 9번 반복. (시작 순서 1)
				System.out.println(dan + "X" + times + " = " + dan * times);
			}
			System.out.println();
		}
		
		// 삼중 for문의 경우 변수명을 i, j, k 순서로 사용
		// 명령문이 하나일 때는 {} 생략 가능.
	}

}
