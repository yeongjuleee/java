package javaPractice.ch_05;

public class Array2_Test02 {

	public static void main(String[] args) {
		// ��ø for���� �̿��ؼ� �־��� �迭�� ��ü �׸��� �հ� ��հ��� ���Ͻÿ�
		// �� ���� ���� ������ �ٸ� ���
		
		int[][] array = {
				{95, 86}, // 1��
				{83, 92, 96}, // 2��
				{78, 83, 93, 87, 88} // 3��
		};
		
		int sum = 0;
		double avg = 0.0;
		
		// for�� �ۼ� ��ġ
		int count = 0; // ���� ������ �ٸ� 2���� �迭�̶� ���� ���� �� ���� ī������ �ؾ���.
		for (int i=0; i < array.length; i++) { // �� �ݺ� > 3
			for (int j=0; j < array[i].length; j++) { // �� �ݺ�
				sum += array[i][j]; 
				count++; 
			}
		}
		avg = (double) sum / count; // ���� ������ ī��Ʈ Ƚ��
		
		System.out.println("sum: " + sum ); //881
		System.out.println("avg: " + avg); // 88.1

	}

}
