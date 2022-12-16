package javaPractice.ch_18.java_util_package;

import java.text.SimpleDateFormat;
import java.util.Date;

/*  Date와 SimpleDateFormat 클래스를 이용해서 
 	오늘 날짜를 아래와 같이 출력하는 프로그램을 작성하라
 	
 	실행결과: 
 	2022년 12월 16일 월요일 12시 ... 분
 */

public class Eaxm02 {

	public static void main(String[] args) {
		Date day = new Date();
		String pattern = "yyyy년 MM월 dd일 E요일 HH시 mm분";
		
		SimpleDateFormat p1 = new SimpleDateFormat(pattern);
		
		System.out.println(p1.format(day));

	}

}
