package javaPractice.ch_08;

class Student2 {
	void learn() {
		System.out.println("배우기");
	}
	
	void eat() {
		System.out.println("밥먹기");
	}
	
	void say() {
		System.out.println("안녕하세요, 선생님!"); // 보통의 학생
	}
}

class Leader extends Student2 {
	void lead() {
		
	}

	// 오버라이딩은 자손 클래스에서 부모 클래스로부터 물려받은 메소드를 다시 작성하는 것
	@Override   // 오버라이딩 하는 방법 : 해당 위치에 마우스 우측 => Source => Override/imp... 누르기
	void say() {
		System.out.println("선생님께 인사!"); // 오버라이딩
		//super.say(); 부모 클래스의 메소드 실행.
	}
	
	
	
}





public class InheritanceOverRide01 {

	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.eat(); // 상속받은 메소드 사용
		leader.say(); // 오버 라이딩한 메소드 사용

	}

}
