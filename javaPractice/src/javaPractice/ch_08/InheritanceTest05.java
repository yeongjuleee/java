package javaPractice.ch_08;

class Score {
	// �ʵ�
	private int kor;
	private int math;
	private int eng;
	private int com;
	
	// ������
	public Score() {}
	
	public Score(int kor, int math, int eng, int com) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.com = com;
	}
	
	// �޼ҵ�
	public void setKor(int kor) {
		if(kor >= 0 && kor <= 100 ) {
			this.kor = kor;
		}
		else {
			System.out.println(kor + "�� �ùٸ� ������ �ƴմϴ�.");
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
			System.out.println(math + "�� �ùٸ� ������ �ƴմϴ�.");
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
		//score.kor = -500; => ����: �ܺο��� ���� �Ұ�! private
		score.setKor(-500); // => �ܺο��� ���� ����.
		// ������ �����ϴµ� �߸��� ��(���̳ʽ�)�� �ԷµǸ� �ٽ� �Է��϶�� ���� �������� �ϱ�.
		

	}

}
