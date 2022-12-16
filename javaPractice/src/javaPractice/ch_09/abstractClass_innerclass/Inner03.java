package javaPractice.ch_09.abstractClass_innerclass;

// InnerTest

class OutClass_02 {
	/*
		���� ���� Ŭ���� static inner class
		���� Ŭ������ �ܺ� Ŭ������ ������ �����ϰ� ����� �� �־�� �ϰ�, ���� ������ ����� �� �־�� �� �� ���
		�ν��Ͻ� ���� Ŭ����ó�� �ܺ� Ŭ���� ����� ���� ��ġ�� �����Ͽ� static ���� �Բ� ���
	*/
	
	// �ܺ� Ŭ���� �ʵ� 
	private int num = 10;
	private static int sNum = 20;
	
	static class InStaticClass { // static ���� Ŭ����
		
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {		// ���� Ŭ������ �Ϲ� �޼ҵ�
			//num += 10;	// �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			// �ܺ� Ŭ���� ��ü�� �������� X �ٷ� ���� ���� Ŭ������ ��ü�� ������ �� �־ �ܺ� Ŭ������ �ν��Ͻ� ���� ����� ����
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ���� ���)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���)");
		}
		
		static void sTest() {	// ���� Ŭ������ static �޼ҵ�
			// num += 10;		// �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� X
			// inNum += 10;		// ���� Ŭ������ �ν��Ͻ� ������ ����� �� X
			
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ����ƽ ���� ���)");
		}
	}
}

public class Inner03 {

	public static void main(String[] args) {
		
		// �ܺ� Ŭ���� ��ü ����X �ٷ� ���� ���� Ŭ������ ��ü ����
		
		OutClass_02.InStaticClass sInClass = new OutClass_02.InStaticClass();
		// �ܺ�Ŭ����.���ν���ƽŬ���� ���� = new �ܺ�Ŭ����.���ν���ƽŬ����()
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼ҵ� ȣ��");
		sInClass.inTest();
		// ����Ŭ����.�Ϲݸ޼ҵ�
		System.out.println();
		
		System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��");
		OutClass_02.InStaticClass.sTest();
		//�ܺ�Ŭ����.���ν���ƽŬ����.���ν���ƽ�޼ҵ�()
	}

}
