package javaPractice.ch_14.collection_Member;

public class Member implements Comparable<Member> {
	// 필드
	private int memberID;		// 회원 아이디
	private String memberName;	// 회원 이름
	
	// 생성자
	public Member(int memberID, String memberName) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
	}

	// 메소드
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
		return memberName + " 회원님의 아이디는 " + memberID + "입니다." ;
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
	public int compareTo(Member member) {	// Comparable를 구현하기 때문에 오버라이딩
		// 비교하는 두 값 중 this 값이 더 크면 양수를 반환하여 오름차순으로 정렬
		// 메소드를 호출하는 객체가 인자로 넘어온 객체보다 작을 경우 음수 리턴, 크기가 동일하다면 0, 클 경우에는 양수 리턴
		// return (this.memberID - member.memberID);	// memberID가 정수이기 때문에 오름차순 정렬
		return (this.memberID - member.memberID) * (-1);	// 내림차순으로 정렬하기 위해 반환값을 음수로 만듬.
	}

	
	
	

}
