package javaPractice.ch_06;

public class Method10 {
	// ���� ���� ���ڿ� �Ϲ� ���ڸ� ȥ�� ���
	// ���� ���ǻ��� 
	// 1. ���� ���� ���ڰ� ���� �����ʿ� �־����
	// 2. ���ÿ� 2���� ���� ���� �λ� ��� X

	static void test(String name, int ... v) {
		System.out.print(name + " : ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		test("��¯��", 98, 85, 88);
		test("�����", 90, 95, 92);
		test("��¯��", 80, 98, 95);

	}

}
