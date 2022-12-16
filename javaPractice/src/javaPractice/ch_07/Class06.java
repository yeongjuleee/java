package javaPractice.ch_07;
//Tv 클래스 이용하기
public class Class06 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다."); //0
		System.out.println("t1의 channel 값은 " + t2.channel + "입니다."); //0
		
		t1.channel = 7; // channel 값을 7로 함
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다."); //7
		System.out.println("t1의 channel 값은 " + t2.channel + "입니다."); //0

	}

}
