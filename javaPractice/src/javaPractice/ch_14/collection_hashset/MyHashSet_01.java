package javaPractice.ch_14.collection_hashset;

import java.util.HashSet;

// Hashset : �ߺ��� ��� X  �ؽ��ڵ� ���� ������, �ߺ��� �ؽ��ڵ� ���� ��� ��. ������ X
//			�ߺ��� ���� �ϳ��� ������ ����

public class MyHashSet_01 {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("���ر�"));
		hashSet.add(new String("�赵��"));
		hashSet.add(new String("���ر�"));
		hashSet.add(new String("������"));
		hashSet.add(new String("����ȯ"));
		
		// �ߺ��� ���ڿ��� ���ŵǰ� ��� ������ �Է� ������ ��� X
		System.out.println(hashSet);

	}

}
