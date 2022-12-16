package javaPractice.ch_07.student;

public class Student {
	int studentID; //학번
	String studentName; // 이름
	int grade; // 학년
	String address; // 주소
	
	public void showStudentInfo() { // 저장된 이름, 주소를 보여줘라! 
		// void 존재 => return 없음!
		System.out.println(studentName + ", " + address); // 이름, 주소
	}
	
	public String getStudentName() { // studentName을 반환. 읽기 쉬우라고 getStudentName(S대문자) 함 
		// void가 없음 => return 있음!
		return studentName;
	}
	
	public void setStudentName(String name) { // studentName을 저장
		// void 존재 => return 없음! 
		studentName = name;
		// studentName 을 name에 저장하기 위해서 return 할 필요 X
	}

}
