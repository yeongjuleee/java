package javaPractice.ch_07.Inheritance;

//public : 접근 제한 X
//protected : 같은 패키지 내에서만 자손 클래스에서 접근 O
//default : 같은 패키지 내에서만 접근 O
//private : 같은 클래스 내에서만 접근 O

class User {
	public String name;
	//public int age;
	private int age; // 동일한 클래스 외에는 접근 X
	
	User(String name, int age) { // 매개변수를 가진 생성자
		this.name = name;
		this.age = age;
		
	}

	String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// 초기 생성자 외에는 값을 맘대로 바꿀 수 없음. 
	// 메소드를 통해서 값을 바꾸도록 함.
	
}

public class Inheritance01 {

	public static void main(String[] args) {
		User user1 = new User ("준규", 23); // 인스턴스 생성
		User user2 = new User ("지훈", 23); // 인스턴스 생성
		
		// System.out.println(user1.name + "의 나이는 " + user1.age);
		
		
		// user2.age = 1000; private로 변했기 때문에 사용할 수 없음.
		//System.out.println(user2.name + "의 나이는 " + user2.age);
		// 나이가 1000살 가능 X  => 이런것을 못하게 하기 위해..
		
		user2.setAge(20);
		System.out.println(user2.getName() + "의 나이는 " + user2.getAge());

	}

}
