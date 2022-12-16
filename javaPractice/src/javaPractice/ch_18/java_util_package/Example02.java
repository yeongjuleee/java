package javaPractice.ch_18.java_util_package;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* java.util.Calendar : 날씨를 다루는 클래스
	Calendar는 추상 클래스이므로 직접 객체 생성X 
	getInstance() 메소드를 통해 GregorianCalendar 인스턴스를 생성해야함
	이 방법을 싱글턴 패턴 Singleton Pattern 이라고 하는데, 싱글턴 패턴은
	객체를 사용할 때 각각 인스턴스를 생성해서 사용하는 것이 X 하나의 인스턴스를 가지고 사용하는 방법
	Calendar 클래스가 싱글턴 패턴으로 만들어진 대표적인 클래스
	
	싱글턴 패턴을 사용하지 않는 방법으로는 직접 GregorianCalendar 인스턴스 생성 */

public class Example02 {

	public static void main(String[] args) {
		Calendar a = Calendar.getInstance();	// 싱글턴 패턴
		Calendar b = new GregorianCalendar();	// GregorianCalendar 인스턴스 생성
		
		// 동일한 결과 값이 나옴
		System.out.println(a.toString());
		System.out.println(b.toString());

	}

}
