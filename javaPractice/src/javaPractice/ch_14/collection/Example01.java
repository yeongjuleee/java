package javaPractice.ch_14.collection;

import java.util.ArrayList;

/*
ArrayList : �迭���� ������ ����
��Ҹ� �߰��ϸ� 0�� �ε������� ���ʴ�� ����
�޼ҵ带 ����ؼ� ���ϴ� ��ġ�� ��Ҹ� �߰��ϰų�, ����, ��ȯ �� �� O
*/


public class Example01 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);	// Ÿ���� ����X ����. �ʱ� capa ���� ������ �� O
		list1.add("T");
		list1.add("R");
		list1.add("E");
		list1.add("A");
		
		System.out.print("�ʱ� ���� : ");
		System.out.println(list1);	// [T, R, E, A]
		
		System.out.print("�ε��� 1 ��ġ�� B �߰� : ");
		list1.add(1, "B");// �ε��� ��ȣ�� �����ϰ� �߰��ϴ� ����
		System.out.println(list1);	// [T, B, R, E, A]
		
		System.out.print("�ε��� 2 ��ġ�� �� ���� : ");
		list1.remove(2);	// �ε��� ��ȣ�� �̿��ؼ� ����
		System.out.println(list1);	// [T, B, E, A]
		
		System.out.println("�ε��� 2�� ��ġ�� �� ��ȯ :" + list1.get(2));	// E

	}

}
