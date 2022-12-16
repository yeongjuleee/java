package javaPractice.ch_14.collection_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// for문은 사용 X 지만
// 인덱스 번호를 사용하지 않는 forEach는 가능
public class MyHashSet_02 {
	// String 객체를 중복 없이 저장하는 HashSet
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet / JSP");
		set.add("Java");	// (중복 발견) Java는 한 번만 저장된다.
		set.add("iBATIS");

		int size = set.size();	// 저장된 객체 수 얻기
		System.out.println("총 객체 수 : " + size);
		// 총 객체 수 : 4 ( Java가 중복이라 1개 사라져서 4개임)
		
		System.out.println("foreach 문으로 출력 시작!");
		for (String s : set) {
			System.out.println("\t" + s);	
		}
		System.out.println();
		
		// Iterator 의 iterator 객체를 생성. 
		Iterator<String> iterator = set.iterator();	// 반복자 얻기
		while (iterator.hasNext()) { // 객체 수만큼 루핑 ( 반복문 형태는 for X while로 함)
			String element = iterator.next();	// 1 개의 객체를 가져옴
			System.out.println("\t " + element);
		}
		
		set.remove("JDBC"); // 1개의 객체 삭제 (삭제의 경우 인덱스 번호가 없기 때문에, 내용을 보고 해시코드를 구해서 삭제함)
		set.remove("iBATIS");	// 1 개의 객체 삭제
		
		System.out.println("총 객체 수: " + set.size());
		
		System.out.println("foreach 문으로 출력 시작");
		for (String s: set) {
			System.out.println("\t" + s);
		}
		System.out.println();
		
		set.clear();	// 모든 객체를 제거하고 비움
		if (set.isEmpty()) {
			System.out.println("비어있음");
		}
	}

}
