package javaPractice.ch_09.abstractClass;

public class Elementary extends Student2 {
	public Elementary(String name, int grade) {
		System.out.println("Elementary ������ ȣ��");
		super.name = name;
		super.grade = grade;
	}
	
	public Elementary(String name, int grade, String teacher) {
		System.out.println("Elementary ������ ȣ��");
		super.name = name;
		super.grade = grade;
		super.teacher = teacher;
	}
	
	public Elementary() {
		this("������", 3);
		System.out.println("Elemetary ������ ȣ��");
	}
	
	// �ʵ��б� ���� �������� ���ϴ� �޼ҵ�
	@Override
	public String getTeacher() {
		return "��� ������: " + super.teacher;
	}
	
	
	
}
