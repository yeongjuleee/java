package javaPractice.ch_06;

public class Method04 {
	
	// �Ű� ������ 2�� ����ϴ� �޼ҵ�
	public void print(int a, int b) { 
		// �Ű����� print �� int a �� int b �� 2����
		// void �� return �� ����
		
		int c = a + b;
		System.out.println("�����: " + c);
	}
	
	// �Ű� ������ ���ڿ��� �޴� �޼ҵ� ����
	public void print1(String str) { // �Ű����� print1 �� Ÿ�� String
		// �Ű����� Ÿ���� String 
		System.out.println(str);
	}

	public static void main(String[] args) {
		// ���� ���� 
		int num1 = 11;
		int num2 = 22;
		int result = 0;
		
		// ����� �޼ҵ尡 �ִ� Ŭ������ �ν��Ͻ� ����
		Method04 method = new Method04();
		
		// �޼ҵ� ȣ��
		method.print(10, 20); // a �� ���� 10��, b ���� 20�� ������ �� �� �ִ�.
		
			//method.print(10, 30.0f); 
			//int Ÿ���� �޼ҵ��̱� ������ 30.0�� float Ÿ������ ����� �� ����
		
		method.print(num1, num2); // a �ڸ��� num1 �� �� 11��, b �ڸ��� num2�� �� 22�� ������ �� �� �ִ�.
		
		method.print1("�ȳ��ϼ���"); // ���� Ÿ�Ը� ����� �� ����
		

	}

}
