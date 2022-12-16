package javaPractice.ch_05;

public class Array2_2 {

	public static void main(String[] args) {
		// 5명 학생의 국어, 영어, 수학 성적 데이터를 가지고
		// 1. 각 학생의 3과목 총점과 평균
		// 2. 각 과목의 모든 학생의 총점을 구하기.
		
		int[][] score = {
				// { 국, 영, 수}
				{ 100, 100, 100 }, // 1층
				{ 20, 20, 20 }, // 2층
				{ 30, 30, 30 }, // 3층
				{ 40, 40, 40 }, // 4층
				{ 50, 50, 50 } //5층
		};
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===============================================");
		
		//System.out.println(score.length); // 행 5개
		for (int i=0; i < score.length; i++) { // 행 반복.  각 층의 값을 구함.
			int sum = 0; // 총점 저장 변수 
			koreanTotal += score[i][0];
			englishTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.print(" " + (i + 1) + "\t"); // 번호. 각 행의 인덱스번호에 1을 더함. 번호 시작을 1부터 하기 위해
			
			//System.out.println(score[i].length); // 열 3개
			for (int j=0; j < score[i].length; j++) {
				// 각 행에대한 열의 반복.  각 반의 값을 구함. 
				sum += score[i][j]; // 총점에 대한 각 행과 열
				System.out.print(score[i][j] + "\t"); // 각 행에 대한 열의 값을 구함. 국,영,수 
			}
			System.out.println(sum + "\t" + sum/(double)score[i].length); // 각 층의 총점 평균을 구함.
		}
		
		System.out.println("===============================================");
		System.out.println("총점:\t" + koreanTotal + "\t" + englishTotal + "\t" + mathTotal);
		

	}

}
