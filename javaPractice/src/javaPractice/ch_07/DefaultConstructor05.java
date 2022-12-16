package javaPractice.ch_07;

class Student1 {
	
	// 변수
	String name;
	private String rollno;
	int age;
	
	// 기능 (메소드)
	Student1 (String name, String rollno, int age) { // 클래스와 이름이 같고, 대문자 => 기본 생성자
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		
		System.out.println("학생의 이름: " + name);
		System.out.println("학생의 학번: " + rollno);
		System.out.println("학생의 나이: " + age);
		
		System.out.println("Student 객체가 생성되었습니다.");
	}
	
	/*나의 잘못된 코딩~
	 * public void setRollno (String rollno) { // 학번 설정하기 
		this.rollno = rollno;
	}
	
	public String getName() { // 이름 값 가져오기
		return name;
	}
	
	public int getAge() { // 나이 가져오기
		return age;
	}*/
	
	
}

public class DefaultConstructor05 {

	// 학생을 나타내는 클래스 Student를 만든다.
	// 학생은 이름(name)과 학번(rollno), 나이(age)를 가진다.
	// 학번은 private로 선언한다.
	
	public static void main(String[] args) {
		Student1 student = new Student1("Kim", "0001", 20);
		// 학생의 이름 : Kim
		// 학생의 학번 : 0001
		// 학생의 나이 : 20
		// Student 객체가 생성되었습니다.

	}

}
