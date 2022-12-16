package javaPractice.ch_14.collection_Member;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList;	// ArrayList 선언
	
	public MemberArrayList() {
		this.arrayList = new ArrayList<Member>();	// Member 형으로 선언한 ArrayList 생성
	}
	
	public void addMember(Member member) {
		arrayList.add(member);	// 회원 추가
	}
	
	public boolean removeMember(int memberID) {
//		for (int i = 0; i < arrayList.size(); i++) {	// foreach 문으로 바꿔보기
//			
//			
//			Member member = arrayList.get(i);	// get() 메소드로 회원을 순차적으로 가져옴
//			if (member.getMemberID() == memberID) { // 회원 아이디와 매개 변수가 일치하면,
//				arrayList.remove(i);	// 해당 회원을 삭제
//				return true;
//			}
//		}
		for (Member member : arrayList) {	// forEach문 타입 Member의 매개변수 member를 arrayList 의 각 요소(인덱스)에 저장
			if (member.getMemberID() == memberID) { // 회원 아이디와 매개 변수가 일치하면,
				arrayList.remove(member);	// 해당 회원을 삭제
				return true;
			}
		}
		
		System.out.println(memberID + "가 존재하지 않습니다.");	// 반복문을 돌려서 해당 아이디를 찾지 못한 경우
		return false;
	}
	
	public void showAllMember() { // 전체 회원을 출력하는 메소드
		for(Member member : arrayList) { // 멤버 객체의 멤버를 arrayList의 각 인덱스 값으로 담음
			System.out.println(member);
		}
		System.out.println();
	}

}
