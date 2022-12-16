package javaPractice.ch_14.collection_Member;

import javaPractice.ch_14.collection_hashset.MemberHashSet;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberKim = new Member(909, "김준규");
		Member memberPark = new Member(314, "박지훈");
		Member memberChoi = new Member(421, "최현석");
		
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberChoi);
		memberHashSet.showAllMember();
		
		memberHashSet.addMember(memberKim);	// 중복된 객체 저장
		memberHashSet.showAllMember();	// 중복된 객체는 저장 X
		
		// 아이디 중복된 객체를 저장하지 않으려면 equals(), hashCode() 메소드 오버라이딩 필요
		Member memberDo = new Member(1204, "김도영");	// 1204 아이디 중복 회원 추가
		memberHashSet.addMember(memberDo);
		memberHashSet.showAllMember();

	}

}
