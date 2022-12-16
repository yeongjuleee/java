package javaPractice.ch_18.java_util_package;

// 특징
// 1. 언어를 인코딩 해주는 기능
// 2. 배열 대신 활용. 배열이 메모리 공간의 크기를 정해 놓고 사용하면, 컬렉션을 무한대로 데이터를 넣을 수 O 
// 배열보다 수정, 관리가 편리
// 3. 날짜를 관리할 수 있다
//	 -Date, Calender, GregorianCalendar와 같은 기능을 많이 사용한다
// 4. List 인터페이스를 구현할 수 있다 
//	  List 인터페이스를 구현하는 것들은 전부 다 순서를 가지고 있으며, 초기 용량을 고려하지 X 됨
//	  List 인터페이스는 사이즈 변경이 가능한 배열의 구현이라고 정의할 수 O

// 1. 시간 처리
// 자바에서 시간에 대해 처리할 수 있는 클래스를 제공
// 시간을 다루는 자료형의 값은 long이며, java.util.Calendar 클래스와 java.util.Date, SimpleDataFormat이 있다.

public class Example01 {

	public static void main(String[] args) {
		// System.currentTimeMillis() : 현재 운영체제의 시각을 long 타입으로 반환
		// 반환한 시각은 1970년 1월 1일을 기준으로 했을 때 현재까지의 시간이며 1/1000초 단위까지 환산해서 보여줌
		// 메소드가 실행되는 순간의 운영체제 시각을 반환하기 때문에 이용을 하면 작업 소요 시간을 측정
		
		long start = System.currentTimeMillis();	// 작업을 시작하기 전의 시간 반환
		System.out.println("시작시간: " + start);
		int a = 0;
		for (int i = 1; i < 100000000; i++) {
			a++;
		}
		
		long end = System.currentTimeMillis();	// 작업이 끝난 후의 시간 반환
		System.out.println("종료시간: " + end);
		System.out.println("걸린 작업 시간: " + (end - start));
	}
	// 시작시간: 1671151472691
	// 종료시간: 1671151472695
	// 걸린 작업 시간: 4

}
