package javaPractice.ch_14.collection_hashmap;

import javaPractice.ch_14.collection_Member.Member;
import javaPractice.ch_14.collection_hashmap.MemberHashMap;


public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberKim = new Member(909, "김준규");
		Member memberPark = new Member(314, "박지훈");
		Member memberChoi = new Member(421, "최현석");
		Member memberYoon = new Member(1004, "윤재혁");
		
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberChoi);
		memberHashMap.addMember(memberYoon);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);	// 회원 아이디 (key 값)가 1004 인 회원 삭제
		memberHashMap.showAllMember();
		

	}

}
