package javaPractice.ch_10.exceptionHandling;

public class Ex_01_2 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		
		System.out.println("arr[2] = " + arr[2]);		
		System.out.println("arr ��� �Ϸ�");
		System.out.println("try / catch ���� �� ���� ����");
		
		try {
			System.out.println("arr[3] = " + arr[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
