package javaPractice.ch_10.exceptionHandling;

public class MyException_02 {

	public static void main(String[] args) {
		int num = 10;
		int num2 = 10;
		
		try {
			System.out.println("** ������ ���� 0���� ������ ���� **");
			// �������� ���� ����
			System.out.println("10 / 0 = " + (num / num2));
			System.out.println("** ������ ���� 0���� ������ ���� �Ϸ� **");
		} catch (Exception e) {
			// Exception e = println("10/0 ~ ) �� ��ü 
			// ����� �ϸ� Exception e => e �� ���� ��ü���� ��µ�. 
			System.out.println(e);
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		System.out.println("���α׷��� ���� �����մϴ�.");

	}

}
