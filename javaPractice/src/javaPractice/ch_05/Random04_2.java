package javaPractice.ch_05;

import java.util.Random;
import java.util.Scanner;

public class Random04_2 {

	public static void main(String[] args) {
		// 간단한 가위바위보 게임 프로그램을 작성하라
		// 1. 가위, 바위, 보는 각각 정수형 1, 2, 3 으로 간주
		// 2. 컴퓨터가 제시할 가위바위보 데이터를 만든다
		// 3. 게임은 총 5회 진행하며, 컴퓨터는 배열 안 데이터를 차례대로 출력하는 것으로 한다
		// 4. 현재 횟수 / 총 횟수와 함께 입력 메시지를 출력한다
		// 5. 키보드로 1, 2, 3 중 하나를 입력하고, 컴퓨터와 키보드로 입력한 값을 비교하여 누가 이겼는지 알려준다
		// 6. 비긴 경우에는 횟수에 포함하지 않는다
		// 7. 게임이 종료되면 누가 이겼는지 표시한다
		
		/* 사용자가 이기는 경우
		 * 컴퓨터 : 사용자
		 * 1 : 2
		 * 2 : 3
		 * 3 : 1
		 * 
		 * 사용자가 지는 경우
		 * 컴퓨터 : 사용자
		 * 2 : 1
		 * 3: 2
		 * 1 : 3
		 */
		
		// 1. 컴퓨터가 제시할 가위바위보 데이터를 만든다.
		Random random = new Random();
		Scanner scanner = new Scanner (System.in);
		
		int[] numbers = new int[5]; // 총 게임 판수 5번
		String[] gameItems = {" ", "가위", "바위", "보" }; // 출력을 위해 문자열로 배열 저장
		int[] results = new int[2]; // 게임 결과를 저장. 각각의 판수가 아니라 누가 이겼는지를 저장함. 0 : 사용자가 이김
		String[] resultStrs = {"사용자가 이김", "컴퓨터가 이김" }; // 출력을 위한 문자열
		
		for (int i=0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(3) + 1; // 1~3 까지 랜덤하게 정수를 반환함
		}
		//System.out.println(Arrays.toString(numbers)); // [3, 3, 2, 2, 3]
		
		// 게임은 총 5회 진행하며 컴퓨터는 배열 안 데이터를 차례대로 출력하는 것으로 함 
		// 현재 횟수 / 총 횟수와 함께 입력 메시지를 출력
		
		
		for (int i=0, answer; i < numbers.length; i++) {
			System.out.print((i + 1) + " /" + numbers.length + " 입니다. 가위(1), 바위(2), 보(3) 중 하나를 입력하세요");
			answer = scanner.nextInt();
			System.out.print(gameItems[answer -1] + "입력하셨고, 컴퓨터는 " + gameItems[numbers[i]-1] + "을 냈습니다.");
			
			if (answer == numbers[i]) { // 비긴 경우
				System.out.println("비겼습니다.");
				i--; // i 의 값이 바뀌지 않게 함. 
			} 
			else if ((answer + 1) % 3 == numbers[i] % 3) { // 사용자가 지는 경우
				results[1]++;
				System.out.println("컴퓨터가 이겼습니다.");
			}
			else {
				results[0]++;
				System.out.println("사용자가 이겼습니다.");
			}
		}
		
		int max = results[0];
		int maxIndex = 0;
		
		for (int i=0; i < results.length; i++) {
			if (max < results[i]) {
				max = results[i];
				maxIndex = i;
			}
		}
		System.out.println("게임 결과는 " + resultStrs[maxIndex]);
	}

}
