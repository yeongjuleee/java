package javaPractice.ch_09.abstractClass_innerclass;
// 내부 클래스
// 윈도우 작업, 안드로이드 작업을 할 때 많이 사용함.
class A {
	class InstanceInner{}	// 내부 클래스
	
	static class Staticlnner{}	// static 내부 클래스. 스태틱 멤버간의 접근 가능
	
	Staticlnner st1 = new Staticlnner();
	
	static void StaticMethod() {
		// 스태틱 멤버가 스태틱 내부 클래스에 접근 가능
		Staticlnner st2 = new Staticlnner();
		
		// 스태틱 멤버는 인스턴스 멤버에 접근 불가
		// InstanceInner ii2 = new InstanceInner(); => 에러 발생
		
	}
	
	void instanceMethod() {
		// 인스턴스 멤버는 모두 접근 가능
		Staticlnner st3 = new Staticlnner();
		InstanceInner ii3 = new InstanceInner();
	}
}

public class Exam01 {


}
