package javaPractice.ch_14.collection_hashset;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet_03 {

	public static void main(String[] args) {
		Set<MemberShip> set = new HashSet<MemberShip>();
		
		// 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장
		set.add(new MemberShip("김준규", 23));
		set.add(new MemberShip("김준규", 23));
		
		System.out.println("총 객체 수 : " + set.size());		// 1
		
		
	}

}
