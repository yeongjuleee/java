package javaPractice.ch_05;

public class Array2_Test02 {

	public static void main(String[] args) {
		// 중첩 for문을 이용해서 주어진 배열의 전체 항목의 합과 평균값을 구하시오
		// 각 행의 열의 갯수가 다른 경우
		
		int[][] array = {
				{95, 86}, // 1층
				{83, 92, 96}, // 2층
				{78, 83, 93, 87, 88} // 3층
		};
		
		int sum = 0;
		double avg = 0.0;
		
		// for문 작성 위치
		int count = 0; // 방의 갯수가 다른 2차원 배열이라 식을 구할 수 없고 카운팅을 해야함.
		for (int i=0; i < array.length; i++) { // 행 반복 > 3
			for (int j=0; j < array[i].length; j++) { // 열 반복
				sum += array[i][j]; 
				count++; 
			}
		}
		avg = (double) sum / count; // 총합 나누기 카운트 횟수
		
		System.out.println("sum: " + sum ); //881
		System.out.println("avg: " + avg); // 88.1

	}

}
