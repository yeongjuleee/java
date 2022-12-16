package javaPractice.ch_05;

public class Array04 {

	public static void main(String[] args) {
		// 배열을 이용하여 math.random 돌리기
		// math.random: 0.0 이상, 1.0 미만의 double 값의 난수를 균일한 분포로 반환
		
		int[] number = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = i; // 배열을 0~9의 숫자로 초기화.
			System.out.print(number[i] + " "); // 0 1 2 3 4 5 6 7 8 9 
		}
		
		System.out.println();
		
		for (int i = 0; i < 10000; i++) {
			int n = (int)(Math.random() * 10); // 0~9 중의 한 값을 임의로 얻음.
			// System.out.println(Math.random());
			// System.out.println((int)(Math.random() * 11);
			
			// 순서대로 나열된 배열의 순서를 섞기 위한 과정 ↓
			int temp = number[0];  // 임의의 변수에 number[0] 의 값을 저장
			number[0] = number[n]; // number[0] 에 임의의 배열 값 number[n] 을 저장
			number[n] = temp; // number[n]에 temp(초기 number[0]) 값 저장 
		}
		
		// Sysetm.out.println(temp);
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");; // 배열의 내용을 출력.
		}
		
		
		}

	}


