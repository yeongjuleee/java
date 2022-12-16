package javaPractice.ch_08;

class MyParent {
	public void pDispaly() {
		System.out.println("Super Class: Parent's Display");
	}
}

class MyChild extends MyParent {

	
	// 상위 클래스의 메소드를 재정의
	@Override
	public void pDispaly() { 
		// 은닉된 상위 클래스의 메소드를 super로 호출
		super.pDispaly();
		System.out.println("Sub Class: Parent's Display");
	}
	public void cDisplay() {
		System.out.println("Sub Class: Child's Display");
	}
	
	
}

public class InheritanceOverRide02 {

	public static void main(String[] args) {
		MyChild c = new MyChild();
		c.pDispaly(); // 재정의된 하위 클래스의 메소드를 호출
		// Super: Parent's Display
		// Sub Class: Parent's Display

	}

}
