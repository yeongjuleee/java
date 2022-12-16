package javaPractice.ch_15.design_patton.mvc.shcool;

public class Student extends Person {
	private int studentNumber;	// 학번
	// 학생이 듣고있는 수업의 정보(자바, 파이썬, C)
	private boolean[] classCheck = {false, false, false, false};	// 수강 신청을 하면 true로 변경
	private int[] classScore = {0, 0, 0, 0};	// 각 과목 성적
	
	// Student 생성자
	public Student(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	// 메소드
	public boolean[] getClassCheck() {
				return classCheck;
			}
	
	public void setClassCheck(int index, boolean check) {
		this.classCheck[index] = check;
	}

	public int[] getClassScore() {
		return classScore;
	}
	
	public void setClassScore(int index, int score) {
		this.classScore[index] = score;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}



	public static void main(String[] args) {
		
	}


}
