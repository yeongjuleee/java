package javaPractice.ch_12.garbage;

// ��ȿ���� ���� �޸� : ������(Garbage) �߻�  => �ڹ��� JVM�� ������ �÷��Ͱ� ���ʿ��� �޸𸮸� �˾Ƽ� ������. 


// getClass() �޼ҵ�� ��ü�� Ŭ���� ������ �����ϴ� Class ��ü�� ����

class Human {
	int age;
	String name;
	Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("�ȳ�" + age + "�� " + name + "�Դϴ�.");
	}
}

public class GetClassMethod {

	public static void main(String[] args) {
		Human kim = new Human(29, "���ر�");
		System.out.println("Ŭ���� �̸�" + kim.getClass());
		// Ŭ���� �̸�class javaPractice.ch_11.objcet.Human
		// => Ŭ������ ������ ������ ��: ��Ű��.Ÿ��.Ŭ�����̸�
	}

}
