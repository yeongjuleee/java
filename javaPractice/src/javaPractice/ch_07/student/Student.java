package javaPractice.ch_07.student;

public class Student {
	int studentID; //�й�
	String studentName; // �̸�
	int grade; // �г�
	String address; // �ּ�
	
	public void showStudentInfo() { // ����� �̸�, �ּҸ� �������! 
		// void ���� => return ����!
		System.out.println(studentName + ", " + address); // �̸�, �ּ�
	}
	
	public String getStudentName() { // studentName�� ��ȯ. �б� ������ getStudentName(S�빮��) �� 
		// void�� ���� => return ����!
		return studentName;
	}
	
	public void setStudentName(String name) { // studentName�� ����
		// void ���� => return ����! 
		studentName = name;
		// studentName �� name�� �����ϱ� ���ؼ� return �� �ʿ� X
	}

}
