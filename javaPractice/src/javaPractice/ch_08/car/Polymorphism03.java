package javaPractice.ch_08.car;

public class Polymorphism03 {

	public static void main(String[] args) {
		// instanceof 연산자
		// a instanceof B : a 는 B의 객체이다.
		
		FireEngine fe = new FireEngine();
		
		if (fe instanceof FireEngine) { // fe는 FireEngine의 객체이다.
			System.out.println("This is a FireEngine instance");
		}
		
		if (fe instanceof Car) { // fe 는 Car 의 객체이다.
			System.out.println("This is a Car instance");
		}
		
		if (fe instanceof Object) { // fe는 Object의 객체이다.
			System.out.println("This is an Object instance");
		}
		System.out.println();
		
		Car polyFe = new FireEngine(); // 다형성 사용해서 참조 변수 만듦.
		if (polyFe instanceof FireEngine) { // polyFe는 FireEngine 의 객체임
			System.out.println("This is a FireEngine instance");
		}
		
		if (polyFe instanceof Car) { // polyFe는 Car의 객체임
			System.out.println("This is a Car instance");
		}
		
		if (polyFe instanceof Object) { // polyFe는 Object의 객체이다.
			System.out.println("This is an Object instance");
		}
		System.out.println();
		
		Car car = new Car(); // 부모 클래스로 객체 생성
		if(car instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		
		if (car instanceof Car) { // car는 Car의 객체이다.
			System.out.println("This is a Car instnace");
		}
		
		if (car instanceof Object) { // car는 Object의 객체이다.
			System.out.println("This is an Object instance");
		}
		

	}

}
