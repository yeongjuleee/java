package javaPractice.ch_07;


public class ClassTest01 {

	public static void main(String[] args) {
		Student s = new Student(); //참조변수 s 선언
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());

	}
	

}

class Student {
	String name; // 이름 
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수
	
	//리턴타입이 있어야함. void아님 
	int getTotal() {
		return (kor + eng + math);
	}
	double getAverage() {
		return (getTotal()) / 3;
		// 강사님 : return (double)this.getTota() / 3;
	}
	
}
