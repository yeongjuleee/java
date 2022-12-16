package javaPractice.ch_05;

public class Array2_Test01 {

	public static void main(String[] args) {
		// 중첩 for문을 이용해서 주어진 배열의 전체 항목의 합과 평균을 구하시오.
		int[][] arr = {
				{ 5, 5, 5, 5, 5 }, // 1행, 5열
				{ 10, 10, 10, 10, 10}, // 2행 5열
				{ 20, 20, 20, 20, 20}, // 3행 5열
				{ 30, 30, 30, 30, 30} // 4행 5열
		};
	
			
		int total = 0;
		double average = 0;
		
		//for문 작성 위치
		
		for (int i=0; i < arr.length; i++) { // 행 반복. 각 층의 값을 구함.
			for (int j=0; j < arr[i].length; j++) {
				total += arr[i][j]; // 총점은 변수 arr의 행과 열				
			}
			
		}
		average = (double)total / (arr.length * arr[0].length); // 4층 * 5반
		
		
		System.out.println("total= " + total); // 325
		System.out.println("average= " + average); // 16.25

	}

}
