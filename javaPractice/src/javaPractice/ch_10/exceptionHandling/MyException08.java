package javaPractice.ch_10.exceptionHandling;
// 사용자 정의 예외 만들기

class MyScore {
	private int score;
	public void setScore(int s) throws MyException {
		// 예외가 발생하면 MyEception으로 보냄.
		if (s < 0) 
			throw new MyException("점수는 음수가 될 수 없습니다.");
		else 
			this.score = s;
	}
}

// 사용자 정의 예외처리 방법 : 클래스 클래스명 extends Excepiton
class MyException extends Exception {
	public MyException() {}
	public MyException(String message) {
		super(message);
	}
}

public class MyException08 {

	public static void main(String[] args) {
		MyScore obj = new MyScore();
		
		try {
			obj.setScore(-10);
		}
		catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
