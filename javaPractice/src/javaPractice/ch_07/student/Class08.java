package javaPractice.ch_07.student;

public class Class08 {

	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "성해은";
		
		// 같은 결과가 나옴
		System.out.println(studentKim.studentName); // 성해은
		System.out.println(studentKim.getStudentName()); // 성해은

	}

}
