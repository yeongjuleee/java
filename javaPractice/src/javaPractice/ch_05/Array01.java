package javaPractice.ch_05;

public class Array01 {

	public static void main(String[] args) {
		// �迭: ������ ������ Ÿ�Ը� ���� �� ���� 
		// ������ �����ؾ���.
		
		
		int [] student = new int [3]; // ���̰� 3�� �迭 ����. new : ���� ������ int : �Ѱ��� ĭ�� �޸� ������. [3] : 3�� �����.
		System.out.println("���� �ڵ����� �ʱ�ȭ�� ��: " + student[0]); // ó�� student�� �θ��� ����� ���� ��� 0���� ����(???)

		student[0] = 30; // �迭�� ù ��° ��ҿ� 30�� ����
		student[1] = 20; // �迭�� �� ��° ��ҿ� 20�� ����
		student[2] = 10; // �迭�� �� ��° ��ҿ� 10�� ����
		
		System.out.println("���� ù ��° ����� ��: " + student[0]);
		
		for (int i: student) {
			System.out.println(i);
		}
	}

}
