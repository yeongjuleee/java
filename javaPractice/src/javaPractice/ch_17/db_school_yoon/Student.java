package javaPractice.ch_17.db_school_yoon;

public class Student{
	
	
	private int studentNumber;	//�й�
	private String name; 
	private String phoneNumber; 
	private String memo;
	
	public Student() {	//�� ������
		
	}
			
	public Student(int studentNumber, String name, String phoneNumber, String memo) {	
		this.studentNumber = studentNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.memo = memo;
	}

	//getter, setter

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	} 
		

	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�л� ���� >> �й�: " + studentNumber + ", �̸�: " + name + ", �ڵ��� ��ȣ: " + phoneNumber + ", �޸�: " + memo+"\n"
				+"���� ���� ���� >> " ; 
	}*/



	//�л��� ��� �ִ� ������ ����
	private int code;
	private String subjectName;
	
	//Student�� ������		
	public Student(int studentNumber) {
		//�й��� �Ű� ������ �޾Ƽ� ���� �л��� �й��� ����
		this.studentNumber = studentNumber;
	}



	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	

	
		
}
