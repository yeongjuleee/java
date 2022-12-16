package javaPractice.ch_09.abstractClass_innerclass;

/*
	로컬 내부 클래스의 정의
	외부 클래스의 메소드 내에서 정의된 클래스
	메소드 호출 시에 생성되고 복귀하면 소멸
	
=> 메소드의 지역 변수는 스택메모리에서 실행되므로 호출 후 복귀하면 소멸.
하지만, 지역 내부 클래스의 객체는 힙(=객체를 생성하면 힙에서 만들어짐)에서 실행 되므로 메소드가 호출이 끝나고 복귀하더라도 살아있음.
	
	로컬 내부 클래스는 프로그래밍에서 거의 사용하지 않음
	이런 내부 클래스가 있다는 정도만 알아두자!
*/

class OutClass_03{
	
	// Runnable 인터페이스를 구현하는 클래스 지역 내부 클래스로 만든 예제
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { 	// 반환형이 Runnable인 메소드 (메소드의 반환형이 객체가 됨 ???)
									// 메소드를 실행할 때에만 클래스를 생성한다. 
		int num = 100;
		// i 와 num은 메소드가 실행되고나면 사라짐.
		
		// Runnable 인터페이스는 자바에서 스레드를 만들 때 사용하는 인터페이스로 javja.lang 패키지에 선언되어 있으며,
		// 반드시 run() 메소드를 구현해야한다.
		
		class MyRunnable implements Runnable {	// 메소드가 종료되어도 살아있음.
			
			int localNum = 10;

			@Override
			public void run() { 
				/*
					지역 내부 클래스가 선언된 메소드의 지역변수는 사용하지 못함
					num = 200; => 에러남. 지역변수는 상수로 바뀜. 값 변경 X but  보는건 가능(=상수화)
					i = 100; => 에러남. 매개 변수 역시 지역변수처럼 상수로 바뀜. 값 변경 X but 보는건 가능(=상수화)
				*/
				
				System.out.println("i = " + i);		// 값 변경은 못해도 보는 것은 가능. 사라지기 전의 값을 기록해둠(???)
				System.out.println("num = " + num);	// 값 변경X, 보는건 가능
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + OutClass_03.sNum + "(외부 클래스 정적 변수)");
			}
		}
		return new MyRunnable();
	}
}

public class local01 {

	public static void main(String[] args) {
		
		OutClass_03 out = new OutClass_03();
		// 외부 클래스 변수 = new 외부클래스()
		Runnable runner = out.getRunnable(10); // => 메소드가 실행되고 메소드안의 로컬 변수는 사라져버림.
		// 내부인터페이스를구현하는클래스 참조변수 = 외부클래스변수.인터페이스를반환하는 메소드();
		runner.run(); // => 하지만 메소드 안에 있는 class는 사라지지 않음. 그래서 상수처럼 class에 값을 기록해둬서 볼 수 있게함.
	}

}
