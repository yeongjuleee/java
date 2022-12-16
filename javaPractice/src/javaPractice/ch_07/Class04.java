package javaPractice.ch_07;

//동작(함수=메소드)은 없고 속성만 있는 class
class MyStudent { // 메소드 없는 클래스
	String name; // 이름
	int grade; // 학년
	int kor; // 국어 성적
	int eng; // 영어 성적
	int math; // 수학 성적
	
	void printStudent() { 
		// 매개 변수 X, 변수 하나로 학생 한 명이 여러 정보를 저장할 수 있다.
		System.out.println(name + "은/는 " + grade + "학년이고, 국어 성적은 " + kor + "점 입니다.");
		
	}
}

public class Class04 {

	public static void main(String[] args) {
		MyStudent student1 = new MyStudent(); // class 를 모델로 하는 객체 생성
		// 일반적인 데이터와 타입이 달라서 객체라고 함.
		// 변수 하나로 학생 한 명이 여러 정보를 저장할 수 있음
		
		student1.name = "김준규";
		student1.grade = 2;
		student1.kor = 100;
		student1.eng = 99;
		student1.math = 80;
		
		MyStudent student2 = new MyStudent(); // class를 모델로 하는 객체 생성
		student2.name = "박지훈";
		student2.grade = 2;
		student2.kor = 100;
		student2.eng = 100;
		student2.math = 99;
		
		//printStudent(student1); // 김준규는 2학년이고, 국어 성적은 100점 입니다. 
		//printStudent(student2); // 박지훈은 2학년이고, 국어 성적은 100점 입니다.
		student1.printStudent();
		student2.printStudent();
	}


}
