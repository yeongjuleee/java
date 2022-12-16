package javaPractice.ch_07;

class Check {
	// 인스턴스 변수 instanceVariable : iv
	// 클래스 변수 classVariable : cv
	// 인스턴스 메소드 instanceMethod : im
	// 클래스 메소드 classMethod : cm
	
	static int cv = 5; // 클래스 변수
	int iv = 4; // 인스턴스 변수
	
	static void cm() { // 클래스 메소드 : 단서 static
		
	}
	
	void im() { // 인스턴스 메소드
		
	}
	
	static void cm_Imember() { // 클래스 메소드가 인스턴스 멤버에게 접근
		// System.out.println(iv); //에러 발생!
		// im(); // 에러 발생
	}
	
	void im_Cmember() {
		// 인스턴스 메소드가 클래스 멤버에게 접근
		System.out.println(cv);
		cm();
	}
	
	static void cm_Cmemrber() {
		// 클래스 메소드가 클래스 멤버에 접근
		System.out.println(cv);
		cm();
	}
	
	void im_Imember() {
		// 인스턴스 메소드가 인스턴스 멤버에 접근
		System.out.println(iv);
		im();
	}
}

public class ClassInstanceMethod01 {

	public static void main(String[] args) {
		//Check.cm_Imember(); // 에러
		Check.cm_Cmemrber(); // 성공
		
		Check myinstance = new Check();
		myinstance.im_Cmember(); // 성공
		myinstance.im_Imember(); // 성공

	}

}
