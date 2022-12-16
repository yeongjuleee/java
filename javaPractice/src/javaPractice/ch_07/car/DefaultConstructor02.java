package javaPractice.ch_07.car;

// 생성자에서 다른 생성자 호출하기

public class DefaultConstructor02 {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car ("blue");
		
		System.out.println("c1의 color= " + car1.color + ", gearType=" 
				+ car1.gearType + ", door = " + car1.door);
		// c1의 color = white, gearType = auto, door = 4
		System.out.println("c2의 color= " + car2.color + ", gearType=" 
				+ car2.gearType + ", door = " + car2.door);
		// c2의 color = blue, gearType = auto, door = 4
		

	}

}
