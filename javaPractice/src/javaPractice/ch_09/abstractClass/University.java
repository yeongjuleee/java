package javaPractice.ch_09.abstractClass;

public class University extends Student2 {
	private int courses;	// ��û ����
	
	public University(String name, int grade, int courses) {
		System.out.println("University ������ ȣ��");
		
		super.name = name;
		super.grade = grade;
		this.courses = courses;
	}
	
	public University(String name, int grade, int courses, String teacher) {
		System.out.println("University ������ ȣ��");
		
		super.name = name;
		super.grade = grade;
		super.teacher = teacher; 
		this.courses = courses;
	}
	
	public University() {
		this("������", 2, 20);
	}
	
	public int getCourses() {
		return courses;
	}

	// �������̵� �޼ҵ�
	
	@Override
	public String getStudInfo() {
		System.out.println("University Ŭ������ getStudInfo �޼ҵ� ȣ��");
		return "�̸��� => " + name + ", �г��� => " + grade + ", ��û ������ => " + courses;
	}
	
	// ���� ������ �̸��� ���ϴ� �޼ҵ�
	
	@Override
	public String getTeacher() {
		return "��� ������: " + super.teacher;
	}
	
	
	
	
}
