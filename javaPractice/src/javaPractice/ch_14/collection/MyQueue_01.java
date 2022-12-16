package javaPractice.ch_14.collection;

import java.util.LinkedList;

/*
�ڵ��� �ϸ鼭 �Ű� ����ϴ� ��
1. �� LinkedList�� ����ұ�?
=> ���� Stack������ ArrayList�� ����ߴµ� �� Queue�� LinkedList?
*/

class MyQueue {
	private LinkedList<String> linkedList = new LinkedList<String>();
	// �� �տ����� ������ �ϳ��� �ڸ��� ����� => �޸𸮰� ���� �Ҹ�. �׷��� LinkedList�� ���� (�����ڸ� �ʱ�)
	
	public void enQueue(String data) {
		linkedList.add(data);
	}
	
	public String deQueue() {
		// ť�� �� �տ��� ���� ( ���� ���� ���Ÿ� ���� ��.)
		int len = linkedList.size();
		if (len == 0) {
			System.out.println("ť�� ������ϴ�.");
			return null;
		}
		return (linkedList.remove(0));	// �� ���� �ڷḦ ��ȯ�ϰ� �迭���� ����
	}
}

public class MyQueue_01 {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue("A"); // enQueue : List�� ���ϴ� �޼ҵ�
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());	// A deQueue : �ڷḦ ��ȯ�ϰ� �迭���� �����ϴ� �޼ҵ�
		System.out.println(queue.deQueue());	// B
		System.out.println(queue.deQueue());	// C

	}

}
