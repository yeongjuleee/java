package javaPractice.ch_14.collection_hashset;

import java.util.HashSet;
import java.util.Iterator;

import javaPractice.ch_14.collection_Member.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;	// hashSet ����
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>(); // HashSet ����
	}
	
	public void addMember(Member member) {
		hashSet.add(member);	// HashSet�� ȸ�� �߰�
	}
	
	public boolean removeMember(int memberID) {
		// �Ű������� ���� ȸ�� ���̵� �ش��ϴ� ȸ�� ����
		
		Iterator<Member> ir = hashSet.iterator();	// iterator�� Ȱ���Ͽ� ��ȸ
		
		while (ir.hasNext() ) {
			Member member = ir.next();	// ȸ���� �ϳ��� �����ͼ�
			int tempId = member.getMemberID();	// ���̵� ��
			if(tempId == memberID) { // ���� ������ ���
				hashSet.remove(member);	// ȸ�� ����
				return true;
			}
		}
		
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() { // ��� ȸ�� ���
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
