package javaPractice.ch_18.java_util_package;

import java.time.LocalDate;

public class Example08 {

	/*  java.time 패키지
	 	나중에 추가된 패키지로 기존의 Date 와 Calendar 보완함
	 	
	 	java.time : 날짜와 시간을 나타내는 LocalDate, LocalTime 등을 포함한 패키지
	 	java.time.format: 날짜와 시간을 피싱하고 포멧팅하는 API 포함
	 	java.time.chrono: 여러가지 달력 시스템을 사용할 수 있는 API 포함
	 	java.time.temporal: 날짜와 시간을 연산하기 위한 API 포함
	 	java.time.zone: 타임존을 지원하는 API 포함
	 	
	 	java.time 패키지에서 날짜와 시간을 변경할 수 O
	 	클래스들은 immutable(불변환) 속성이 있기때문에 날짜나 시간을 변경하게 되면
	 	실제로는 변경하는 것이 아니라 새로운 객체를 반환함
	 */
	
	public static void main(String[] args) {
		/*  LocalDate 클래스 
		 	날짜 정보를 저장. 날짜 정보를 저장하는 방법
		 	1. 현재 날짜를 지정하는 now() 메소드 사용 
		 	2. 특정 날짜를 지정하는 of() 메소드 사용
		 	
		 	날짜를 더하고 빼는 메소드를 확인하는 코드
		 	년도 빼기 : minusYears(long) 	<-> plusYear(long) 
		 	월 빼기 : minusMonth(long)		<-> plusMonth(long)
		 	일 빼기 : minusDays(long)		<-> plusDays(long)
		 	주 빼기 : minusWeeks(long)		<-> plusWeeks(long)	 	
		 */
		
		LocalDate ld = LocalDate.now();	// 현재 날짜를 지정
		System.out.println(ld);	// 2022-12-16
		
		// 2년을 빼고 3달을 더하고 4일을 뺌
		LocalDate ld2 = ld.minusYears(2).plusMonths(3).minusDays(4);
		System.out.println(ld2);
		// 2021-03-12
		
		// 자동변환
		LocalDate ld3 = ld2.minusDays(3);	//ld2에서 3일을 뺌
		System.out.println(ld3);
		// 2021-03-09
		
		// 주 더하기
		LocalDate ld4 = ld3.plusWeeks(3);	// ld3에서 3주를 더함
		System.out.println(ld4);
		// 2021-03-30
	}

}
