package javaPractice.ch_12.garbage;

public class StringClass2 {

	public static void main(String[] args) {
		/*
		다른 프로그래밍 언어는 문자열을 구할 때 char[] 배열을 사용
		자바는 String 클래스를 제공해 char[] 배열을 직접 구현하지 X 문자열을 사용 O
		
		String 클래스의 구현 내용 : 
		private final char value[] 라고 선언된 char 배열이 있음
		프로그램에서 String s = new String("abc") 라고 쓰면 abc는 String 클래스의 vlaue 변수에 저장됨
		value 변수 final로 선언이 되어 있어서 값을 변경할 수 없음 
		-> 불변 immutable(자료형) 이라고 함 ( <-> mutable 값 변경 가능함. (자료형임)) 
		
		프로그램에서 두 개의 문자열을 연결하면, 둘 중 하나의 문자열이 변경 되는 게 아니라 두 문자열이 연결된 새로운 문자열이 생김
		*/
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);	// java
		System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));	
		// 처음 문자열 주소 값: 1586600255
		
		javaStr = javaStr.concat(androidStr);	// java와 android 문자열의 연결
						// 변수명.concat(연결할변수명) => concat : 연결해라~ 의미
		
		System.out.println(javaStr);	// javaandroid
		System.out.println("연결된 문자열 주소 값: " + System.identityHashCode(javaStr));
		// 연결된 문자열 주소 값 : 474675244
		
		// 문자열의 값을 변경하는 경우 : immutable로 값을 바꿀 수 없어 새로운 객체를 생성함. 
		javaStr = "new java";
		System.out.println(javaStr);	// new java
		System.out.println("값을 변경한 문자열 주소 값: " + System.identityHashCode(javaStr));	
		//	값을 변경한 문자열 주소 값 : 932583850
	}

}
