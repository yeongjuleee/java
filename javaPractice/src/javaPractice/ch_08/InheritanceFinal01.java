package javaPractice.ch_08;

/*
final 변수 : 값을 더 이상 변경 X 상수
final 메소드 : 내용을 더 이상 변경 X 메소드. 오버라이딩 X
final 클래스 : 내용을 더 이상 변경 X 클래스. 상속 X
*/

final class FinalClass {
	final int number = 4; // 상수 
	
}

class Parents { // extends FinalClass 에러 발생
	final void finalMethod() { // 오버라이딩 불가한 메소드
		System.out.println("상속 불가능한 메소드");
	}
}

class Son extends Parents {
	// void finalMethod() 에러 발생
}

public class InheritanceFinal01 {

	public static void main(String[] args) {
		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
		// member1.number = 5; // 상수는 변경 X

	}

}
