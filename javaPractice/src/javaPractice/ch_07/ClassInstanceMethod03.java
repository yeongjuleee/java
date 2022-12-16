package javaPractice.ch_07;

class Card {
	String kind; // ī���� ���� : �ν��Ͻ� ����
	int number; // ī���� ����: �ν��Ͻ� ����
	static int width = 100; // ī���� �� : Ŭ���� ����
	static int height = 250; // ī���� ���� : Ŭ���� ����
}

public class ClassInstanceMethod03 {

	public static void main(String[] args) {
		// Ŭ���� ����(static ����)�� ��ü�������� 'Ŭ�����̸�.Ŭ��������'�� ���� ��� ����
		System.out.println("Card.width =" + Card.width); // 100;
		System.out.println("Card.height =" + Card.height); // 250;
		
		// �ν��Ͻ� ������ ����ϱ� ���� ��ü ����
		Card c1 = new Card(); 
		c1.kind = "Heart";
		c1.number = 9;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number +
				"�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		// c1�� Heart, 9�̸�, ũ��� (100, 250)
		System.out.println("c2�� " + c2.kind + ", " + c2.number +
				"�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		// c2�� Spade, 4�̸�, ũ��� (100, 250)
		
		System.out.println("���� c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number
				+ "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		// c1�� Heart 9�̸�, ũ��� (50, 80)
		
		System.out.println("c2�� " + c2.kind + ", " + c2.number
				+ "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		// c2�� Spade 4�̸�, ũ��� (50, 80)

	}

}
