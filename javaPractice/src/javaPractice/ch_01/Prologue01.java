package javaPractice.ch_01;

public class Prologue01 {

	public static void main(String[] args) {
		// �⺻���� ������ ������ ���⿡ �����ÿ�~ �ϴ� main
		System.out.println("Hello Java!"); // println �� �Լ�ó�� ���. (�Լ��� �� �޼ҵ��� �������� �Լ� �տ� . �ٴ�..) 
		System.out.println("������ - DAY6");
		System.out.println("���־� ��Ʃ����� �� ���־����� �˰Ͱ��� �������� ����!");
		// ��� ���� �ּ��̱���		

		/*
		��� ������ �ּ��̿���!
		�ѹ��� �鿩���� ���� �ϴ� ���: ��� �巡���ؼ� ���ϱ� (�ڷ� ���ؾ��Ҷ� ����Ʈ + ��)
		 */		
		
		// java�� �� �ڵ尡 ������ ; (����Ŭ��)�� ���̰�! ���ڿ����� �� ū ����ǥ " " �� ����ؾ���!
		
		//"Hello Java�� ������ �����ؼ� ����Ʈ�غ���!
		String greet = "Hello Java!";
		System.out.println(greet);
		
		String soon = "�� ���� ���� �ð�";
		System.out.println(soon);
		
		// char Ÿ�� ����غ���
		char ch = 'A'; // char ch = '\u0041'; �� �ٲ� �ᵵ ����.
		int code = (int)ch;
		
		System.out.println(ch); // A
		System.out.println(code); // 65
		
		//char Ÿ������ �ҹ��� a�� �� ����غ���
		char kode = 'a';
		
		System.out.println(kode);
		
		//���ڿ� ǥ��
		char single = '\'';	 // ���� ����ǥ�� ����Ϸ��� �齽����\ �ڿ� ' �Է�
		String dblQuote = "\"Hello\""; //�����ǥ�� ����Ϸ��� �齽����\ �ڿ� " �� �Է�
		String root = "c:\\";
		
		System.out.println(single);
		System.out.println(dblQuote);
		System.out.println(root);
		
		
		//�Ǽ�Ÿ��(float) �غ���
		float f = 1.234567890123456789f;
		float f3 = 1.2f; 
		
		//�Ǽ�Ÿ��(duble) �غ���
		double d = 1.234567890;
		
		System.out.println(f);
		System.out.println(f3);
		System.out.println(d);
		
		// ����Ÿ�� (long) ����� ���, int�� ������ ����� �� ���̻� L ���
		long var1 = 10;
		long var2 = 20L;
		long var3 = 100000000L;
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}

}
