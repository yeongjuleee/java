package javaPractice.ch_14.collection_treeset;

import javaPractice.ch_14.collection_Member.MemberTreeSet;
import javaPractice.ch_14.collection_Member.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(314, "박지훈");
		Member memberKim = new Member(909, "김준규");
		Member memberChoi = new Member(421, "최현석");
		
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberChoi);
		memberTreeSet.showAllMember();
		
		Member memberDo = new Member(314, "김도영");	// 314 아이디 중복
		memberTreeSet.addMember(memberDo);
		memberTreeSet.showAllMember();
	}

}
