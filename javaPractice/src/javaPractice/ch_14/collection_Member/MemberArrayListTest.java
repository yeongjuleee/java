package javaPractice.ch_14.collection_Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		// ���ο� ȸ�� �ν��Ͻ� ����
		Member memberKim = new Member(1001, "���ر�");
		Member memberPark = new Member(1002, "������");
		Member memberYoon = new Member(1003, "������");
		Member memberSo = new Member(1004, "����ȯ");
		
		// ArrayList�� ȸ�� �߰�
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberYoon);
		memberArrayList.addMember(memberSo);
		
		memberArrayList.showAllMember();	// ��ü ȸ�� ���
		
		memberArrayList.removeMember(memberYoon.getMemberID());	// ������ ȸ�� ����
		memberArrayList.showAllMember();

	}

}
