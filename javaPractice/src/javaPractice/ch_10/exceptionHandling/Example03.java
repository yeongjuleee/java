package javaPractice.ch_10.exceptionHandling;

//finally�� 
// �ܺο��� ������ �� �� �����.

public class Example03 {

	public static void main(String[] args) {
		// �ܺη� ����
		int a = 0;
		int b = 2;
		
		try {
			System.out.println("�ܺη� ����");
			int c = b / a;
			System.out.println("���� ����");
		}
		catch (ArithmeticException e) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
		finally {
			System.out.println("���� ����");
		}
		System.out.println("���⵵ ����˴ϴ�.");
	}

}
