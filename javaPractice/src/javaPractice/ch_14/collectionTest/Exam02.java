package javaPractice.ch_14.collectionTest;

import java.util.HashSet;


/*
	��� ����� ������ ���� �������� Member Ŭ������ �����϶�
	[400: ������, 100: ���ر�, 200: �����, 300: ������]
	��� ������ �������.
*/

class Member {
	// �ʵ�(�Ӽ�)
	String score;	// ���� 
	String name;	// �̸�
	
	// ������
	public Member(String score, String name) {
		this.score = score;
		this.name = name;
	}

	// �޼ҵ�
	

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
		set.add(new Member("100", "���ر�"));
		set.add(new Member("200", "�����"));
		set.add(new Member("300", "������"));
		set.add(new Member("400", "������"));
		set.add(new Member("100", "����ȯ"));
		
		System.out.println(set);

	}

}
