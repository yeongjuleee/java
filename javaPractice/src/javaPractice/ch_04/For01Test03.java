package javaPractice.ch_04;

public class For01Test03 {

	public static void main(String[] args) {
		// For���� �̿��Ͽ� * ���
		// Test02�� �ݴ� �������� ���!
		// ��Ʈ : ������ ���� ������ �� ������ �ý���.. 
		// ���� ���� ����ϴ� for��, �� ����ϴ� for���� �־����.. 

		for (int i = 1; i <= 4; i++) {
			for (int j=4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		// �ٸ� ���
		for (int x = 1; x <= 4; x++) {
			for (int y = 1; y <= (4 - x); y++) {
				System.out.print(" ");
			}
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
