package javaPractice.ch_06;

import java.util.Scanner;

public class Method01 {

	public static void main(String[] args) {
		// �޼ҵ�(Method)�� �� �ʿ��Ѱ�?
		
		// ������ �ڵ��ϰ� ���� Method02���� �Լ� ������ 
		
		// 3���� ����, ü��, ������ �ִ��� ���ؼ� ǥ��
		Scanner stdIn = new Scanner (System.in);
		
		int[] height = new int[3]; // ����
		int[] weight = new int[3]; // ü��
		int[] age = new int[3];    // ����
		
		for (int i=0; i < 3; i++) { // �Է�
			System.out.print("[" + (i + 1) + "] ");
			System.out.print("����: "); 
			height[i] = stdIn.nextInt();
			System.out.print("     ü��: ");
			weight[i] = stdIn.nextInt();
			System.out.print("     ����: ");
			age[i] = stdIn.nextInt();
		}
		
		// ������ �ִ��� ���Ѵ�
		int maxHeight = height[0];
		if (height[1] > maxHeight) maxHeight = height[1];
		if (height[2] > maxHeight) maxHeight = height[2];
		
		// ü���� �ִ��� ���Ѵ�
		int maxWeight = weight[0];
		if (weight[1] > maxWeight) maxWeight = weight[1];
		if (weight[2] > maxWeight) maxWeight = weight[2];
		
		// ������ �ִ��� ���Ѵ�
		int maxAge = age[0];
		if (age[1] > maxAge) maxAge = age[1];
		if (age[2] > maxAge) maxAge = age[2];
		
		System.out.println("������ �ִ��� " + maxHeight + "�Դϴ�");
		System.out.println("ü���� �ִ��� " + maxWeight + "�Դϴ�");
		System.out.println("������ �ִ��� " + maxAge + "�Դϴ�");
	}

}
