package javaPractice.ch_14.collection_Member;

public class Member implements Comparable<Member> {
	// �ʵ�
	private int memberID;		// ȸ�� ���̵�
	private String memberName;	// ȸ�� �̸�
	
	// ������
	public Member(int memberID, String memberName) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
	}

	// �޼ҵ�
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " ȸ������ ���̵�� " + memberID + "�Դϴ�." ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			if( this.memberID == member.memberID)
				return true;
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return memberID;
	}

	@Override
	public int compareTo(Member member) {	// Comparable�� �����ϱ� ������ �������̵�
		// ���ϴ� �� �� �� this ���� �� ũ�� ����� ��ȯ�Ͽ� ������������ ����
		// �޼ҵ带 ȣ���ϴ� ��ü�� ���ڷ� �Ѿ�� ��ü���� ���� ��� ���� ����, ũ�Ⱑ �����ϴٸ� 0, Ŭ ��쿡�� ��� ����
		// return (this.memberID - member.memberID);	// memberID�� �����̱� ������ �������� ����
		return (this.memberID - member.memberID) * (-1);	// ������������ �����ϱ� ���� ��ȯ���� ������ ����.
	}

	
	
	

}
