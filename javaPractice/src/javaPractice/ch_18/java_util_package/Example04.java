package javaPractice.ch_18.java_util_package;

import java.util.Calendar;

public class Example04 {

	public static void main(String[] args) {
		/*	set() 으로 날짜 지정하기
			set() 메소드는 Calendar 인스턴스의 값을 변경할 때 사용함
			두 개의 파라미터(=값)를 필요로 하며, 첫 번째 파라미터는 바꿔야 할 항목, 두 번째 파라미터는 바꿀 값을 대입
			set(바꿔야 할 항목, 바꿀 값);
			set(년, 월, 일); */
		
		/* D-day 를 구하는 코드 */
		Calendar today = Calendar.getInstance();		// 현재 날짜를 나타내서 비교로 할 때 사용하는 객체
		Calendar endOfYear = Calendar.getInstance();	// 연말 날짜를 지정하는 객체
		Calendar christmas = Calendar.getInstance();	// 크리스마스 날짜를 지정할 객체
		
		endOfYear.set(Calendar.MONTH, 11);	// endOfYear 객체의 월을 12월로 변경
		endOfYear.set(Calendar.DATE, 31);	// endOfYear 객체의 일을 31일로 변경
		long diff = endOfYear.getTimeInMillis() - today.getTimeInMillis();	// 연말에서 현재 초를 뺌
		System.out.println("연말까지 남은 날 : " + diff / (24 * 60 * 60 * 1000) + "일");// dusakfdptj guswoRkwldml chfmf dlffh qusghks
		//	연말까지 남은 날 : 15일
		
		
		
		christmas.set(2022, 11, 25);	// 2022년 12월 25일. 월은 -1 값을 입력
		diff = christmas.getTimeInMillis() - today.getTimeInMillis();	// 크리스마스에서 현재 초를 뺌
		System.out.println("크리스마스 까지 남은 날 : " + diff / (24 * 60 * 60 * 1000) + "일");
		// 크리스마스에서 현재까지의 초를 일로 변환
		// 크리스마스 까지 남은 날 : 9일
	}

}
