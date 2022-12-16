package javaPractice.ch_17.db_school;

public class StdClassDTO {
	private int subjectCode;	// 수강과목 코드
	private int studentNumber;	// 학번
	private int score;			// 점수
	
	// 생성자
	public StdClassDTO() {}
	
	public StdClassDTO(int subjectCode, int studentNumber, int score) {
		this.subjectCode = subjectCode;
		this.studentNumber = studentNumber;
		this.score = score;
	}
	
	// 메소드
	public int getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
