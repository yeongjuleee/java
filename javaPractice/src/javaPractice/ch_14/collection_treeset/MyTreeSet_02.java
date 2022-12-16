package javaPractice.ch_14.collection_treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompareInt implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2) * -1;
		// Integer 클래스의 compareTo() 메소드를 반대로
		// compareTo() 메소드 : 두개의 값을 비교하여 int 값으로 반환해주는 함수
		// compareTo() 메소드 : 문자열 비교 와 숫자 비교 방식 
		// 숫자 비교 방법 : 단순히 크다(1), 같다(0), 작다(-1) 의 관한 결과값 리턴
		// 문자열 비교 방법 : 같다(0), 그 외 양수/음수 값 결과 반환 ???
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
		value = score.first();	// first() : 가장  작은 값 반환
		print("가장 낮은 점수", value);
		value = score.last();	// last() : 가장 큰 값
		print("가장 높은 점수", value);
		value = score.lower(85);	// lower() : 제공된 값보다 작은 값 중 가장 큰 값(인자값 미포함)
		print("85 바로 이전 점수", value);
		value = score.higher(85);	// higher() : 제공된 값보다 큰 값 중 가장 작은 값 (인자값 미포함)
		print("85 바로 다음 점수", value);
		value = score.floor(85);	// floor() : 제공된 값과 같거나 작은 값 중 가장 큰 값 (인자값 포함_
		print("85 또는 바로 이전 점수", value);
		value = score.ceiling(85);	// ceiling() : 제공된 값보다 크거나 같은 값 중 가장 작은 값(인자값 포함)
		print("85 또는 바로 다음 점수", value);
		
		while(!score.isEmpty()) {
			value = score.pollLast();	// pollLast() : 가장 큰 값을 반환 후 삭제
			print("현재 가장 높은 점수", value);
		}

	}

}
