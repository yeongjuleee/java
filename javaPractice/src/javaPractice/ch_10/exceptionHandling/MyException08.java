package javaPractice.ch_10.exceptionHandling;
// ����� ���� ���� �����

class MyScore {
	private int score;
	public void setScore(int s) throws MyException {
		// ���ܰ� �߻��ϸ� MyEception���� ����.
		if (s < 0) 
			throw new MyException("������ ������ �� �� �����ϴ�.");
		else 
			this.score = s;
	}
}

// ����� ���� ����ó�� ��� : Ŭ���� Ŭ������ extends Excepiton
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
