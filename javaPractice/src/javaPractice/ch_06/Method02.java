package javaPractice.ch_06;

import java.util.Scanner;

public class Method02 {

	static int max(int a, int b, int c) { // a, b, c 최댓값을 반환
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
		
	}
	
	public static void main(String[] args) {
		// 3명의 신장, 체중, 나이의 최댓값을 구해서 표시
		Scanner stdIn = new Scanner (System.in);
		
		int[] height = new int[3]; // 신장
		int[] weight = new int[3]; // 체중
		int[] age = new int[3];    // 나이
		
		for (int i=0; i < 3; i++) { // 입력
			System.out.print("[" + (i + 1) + "] ");
			System.out.print("신장: "); 
			height[i] = stdIn.nextInt();
			System.out.print("    체중: ");
			weight[i] = stdIn.nextInt();
			System.out.print("    나이: ");
			age[i] = stdIn.nextInt();
		}
		
		int maxHeight = max(height[0], height[1], height[2]); // 신장의 최댓값
		int maxWeight = max(weight[0], weight[1], weight[2]); // 체중의 최댓값
		int maxAge = max(age[0], age[1], age[2]); // 나이의 최댓값
		
		System.out.println("신장의 최댓값은 " + maxHeight + "입니다");
		System.out.println("체중의 최댓값은 " + maxWeight + "입니다");
		System.out.println("나이의 최댓값은 " + maxAge + "입니다");
		

	}

}
