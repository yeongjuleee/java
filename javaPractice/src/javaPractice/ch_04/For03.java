package javaPractice.ch_04;

public class For03 {

	public static void main(String[] args) {
		// ��ø For���� Ȱ���Ͽ� ������ ����� 
		// for���� �� �ٸ� for���� ������ �� ���� => ��ø for��
		
		// ���� ����
		// 1. �� ��� �ٱ��� for���� �� �� ������ ������ ��ø�� for���� ������ Ƚ�� ��ŭ
		// 2. �ݺ��ؼ� ���� �ٽ� �ٱ��� for������ ���ư�.

		for(int dan = 2; dan <= 9; dan ++) { // �ٱ� �� for ������ 8�� �ݺ� (���� ���� 2)
			System.out.println(" " + dan +"�� �Դϴ�.");
			for (int times = 1; times <= 9; times++) { // ��ø for������ 9�� �ݺ�. (���� ���� 1)
				System.out.println(dan + "X" + times + " = " + dan * times);
			}
			System.out.println();
		}
		
		// ���� for���� ��� �������� i, j, k ������ ���
		// ��ɹ��� �ϳ��� ���� {} ���� ����.
	}

}
