package javaPractice.ch_17.db_school;

public class StdClassDTO {
	private int subjectCode;	// �������� �ڵ�
	private int studentNumber;	// �й�
	private int score;			// ����
	
	// ������
	public StdClassDTO() {}
	
	public StdClassDTO(int subjectCode, int studentNumber, int score) {
		this.subjectCode = subjectCode;
		this.studentNumber = studentNumber;
		this.score = score;
	}
	
	// �޼ҵ�
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
