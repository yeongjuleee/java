package javaPractice.ch_09.abstractClass.Interface;

public abstract class Calculator implements Calc {
	// �������̽��� ������ �߻� Ŭ����
	// �߻� Ŭ������ ��� �������̽��� ��� �߻� �޼ҵ带 �������� �ʾƵ� ��
	// => �ڽſ��� �ʿ��� �߻� �޼ҵ常 �����ص� ��
	
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substact(int num1, int num2) {
		return num1 - num2;
	}
	
	
	
}
