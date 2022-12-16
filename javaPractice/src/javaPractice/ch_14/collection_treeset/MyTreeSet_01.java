package javaPractice.ch_14.collection_treeset;

import java.util.TreeSet;

public class MyTreeSet_01 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("최현석");
		treeSet.add("박지훈");
		treeSet.add("김방전");
		treeSet.add("김준규");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		// 오름차순으로 정렬이 되어 출력됨
//		김방전
//		김준규
//		박지훈
//		최현석
		
	}

}
