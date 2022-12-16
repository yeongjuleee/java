package javaPractice.ch_07;


public class Class03 {
	//같은 클래스를 가지고 만든 두 객체는 구조는 동일하지만 서로 다른 저장 공간을 가짐

	public static void main(String[] args) {
		Car1 mycar1 = new Car1(); // car 인스턴스 생성
		Car1 mycar2 = new Car1(); // car 인스턴스 하나 더 생성
		
		// 속성 지정
		mycar1.color = "white"; // mycar1 의 색상 white
		mycar2.color = "black"; // mycar2 의 색상 black
		mycar1.speedUp(); // mycar1 엑셀 메소드 호출
		mycar2.wiper(); // mycar2 와이퍼 메소드 호출
		
		//메소드 실행
		System.out.println("mycar1의 색 : " + mycar1.color);
		System.out.println("mycar2의 색 : " + mycar2.color);
		System.out.println("mycar1의 속도 : " + mycar1.speed);
		System.out.println("mycar2의 속도 : " + mycar2.speed);
		System.out.println("mycar1의 와이퍼 작동 여부 : " + mycar1.wiperOn);
		System.out.println("mycar2의 와이퍼 작동 여부 : " + mycar2.wiperOn);

	}

}
