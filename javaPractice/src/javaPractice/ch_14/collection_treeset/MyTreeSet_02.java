package javaPractice.ch_14.collection_treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompareInt implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2) * -1;
		// Integer Ŭ������ compareTo() �޼ҵ带 �ݴ��
		// compareTo() �޼ҵ� : �ΰ��� ���� ���Ͽ� int ������ ��ȯ���ִ� �Լ�
		// compareTo() �޼ҵ� : ���ڿ� �� �� ���� �� ��� 
		// ���� �� ��� : �ܼ��� ũ��(1), ����(0), �۴�(-1) �� ���� ����� ����
		// ���ڿ� �� ��� : ����(0), �� �� ���/���� �� ��� ��ȯ ???
	}
	
}

public class MyTreeSet_02 {
	private static void print(String string, Integer value) {
	      System.out.println(string+": " +value);
	      
	   }
	
	public static void main(String[] args) {
		TreeSet<Integer> score = new TreeSet<Integer>();
		
		score.add(90);
		score.add(100);
		score.add(85);
		score.add(65);
		score.add(50);
		score.add(75);
		score.add(90);
		
		System.out.println(score);
		// [50, 65, 75, 85, 90, 100]
		
		Integer value = null;
		value = score.first();	// first() : ����  ���� �� ��ȯ
		print("���� ���� ����", value);
		value = score.last();	// last() : ���� ū ��
		print("���� ���� ����", value);
		value = score.lower(85);	// lower() : ������ ������ ���� �� �� ���� ū ��(���ڰ� ������)
		print("85 �ٷ� ���� ����", value);
		value = score.higher(85);	// higher() : ������ ������ ū �� �� ���� ���� �� (���ڰ� ������)
		print("85 �ٷ� ���� ����", value);
		value = score.floor(85);	// floor() : ������ ���� ���ų� ���� �� �� ���� ū �� (���ڰ� ����_
		print("85 �Ǵ� �ٷ� ���� ����", value);
		value = score.ceiling(85);	// ceiling() : ������ ������ ũ�ų� ���� �� �� ���� ���� ��(���ڰ� ����)
		print("85 �Ǵ� �ٷ� ���� ����", value);
		
		while(!score.isEmpty()) {
			value = score.pollLast();	// pollLast() : ���� ū ���� ��ȯ �� ����
			print("���� ���� ���� ����", value);
		}

	}

}
