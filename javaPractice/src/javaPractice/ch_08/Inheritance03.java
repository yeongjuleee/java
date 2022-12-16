package javaPractice.ch_08;

class Tv {
	// 속성
	boolean power; // 전원상태(on / off)
	int channel;
	
	// 메소드
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class CaptionTv extends Tv{
	// 속성
	boolean caption; // 캡션상태(on / off)
	
	// 메소드
	void displayCaption(String text) {  // void로 return 없음!
		if (caption) { // 캡션 상태가 on(true)이면, text를 보여줘
			System.out.println(text); 
		}
	}
}

public class Inheritance03 {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;				// 조상 클래스로부터 상속받은 멤버
		ctv.channelUp();				// 조상 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, Hello, Hello!"); 
		ctv.caption = true;							// 캡션 기능을 켬
													// boolean의 초기 값은 false 임. 그래서 true 로 바꿔줘야함,,
		ctv.displayCaption("Hello, Hello, Hello!"); // 캡션을 화면에 보여줌

	}

}
