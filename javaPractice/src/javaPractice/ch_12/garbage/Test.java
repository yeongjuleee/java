package javaPractice.ch_12.garbage;

import java.util.HashMap;

/* Student Ŭ������ �ۼ��ϵ�, Object�� equals() �� hashCode()�� �������ؼ�
Student�� �й� studentNum �� ������ ���� ��ü�� �� �� �ֵ��� �϶�
Student Ŭ������ �ʵ�� ������ ����
hashCode()�� ���� ���� studentNum �ʵ� ���� �ؽ��ڵ带 �����ϵ��� �϶�

������ :
	1�� �л��� ���� : 95 */

class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	// ���⿡ �ڵ带 �ۼ��϶� (Object ���� ����ȯ ����)
	@Override
	public boolean equals(Object obj) { // equals() �޼ҵ� ������. �й��� ������ ���� �л����� ������
		if (obj instanceof Student) {
			Student student = (Student)obj;
			
			if (studentNum.equals(student.getStudentNum())) { // �� ��ü�� �л������� �Ű� ������ �Ѿ�� ��ü�� �л� ������ ������ true��ȯ
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode(); 
		// �л������� �ּҰ��� ��ȯ
	}
	
}


public class Test {

	public static void main(String[] args) {
		// Student Ű�� ������ �����ϴ� HashMap ��ü ����
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		
		// new Student("1")�� ���� 95�� ����
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1�� �л��� ���� : " + score);
	}

}
