package javaPractice.ch_07;

public class Tv {
	// Tv�� �Ӽ�(��� ����)
	String color; // Tv�� ����
	boolean power; // ��������(on / off)
	int channel; // ä��
	
	
	// Tv�� ���(�޼ҵ�)
	void power() { // Tv�� �Ѱų� ���� ����� �ϴ� �޼ҵ�
		power = !power;
	}
	void channelUp() { // Tv�� ä���� �ø��� ����� �ϴ� �޼ҵ�
		++channel;
	}
	void channelDown() { // Tv�� ä���� ������ ����� �ϴ� �޼ҵ�
		--channel;
	}

}
