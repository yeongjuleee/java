package javaPractice.ch_01;

public class Prologue04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 상수: 프로그램 실행 중 변경할 수 없는 고정된 값. 
		 * 변수와는 다르게 대문자로 선언
		 * 
		 * 문법: final 데이터타입 상수명 = 값;
		 * */
		
		int a =3;
		a = 4;
		
		final double PI = 3.14;
		//PI = 3.15; 에러 발생. PI는 상수로 변할 수 없음!

	}

}
