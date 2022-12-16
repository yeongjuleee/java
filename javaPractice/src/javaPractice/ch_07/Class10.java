package javaPractice.ch_07;

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100; // �ܾ�� �ܾ�� _ ���
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	// Tv�� ���(�޼ҵ�)
	void turnOnOff() { // isPowerOn�� ���� true�� false��, false�� true�� ����
		isPowerOn = !isPowerOn;
		
	}
	void volumeUp() { // volume ���� MAX_VOLUME���� ���� ��쿡�� 1 ����
		if (volume < MAX_VOLUME) ++volume; 
		// ���׿����ڷ� �� �� ����
		// volume = (MAX_VOLUME > volume) ? volume + 1 : volume;
	}
	void volumeDown() { // volume ���� MIN_VOLUME���� ���� ��쿡�� 1 ����
		if (volume > MIN_VOLUME) --volume;
		// ���׿����ڷ� �� �� ����
		// volume = (MIN_VOLUME < volume) ? volume - 1 : volume;
	}
	void channelUp() { // channel�� ���� 1 ����, MAX_CHANNEL ���� �ö� �� X
		if (channel < MAX_CHANNEL) ++channel;
		// ���׿����ڷ� �� �� ����
		// channel = (MAX_CHANNEL == channel) ? MAX_CHANNEL : channel + 1;
	}
	void channelDown() { // channel�� ���� 1 ����, MIN_CHANNEL ���� ������ �� X
		if (channel > MIN_CHANNEL) --channel;
		// ���׿����ڷ� �� �� ����
		// channel = (MIN_CHANNEL == channel) ? MIN_CHANNEL : channel - 1;
	}

}

// class Tv

public class Class10 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0; // �ٵ� ���� �׸��� ���ݾ� class��
		System.out.println("CH: " + t.channel + ", VOL: " + t.volume); // CH:100, VOL:0
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH: " + t.channel + ", VOL: " + t.volume); // CH: , VOL:
		
		t.volume = 100;
		
		t.channelUp();
		t.volumeUp();
		System.out.println("CH: " + t.channel + ", VOL: " + t.volume); // CH: , VOL:

	}

}
