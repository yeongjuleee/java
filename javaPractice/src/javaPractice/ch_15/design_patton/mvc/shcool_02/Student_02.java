package javaPractice.ch_15.design_patton.mvc.shcool_02;

public class Student_02 extends Person {
	private int studentNumber;	// �й�
	// �л��� ����ִ� ������ ����
//	private boolean[] classCheck = new boolean[className.length];	// ���� ��û�� �ϸ� true�� ����
	private boolean[] classCheck = {false, false, false, false};
//	private int[] classScore = {0, 0, 0};	// �� ���� ����
	private int[] classScore = {0, 0, 0, 0};
	
	// Student ������
	public Student_02(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	// �޼ҵ�
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

}
