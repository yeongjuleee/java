package javaPractice.ch_07;
// 패키지에는 동일한 클래스 1개만 할 수 있음. (??)
// 같은 패키지 내에 존재 한다면 따로 불러오는 과정이 필요 X
// 클래스는 첫 문자를 다 대문자로 넣어야만 해! 그냥 그런거임

class Car1 {
	// 속성적기
	boolean powerOn; // 자동차 시동 변수. 시동 켜기/안 켜기 2가지 값만 존재하면 되니까 boolean
	String color; // 차량의 색깔
	int wheel; // 바퀴의 수. 수는 대부분 정수이니까 int
	int speed; // 속력 또한 수로 확인 => int
	boolean wiperOn; // wiper를 작동하고 안 하고 의 동작 2가지 경우임 => boolean 으로 2가지 경우 함
	
	
	// 메소드 적기
	void power() { // void = return 값이 없음을 알 수 있음
		powerOn = !powerOn; // 시동 메소드. powerOn의 타입은 boolean 임. 그래서 참 거짓 으로 두 가지 
	}
	void speedUp() {
		speed++; // 엑셀 메소드. speed는 속력으로 int 타입임. 
	}
	void speedDown() {
		speed--; // 브레이크 메소드. 
	}
	void wiper() {
		wiperOn = !wiperOn; // 와이퍼 메소드. 
	}
}

public class Class01 {

	public static void main(String[] args) {
		

	}

}
