package javaPractice.ch_14.collection;

import java.util.ArrayList;
import java.util.List;

public class MyListArrayList_01 {
	// String 객체를 저장하는 ArrayList
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// String 객체 저장 ( .add() 메소드 사용 )
		list.add("Java");
		list.add("JDBC");
		list.add("Serverlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();	// 저장된 총 객체수 열기
		System.out.println("총 객체 수 : " + size);	// 총 객체수 : 5
		System.out.println();
		
		String skill = list.get(2);	// 2번 인덱스에 저장된 객체 열기
		System.out.println("2: " + skill);	// 2: Database
		System.out.println();
		
		// 저장된 객체 출력
		for (int i = 0; i < list.size(); i++) { // 저장된 갯수만큼 반복
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		// 0 : Java
		// 1 : JDBC
		// 2 : Database
		// 3 : Serverlet/JSP
		// 4 : iBATIS
		
		System.out.println();
		for(String str : list) { // foreach로도 출력 가능
			System.out.println(str);
		}
		System.out.println();
		
		list.remove(2);	// 2번 인덱스 Database 삭제
		list.remove(2);	// 2번 인덱스 Serverlet/JSP 삭제 
						// (Database가 삭제되어서 Serverlet/JSP가 2번 인덱스가 됨 => 배열 한칸씩 땅겨짐)
		list.remove("iBATIS");
		
		for (int i = 0; i < list.size(); i++) { // 저장된 갯수만큼 반복
												// ArrayList의 길이는 length 가 아닌 size를 이용
			String str = list.get(i);
			System.out.println(i + " : " + str);
			// 0 : Java
			// 1 : JDBC
		}
	}

}
