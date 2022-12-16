package javaPractice.ch_10.exceptionHandling;

public class MyException05 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);	// ���� �߻�!
			System.out.println(4);
		}
		catch (ArithmeticException ae) {
			// �������� ae�� ����, ������ ArithmeticException �ν��Ͻ��� ������ �� O
			ae.printStackTrace();
			// StackTrace �κ�: by zero
			//				   at javaPractice.ch_10.exceptionHandling.MyException05.main
			
			System.out.println("���� �޽���: " + ae.getMessage());
		}	// try-catch ��
		System.out.println(6);

	}

}
