package javaPractice.ch_14.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 이름을 key로 점수를 value로 저장하기
public class MyMap_01 {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		// <String, Integer> => String을 키로, Integer를 값으로 사용
		
		// 객체 저장
		map.put("김준규", 80);
		map.put("박지훈", 85);
		map.put("박정우", 90);
		map.put("박지훈", 95);
		// key가 같기 때문에 제일 마지막 저장한 값으로 대체 
		System.out.println("중 Entry 수 : " + map.size());
		
		// 객체 찾기
		// 이름(key)으로 점수(value) 검색
		System.out.println("\t박지훈 : " + map.get("박지훈"));	// key로 정수 값 입력
		System.out.println();
		
		// 객체 하나씩 처리
		Set<String> keySet = map.keySet();	// KeySet() : 모든 키를 Set 객체에 담아서 리턴. Key Set 얻기
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) { // 반복(Set은 인덱스 값 X => forEach 또는 while)해서 키를 얻고 값을 Map에서 얻어냄
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// forEach문을 사용해 출력
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			String strKey = entry.getKey();
			Integer intValue = entry.getValue();
			System.out.println(strKey + " : " + intValue);
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("박지훈");	// 키로 Map.Entry 제거
		System.out.println("중 Entry 수 : " + map.size());	// 중 Entry 수 : 2
		
		// 객체를 하나씩 처리
		// entrySet() : 키와 값의 싸으로 구성된 모든 Map.Entry 객체를 Set에 담아 리턴
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();	// Map.Entry Set 얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 객체 전체 삭제
		map.clear();
		System.out.println("중 Entry 수 : " + map.size()); // 중 Entry 수 : 0
		

	}

}
