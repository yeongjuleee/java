package javaPractice.ch_04;

public class While01Example01 {

	public static void main(String[] args) {
		// for ���� while������ �����϶�
		// ������ �״�� ����ϱ�.
		
		int num;
		int sum = 0;
		
		for (num = 1; num <= 10; num++) {
			sum += num;
		}
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");
		
		num = 1;
		sum = 0;
		while (num <= 10) {
			sum += num;
			num ++; // for������ ������ ���� �������� �����. �׷��� for���� �帧�� ��..����..�Ѱ�... ��� ���� ������.
		}
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");
	}

}
