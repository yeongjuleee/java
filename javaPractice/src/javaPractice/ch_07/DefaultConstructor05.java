package javaPractice.ch_07;

class Student1 {
	
	// ����
	String name;
	private String rollno;
	int age;
	
	// ��� (�޼ҵ�)
	Student1 (String name, String rollno, int age) { // Ŭ������ �̸��� ����, �빮�� => �⺻ ������
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		
		System.out.println("�л��� �̸�: " + name);
		System.out.println("�л��� �й�: " + rollno);
		System.out.println("�л��� ����: " + age);
		
		System.out.println("Student ��ü�� �����Ǿ����ϴ�.");
	}
	
	/*���� �߸��� �ڵ�~
	 * public void setRollno (String rollno) { // �й� �����ϱ� 
		this.rollno = rollno;
	}
	
	public String getName() { // �̸� �� ��������
		return name;
	}
	
	public int getAge() { // ���� ��������
		return age;
	}*/
	
	
}

public class DefaultConstructor05 {

	// �л��� ��Ÿ���� Ŭ���� Student�� �����.
	// �л��� �̸�(name)�� �й�(rollno), ����(age)�� ������.
	// �й��� private�� �����Ѵ�.
	
	public static void main(String[] args) {
		Student1 student = new Student1("Kim", "0001", 20);
		// �л��� �̸� : Kim
		// �л��� �й� : 0001
		// �л��� ���� : 20
		// Student ��ü�� �����Ǿ����ϴ�.

	}

}
