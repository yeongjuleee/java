package javaPractice.ch_14.collection_hashmap;

import javaPractice.ch_14.collection_Member.Member;
import javaPractice.ch_14.collection_hashmap.MemberHashMap;


public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberKim = new Member(909, "���ر�");
		Member memberPark = new Member(314, "������");
		Member memberChoi = new Member(421, "������");
		Member memberYoon = new Member(1004, "������");
		
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberChoi);
		memberHashMap.addMember(memberYoon);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);	// ȸ�� ���̵� (key ��)�� 1004 �� ȸ�� ����
		memberHashMap.showAllMember();
		

	}

}
