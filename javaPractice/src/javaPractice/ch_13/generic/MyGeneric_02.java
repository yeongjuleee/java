package javaPractice.ch_13.generic;

/*  01. GenericType Test
 	제네릭(Generic) : 일반화, 범용화 라는 의미
 	클래스나 메소드에서 사용하는 필드나 매개 변수의 자료형(클래스형)을 호출하는 쪽에서 지정하도록 하는 기능
 
 	어떤 문자를 사용해도 되지만, 미리 지정된 타입들이 있다.
 	E: Element 의 약자. 컬렉션 프레임워크를 사용할 때 각 객체를 지칭하는 의미로 사용
 	K: Key 의 약자. 키와 값이라는 쌍으로 이루어진 형태에서 '키'의 의미로 사용
 	V: Value 의 약자. 키와 값이라는 쌍으로 이루어진 형태에서 '값' 의미로 사용
 	T: Type 의 약자. 자료형이나 클래스의 의미로 사용
 	N: Number 의 약자. 수치 계열의 의미로 사용. 여러 개를 사용할 경우 각 타입 매개 변수 뒤에 2, 3, 4 등의 숫자를 붙여 사용
 	제네릭에서는 기본 자료형(boolean, byte, char, int 등) 타입으로 사용할 수 없어서 여기서는 Wrapper클래스를 의미함.
 */

class CommonData<T> { // 일반적인 방식으로는 클래스에서 미리 데이터 타입을 지정해야 하지만, 제네릭을 사용하면 호출하는 쪽에서 데이터 타입을 지정
					 // < > 안에 여러개가 올 수 있음.  
	private T data;	// 데이터 타입으로 T를 지정. Type의 약자. 클래스 선언에서 < > 사이에 다른 문자를 넣어도 됨. 
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}

public class MyGeneric_02 {

	public static void main(String[] args) {
		ObjectData stringCommonData = new ObjectData(); // 호출하는 쪽에서 타입을 지정
		ObjectData integerCommonData = new ObjectData();// 선언하면서 타입을 지정하면 생성자에서는 타입 생략 가능
		
		stringCommonData.setData("abc"); 
		// 클래스의 데이터 타입이 Object라서 모든 데이터 타입 사용 가능
		integerCommonData.setData(100);
		
		System.out.println("stringCommonData : " + stringCommonData.getData());
		// stringCommonData : abc
		System.out.println("integerCommonData : " + integerCommonData.getData());
		// integerCommonData : 100
		
	}

}
