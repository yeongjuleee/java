package javaPractice.ch_07.student2;

class Student2 {
	// 속성 선언(변수, 멤버)
	String name; // 이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어 
	int eng; // 영어
	int math; // 수학
	int total; // 총점
	double average; // 평균
	
	
	// 기본생성자와 메소드의 차이점은?
	
	// 기본 생성자 선언 
	public Student2 (String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		
	}
	
	// 기능(메소드 선언)
	public String toString() {
		return "이름 : " + name + ", 반 : " + ban + ", 번호 : " + no;
	}
	
	public void updateRecord (int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return (kor + eng + math);
	}
	
	public double getAverage() {
		return getTotal() / 3.0;
	}
	
	
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBan (int ban) {
		this.ban = ban;
	}
	
	public int getBan() {
		return ban;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public int getNo () {
		return no;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getEng() {
		return eng;
	}
	
}

public class DefaultConstructor11 {

	/*
	Student 클래스를 생성하시오
	이름이 name, 반 ban, 번호 no 를 입력받는 생성자를 만드시오.
	국어 kor, 영어 eng, 수학 math 성적을 입력받는 updateRecord() 메소드를 작성하시오.
	학생의 이름을 반환하는 getName(), 입력받은 성적의 합계를 구하는 getTotal(), 
	평균을 반환하는 getAverage()를 작성하시오.
	*/
	
	public static void main(String[] args) {
		Student2 s = new Student2 ("홍길동", 1, 1);
		s.updateRecord(100, 60, 76);
		System.out.println(s);
		
		System.out.println("이름: " + s.getName());
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());
		

	}

}
