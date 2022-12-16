package javaPractice.ch_12.garbage;

/*
Class Ŭ����
�ڹ��� ��� Ŭ������ �������̽��� ������ �ǰ� ���� class ���Ϸ� ������
java ������ ������ �Ǹ� class ������ �����ǰ�, �� class ���Ͽ��� Ŭ������ �������̽��� ���� ����, �޼ҵ�, ������ �� ������ ��� ����
Class Ŭ������ ������ �� class ���Ͽ� ����� Ŭ������ �����Ŀ����� ������ �������� �� ���

��Ȳ�� ���� ���� �۾����� ���� Ŭ������ ����ؾ� �� ���� �ְ�, ��ȯ�ϴ� Ŭ������ ��Ȯ�� � �ڷ������� �𸣴� ��찡 ����
�𸣴� Ŭ������ ������ ����� ��쿡�� �츮�� Ŭ������ ������ ���� ã�ƾ���
*/

class Person {
	private String name;
	private int age;
	
	public Person() {} // ����Ʈ ������
	
	public Person(String name) {
		this.name =name;
	}
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class Class1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// forName() �޼ҵ忡�� �߻��ϴ� ���ܸ� ó����. �̸��� ��ġ�ϴ� Ŭ������ ���� ��� ClassNotFoundException �߻�
		
		/* Class Ŭ������ �����ϰ� Ŭ���� ������ �������� ����� 3 ����
			1. Object Ŭ������ getClass() �޼ҵ� ����ϱ�
			String s = new String();
			Class c = s.getClass();	 => getClass() �޼ҵ��� ��ȯ���� Class
					
			2. Ŭ���� ���� �̸��� Class ������ ���� �����ϱ�
			Class c = String.Class;
			
			3. Class.forName("Ŭ���� �̸�") �޼ҵ� ����ϱ�
			Class c = Class.forName("java.lang.String");
		*/
		
		Person person = new Person();
		Class pClass1 = person.getClass();		// Object�� getClass() �޼ҵ� ����ϱ�
		System.out.println(pClass1.getName());	// javaPractice.ch_12.garbage.Person
		
		Class pClass2 = Person.class;			// ���� class ���� �����ϱ�
		System.out.println(pClass2.getName());	// javaPractice.ch_12.garbage.Person
		
		Class pClass3 = Class.forName("javaPractice.ch_12.garbage.Person");		// Ŭ���� �̸����� ��������
		System.out.println(pClass3.getName());	// javaPractice.ch_12.garbage.Person
	}

}
