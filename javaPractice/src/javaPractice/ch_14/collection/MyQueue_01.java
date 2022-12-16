package javaPractice.ch_14.collection;

import java.util.LinkedList;

/*
코딩을 하면서 신경 써야하는 점
1. 왜 LinkedList를 사용할까?
=> 이전 Stack에서는 ArrayList를 사용했는데 왜 Queue는 LinkedList?
*/

class MyQueue {
	private LinkedList<String> linkedList = new LinkedList<String>();
	// 맨 앞에꺼가 빠지고 하나씩 자리가 당겨짐 => 메모리가 많이 소모. 그래서 LinkedList로 구현 (반쪽자리 필기)
	
	public void enQueue(String data) {
		linkedList.add(data);
	}
	
	public String deQueue() {
		// 큐의 맨 앞에서 꺼냄 ( 가장 먼저 들어간거를 먼저 뺌.)
		int len = linkedList.size();
		if (len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return (linkedList.remove(0));	// 맨 앞의 자료를 반환하고 배열에서 제거
	}
}

public class MyQueue_01 {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue("A"); // enQueue : List를 더하는 메소드
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());	// A deQueue : 자료를 반환하고 배열에서 제거하는 메소드
		System.out.println(queue.deQueue());	// B
		System.out.println(queue.deQueue());	// C

	}

}
