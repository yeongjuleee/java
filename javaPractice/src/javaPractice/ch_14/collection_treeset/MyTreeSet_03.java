package javaPractice.ch_14.collection_treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
	�����ϴ� ���
	1. Comparable �������̽� ����
	������ �����ϴµ� ����ϴ� �������̽�. compareTo() �޼ҵ带 �����ؾ� ��� ����
	ù ��° �Ű������� �� Ŭ �� ����� ��ȯ�Ͽ� ������������ ����
	
	a.compareTo(b) : 
		���� ��ü < �Ķ���ͷ� �Ѿ�� ��ü : ���� ����
		���� ��ü == �Ķ���ͷ� �Ѿ�� ��ü : 0 ����
		���� ��ü > �ĸ����ͷ� �Ѿ�� ��ü : ��� ����
		���� �Ǵ� 0�̸� ��ü�� �ڸ��� �״�� �����Ǹ�, ����� ��� �� ��ü�� �ڸ��� �ٲ�
		
	2. Comparator �������̽� ����
		������ �����ϴµ� ����ϴ� �������̽�. compare() �޼ҵ带 �����ؾ� ��� ����
		compareTo() �޼ҵ�� this�� ���޵� �Ű������� ���ߴٸ�, compare() �޼ҵ�� ���޵Ǵ�
		�� �Ű������� ��
		compare() �޼ҵ忡�� �Ű� ������ 2�� ����
		
	compara(a, b)
	ù ��° �Ķ���ͷ� �Ѿ�� ��ü < �ι�° ��
*/

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1;
		// String Ŭ������ compareTo() �޼ҵ带 �ݴ��
	}
	
}

public class MyTreeSet_03 {

	public static void main(String[] args) {
		// Set<String> set = new TreeSet<String>();
		// TreeSet �����ڿ� Comparator�� ������ ��ü�� �Ű������� ������
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
		// [ccc, bbb, aaa]

	}

}
