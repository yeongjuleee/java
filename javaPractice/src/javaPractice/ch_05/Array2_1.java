package javaPractice.ch_05;

public class Array2_1 {

	public static void main(String[] args) {
		// 2차원 배열 초기화 및 출력방법
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6}
		}; // 2차원 배열 선언
		
		System.out.println("행: " + arr.length);
		System.out.println("열: " + arr[0].length);
		
		for(int i=0; i < arr.length; i++) { // 변수 arr의 배열 길이만큼 i를 1씩 증가시킴 = i =행. 
			for(int j=0; j < arr[i].length; j++) { // 변수 arr의 행(=i) 길이만큼 열(=j)을 1씩 증가시킴. arr[i]에서 i는 각 행을 말함. 
				System.out.print(arr[i][j] + " "); // 변수 arr의 행과 열을 출력하라.
			}
			System.out.println(); // 행이 반복이 끝나면 줄바꿈
		}

	}

}
