package javaPractice.ch_07;
//Tv Ŭ���� �̿��ϱ�
public class Class07 {

	public static void main(String[] args) {
		// System.out.println("b�� ��: " + b); // 20
		
		// ���� ������ ����
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1.toString()���� " + t1.toString() + "�Դϴ�.");
		// t1�� ���ڿ� ���� javaPractice.ch_07.Tv@1c4af82c ���� t1�� ��������(???)
		System.out.println("t2.toString()���� " + t2.toString() + "�Դϴ�.");
		// t2�� ���ڿ� ���� javaPractice.ch_07.Tv@379619aa ���� t2�� ��������(???)
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�."); // 0
		System.out.println("t1�� channel���� " + t2.channel + "�Դϴ�."); // 0
		
		t1.channel = 7; // channel�� ���� 7�� ��
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�."); // 7
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�."); // 0
		System.out.println();
		
		t1 = t2; // t1�� ������ �ּҰ��� t2�� ����. ���� ������ ������ �ּҸ� ����Ŵ
		System.out.println("t1.toString()���� " + t1.toString() + "�Դϴ�.");
		// javaPractice.ch_07.Tv@379619aa
		System.out.println("t2.toString()���� " + t2.toString() + "�Դϴ�.");
		// javaPractice.ch_07.Tv@379619aa
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�."); //0
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�."); //0
		System.out.println();
		
		t1.channel = 27; 
		System.out.println("t1�� channel���� 27�� �����Ͽ����ϴ�.");
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�."); //27
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�."); //27
	}

}
