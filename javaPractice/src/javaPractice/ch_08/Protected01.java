package javaPractice.ch_08;

class User {
	// �ʵ�
	private String name;
	private int age;
	
	// ������
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// �޼ҵ�
	
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

public class Protected01 { // ���� ������
	
	public static void main(String[] args) {
		User user1 = new User("ö��", 20); // �ν��Ͻ� ����
		User user2 = new User("¯��", 19); // �ν��Ͻ� ����
		
		System.out.println(user1.getName() + "�� ���̴� " + user1.getAge());
		user2.setAge(1000);
		System.out.println(user2.getName() + "�� ���̴� " + user2.getAge());

	}

}
