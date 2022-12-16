package javaPractice.ch_14.collection_hashset;

import java.util.HashSet;

// Hashset : 중복을 허용 X  해시코드 값을 가지고, 중복된 해시코드 값을 잡는 것. 순서는 X
//			중복된 값을 하나만 저장이 목적

public class MyHashSet_01 {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("김준규"));
		hashSet.add(new String("김도영"));
		hashSet.add(new String("김준규"));
		hashSet.add(new String("박정우"));
		hashSet.add(new String("소정환"));
		
		// 중복된 문자열은 제거되고 출력 순서와 입력 순서는 상관 X
		System.out.println(hashSet);

	}

}
