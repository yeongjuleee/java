package javaPractice.ch_06;

public class CallByValue02 {
	
	// 값(데이터)를 복사하는 방법. 자료형 타입이 사용함
	//문자열에 의한 호출 방식
	// 예외적으로 문자열을 전달하려면 참조형 데이터라도 값에 의한 호출을 함
	
	public void setAddress (String addr) {
		addr = "경기도 수원시 장안구";
	}

	public static void main(String[] args) {
		String address = "서울시 강남구 논현동";
		
		CallByValue02 st = new CallByValue02();
		System.out.println("메소드 호출 전");
		System.out.println("adress: " + address); // adress : 서울 강남구 논현동
		
		st.setAddress(address);
		
		System.out.println("메소드 호출 후");
		System.out.println("adress: " + address); // adress : 서울시 강남구 논현동

	}

}
