package javaPractice.ch_14.collection_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// for���� ��� X ����
// �ε��� ��ȣ�� ������� �ʴ� forEach�� ����
public class MyHashSet_02 {
	// String ��ü�� �ߺ� ���� �����ϴ� HashSet
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet / JSP");
		set.add("Java");	// (�ߺ� �߰�) Java�� �� ���� ����ȴ�.
		set.add("iBATIS");

		int size = set.size();	// ����� ��ü �� ���
		System.out.println("�� ��ü �� : " + size);
		// �� ��ü �� : 4 ( Java�� �ߺ��̶� 1�� ������� 4����)
		
		System.out.println("foreach ������ ��� ����!");
		for (String s : set) {
			System.out.println("\t" + s);	
		}
		System.out.println();
		
		// Iterator �� iterator ��ü�� ����. 
		Iterator<String> iterator = set.iterator();	// �ݺ��� ���
		while (iterator.hasNext()) { // ��ü ����ŭ ���� ( �ݺ��� ���´� for X while�� ��)
			String element = iterator.next();	// 1 ���� ��ü�� ������
			System.out.println("\t " + element);
		}
		
		set.remove("JDBC"); // 1���� ��ü ���� (������ ��� �ε��� ��ȣ�� ���� ������, ������ ���� �ؽ��ڵ带 ���ؼ� ������)
		set.remove("iBATIS");	// 1 ���� ��ü ����
		
		System.out.println("�� ��ü ��: " + set.size());
		
		System.out.println("foreach ������ ��� ����");
		for (String s: set) {
			System.out.println("\t" + s);
		}
		System.out.println();
		
		set.clear();	// ��� ��ü�� �����ϰ� ���
		if (set.isEmpty()) {
			System.out.println("�������");
		}
	}

}
