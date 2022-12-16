package javaPractice.ch_18.java_util_package;

import java.util.Calendar;

/*  Calendar 클래스는 달력을 표현한 클래스이다.
 	Calendar 클래스를 이용하여 현재 시간이 나오도록 구현하라
 	실행 결과 : 
 	2022년 12월 16일
 	금요일 오전 11시 .. 분
 */

public class Exam01 {
	public static String getDayToStr(int day) {
		String[] days = {"일", "월", "화", "수", "목", "금", "토"
				+ ""};
		return days [day - 1];
	}
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);	// 년
		int month = now.get(Calendar.MONTH) + 1;	// 월
		int day = now.get(Calendar.DATE);	// 일
		String strWeek = getDayToStr(now.get(Calendar.DAY_OF_WEEK));	// 요일
		String strAmPm = null;	// 오전 / 오후
		int hour = now.get(Calendar.HOUR_OF_DAY);	// 시
		int minute = now.get(Calendar.MINUTE);	// 분
		int second = now.get(Calendar.SECOND);	// 초
		
		int amPm = now.get(Calendar.AM_PM);
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
	}

}
