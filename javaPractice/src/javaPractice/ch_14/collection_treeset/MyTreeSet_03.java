package javaPractice.ch_14.collection_treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
	정렬하는 방법
	1. Comparable 인터페이스 구현
	정렬을 구현하는데 사용하는 인터페이스. compareTo() 메소드를 구현해야 사용 가능
	첫 번째 매개변수가 다 클 때 양수를 반환하여 오름차순으로 정렬
	
	a.compareTo(b) : 
		현재 객체 < 파라미터로 넘어온 객체 : 음수 리턴
		현재 객체 == 파라미터로 넘어온 객체 : 0 리턴
		현재 객체 > 파마리터로 넘어온 개체 : 양수 리턴
		음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우 두 객체의 자리가 바뀜
		
	2. Comparator 인터페이스 구현
		정렬을 구현하는데 사용하는 인터페이스. compare() 메소드를 구현해야 사용 가능
		compareTo() 메소드는 this와 전달된 매개변수를 비교했다면, compare() 메소드는 전달되는
		두 매개변수를 비교
		compare() 메소드에는 매개 변수가 2개 전달
		
	compara(a, b)
	첫 번째 파라미터로 넘어온 객체 < 두번째 리
*/

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1;
		// String 클래스의 compareTo() 메소드를 반대로
	}
	
}

public class MyTreeSet_03 {

	public static void main(String[] args) {
		// Set<String> set = new TreeSet<String>();
		// TreeSet 생성자에 Comparator를 구현한 객체를 매개변수로 전달함
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
		// [ccc, bbb, aaa]

	}

}
