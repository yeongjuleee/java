package javaPractice.ch_10.exceptionHandling;

public class Example02 {

	public static void main(String[] args) {
		try {
			int[] a = {2, 0};
			int b = 4;
			System.out.println("���� ó�� ���� �� 1");
			int c= b / a [2];
			System.out.println("���� ó�� ���� �� 2");
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			// ���� ���� �� ArithmeticException ������ �߻��ϸ�, 
			System.out.println("��� ���� �߻�!");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� ���� �߻�!");
		}
		System.out.println("���� ó�� ���� �� 3");
		
	}

}
