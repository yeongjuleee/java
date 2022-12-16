package javaPractice.ch_09.abstractClass_innerclass;

/*
	�͸� ��ü�� ���� ���� ���
	�޼ҵ��� �Ű� ������ ���� ������ �͸� ��ü ���ο��� ����� ���� ������ ����
	�޼ҵ尡 ����Ǿ �͸� ��ü�� ���� ���·� ������ �� ����
	������ �޼ҵ��� �Ű� ������ ���� ������ �͸� ��ü ���ο��� ����� ���ε�,
	�޼ҵ尡 ������ ������ ���� �޸𸮿��� ������� ������ �͸� ��ü���� ���������� ����� �� X
	
	�ڹٴ� �� ������ �ذ��ϱ� ���� ������ �� �͸� ��ü���� ����ϴ� �Ű� ������ ���� ������ ���� �͸� ��ü ���ο� �����صΰ� ���
	�׸��� �Ű� ������ ���� ������ �����Ǿ� ���� ����Ǹ� �͸� ��ü�� �����ص� ���� �޶����Ƿ�
	�Ű� ������ ���� ������ final Ư���� �ο�(=����� ����)
*/

interface Calculatable {
	public int sum();
}

class Anoymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;		// �ܺ� Ŭ������ ��� ����
		
		// arg1 = 20;	// �Ű� ������ ����� ���� �Ұ�
		// arg2 = 20;	// �Ű� ������ �͸� ��ü���� ����ؼ� ���ȭ �Ǿ� ����. ������ ����������� ó��
		
		// var1 = 30; ���� ������ �����  ����X
		// var2 = 30; ���� ������ �͸� ��ü���� ����ؼ� ���ȭ �Ǿ� ����
		
		Calculatable calc = new Calculatable() {

			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
			
		};
		System.out.println(calc.sum());
	}
}


public class AnonymousClass04 {

	public static void main(String[] args) {
		Anoymous anoy = new Anoymous();
		anoy.method(0, 0); // 10

	}

}
