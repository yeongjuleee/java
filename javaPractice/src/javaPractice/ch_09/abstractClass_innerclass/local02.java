package javaPractice.ch_09.abstractClass_innerclass;

/*
MyOuter2.test()을 호출해서 아래와 같이 출력이 되도록 main() 메소드 작성
'고객정보: 이름: 박지훈, 나이: 23, 주소: 서울시 마포구'
*/

class MyOuter2 {	// 외부 클래스
	// 필드
	private String name;
	private int age;
	
	public MyOuter2 (String name, int age) {	// 외부 클래스의 생성자
		this.name = name;
		this.age = age;
	}
	
	// 외부 클래스의 메소드
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void test() {	// 일반 메소드
							// 메소드를 실행할 때에만 클래스 생성
		
		int num = 4; // local 변수 => 메소드 실행이 종료되면 사라짐
		
		class Inner {	// 메소드 안의 내부 클래스
			// 필드
			private String address; 
			
			public Inner (String address) { // 내부 클래스 생성자
				this.address = address;
			}
			
			// 내부 클래스 메소드
			public String getCustomerInfo() {	
				System.out.println("inner_test() : " + num); // 일반 메소드의 값을 저장함. 보기만 가능하고 이후 변경X 상수가 되었음.
				
				return "이름 : " + name + ", 나이 : " + age + ", 주소 : " + address;
			}
		}// end Inner_class
		
		Inner inner = new Inner("서울시 마포구"); // 힙에 메모리 생성됨. 메소드가 종료되어도 사라지지 않음.
		System.out.println("고객 정보: " + inner.getCustomerInfo());
	}
}

public class local02 {

	public static void main(String[] args) {
		MyOuter2 out = new MyOuter2("박지훈", 23);
		out.test();
		
		

	}

}
