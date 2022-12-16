package javaPractice.ch_14.collection_Member;

/*
	LinkedList 
	-������ �߰�, ������ ���� (��, ������ Ȯ��(idx��ȣ Ȯ��)�� ����)
		=> ������ �߰�, ���� : ����
		=> �߰� �߰� ���� : ����
		=> �˻�: ����
	-�ּҸ� ������ ����Ǿ� �ִ� ���


	ArrayList�� �ٸ���
	-ArrayList�� ������ �� �뷮�� ����, �뷮���� �� ���� ��Ұ� �߰��� ��� �뷮�� �ÿ����� ����
	-LinkedList�� ��Ҹ� �߰��� ������ �������� ����� �޸𸮸� ���� => �迭ó�� �뷮�� �ø��� ��� ���� �����ϴ� ���ŷο� X
	-LinkedList�� �ڷḦ �߰��� �߰��ϰų� ������ �� �ڷ��� �̵��� �迭���� ����
		=> ������ �߰�, ���� : ����
		=> �߰� �߰� ���� : ����
		=> �˻� : ����
*/


import java.util.LinkedList;

public class MyListLinkedList_01 {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// ��ũ�� ����Ʈ�� ��� �߰�
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		
		System.out.println(linkedList);	// ����Ʈ ��ü ���
		// [A, B, C]
		
		linkedList.add(1, "D");	// 1�� �ε����� D �߰�
		System.out.println(linkedList);
		// [A, D, B, C]
		
		linkedList.addFirst("O");	// addFirst() : �� �տ� �߰�
									// LinkedList���� ���
		System.out.println(linkedList);
		// [O, A, D, B, C]
		
		System.out.println(linkedList.removeLast());	// removeLast() : �� ���� ��� ���� �� ��ȯ
														// LinkedList���� ���
		System.out.println(linkedList);
		// [O, A, D, B]

	}

}
