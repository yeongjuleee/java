package javaPractice.ch_14.collection_Member;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
	ArrayList�� LinkedList�� ���� ���� ��
	������ ���� (����������) �߰� �Ǵ� �����ϴ� ��� ArrayList�� ��������,
	�߰��� �߰�, �����ϴ� ��쿡�� �� �� ��ũ ������ �����ϴ� LinkedList�� �� ������
	ArrayList�� ���� �ε������� ��� 1�� ���� �Ǵ� ���� ��Ű�� �ð��� �ʿ� => ó�� �ӵ��� ����
*/

public class MyListLinkedList_02 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// 1. �߰��� �߰��ϴ� ���
		System.out.println("1. �߰��� �߰��ϴ� ���");
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ� �ð�: " + (endTime - startTime) + " ns");
		// ArrayList �ɸ� �ð� : 4969800 ns
		
		// 2. ���� ���������� �߰��ϴ� ���
		System.out.println("2. ���� ���������� �߰��ϴ� ���");
		startTime = System.nanoTime();
		
		for(int i = 0; i < 10000; i++) {
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ� �ð�: " + (endTime - startTime) + " ns");
		// ArrayList �ɸ� �ð�: 771900 ns
		
		for(int i=0; i < 10000; i++) {
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ� �ð�: " + (endTime - startTime) + " ns");
		// LinkedList �ɸ� �ð�: 4104400 ns
	}

}
