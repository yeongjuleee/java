package javaPractice.ch_05;

public class Array2 {

	public static void main(String[] args) {
		// 2���� �迭
		// ����: int[][] �迭�̸� = new int[][];
		
		int[][] arr = new int[2][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("�� : " + arr.length); // 2���� ��
		System.out.println("�� : " + arr[0].length); // 3���� ��
	}

}
