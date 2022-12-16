package javaPractice.ch_09.abstractClass.Interface;

/*
인터페이스만 수정

자바 7
	인터페이스에서 추상 메소드와 상수, 이 두가지 요소만 선언해서 사용 할 수 O
	그런데 어떤 인터페이스를 구현한 여러 클래스에서 사용할 메소드가 클래스마다 같은 기능을 제공하는 경우,
	기능이 같다고해도 인터페이스에서 코드를 구현할 수 없음 => 추상 메소드를 선언,
	각 클래스마다 똑같이 그 기능을 반복해서 구현해야 함
	
자바 8
	인터페이스 활용성을 높이기 위해 디폴트 메소드와 정적 메소드 기능 제공
	디폴트 메소드는 인터페이스에서 구현 코드까지 작성한 메소드
	인터페이스를 구현한 클래스에서 기본적으로 제공할 메소드
	인터페이스에서 구현하지만, 이후 인터페이스를 구현한 클래스가 생성되면 그 클래스에서 사용할 기본 기능
	정적 메소드는 인스턴스 생성과 상관 X 사용할 수 있는 메소드
	사용할 때는 인터페이스 이름으로 직접 참조하여 사용

자바 9
	인터페이스에 private 메소드 구현 가능
	private 메소드는 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 X
	따라서 기존에 구현된 코드르르 변경하지 않고 인터페이스를 구현한 클래스에서 공통으로 사용하는 경우
	private 메소드를 사용하면, 코드 재사용성을 높일 수 있음
	또한 클라이언트 프로그램에 제공할 기본 기능을 private 메소드로 구현하기도 함
*/

public interface Calc {
	// 인터페이스에서 선언된 변수는 컴파일 과정에서 상수로 변환됨
	double PI = 3.14;
	int ERROR = -999999999;
	
	// 인터페이스에서 선언한 메소드는 컴파일 과정에서 추상 메소드로 변환됨
	int add(int num1, int num2);
	int substact(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// 인터페이스에 디폴트 메소드 구현
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}
	
	// 정적 메소드 구현
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod(); // static이 있어 사용 가능.
		return total;
	}
	
	private void myMethod( ) {	// 디폴트 메소드에서 사용
								// private 붙은 메소드들은 상속받은 애들은 private로 사용 X
								// 추상 메소드도 private 메소드 사용 X 
								// default 와 static으로 사용할 수 있도록 함...
		
		
		System.out.println("private 메소드 입니다.");
	}
	
	// private 메소드는 코드를 모두 구현해야 하므로 추상 메소드에는 private 예약어를 사용 할 수 X
	// static 예약어는 함께 사용 가능
	private static void myStaticMethod() { // 정적 메소드에서 사용
		System.out.println("private static 메소드 입니다.");
	}
}
