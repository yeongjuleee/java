package javaPractice.ch_14.collectionTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam04 {
/*
	아이디와 비밀번호 검사하기
	아이디 비번을 입력 받아서 map에 저장된 값과 비교해서
	1. 동일한 아이디와 비밀번호가 있는 경우 "로그인 되었습니다."
	2. 동일한 아이디는 있지만, 비밀번호가 틀릴 경우 "비밀번호가 일치하지 않습니다."
	3. 동일한 아이가 없을 경우 "입력하신 아이디가 존재하지 않습니다" 
	출력하기
*/
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();	// 키와 값으로 String 사용
		
		// 아이디와 비밀번호를 미리 저장
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해 주세요");
			System.out.print("아이디 : ");
			String id = scanner.nextLine();
			System.out.print("비밀번호 : ");
			String password = scanner.nextLine();
			System.out.println();
			
			// 작성위치
			// 힌트: boolean containsKey(Object Key)를 이용하여 아이디가 있는지 먼저 확인하기
			// 만약 아이디 비번이 있는 경우 => 로그인이 되었습니다
			// 만약 아이디는 있는데 비밀번호가 틀릴 경우 => 비밀번호가 일치하지 않습니다
			// 동일한 아이디가 없는 경우 => 입력핫긴 아이디가 존재하지 않습니다.
			
			if (map.containsKey(id)) { // 아이디인 키가 존재하는지 확인하기
				if(map.get(id).equals(password)) { // 키가 id인 value와 입력한 비밀번호 문자열을 비교
					System.out.println("로그인 되었습니다.");
					break;
				}
				else { 
					System.out.println("비밀번호가 일치하지 않습니다."); }
			}
			else {
				System.out.println("입력핫긴 아이디가 존재하지 않습니다.");
			}
			
			
		}

	}

}
