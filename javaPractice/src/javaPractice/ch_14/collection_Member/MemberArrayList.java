package javaPractice.ch_14.collection_Member;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList;	// ArrayList ����
	
	public MemberArrayList() {
		this.arrayList = new ArrayList<Member>();	// Member ������ ������ ArrayList ����
	}
	
	public void addMember(Member member) {
		arrayList.add(member);	// ȸ�� �߰�
	}
	
	public boolean removeMember(int memberID) {
//		for (int i = 0; i < arrayList.size(); i++) {	// foreach ������ �ٲ㺸��
//			
//			
//			Member member = arrayList.get(i);	// get() �޼ҵ�� ȸ���� ���������� ������
//			if (member.getMemberID() == memberID) { // ȸ�� ���̵�� �Ű� ������ ��ġ�ϸ�,
//				arrayList.remove(i);	// �ش� ȸ���� ����
//				return true;
//			}
//		}
		for (Member member : arrayList) {	// forEach�� Ÿ�� Member�� �Ű����� member�� arrayList �� �� ���(�ε���)�� ����
			if (member.getMemberID() == memberID) { // ȸ�� ���̵�� �Ű� ������ ��ġ�ϸ�,
				arrayList.remove(member);	// �ش� ȸ���� ����
				return true;
			}
		}
		
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");	// �ݺ����� ������ �ش� ���̵� ã�� ���� ���
		return false;
	}
	
	public void showAllMember() { // ��ü ȸ���� ����ϴ� �޼ҵ�
		for(Member member : arrayList) { // ��� ��ü�� ����� arrayList�� �� �ε��� ������ ����
			System.out.println(member);
		}
		System.out.println();
	}

}
