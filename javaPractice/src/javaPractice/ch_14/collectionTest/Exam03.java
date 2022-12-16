package javaPractice.ch_14.collectionTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// HashMap에 아이디(String)와 점수(Integer)가 저장되어 있다.
// 실행 결과와 같이 평균 점수를 출력하고, 최고 점수와 최고 점수를 받은 아이디를 출력할 것
// 출력 결과
// 평균 점수 : 91
// 최고 점수 : 96
// 최고 점수를 받은 아이디 : blue

public class Exam03 {
	private static void print(String string, Integer value) {
	      System.out.println(string+" : " +value);
	      
	   }
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;	// 최고 점수를 받은 아이디 저장
		int maxScore = 0;	// 최고 점수 저장
		int totalScore = 0;	// 점수 합계 저장

		// 작성 위치
		// 힌트 : 반복문을 이용하기! 
		// 어렵다면, 먼저 총점을 구해보자! 
		
// 내가 한 방법 (참고자료 : MyMap_01)
//		for(Map.Entry<String, Integer> entry : map.entrySet()) {	// 각 점수 구하는 반복문
//			String strKey = entry.getKey();
//			Integer intValue = entry.getValue();
//			System.out.println(strKey + " : " + intValue);
//			totalScore += intValue;
//			
//			if (maxScore < intValue) {
//				maxScore = intValue;
//				name = strKey;
//			}
//				
//		}
//		System.out.println();
//		
//		print("평균 점수 : ", totalScore / map.size());
//		print("최고 점수 : ", maxScore);
//		System.out.println("최고 점수를 받은 아이디 : " + name);
		
		
		// 강사님 방법
		Iterator<String> entrySet = map.keySet().iterator();
		while(entrySet.hasNext()) { // 반복해서 키를 얻고 값을 Map에서 얻어냄
			// key 값을 set 값으로 바꾸는 것이 1 번. 
			String key = entrySet.next();
			int thisScore = map.get(key);
			totalScore += thisScore;
			if ( maxScore < thisScore) {
				maxScore = thisScore;
				name = key;
			}
		}
		System.out.println("평균 점수 : " + totalScore / map.size());
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
	}

}
