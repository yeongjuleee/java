package javaPractice.ch_07.singleton;


class Rocket {
	// 속성
	int x; // 로켓 위치
	int y; // 로켓 위치
	
	Rocket(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String printInfo() {
		return "x: " + x + ", y: " + y;
	}
	
	void moveUp() {
		y++;
	}
	
	
	// 기능 (메소드)
//	Rocket(int x, int y) { // 현재 로켓의 위치
//							// 클래스와 이름이 같고, 메소드가 대문자로 시작 = 생성자임
//		
//	}
//	
//	printInfo(String ) { // 로켓 정보를 문자열로 변환하는 메소드
//		
//	}
//	
//	moveUp(int x, int y) { // 로켓의 좌표가 증가
//	
//	}
}

public class SingletonTest02 {
	
	// 클래스 작성 및 객체 생성
	// 로켓을 나타내는 Rocket 클래스를 작성하라.
	// Rocket 클래스는 다음과 같은 필드와 메소드를 가진다.
	// #필드
	// x, y : 현재 로켓의 위치
	// # 메소드
	// Rocket(x, y) : 현재 로켓의 위치
	// pirntInfo() : 로켓 정보를 문자열로 변환하는 메소드
	// moveUp() : 로켓의 y 좌표가 1만큼 증가
	
	public static void main(String[] args) {
		Rocket rocket = new Rocket (10, 20);
		System.out.println(rocket.printInfo()); // x: 10, y: 20
		rocket.moveUp();
		rocket.moveUp();
		System.out.println(rocket.printInfo()); // x: 10, y: 22

	}

}
