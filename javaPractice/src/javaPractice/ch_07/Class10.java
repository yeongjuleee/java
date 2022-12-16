package javaPractice.ch_07;

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100; // 단어와 단어면 _ 사용
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	// Tv의 기능(메소드)
	void turnOnOff() { // isPowerOn의 값을 true를 false로, false를 true로 변경
		isPowerOn = !isPowerOn;
		
	}
	void volumeUp() { // volume 값을 MAX_VOLUME보다 낮을 경우에는 1 증가
		if (volume < MAX_VOLUME) ++volume; 
		// 삼항연산자로 할 수 있음
		// volume = (MAX_VOLUME > volume) ? volume + 1 : volume;
	}
	void volumeDown() { // volume 값을 MIN_VOLUME보다 높을 경우에는 1 감소
		if (volume > MIN_VOLUME) --volume;
		// 삼항연산자로 할 수 있음
		// volume = (MIN_VOLUME < volume) ? volume - 1 : volume;
	}
	void channelUp() { // channel의 값을 1 증가, MAX_CHANNEL 보다 올라갈 수 X
		if (channel < MAX_CHANNEL) ++channel;
		// 삼항연산자로 할 수 있음
		// channel = (MAX_CHANNEL == channel) ? MAX_CHANNEL : channel + 1;
	}
	void channelDown() { // channel의 값을 1 감소, MIN_CHANNEL 보다 내려갈 수 X
		if (channel > MIN_CHANNEL) --channel;
		// 삼항연산자로 할 수 있음
		// channel = (MIN_CHANNEL == channel) ? MIN_CHANNEL : channel - 1;
	}

}

// class Tv

public class Class10 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0; // 근데 볼륨 항목이 없잖아 class에
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
