package javaPractice.ch_06;

public class CallByRef {

	// 참조에 의한 호출 방식
	// 매개 변수의 타입이 참조형 타입일 때 사용
	// 참조에 의한 호출은 메소드 호출시 참조 데이터의 위치가 매개변수에 전달이 됨
	
	// 값에 의한 호출은 메모리에 동일한 값을 복사한 후 사용
	// 참조에 의한 호출은 메모리의 주소를 넘기기 때문에 값을 복사하지 않음. 
	
	// 문자열에 의한 호출 방식: 예외적으로 문자열을 전달하려면 참조형 데이터라도 값에 의한 호출을 함 
	
	public void increase(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		int[] refArray = {100, 800, 1000};
		
		CallByRef ref = new CallByRef();
		
		System.out.println("메소드 호출 전");
		for (int i=0; i < refArray.length; i++) {
			System.out.println("refArray[" + i + "]: " + refArray[i]);
		}
		
		

	}

}
