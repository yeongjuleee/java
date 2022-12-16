package javaPractice.ch_07;
//Tv 클래스 이용하기
public class Class07 {

	public static void main(String[] args) {
		// System.out.println("b의 값: " + b); // 20
		
		// 참조 변수의 복사
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1.toString()값은 " + t1.toString() + "입니다.");
		// t1의 문자열 값은 javaPractice.ch_07.Tv@1c4af82c 으로 t1의 번지수임(???)
		System.out.println("t2.toString()값은 " + t2.toString() + "입니다.");
		// t2의 문자열 값은 javaPractice.ch_07.Tv@379619aa 으로 t2의 번지수임(???)
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다."); // 0
		System.out.println("t1의 channel값은 " + t2.channel + "입니다."); // 0
		
		t1.channel = 7; // channel의 값을 7로 줌
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		System.out.println("t1의 channel값은 " + t1.channel + "입니다."); // 7
		System.out.println("t2의 channel값은 " + t2.channel + "입니다."); // 0
		System.out.println();
		
		t1 = t2; // t1이 저장한 주소값을 t2에 저장. 참조 변수라서 동일한 주소를 가르킴
		System.out.println("t1.toString()값은 " + t1.toString() + "입니다.");
		// javaPractice.ch_07.Tv@379619aa
		System.out.println("t2.toString()값은 " + t2.toString() + "입니다.");
		// javaPractice.ch_07.Tv@379619aa
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다."); //0
		System.out.println("t2의 channel값은 " + t2.channel + "입니다."); //0
		System.out.println();
		
		t1.channel = 27; 
		System.out.println("t1의 channel값을 27로 변경하였습니다.");
		System.out.println("t1의 channel값은 " + t1.channel + "입니다."); //27
		System.out.println("t2의 channel값은 " + t2.channel + "입니다."); //27
	}

}
