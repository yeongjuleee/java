package javaPractice.ch_14.collection_treeset;

import java.util.TreeSet;

public class MyTreeSet_01 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("������");
		treeSet.add("������");
		treeSet.add("�����");
		treeSet.add("���ر�");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		// ������������ ������ �Ǿ� ��µ�
//		�����
//		���ر�
//		������
//		������
		
	}

}
