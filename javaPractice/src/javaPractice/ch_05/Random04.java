package javaPractice.ch_05;

import java.util.Scanner;

public class Random04 {

	public static void main(String[] args) {
		// 간단한 가위바위보 게임 프로그램을 작성하라
		// 1. 가위, 바위, 보는 각각 정수형 1, 2, 3 으로 간주
		// 2. 컴퓨터가 제시할 가위바위보 데이터를 만든다
		// 3. 게임은 총 5회 진행하며, 컴퓨터는 배열 안 데이터를 차례대로 출력하는 것으로 한다
		// 4. 현재 횟수 / 총 횟수와 함께 입력 메시지를 출력한다
		// 5. 키보드로 1, 2, 3 중 하나를 입력하고, 컴퓨터와 키보드로 입력한 값을 비교하여 누가 이겼는지 알려준다
		// 6. 비긴 경우에는 횟수에 포함하지 않는다
		// 7. 게임이 종료되면 누가 이겼는지 표시한다
		
		Scanner scanner = new Scanner(System.in);
		
		//String[] gbb = { "가위", "바위", "보" }; // index 번호 0 1 2 상태. 
		// String 으로 배열을 정의 한 후에 그 인덱스 값을 입력해서 가위, 바위, 보가 나오게 해야할 것 같음. 
		// 그래서 gbb로 선언했는데 그걸 int로 바꾸는 방법을 모름 > 할 수 없는 것 같음. 
		
		
		int[] rsp = {1, 2, 3, 2, 3};
		int user = 0;
		int count = 0; // 횟수 출력
		
		for (int i=0; i < rsp.length; i++) {
			System.out.print("1 ~ 3 까지의 숫자를 입력하세요: ");
			user = scanner.nextInt();
			
			if (user == rsp[i]) {
				System.out.print("비겼습니다.");
				i--;
				continue;
				
			} else if (user > rsp[i]) {
				System.out.print("이겼습니다.");
			} else if (user < rsp[i]) {
				System.out.print("졌습니다.");
			}
			
		}
		System.out.println("5판을 모두 했습니다.");
		 
		
		
	}
}
