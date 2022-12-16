package javaPractice.ch_14.collectionTest;

import java.util.HashSet;


/*
	출력 결과가 다음과 같이 나오도록 Member 클래스를 구현하라
	[400: 박지훈, 100: 김준규, 200: 김방전, 300: 최현석]
	출력 순서는 상관없다.
*/

class Member {
	// 필드(속성)
	String score;	// 점수 
	String name;	// 이름
	
	// 생성자
	public Member(String score, String name) {
		this.score = score;
		this.name = name;
	}

	// 메소드
	

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			if(this.score.equals(member.score)) {
				return true;
			}
			else 
				return false;
		}
		return false;
	}
	
	@Override
		public int hashCode() {
			return this.score.hashCode();
	}
	
	@Override
	public String toString() {
		return score + ":" + name;
	}
	
	
	
	
}

public class Exam02 {
	public static void main(String[] args) {
		HashSet<Member> set = new HashSet<Member>();
		set.add(new Member("100", "김준규"));
		set.add(new Member("200", "김방전"));
		set.add(new Member("300", "최현석"));
		set.add(new Member("400", "박지훈"));
		set.add(new Member("100", "소정환"));
		
		System.out.println(set);

	}

}
