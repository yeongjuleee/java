package javaPractice.ch_12.garbage;

import java.util.HashMap;

/* Student 클래스를 작성하되, Object의 equals() 와 hashCode()를 재정의해서
Student의 학번 studentNum 이 같으면 동등 객체가 될 수 있도록 하라
Student 클래스의 필드는 다음과 같다
hashCode()의 리턴 값은 studentNum 필드 값의 해시코드를 리턴하도록 하라

실행결과 :
	1번 학생의 총점 : 95 */

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

	// 여기에 코드를 작성하라 (Object 관련 형변환 문제)
	@Override
	public boolean equals(Object obj) { // equals() 메소드 재정의. 학번이 같으면 같은 학생으로 재정의
		if (obj instanceof Student) {
			Student student = (Student)obj;
			
			if (studentNum.equals(student.getStudentNum())) { // 이 객체의 학생점수와 매개 변수로 넘어온 객체의 학생 점수가 같으면 true반환
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode(); 
		// 학생점수의 주소값을 반환
	}
	
}


public class Test {

	public static void main(String[] args) {
		// Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		
		// new Student("1")의 점수 95를 저장
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점 : " + score);
	}

}
