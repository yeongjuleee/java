package javaPractice.ch_08;

/*
������ �Է¹޴� �����ڸ� �����,
��� ������ ������ �� �� �ִ� display() ����
*/

class Score2 {
	// �ʵ�
	private int kor;
	private int math;
	private int eng;
	private int com;
	
	// ������
	public Score2() {}
	
	public Score2(int kor, int math, int eng, int com) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.com = com;
	}
	
	// �޼ҵ�
	// �޼ҵ忡�� return ���� �ʿ��� ���
	// 1. ������ �����ؼ� = �� �� ���
	// 2. �޼ҵ忡 ���ڰ� �� ���
	
	public void display() { // �Է¹����� ��¸� �ϸ� �Ǵ� return �ʿ� X
		System.out.println("����: " + kor + ", ����: " + math + ", ����: " + eng + ", �ڵ�: "+ com);
	}
	
}

public class InheritanceTest06 {

	public static void main(String[] args) {
		Score2 score = new Score2 (100, 80, 95, 84);
		//s.kor; => �ܺο��� ���� X => private ���
		score.display(); 
		// �ܺο��� ���� ���� 

	}

}
