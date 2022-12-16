package javaPractice.ch_12.garbage;

public class StringBuffer1 {

	public static void main(String[] args) {
		/*
		StringBuffer 의 StringBuilder 클래스 활용
		프로그램을 만들다 보면 문자열을 변경하거나 연결해야 하는 경우가 많음
		하지만, String 클래스는 한번 생성되면 그 내부의 문자열이 변경 X
		String 클래스를 사용하여 계속 문자열을 변경하거나 변경하는 프로그램을 작성하면 메모리가 크게 낭비됨.
		=> 이 문제를 해결하기 위한 것이 StringBuffer와 StringBuilder 클래스
		
		StringBuffer 와 StringBuilder 클래스는 내부에 변경 가능한(final X) char[] 을 변수로 가지고 O
		두 클래스를 사용하여 문자열을 연결하면, 기존 사용하던 char[] 배열이 확장되므로 추가 메모리 사용X
		따라서 문자열을 연결하거나 변경할 경우 StringBuffer 또는 StringBuilder 둘 중 하나만 사용하면 됨
		
		두 클래스의 차이는 여러 작업(스레드)이 동시에 문자열을 변경하려 할 때 문자열이 안전하게 변경되도록 보장해주는가, 그렇지 않은가 차이
		StringBuffer 클래스는 문자열이 안전하게 변경되도록 보장
		StringBuilder 클래스는 문자열이 안전하게 변경되도록 보장 X
		따로 스레드를 생성하는 멀티 스레드 프로그램이 아니라면 StringBuilder 사용하는 것이 실행 속도가 더 빠름
		*/
		
		String javaStr = new String("kkyu");
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		// javaStr 문자열 주소 : 1586600255  처음 생성된 메모리 주소
		
		StringBuilder buffer = new StringBuilder(javaStr);	// String으로 부티 StringBuilder 생성
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		// 연산 전 buffer 메모리 주소 : 474675244  buffer 메모리 주소
		buffer.append(" and"); 			// 문자열 추가
		buffer.append(" bbi");			// 문자열 추가
		buffer.append(" I like it!");	// 문자열 추가
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		// 연산 후 buffer 메모리 주소 : 474675244 buffer 메모리 주소
		
		javaStr = buffer.toString();	// String 클래스로 반환
		System.out.println(javaStr);	// kkyu and bbi I like it!
		System.out.println("새로 만들어진 javaSTr 문자열 주소 : " + System.identityHashCode(javaStr));
		// 새로 만들어진 javaSTr 문자열 주소 : 932583850 새로 생성된 메모리 주소
	}

}
