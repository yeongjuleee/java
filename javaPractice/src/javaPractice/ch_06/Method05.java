package javaPractice.ch_06;

public class Method05 {
	
	// ���� Ÿ���� �ִ� �޼ҵ�
	public int add(int a, int b) { // ���� add�� �Ű����� int a, b 
		int c = a + b;
		return c;
		// return ������ ��ġ�ϴ� �����ʹ� �ݵ�� �޼ҵ��� ���� Ÿ�԰� ��ġ�ؾ���
		// return 3.5 > ���� Ÿ�԰� �ٸ� ���������� ��ȯ�ϸ� ���� �߻�
	}
	

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		// ����� �޼ҵ尡 �ִ� Ŭ������ �ν��Ͻ� ����
		Method05 method = new Method05();
		result = method.add(num1, num2);
		
		System.out.println("�� ���� ���� " + result); // �޼ҵ��� ��ȯ ���� �����ؼ� ���
		System.out.println("�� ���� ���� " + method.add(num1, num2)); // �޼ҵ��� ��ȯ ���� �ٷ� ��� (�� ����� �� ��ȣ��.)
		

	}

}
