package javaPractice.ch_09.abstractClass.Interface;

public class CompleteCalc extends Calculator {
	// �������̽��� ������ �߻� Ŭ������ ��� ���� �Ϲ� Ŭ����
	// �߻� Ŭ�������� add(), substact()�� �����߱� ������ times(), divide()�� �����ϸ� ��

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1 / num2;
		else 
			return Calc.ERROR;	// � ���� 0���� ������ ��쿡 ������ ��ȯ
	}
	
	public void showInfo( ) { // CompleteCalc ���� �߰��� ������ �޼ҵ�
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}
	
	

}
