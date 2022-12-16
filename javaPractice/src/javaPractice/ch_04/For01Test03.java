package javaPractice.ch_04;

public class For01Test03 {

	public static void main(String[] args) {
		// For문을 이용하여 * 찍기
		// Test02의 반대 방향으로 찍기!
		// 힌트 : 공백이 먼저 찍히고 별 찍히는 시스템.. 
		// 따라서 공백 출력하는 for문, 별 출력하는 for문이 있어야함.. 

		for (int i = 1; i <= 4; i++) {
			for (int j=4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		// 다른 방법
		for (int x = 1; x <= 4; x++) {
			for (int y = 1; y <= (4 - x); y++) {
				System.out.print(" ");
			}
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
