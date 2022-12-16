package javaPractice.ch_07.Inheritance;

//public : ���� ���� X
//protected : ���� ��Ű�� �������� �ڼ� Ŭ�������� ���� O
//default : ���� ��Ű�� �������� ���� O
//private : ���� Ŭ���� �������� ���� O

class User {
	public String name;
	//public int age;
	private int age; // ������ Ŭ���� �ܿ��� ���� X
	
	User(String name, int age) { // �Ű������� ���� ������
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
	
	// �ʱ� ������ �ܿ��� ���� ����� �ٲ� �� ����. 
	// �޼ҵ带 ���ؼ� ���� �ٲٵ��� ��.
	
}

public class Inheritance01 {

	public static void main(String[] args) {
		User user1 = new User ("�ر�", 23); // �ν��Ͻ� ����
		User user2 = new User ("����", 23); // �ν��Ͻ� ����
		
		// System.out.println(user1.name + "�� ���̴� " + user1.age);
		
		
		// user2.age = 1000; private�� ���߱� ������ ����� �� ����.
		//System.out.println(user2.name + "�� ���̴� " + user2.age);
		// ���̰� 1000�� ���� X  => �̷����� ���ϰ� �ϱ� ����..
		
		user2.setAge(20);
		System.out.println(user2.getName() + "�� ���̴� " + user2.getAge());

	}

}
