package javaPractice.ch_06;

public class Retrun02 {
	
	// �Ű������� ���� Ÿ���� ���� �޼ҵ�
	public void print() {
		System.out.println("�޼ҵ带 ȣ���մϴ�.");
		//���� Ÿ���� ������ retrun�� ����� �� ����
		// ��, return ������ ���� �������
		// retrun�� �ǹ̴� �� �κп��� �޼ҵ� ������ �����ϰ� �����Ѵٴ� �ǹ�
		return;
	}

	public static void main(String[] args) {
		// 
		
		int a = 1;
		int b = 2;
		int result = 0;
		
		// ����� �޼ҵ尡 �ִ� Ŭ������ �ν��Ͻ� ����
		Retrun02 method = new Retrun02();
		method.print();
		method.print();
		method.print();

	}
	// ���� method�� ����Ÿ���� �ִ� �Ͱ� ���� ���� method03, 04 �� method Ŭ������ ��.
}
