package javaPractice.ch_09.abstractClass_innerclass;
/*
	인스턴스 내부 클래스의 정의와 형식
	외부 클래스의 멤버처럼 정의된 클래스
	내부 클래스를 사용하려면 먼저 외부 클래스의 인스턴스를 생성한 후 접근해야 함
	
	Inner.getCustomerInfo()를 호출해서 아래 내용이 나오도록 main() 메소드 작성
	'고객정보 >> 이름: 김준규, 나이: 23, 주소: 서울특별시 마포구'
*/

class MyOuter1 {
	// 필드 (외부) 클래스
	private String name;
	private int age;
	
	public MyOuter1 (String name, int age) {	// 외부 클래스 생성자
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// 내부 클래스를 정의한다
	public class Inner { // 내부 클래스
		private String address; // 내부 클래스 필드
		public Inner (String address) { // 내부 클래스 생성자
			this.address = address;
		}
		
		public String  getCustomerInfo() { // 내부 클래스 메소드
			return "이름 : " + name + ", 나이 : " + age + ", 주소 : " + address;
		}
	}
}


public class Inner02 {

	public static void main(String[] args) {
		MyOuter1 outClass = new MyOuter1("김준규", 23); // 외부 클래스 생성
		MyOuter1.Inner inClass = outClass.new Inner("서울특별시 마포구"); // 외부 클래스 변수를 이용하여 내부 클래스 생성
		
		System.out.println("고객정보 >> " + inClass.getCustomerInfo());	// 내부 클래스의 메소드 사용

	}

}
