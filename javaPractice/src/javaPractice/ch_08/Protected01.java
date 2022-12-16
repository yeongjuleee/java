package javaPractice.ch_08;

class User {
	// 필드
	private String name;
	private int age;
	
	// 생성자
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메소드
	
	void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
}

public class Protected01 { // 접근 제한자
	
	public static void main(String[] args) {
		User user1 = new User("철수", 20); // 인스턴스 생성
		User user2 = new User("짱구", 19); // 인스턴스 생성
		
		System.out.println(user1.getName() + "의 나이는 " + user1.getAge());
		user2.setAge(1000);
		System.out.println(user2.getName() + "의 나이는 " + user2.getAge());

	}

}
