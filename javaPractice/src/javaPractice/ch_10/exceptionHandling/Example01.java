package javaPractice.ch_10.exceptionHandling;

public class Example01 {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		int a = 0;
		int b = 2;
		int c = b / a;		// 0 ���� ���� �� ��� ���� �߻�!
							// ����� �ش� ������ ��µ�. ���� �� �� ����.
							// Exception in thread "main" java.lang.ArithmeticException: / by zero
							// at javaPractice.ch_10.exceptionHandling.Example01.main(Example01.java:9)
		
		System.out.println("���α׷� ����");

	}

}
