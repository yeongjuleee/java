package javaPractice.ch_14.collection;

import java.util.ArrayList;

/*
ArrayList : 배열에서 발전된 형태
요소를 추가하면 0번 인덱스부터 차례대로 저장
메소드를 사용해서 원하는 위치에 요소를 추가하거나, 삭제, 반환 할 수 O
*/


public class Example01 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);	// 타입을 지정X 형태. 초기 capa 값을 지정할 수 O
		list1.add("T");
		list1.add("R");
		list1.add("E");
		list1.add("A");
		
		System.out.print("초기 상태 : ");
		System.out.println(list1);	// [T, R, E, A]
		
		System.out.print("인덱스 1 위치에 B 추가 : ");
		list1.add(1, "B");// 인덱스 번호를 지정하고 추가하는 형태
		System.out.println(list1);	// [T, B, R, E, A]
		
		System.out.print("인덱스 2 위치의 값 삭제 : ");
		list1.remove(2);	// 인덱스 번호를 이용해서 삭제
		System.out.println(list1);	// [T, B, E, A]
		
		System.out.println("인덱스 2번 위치의 값 반환 :" + list1.get(2));	// E

	}

}
