package javaPractice.ch_05;

public class Array03 {

	public static void main(String[] args) {
		// �迭�� Ȱ���Ͽ� �ּڰ�, �ִ� ���ϱ�.
		// for ������ �迭�� ���̰� ª������ ������� ���ϰ� ���� �� ������ �� �� �ִ�.
		// if ������ ������ ����� ���ϴ� ���� �ݹ� ������ �� �ִ�.
		
		int [] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0]; // �迭�� ù ��° ������ �ִ��� �ʱ�ȭ �Ѵ�.
		int min = score[0]; // �迭�� ù ��° ������ �ּڰ��� �ʱ�ȭ �Ѵ�.
		
		for (int i = 1; i < score.length; i++) { // int 1�� index ��ȣ 1������ i�� score�� ���� ��ŭ, i�� ++
			if (score[i] > max) { // score[i] �� max ���� ũ�� 
				max = score[i]; // max = score[i]
			}
			if (score[i] < min) { // score[i] �� min ���� ������
				min = score[i]; // min = score[i]
			}
			
		} // end of for

		
		System.out.println("�ִ�: " + max);
		System.out.println("�ּڰ�: " + min);
	}

}
