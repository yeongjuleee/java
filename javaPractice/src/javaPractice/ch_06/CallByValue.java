package javaPractice.ch_06;

public class CallByValue {
	// stack 방식: 자료형 타입이 이용 가능. 
	// 프로그램 시작과 함께 호출되며 종료되면 알아서 메모리(공간)이 사라짐. 
	
	// 메소드 호출 방식
	// 1. 값에 의한 호출 
	// 값에 의한 메소드 호출 방식은 메소드 호출시 값이 복사도이 전달
	// 메소드의 매개변수 타입이 기본형 데이터일때 값에 의한 호출을 함
	
	// 메소드 increase() 호출시 n이라는 매개변수가 메모리에 생성되어
	// var1의 값이 100이 복사되어 처리
	// 메소드 실행이 종료되면 매개변수 n은 메모리에서 소멸
	// 이처럼 값에 의한 호출은 호출시 매개변수로 전달되는 값이 복사되어 전달
	// 따라서 var1의 값은 변하지 않음
	
	public int increase(int n) {
		++n;
		return n;
	}
	
	public static void main(String[] args) {
		// 
		int var1 = 100;
		CallByValue val = new CallByValue();
		int result = val.increase(var1);
		// val1 을 increase(int n) 의 n에 넣음 > int var1 = int 100이 됨. 
		// 그리고 increase 를 실행하여 ++1 을 함. 
		// return 하여 저장한 값(101)을 result에 저장. 
		
		System.out.println("var1: " + var1 + ", result: " + result);

	}

}
