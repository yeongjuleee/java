package javaPractice.ch_05;

public class Array2_Test01 {

	public static void main(String[] args) {
		// ��ø for���� �̿��ؼ� �־��� �迭�� ��ü �׸��� �հ� ����� ���Ͻÿ�.
		int[][] arr = {
				{ 5, 5, 5, 5, 5 }, // 1��, 5��
				{ 10, 10, 10, 10, 10}, // 2�� 5��
				{ 20, 20, 20, 20, 20}, // 3�� 5��
				{ 30, 30, 30, 30, 30} // 4�� 5��
		};
	
			
		int total = 0;
		double average = 0;
		
		//for�� �ۼ� ��ġ
		
		for (int i=0; i < arr.length; i++) { // �� �ݺ�. �� ���� ���� ����.
			for (int j=0; j < arr[i].length; j++) {
				total += arr[i][j]; // ������ ���� arr�� ��� ��				
			}
			
		}
		average = (double)total / (arr.length * arr[0].length); // 4�� * 5��
		
		
		System.out.println("total= " + total); // 325
		System.out.println("average= " + average); // 16.25

	}

}
