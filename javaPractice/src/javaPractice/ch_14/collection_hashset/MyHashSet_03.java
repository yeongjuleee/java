package javaPractice.ch_14.collection_hashset;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet_03 {

	public static void main(String[] args) {
		Set<MemberShip> set = new HashSet<MemberShip>();
		
		// �ν��Ͻ��� �ٸ����� ���� �����Ͱ� �����ϹǷ� ��ü 1���� ����
		set.add(new MemberShip("���ر�", 23));
		set.add(new MemberShip("���ر�", 23));
		
		System.out.println("�� ��ü �� : " + set.size());		// 1
		
		
	}

}
