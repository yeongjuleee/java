package javaPractice.ch_11.objcet;

class Student {
	// �ʵ�
	int studentID;
	String studentName;
	
	// ������
	public Student(int studentID, String studnetName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentID + ", " + studentName;
	}
	
	// equals() �޼ҵ� ������. �й��� ������ ���� �л����� ������
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) { 	// ������ Ŭ���� ��ü�̸�
			Student std = (Student)obj;	// Student Ŭ������ ����ȯ
			
			if(studentID == std.studentID) 	// �� ��ü�� �й��� �Ű������� �Ѿ�� ��ü�� �й��� ������ true ��ȯ
				return true;
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentID;
	}

	
	
	
}

public class D_04 {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "�̻��");
		
		// ������ �ּ��� �� �ν��Ͻ� ��
		if (studentLee == studentLee2)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		else 
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		// studentLee�� studentLee2�� �ּҴ� �����ϴ�.
		
		if (studentLee.equals(studentLee2))
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		else 
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
		// studentLee�� studentLee2�� �����մϴ�.
		
		// ������������ �ν��Ͻ� �ּҰ� �ٸ� ���
		// �ּҴ� �ٸ����� equals �� ����� true�� ���
		if (studentLee == studentSang)
			System.out.println("studentLee�� studentSang�� �ּҴ� �����ϴ�.");
		else 
			System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�.");
		// studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�.
		
		if (studentLee.equals(studentSang))
			System.out.println("studentLee�� studentSang�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentSang�� �������� �ʽ��ϴ�.");
		// studentLee�� studentLee2�� �����մϴ�.
		
		System.out.println("studentLee�� hashCode : " + studentLee.hashCode());		// studentLee�� hashCode : 100
		System.out.println("studentSang�� hashCode : " + studentSang.hashCode());	// studentSang�� hashCode : 100
		
		System.out.println("studentLee�� ���� �ּҰ� : " + System.identityHashCode(studentLee));	// studentLee�� ���� �ּҰ� : 474675244
		System.out.println("studentSang�� ���� �ּҰ� : " + System.identityHashCode(studentSang));	// studentSang�� ���� �ּҰ� : 932583850
		// ���� �ּҰ��� ���ϴ� �±� : identityHashCode(��ü��)
		
		
	}

}
