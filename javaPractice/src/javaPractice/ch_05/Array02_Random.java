package javaPractice.ch_05;

import java.util.Arrays;

public class Array02_Random {

	public static void main(String[] args) {
		// 로또 번호 구하기
		// 1~45까지의 임의의 수 구하기
		// 중복 되는 것이 없도록
		
		
		int range = 6;
		int [] numbers = new int[range];// 현재 range 는 총 6칸이고 0 이 저장되어 있음
		
		while (range > 0) {
			int temp = (int)(Math.random() * 45) + 1; // 1~45의 임의의 값을 얻는다. 
			
			// 중복 확인
			boolean result = true; // 중복 확인 값을 위해 저장하기 위한 변수. 중복이면 false
			// { , , , 13 ,12 }
			for (int i=5;  i >= range; i--) { // 값이 저장된 것만 확인을 해야함.
				if(temp == numbers[i]) {
					result = false;
				}
			}
			  
			
			if (result) {
				numbers[range - 1] = temp;
				range--;
			}
		
		}
		System.out.println(Arrays.toString(numbers));


	}

}
