package javaPractice.ch_10.exceptionHandling;

public class MyException_01 {

	public static void main(String[] args) {
		int num = 10;
		int num2 = 0;
		
		System.out.println("** ������ ���� 0���� ������ ���� **");
		// �������� ���� ����
		System.out.println("10/0 = " + (num / num2));
		System.out.println("try/catch ���� �� ���� ����");

	}

}
