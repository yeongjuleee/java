package javaPractice.ch_17.db_school_yoon;

public class Student{
	
	
	private int studentNumber;	//학번
	private String name; 
	private String phoneNumber; 
	private String memo;
	
	public Student() {	//빈 생성자
		
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
		return "학생 정보 >> 학번: " + studentNumber + ", 이름: " + name + ", 핸드폰 번호: " + phoneNumber + ", 메모: " + memo+"\n"
				+"수강 과목 정보 >> " ; 
	}*/



	//학생이 듣고 있는 수업의 정보
	private int code;
	private String subjectName;
	
	//Student의 생성자		
	public Student(int studentNumber) {
		//학번을 매개 변수로 받아서 현재 학생의 학번을 설정
		this.studentNumber = studentNumber;
	}



	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	

	
		
}
