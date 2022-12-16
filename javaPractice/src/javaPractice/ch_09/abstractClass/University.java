package javaPractice.ch_09.abstractClass;

public class University extends Student2 {
	private int courses;	// 신청 학점
	
	public University(String name, int grade, int courses) {
		System.out.println("University 생성자 호출");
		
		super.name = name;
		super.grade = grade;
		this.courses = courses;
	}
	
	public University(String name, int grade, int courses, String teacher) {
		System.out.println("University 생성자 호출");
		
		super.name = name;
		super.grade = grade;
		super.teacher = teacher; 
		this.courses = courses;
	}
	
	public University() {
		this("박정우", 2, 20);
	}
	
	public int getCourses() {
		return courses;
	}

	// 오버라이딩 메소드
	
	@Override
	public String getStudInfo() {
		System.out.println("University 클래스의 getStudInfo 메소드 호출");
		return "이름은 => " + name + ", 학년은 => " + grade + ", 신청 학점은 => " + courses;
	}
	
	// 지도 교수의 이름을 구하는 메소드
	
	@Override
	public String getTeacher() {
		return "담당 교수님: " + super.teacher;
	}
	
	
	
	
}
