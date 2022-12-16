package javaPractice.ch_09.abstractClass;

public class Elementary extends Student2 {
	public Elementary(String name, int grade) {
		System.out.println("Elementary 생성자 호출");
		super.name = name;
		super.grade = grade;
	}
	
	public Elementary(String name, int grade, String teacher) {
		System.out.println("Elementary 생성자 호출");
		super.name = name;
		super.grade = grade;
		super.teacher = teacher;
	}
	
	public Elementary() {
		this("윤재혁", 3);
		System.out.println("Elemetary 생성자 호출");
	}
	
	// 초등학교 담임 선생님을 구하는 메소드
	@Override
	public String getTeacher() {
		return "담당 선생님: " + super.teacher;
	}
	
	
	
}
