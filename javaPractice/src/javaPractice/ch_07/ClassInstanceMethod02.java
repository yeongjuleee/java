package javaPractice.ch_07;
// �޼ҵ� �����ε� ���

public class ClassInstanceMethod02 {
	// Printer ��ü�� �����ϰ�, println() �޼ҵ带 ȣ���ؼ� �Ű����� �ֿܼ� ����Ϸ��� �Ѵ�.
	// println() �޼ҵ��� �Ű������� int, boolean, double, String ���� �� �� �ִ�.
	// Printer Ŭ�������� println() �޼ҵ带 �����϶�
	
	public static void main(String[] args) {
		// ��ü ���� �� ��� �ϱ�
//		Printer printer = new Printer();  => �ν��Ͻ� �޼ҵ� ����� ���� ��ü������. Ŭ���� ������ = new Ŭ������
//		printer.println(10);
//		printer.println(true);
//		printer.println(5.7);
//		printer.println("����ȯ");

		// Ŭ������ �ٷ� ����ϱ� : Ŭ����.Ŭ�����޼ҵ�(��)
		// class Printer �� �ν��Ͻ� �޼ҵ带 �� Ŭ���� �޼ҵ�� �����ؾ��� => static ���̱�.
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("�赵��");
	}

}

class Printer { // Printer ��ü ����
	static void println(int a) { // Ŭ���� �޼ҵ� ����, �޼ҵ� ȣ��
		System.out.println(a);
	}
	static void println(boolean a) { // Ŭ���� �޼ҵ� ����
		System.out.println(a);
	}
	static void println(double a) { // Ŭ���� �޼ҵ� ����
		System.out.println(a);
	}
	static void println(String a) { // Ŭ���� �޼ҵ� ����
		System.out.println(a);
	}
	/*
	 void println(int a) { // �ν��Ͻ� �޼ҵ� ����, �޼ҵ� ȣ��
		System.out.println(a);
	}
	 void println(boolean a) { // �ν��Ͻ� �޼ҵ� ����
		System.out.println(a);
	}
	 void println(double a) { // �ν��Ͻ� �޼ҵ� ����
		System.out.println(a);
	}
	 void println(String a) { // �ν��Ͻ� �޼ҵ� ����
		System.out.println(a);
	}
	 */
}
