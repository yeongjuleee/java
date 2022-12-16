package javaPractice.ch_05;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		// 배열의 다양한 선언 방법. 
		// new를 적지 않고, 배열의 값을 지정하지 않고 저장하는 방법.
		
		// 1. 길이가 5인 배열 생성. 배열 길이 생략
		int[] a = new int[] {10, 20, 4, 25, 18};
		
		// 2. 길이가 7인 배열 생성, new int[] 생략 가능
		int[] b = {1, 2, 3, 4, 5, 6, 7};
		
		// 3. for문으로 배열 초기화
		/*
		int [] c = new int[10];
		for(int i = 0; i < c.length; i++) {
			c[i] = i;
		}
		*/
		// 3. foreach문으로 배열 초기화 해보기
		int [] c = new int [10];
		for (int i : c) {
			c[i] = i;
		}
		
		// for 문을 이용한 출력
		/*
		System.out.println(c.length);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		*/
		
		// forEach 문을 이용한 출력
		System.out.println(c.length);
		for(int i : c) {
			System.out.println(c[i]);
		}
		
		// forEach문을 이용한 배열 출력
		// 문법: for(데이터타입 변수명: 배열 ) { 실행문 }
		// 실행순서: 배열 > 타입변수 > 실행문 > 배열...  가져올 항목이 없을 경우 forEach 탈출.
		
		/*
		System.out.println();
		for(int d: c) { // 데이터타입 int 변수명d: 배열c
			System.out.print(d);
		}
		*/
		
		// Arrays.toString(c) : 배열 () 안의 내용을 문자열로 바꾸어라.
		// 단, Arrays.toString의 경우 연산은 못함.
		System.out.println();
		System.out.println(Arrays.toString(c));
	}

}
