package javaPractice.ch_07.student;

public class Class08 {

	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "������";
		
		// ���� ����� ����
		System.out.println(studentKim.studentName); // ������
		System.out.println(studentKim.getStudentName()); // ������

	}

}
