package javaPractice.ch_12.garbage;

// 유효하지 않은 메모리 : 가바지(Garbage) 발생  => 자바의 JVM은 가비지 컬렉터가 불필요한 메모리를 알아서 정리함. 


// getClass() 메소드는 객체의 클래스 정보를 조사하는 Class 객체를 리턴

class Human {
	int age;
	String name;
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("안녕" + age + "살 " + name + "입니다.");
	}
}

public class GetClassMethod {

	public static void main(String[] args) {
		Human kim = new Human(29, "김준규");
		System.out.println("클래스 이름" + kim.getClass());
		// 클래스 이름class javaPractice.ch_11.objcet.Human
		// => 클래스의 정보를 가지고 옴: 패키지.타입.클래스이름
	}

}
