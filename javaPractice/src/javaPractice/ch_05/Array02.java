package javaPractice.ch_05;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		// �迭�� �پ��� ���� ���. 
		// new�� ���� �ʰ�, �迭�� ���� �������� �ʰ� �����ϴ� ���.
		
		// 1. ���̰� 5�� �迭 ����. �迭 ���� ����
		int[] a = new int[] {10, 20, 4, 25, 18};
		
		// 2. ���̰� 7�� �迭 ����, new int[] ���� ����
		int[] b = {1, 2, 3, 4, 5, 6, 7};
		
		// 3. for������ �迭 �ʱ�ȭ
		/*
		int [] c = new int[10];
		for(int i = 0; i < c.length; i++) {
			c[i] = i;
		}
		*/
		// 3. foreach������ �迭 �ʱ�ȭ �غ���
		int [] c = new int [10];
		for (int i : c) {
			c[i] = i;
		}
		
		// for ���� �̿��� ���
		/*
		System.out.println(c.length);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		*/
		
		// forEach ���� �̿��� ���
		System.out.println(c.length);
		for(int i : c) {
			System.out.println(c[i]);
		}
		
		// forEach���� �̿��� �迭 ���
		// ����: for(������Ÿ�� ������: �迭 ) { ���๮ }
		// �������: �迭 > Ÿ�Ժ��� > ���๮ > �迭...  ������ �׸��� ���� ��� forEach Ż��.
		
		/*
		System.out.println();
		for(int d: c) { // ������Ÿ�� int ������d: �迭c
			System.out.print(d);
		}
		*/
		
		// Arrays.toString(c) : �迭 () ���� ������ ���ڿ��� �ٲپ��.
		// ��, Arrays.toString�� ��� ������ ����.
		System.out.println();
		System.out.println(Arrays.toString(c));
	}

}
