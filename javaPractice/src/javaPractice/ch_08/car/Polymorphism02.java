package javaPractice.ch_08.car;

public class Polymorphism02 {

	public static void main(String[] args) {
		// 다형성과 형변환
		// 자식 타입에서 부모 타입으로 자동 형변환 되지만, 부모에서 자식 타입으로는 명시적 형변환
		
		Car car;
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		
		fe.water();		
		car = fe;		// car = (Car)fe; 에서 형변환이 생략된 형태
		// car.water() => Car 타입의 참조 변수로는 water() 를 호출할 수 X
		
		
		fe2 = (FireEngine)car; // 부모 타입에서 자식 타입으로 대입할 때는 형변환을 해줘야 함
		fe2.water();
		
	}

}
