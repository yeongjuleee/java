package javaPractice.ch_07;

public class Tv {
	// Tv의 속성(멤버 변수)
	String color; // Tv의 색상
	boolean power; // 전원상태(on / off)
	int channel; // 채널
	
	
	// Tv의 기능(메소드)
	void power() { // Tv를 켜거나 끄는 기능을 하는 메소드
		power = !power;
	}
	void channelUp() { // Tv의 채널을 올리는 기능을 하는 메소드
		++channel;
	}
	void channelDown() { // Tv의 채널을 내리는 기능을 하는 메소드
		--channel;
	}

}
