package javaPractice.ch_14.collection_linkedlist;


import java.util.LinkedList;
import javaPractice.ch_14.collection_Member.Member;
// import ��Ű���̸�.Ŭ�����̸�;

public class MemberLinkedList {
	private LinkedList <Member> linkedList;
	
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();
	}
	
	public void addMember(Member member) {
		linkedList.add(member);
	}
	
	public boolean removeMember(int memberID) {
		for(int i = 0; i < linkedList.size(); i++) {
			Member member = linkedList.get(i);
			if(member.getMemberID() == memberID) {
				linkedList.remove(i);
				return true;
			}
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}

}
