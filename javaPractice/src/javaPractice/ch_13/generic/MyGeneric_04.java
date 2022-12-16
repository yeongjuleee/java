package javaPractice.ch_13.generic;

// Generic MethodTest
// 제네릭 타입 메소드 : 메소드에 타입 매개 변수를 사용하여 선언하는 것
// 매개 변수로 사용하는 타입 매개변수를 반환값 앞에 선언

class GenMethod {
	public <K, V> boolean compare(K fKey, V fValue, K sKey, V sValue) { // 반환형 지정
		if (fKey.equals(sKey) && fValue.equals(sValue)) {
			return true;
		}
		return false;
	}
}

public class MyGeneric_04 {

	public static void main(String[] args) {
		GenMethod genMethod = new GenMethod();
		
		// 메소드의 호출시에는 객체.<클래스형들>메소드이름(매개변수들) 형식으로 사용
		// <클래스형들>은 생략 가능. 컴파일러가 매개변수로 필요한 타입을 추론
		boolean check = genMethod.<Integer, String>compare(1, "최현석", 1, "최현석");
		// <Integer : K , String : V > 임 . 여기서 타입이 없어도 실행 됨! 매개변수를 보고 컴파일러가 추론이 가능하기 때문
		System.out.println("check: " + check);	// true;

	}

}
