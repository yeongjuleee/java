package javaPractice.ch_14.collection_hashmap;

import java.util.HashMap;
import java.util.Iterator;

import javaPractice.ch_14.collection_Member.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;	// HashMap ����
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();	// HashMap ��ü ����
	}
	
	public void addMember(Member member) { // ȸ�� �߰�
		hashMap.put(member.getMemberID(), member);	// key-value ������ �߰�
	}
	
	public boolean removeMember(int memberID) {
		if(hashMap.containsKey(memberID)) { // HashMap�� �Ű������� ���� Ű ���� ȸ�� ���̵� ������
			hashMap.remove(memberID);	// �ش� ȸ�� ����
			return true;
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() { // iterator�� ����ؼ� ��ü ȸ���� ����ϴ� �޼ҵ�
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) { // ���� key�� �ִٸ�,
			int key = ir.next();
			Member member = hashMap.get(key);	// key�κ��� value ��������
			System.out.println(member);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		

	}

}
