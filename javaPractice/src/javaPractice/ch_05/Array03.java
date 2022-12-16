package javaPractice.ch_05;

public class Array03 {

	public static void main(String[] args) {
		// 배열을 활용하여 최솟값, 최댓값 구하기.
		// for 문으로 배열의 길이가 짧아지던 길어지던 편리하게 구할 수 있음을 알 수 있다.
		// if 문으로 조건을 만들어 원하는 값을 금방 산출할 수 있다.
		
		int [] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0]; // 배열의 첫 번째 값으로 최댓값을 초기화 한다.
		int min = score[0]; // 배열의 첫 번째 값으로 최솟값을 초기화 한다.
		
		for (int i = 1; i < score.length; i++) { // int 1의 index 번호 1번부터 i가 score의 길이 만큼, i를 ++
			if (score[i] > max) { // score[i] 가 max 보다 크면 
				max = score[i]; // max = score[i]
			}
			if (score[i] < min) { // score[i] 가 min 보다 작으면
				min = score[i]; // min = score[i]
			}
			
		} // end of for

		
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}

}
