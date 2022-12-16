package javaPractice.ch_09.abstractClass_innerclass;



class Outter2 {
	/*
		익명 내부 클래스
		이름을 사용하지 않는 클래스
			1. 메소드를 호출할 때 생성 되거나
			2. 참조 변수에 대입할 때 new 예약어를 사용하여 생성
	*/
	
	Runnable getRunnable(int i) { // 메소드 선언
		
		int num = 100;
		
		return new Runnable() {		// 1. 메소드를 호출할 때 생성
		// 리턴에 객체 생성을 던져놓음(?)
			
			// 익명 내부 클래스.
			// 리턴 용도로만 사용할 것 -> 익명 내부 함수 사용. 
			// 클래스를 바로 생성

			@Override
			public void run() {
				//num = 200; 	에러남
				// i = 10; 		에러남
				System.out.println(i);
				System.out.println(num);
			} 
			
		};// 클래스 끝에 ; 사용
	}
	
	Runnable runner = new Runnable() { // 2. 참조 변수에 대입할 때 new 예약어를 사용하여 생성
		// 익명 내부 클래스. 객체 생성시 run() 메소드만 오버라이딩해서 사용
		
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");
			
		} 
		
	};	// 클래스 끝에 ; 사용
	
	
}
public class AnonymousClass01 {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
		
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		
		out.runner.run(); 	// Runnable이 구현된 익명 클래스 변수	
		// 객체.내부객체.메소드() 형식으로 접근

	}

}
