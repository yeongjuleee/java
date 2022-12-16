package javaPractice.ch_09.abstractClass;

public abstract class Student2 {
	public String name;		// 이름
	public int grade; 		// 학년
	public String teacher; // 선생님 이름
	
	
	public Student2() {
		System.out.println("Student 생성자 호출");
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getStudInfo() {
		System.out.println("Student 클래스의 getStudInfo() 메소드 호출");
		
		return "이름은 : " + name + ", 학년은 " + grade;
	}
	
	// 학생의 담임 선생님 이름을 구하는 메소드
	public abstract String getTeacher();

}
