package javaPractice.ch_14.collection_Member;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
	ArrayList와 LinkedList의 실행 성능 비교
	끝에서 부터 (순차적으로) 추가 또는 삭제하는 경우 ArrayList가 빠르지만,
	중간에 추가, 삭제하는 경우에는 앞 뒤 링크 정보만 변경하는 LinkedList가 더 빠르다
	ArrayList는 뒤쪽 인덱스들을 모두 1씩 증가 또는 감소 시키는 시간이 필요 => 처리 속도가 느림
*/

public class MyListLinkedList_02 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// 1. 중간에 추가하는 경우
		System.out.println("1. 중간에 추가하는 경우");
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간: " + (endTime - startTime) + " ns");
		// ArrayList 걸린 시간 : 4969800 ns
		
		// 2. 끝에 순차적으로 추가하는 경우
		System.out.println("2. 끝에 순차적으로 추가하는 경우");
		startTime = System.nanoTime();
		
		for(int i = 0; i < 10000; i++) {
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간: " + (endTime - startTime) + " ns");
		// ArrayList 걸린 시간: 771900 ns
		
		for(int i=0; i < 10000; i++) {
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간: " + (endTime - startTime) + " ns");
		// LinkedList 걸린 시간: 4104400 ns
	}

}
