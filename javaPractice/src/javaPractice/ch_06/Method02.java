package javaPractice.ch_06;

import java.util.Scanner;

public class Method02 {

	static int max(int a, int b, int c) { // a, b, c �ִ��� ��ȯ
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
		
	}
	
	public static void main(String[] args) {
		// 3���� ����, ü��, ������ �ִ��� ���ؼ� ǥ��
		Scanner stdIn = new Scanner (System.in);
		
		int[] height = new int[3]; // ����
		int[] weight = new int[3]; // ü��
		int[] age = new int[3];    // ����
		
		for (int i=0; i < 3; i++) { // �Է�
			System.out.print("[" + (i + 1) + "] ");
			System.out.print("����: "); 
			height[i] = stdIn.nextInt();
			System.out.print("    ü��: ");
			weight[i] = stdIn.nextInt();
			System.out.print("    ����: ");
			age[i] = stdIn.nextInt();
		}
		
		int maxHeight = max(height[0], height[1], height[2]); // ������ �ִ�
		int maxWeight = max(weight[0], weight[1], weight[2]); // ü���� �ִ�
		int maxAge = max(age[0], age[1], age[2]); // ������ �ִ�
		
		System.out.println("������ �ִ��� " + maxHeight + "�Դϴ�");
		System.out.println("ü���� �ִ��� " + maxWeight + "�Դϴ�");
		System.out.println("������ �ִ��� " + maxAge + "�Դϴ�");
		

	}

}
