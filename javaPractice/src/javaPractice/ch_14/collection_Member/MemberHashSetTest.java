package javaPractice.ch_14.collection_Member;

import javaPractice.ch_14.collection_hashset.MemberHashSet;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberKim = new Member(909, "���ر�");
		Member memberPark = new Member(314, "������");
		Member memberChoi = new Member(421, "������");
		
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberChoi);
		memberHashSet.showAllMember();
		
		memberHashSet.addMember(memberKim);	// �ߺ��� ��ü ����
		memberHashSet.showAllMember();	// �ߺ��� ��ü�� ���� X
		
		// ���̵� �ߺ��� ��ü�� �������� �������� equals(), hashCode() �޼ҵ� �������̵� �ʿ�
		Member memberDo = new Member(1204, "�赵��");	// 1204 ���̵� �ߺ� ȸ�� �߰�
		memberHashSet.addMember(memberDo);
		memberHashSet.showAllMember();

	}

}
