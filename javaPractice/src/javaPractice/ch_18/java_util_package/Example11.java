package javaPractice.ch_18.java_util_package;

import java.time.LocalDate;

public class Example11 {

	public static void main(String[] args) {
		// 1900년 부터 2100년 까지 윤년이 언제 있는지, 몇년인지 알아보는 코드
		LocalDate localDate = LocalDate.now();
		LocalDate localDate1;
		int count = 0;	// 윤년의 횟수 저장
		
		for (int i = 1900; i <= 2100; i++) {
			localDate1 = localDate.withYear(i);	// 년을 i로 변경
			if(localDate1.isLeapYear()) { // isLeapYear() 메소드 : 윤년이면 true 반환
				System.out.println(localDate1.getYear() + "은 윤년입니다.");
				count++;	// 윤년일 경우 1 더함
			}
		}
		
		System.out.println("1900년부터 2100년 까지 윤년은 총 " + count + "번 있습니다." );
		// 2088은 윤년입니다.
		// 2092은 윤년입니다.
		// 2096은 윤년입니다.
		// 1900년부터 2100년 까지 윤년은 총 49번 있습니다.
		
	}

}
