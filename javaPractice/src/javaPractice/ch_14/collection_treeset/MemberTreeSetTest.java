package javaPractice.ch_14.collection_treeset;

import javaPractice.ch_14.collection_Member.MemberTreeSet;
import javaPractice.ch_14.collection_Member.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(314, "������");
		Member memberKim = new Member(909, "���ر�");
		Member memberChoi = new Member(421, "������");
		
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberChoi);
		memberTreeSet.showAllMember();
		
		Member memberDo = new Member(314, "�赵��");	// 314 ���̵� �ߺ�
		memberTreeSet.addMember(memberDo);
		memberTreeSet.showAllMember();
	}

}
