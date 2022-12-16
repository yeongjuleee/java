package javaPractice.ch_08;

class Tv {
	// �Ӽ�
	boolean power; // ��������(on / off)
	int channel;
	
	// �޼ҵ�
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class CaptionTv extends Tv{
	// �Ӽ�
	boolean caption; // ĸ�ǻ���(on / off)
	
	// �޼ҵ�
	void displayCaption(String text) {  // void�� return ����!
		if (caption) { // ĸ�� ���°� on(true)�̸�, text�� ������
			System.out.println(text); 
		}
	}
}

public class Inheritance03 {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;				// ���� Ŭ�����κ��� ��ӹ��� ���
		ctv.channelUp();				// ���� Ŭ�����κ��� ��ӹ��� ���
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, Hello, Hello!"); 
		ctv.caption = true;							// ĸ�� ����� ��
													// boolean�� �ʱ� ���� false ��. �׷��� true �� �ٲ������,,
		ctv.displayCaption("Hello, Hello, Hello!"); // ĸ���� ȭ�鿡 ������

	}

}
