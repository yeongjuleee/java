package javaPractice.ch_14.collection_Member;

/*
	LinkedList 
	-데이터 추가, 삭제가 빠름 (단, 데이터 확인(idx번호 확인)이 느림)
		=> 순차적 추가, 삭제 : 느림
		=> 중간 추가 삭제 : 빠름
		=> 검색: 느림
	-주소를 가지고 연결되어 있는 방식


	ArrayList와 다른점
	-ArrayList는 생성할 때 용량을 지정, 용량보다 더 많은 요소가 추가된 경우 용량을 늘여가며 수행
	-LinkedList는 요소를 추가할 때마다 동적으로 요소의 메모리를 생성 => 배열처럼 용량을 늘리고 요소 값을 복사하는 번거로움 X
	-LinkedList는 자료를 중간에 추가하거나 삭제할 때 자료의 이동이 배열보다 적음
		=> 순차적 추가, 삭제 : 빠름
		=> 중간 추가 삭제 : 느림
		=> 검색 : 빠름
*/


import java.util.LinkedList;

public class MyListLinkedList_01 {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// 링크드 리스트에 요소 추가
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		
		System.out.println(linkedList);	// 리스트 전체 출력
		// [A, B, C]
		
		linkedList.add(1, "D");	// 1번 인덱스에 D 추가
		System.out.println(linkedList);
		// [A, D, B, C]
		
		linkedList.addFirst("O");	// addFirst() : 맨 앞에 추가
									// LinkedList에서 사용
		System.out.println(linkedList);
		// [O, A, D, B, C]
		
		System.out.println(linkedList.removeLast());	// removeLast() : 맨 뒤의 요소 삭제 및 반환
														// LinkedList에서 사용
		System.out.println(linkedList);
		// [O, A, D, B]

	}

}
