package javaPractice.ch_08;

class Score {
	// 필드
	private int kor;
	private int math;
	private int eng;
	private int com;
	
	// 생성자
	public Score() {}
	
	public Score(int kor, int math, int eng, int com) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.com = com;
	}
	
	// 메소드
	public void setKor(int kor) {
		if(kor >= 0 && kor <= 100 ) {
			this.kor = kor;
		}
		else {
			System.out.println(kor + "는 올바른 점수가 아닙니다.");
		}
		
	}
	public int getKor() {
		return kor;
	}
	
	
	public void setMath(int math) {
		if(math >= 0 && math <= 100 ) {
			this.math = math;
		}
		else {
			System.out.println(math + "는 올바른 점수가 아닙니다.");
		}
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setCom(int com) {
		this.com = com;
	}
}

public class InheritanceTest05 {

	public static void main(String[] args) {
		Score score = new Score();
		//score.kor = -500; => 오류: 외부에서 접근 불가! private
		score.setKor(-500); // => 외부에서 접근 가능.
		// 점수를 저장하는데 잘못된 값(마이너스)가 입력되면 다시 입력하라는 문구 나오도록 하기.
		

	}

}
