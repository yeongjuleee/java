package javaPractice.ch_18.java_util_package;

import java.time.LocalDate;

public class Example10 {

	public static void main(String[] args) {
		// 클래스들의 정보 값 변경하기
		// 각 클래스에는 필드 값들을 특정 값으로 변경할 수 있는 메소드가 있다.
		// withYear(int)년 변경, withMonth(int) 일 변경, withDayofYear(int) 년의 일 변경
		// withDayOfMonth(int)월의 일 변경
		
		// 날짜를 변경하는 코드
		LocalDate ld = LocalDate.now();
		System.out.println(ld);	
		// 2022-12-16
		
//		LocalDate new_ld = ld.withYear(1999).withMonth(8).withDayOfYear(33);
		// 새로운 객체를 생성함. => 계속 쓸 수 있음. (총 3개가 생성됨. withYear, withMonth, withDayOfYear
		// 년을 1999 로, 월을 8로, 일을 년의 33일로 변경
		//System.out.println(new_ld);
		// 1999-02-02
		
		System.out.println(ld.withYear(1999).withMonth(8).withDayOfYear(33));
		// 1999-02-02 
		// 이렇게 작성할 경우 : 저장이 되지 않아 출력만 되고 다시 사용X

	}

}
