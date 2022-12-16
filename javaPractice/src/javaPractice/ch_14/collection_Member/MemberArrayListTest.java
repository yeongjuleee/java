package javaPractice.ch_14.collection_Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		// 새로운 회원 인스턴스 생성
		Member memberKim = new Member(1001, "김준규");
		Member memberPark = new Member(1002, "박지훈");
		Member memberYoon = new Member(1003, "윤재혁");
		Member memberSo = new Member(1004, "소정환");
		
		// ArrayList에 회원 추가
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberYoon);
		memberArrayList.addMember(memberSo);
		
		memberArrayList.showAllMember();	// 전체 회원 출력
		
		memberArrayList.removeMember(memberYoon.getMemberID());	// 윤재혁 회원 삭제
		memberArrayList.showAllMember();

	}

}
