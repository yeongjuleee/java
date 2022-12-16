package javaPractice.ch_07.student;

public class Class09 {

	public static void main(String[] args) {
		// 멤버 변수로 접근하는 방법
		// 1. 바로 접근
		// 2. 메소드를 통한 접근이 가능
		// 일반적으로 메소드를 통한 접근을 사용함
		
		Student student1 = new Student();
		//student1.setStudentName = "박정우";
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();
		//student2.studentName = "김준규";
		student2.setStudentName("김준규");
		System.out.println(student2.getStudentName());

	}

}
