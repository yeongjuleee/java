package javaPractice.ch_07;
// Tv 클래스 이용하기

public class Class05 {

	public static void main(String[] args) {
		Tv t; // Tv 인스턴스를 참조하기 위한 변수 t 선언
		t = new Tv(); // Tv 인스턴스를 생성한다.
		t.channel = 7; // Tv 인스턴스의 멤버 변수 channel의 값을 7로 한다.
		t.channelDown(); // Tv 인스턴스의 메소드 channelDown()을 호출한다.
		System.out.println("현재 채널은 " + t.channel + "입니다."); // 현재 채널은 6 입니다.

	}

}
