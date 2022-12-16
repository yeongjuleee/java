package javaPractice.ch_13.generic;

// 제네릭은 C++의 템플릿이 발전한 형태
// C++과는 달리 제네릭 대신 Object를 사용하면 모든 데이터 타입을 사용할 수 있지만, 
// 경우에 따라 형변환을 해줘야 함
// 때문에 제네릭을 선호

class ObjectData {
	private Object data;	// 클래스 데이터 타입이 Object라서 모든 데이터 타입 사용 가능
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
}

public class MyGeneric {

	public static void main(String[] args) {
		ObjectData stringCommonData = new ObjectData(); // String타입만 저장할거임
		ObjectData integerCommonData = new ObjectData();// int타입만 저장할거임
		
		stringCommonData.setData("abc"); 
		// 클래스의 데이터 타입이 Object라서 모든 데이터 타입 사용 가능
		integerCommonData.setData(100);
		
		System.out.println("stringCommonData : " + stringCommonData.getData());
		// stringCommonData : abc
		System.out.println("integerCommonData : " + integerCommonData.getData());
		// integerCommonData : 100
	}

}
