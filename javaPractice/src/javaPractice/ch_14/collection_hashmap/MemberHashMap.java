package javaPractice.ch_14.collection_hashmap;

import java.util.HashMap;
import java.util.Iterator;

import javaPractice.ch_14.collection_Member.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;	// HashMap 선언
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();	// HashMap 객체 생성
	}
	
	public void addMember(Member member) { // 회원 추가
		hashMap.put(member.getMemberID(), member);	// key-value 쌍으로 추가
	}
	
	public boolean removeMember(int memberID) {
		if(hashMap.containsKey(memberID)) { // HashMap에 매개변수로 받은 키 값인 회원 아이디가 있으면
			hashMap.remove(memberID);	// 해당 회원 삭제
			return true;
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() { // iterator를 사용해서 전체 회원을 출력하는 메소드
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) { // 다음 key가 있다면,
			int key = ir.next();
			Member member = hashMap.get(key);	// key로부터 value 가져오기
			System.out.println(member);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		

	}

}
