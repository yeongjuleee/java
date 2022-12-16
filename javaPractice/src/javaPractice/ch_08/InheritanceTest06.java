package javaPractice.ch_08;

/*
점수를 입력받는 생성자를 만들고,
모든 과목의 점수를 볼 수 있는 display() 생성
*/

class Score2 {
	// 필드
	private int kor;
	private int math;
	private int eng;
	private int com;
	
	// 생성자
	public Score2() {}
	
	public Score2(int kor, int math, int eng, int com) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.com = com;
	}
	
	// 메소드
	// 메소드에서 return 값이 필요한 경우
	// 1. 변수를 선언해서 = 을 쓴 경우
	// 2. 메소드에 인자가 들어간 경우
	
	public void display() { // 입력받은거 출력만 하면 되니 return 필요 X
		System.out.println("국어: " + kor + ", 수학: " + math + ", 영어: " + eng + ", 코딩: "+ com);
	}
	
}

public class InheritanceTest06 {

	public static void main(String[] args) {
		Score2 score = new Score2 (100, 80, 95, 84);
		//s.kor; => 외부에서 접근 X => private 사용
		score.display(); 
		// 외부에서 접근 가능 

	}

}
