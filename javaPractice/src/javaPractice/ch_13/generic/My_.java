package javaPractice.ch_13.generic;

class MyClass01 {
	void sum (int a, int b) {	// �����ε�. ���� ���ο��� �Է��ϸ� ���� �����
		System.out.println(a);
		System.out.println(b);
	}
	
	void sum (float a, float b) {
		System.out.println(a);
		System.out.println(b);
	}
}

class MyClass02<T, V> {
	// ���׸��� ����ϴ� sum() �޼ҵ� �ۼ��ϱ�
	void sum(T a, V b) {
		// void ����(Ÿ�� �Ű�����, Ÿ�� �Ű�����)
		System.out.println(a);
		System.out.println(b);
	}
}

public class My_ {

	public static void main(String[] args) {
		int a = 10, b = 20;
		float c = 11.1f, d = 12.1f;
		
		MyClass01 mc1 = new MyClass01();
		mc1.sum(a, b);
		mc1.sum(c, d);
		
		MyClass02 mc2 = new MyClass02();
		mc2.sum(a, b); // �Ű������� ���� �ʿ��� Ÿ���� ����� ��
		mc2.sum(c, d);
	}

}
