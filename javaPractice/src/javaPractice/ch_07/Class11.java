package javaPractice.ch_07;

public class Class11 {
	// �� ����� ���� ���� �����͸� ����Ѵ� ���α׷�
	// � ��쿡 Ŭ������  ����ϴ°� => �� �ڵ带 ������� Class ����

	public static void main(String[] args) {
		String junkyuAccountName = "�ر�"; // �ر��� ���¸���
		String junkyuAccountNo = "20000909"; // �ر��� ���¹�ȣ
		long junkyuAccountBalance = 30000; // �ر��� ���� �ܰ�
		
		String jihoonAccountName = "����"; // ������ ���¸���
		String jihoonAccountNo = "20000314"; // ������ ���¹�ȣ
		long jihoonAccountBalance = 29000; // ������ ���� �ܰ�
		
		junkyuAccountBalance -= 5000; // �ر԰� 5000�� ����
		jihoonAccountBalance += 1000; // ������ 1000�� ����
		
		System.out.println("�� �ر��� ����");
		System.out.println("  ���¸���: " + junkyuAccountName); // ���¸���: �ر�
		System.out.println("  ���¹�ȣ: " + junkyuAccountNo); // ���¹�ȣ: 20000909
		System.out.println("  �����ܰ�: " + junkyuAccountBalance); // �����ܰ�: 25000
		
		System.out.println("�� ������ ����");
		System.out.println("  ���¸���: " + jihoonAccountName); // ���¸���: ����
		System.out.println("  ���¹�ȣ: " + jihoonAccountNo); // ���¹�ȣ: 20000314
		System.out.println("  �����ܰ�: " + jihoonAccountBalance); // �����ܰ�: 30000
	}

}
