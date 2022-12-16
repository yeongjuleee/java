package javaPractice.ch_10.exceptionHandling;

public class Ex_01 {
	
	// ������ ���Ḧ �ϴµ�, try ~ catch �� �̿��ؼ�
	// ���ܸ� �����ϰ� ó���ϵ��� �ڵ带 ������ ��
	
	public static void main(String[] args) {
		int[] arr = new int[10];
	
		for(int i = 0; i < 10; i++) {
			arr[i] = i;
		}
		try {
			for (int i = 0; i < 11; i++) {
				System.out.println(arr[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
