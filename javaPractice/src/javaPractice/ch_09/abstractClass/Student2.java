package javaPractice.ch_09.abstractClass;

public abstract class Student2 {
	public String name;		// �̸�
	public int grade; 		// �г�
	public String teacher; // ������ �̸�
	
	
	public Student2() {
		System.out.println("Student ������ ȣ��");
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getStudInfo() {
		System.out.println("Student Ŭ������ getStudInfo() �޼ҵ� ȣ��");
		
		return "�̸��� : " + name + ", �г��� " + grade;
	}
	
	// �л��� ���� ������ �̸��� ���ϴ� �޼ҵ�
	public abstract String getTeacher();

}
