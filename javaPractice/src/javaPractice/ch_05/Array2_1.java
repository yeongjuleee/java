package javaPractice.ch_05;

public class Array2_1 {

	public static void main(String[] args) {
		// 2���� �迭 �ʱ�ȭ �� ��¹��
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6}
		}; // 2���� �迭 ����
		
		System.out.println("��: " + arr.length);
		System.out.println("��: " + arr[0].length);
		
		for(int i=0; i < arr.length; i++) { // ���� arr�� �迭 ���̸�ŭ i�� 1�� ������Ŵ = i =��. 
			for(int j=0; j < arr[i].length; j++) { // ���� arr�� ��(=i) ���̸�ŭ ��(=j)�� 1�� ������Ŵ. arr[i]���� i�� �� ���� ����. 
				System.out.print(arr[i][j] + " "); // ���� arr�� ��� ���� ����϶�.
			}
			System.out.println(); // ���� �ݺ��� ������ �ٹٲ�
		}

	}

}
