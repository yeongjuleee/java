package javaPractice.ch_06;

public class Method03 {
	// �Ű������� �ִ� �޼ҵ�
	// �Ű� ������ �޼ҵ� ȣ��� �޸𸮰� �����ǰ�, ȣ�� �� ���� �� �Ҹ�
	
	public void print(int a) { // void = return�� ������ �� �� ����. �Ű����� int a �� ������ �� �� ����
		System.out.println("�����: " + a);
		
	}
	
	public static void main(String[] args) {
		//
		
		int a = 11;
		int b = 22;
		int result = 0;
		
		// ����� �޼ҵ尡 �ִ� Ŭ������ �ν��Ͻ� ����
		Method03 method = new Method03();
		method.print(10);
		method.print(b);
		method.print(result);

	}

}
