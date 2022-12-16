package javaPractice.ch_06;

public class Method09 {
	// �������� ����
	// ���� ���� ���ڴ� �޼ҵ� ȣ��� �ڵ����� �迭�� �����ǰ�
	// �迭�� ���ڰ����� ������ �� �迭�� ó���ϴ� ��
	// �ڵ����� �����Ǵ� �迭�� Ÿ���� ����� Ÿ������ �����Ǹ� �迭�� ũ��� ������ ������ ����
	// ������ Ÿ�� ������ �� �� ���� �� ������ 
	// ex) ~ ����(int ... j) 
	
	static void test(int... v) {
		System.out.println(v.length + " : ");
		for(int x : v) {
			System.out.println(x + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		test(1);
		test(1, 2);
		test(1, 2, 3);

	}

}
