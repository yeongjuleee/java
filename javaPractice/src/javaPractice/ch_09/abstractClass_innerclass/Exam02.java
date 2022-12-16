package javaPractice.ch_09.abstractClass_innerclass;

class OuterClass { // 외부 클래스
	int a = 3;
	static int b = 4;
	
	class Inner { // 인스턴스 내부 클래스
		int c = 5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	
	static class StaticInner { // static 내부 클래스
		int d = 6;	// static 내부 클래스는 인스턴스 필드를 가질 수 있음
		static int stat = 10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}

public class Exam02 {

	public static void main(String[] args) {
		// 외부 클래스 사용
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass의 a값 = " + oc.a);	// 3
		
		// static 변수라서 클래스명으로 접근 가능
		System.out.println("OuterClass의 b값 = " + OuterClass.b);	//4
		//System.out.println("OuterClass의 b값 = " + OuterClass.StaticInner.d); => 접근 불가
		System.out.println("OuterClass의 StaticInner의 stat값 = " + OuterClass.StaticInner.stat);
		OuterClass.StaticInner.staticMethod();	// <Static Inner> // 클래스 명으로도 접근 가능
		
		System.out.println("\n====== inner 클래스 접근하기 =====");
		OuterClass oc2 = new OuterClass();	// 외부 클래스의 객체 생성 후 사용
		OuterClass.Inner inner = oc2.new Inner();	// 인스턴스 내부 클래스의 객체 생성
		
		System.out.println("Inner의 c값 = " + inner.c);	// 5
		inner.innerMethod(); 	// <Inner Class>
		
		System.out.println("\n===== static inner 클래스 접근하기 =====");
		OuterClass.StaticInner si = new OuterClass.StaticInner();	// static 내부 클래스의 객체 생성
		// OuterClass 안에 있는 StaticInner클래스 변수 = new OuterClass안에 있는 StaticInner()
		System.out.println("StaticInner의 d값 = " + si.d);	// 6
		si.staticMethod();	// <Static Inner> 클래스, 객체 모두를 사용해 접근 가능

	}

}
