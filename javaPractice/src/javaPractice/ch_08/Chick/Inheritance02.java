package javaPractice.ch_08.Chick;

public class Inheritance02 {

	public static void main(String[] args) {
		GeneralChick generalChick = new GeneralChick();
		generalChick.display();
		
		RedChick redChick = new RedChick();
		redChick.display();
		System.out.println(redChick.x);
		
		// 메소드만 썼는데 멤버 변수를 쓸 수 있음을 알 수 있다.
	}

}
