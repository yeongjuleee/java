package javaPractice.ch_09.abstractClass_innerclass;

/*
static 내부 클래스의 정의
내부 클래스가 static으로 지정된 클래스
내부 클래스의 멤버가 static으로 지정되었으면 내부 클래스도 반드시 static으로 지정해야 됨

MyOuter3.Inner.getUserInfo()을 호출해서 아래 내용이 출력되도록 main() 메소드 작성
'고객정보 >> 주소: 서울시 마포구, 전화번호: 010-2000-0909'
*/

class MyOuter3 {	// 외부 클래스
	// 필드
	private String name;
	private int age;
	
	public MyOuter3(String name, int age) { // 외부 클래스 생성자
		this.name = name;
		this.age = age;
	}
	
	public String getName() { return name; }
	public int getAge() { return age; }
	
	static class Inner { // 내부 스태틱 클래스
		// 필드
		private String address;
		static String tel = "010-2000-0909";
		
		public Inner (String address) { // 내부 클래스 생성자
			this.address = address;
		}
	
	public String getUserInfo() {
		// static 내부 클래스에서 외부 클래스의 멤버 변수에 접근은 불가능하다.
		// return name + " "  + age;
		return "주소: " + address + " , 전화번호 : " + tel;
		}
	
	}	// end Inner_class
	
}	// end Outer_class

public class Inner04 {

	public static void main(String[] args) {
		MyOuter3.Inner inner = new MyOuter3.Inner("서울시 마포구");
		System.out.println("고객정보 >> " + inner.getUserInfo());
	}

}
