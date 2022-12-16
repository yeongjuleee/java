package javaPractice.ch_01;

public class Prologue03 {

	public static void main(String[] args) {
		// 자동형 변환
		
		byte a = 127; // byte가 가질 수 있는 최대값
		int b = a; // 자동형 변환 (byte => int)
		System.out.println(b); // 127
		
		float c = b; // 자동형 변환 (int => float)
		System.out.println(c); // 127.0
		
		// int d =c ; 를 할 경우 float 자료형을 int 변수에 대입하면 자동형변환이 안됨. 값이 손실되기 때문

		// 명시적 형변환 : 개발자가 변수의 자료형을 "강제로" 바꾸는 것 
		// 문법: (변환하고자 하는 타입)변수명
		
		int e = 263;
		System.out.println(e);
		
		byte f = (byte) e; // 명시적 형변환 263 - 256 = 7
		System.out.println(f);
		
		/* 문자열을 기본 타입으로 강제 타입 변환
		 * String은 int나 char 처럼 기본 자료 타입이 아니라 클래스의 객체 형태로 일반적 형변환과 다름 
		 * 혼공자 83p
		 * */
		
		String str = "1a";
		//int value = Integer.parseInt(str); // 문자열에 숫자 외의 문자가 있으면 변환이 되지 않음!!! 
		
		//String => byte
		String str1 = "10";
		byte value1 = Byte.parseByte(str1);
		System.out.println(value1); // 10
		
		//String => short
		String str2 = "200";
		short value2 = Short.parseShort(str2);
		System.out.println(value2); // 200
		
		// String => int
		String str3 = "30000";
		int value3 = Integer.parseInt(str3);
		System.out.println(value3); // 30000
		
		//String => long
		String str4 = "4000000";
		long value4 = Long.parseLong(str4);
		System.out.println(value4); // 4000000
		
		//String => float 
		String str5 = "12.345";
		float value5 = Float.parseFloat(str5);
		System.out.println(value5); // 12.345
		
		//String => double
		String str6 = "12.345";
		double value6 = Double.parseDouble(str6);
		System.out.println(value6); // 12.345
		
		//기본 타입을 문자열로 변환
		String str7 = String.valueOf(10);
		String str8 = String.valueOf(3.14);
		String str9 = String.valueOf(false);
		
		System.out.println("str7 :" + str7); // str7: 10
		System.out.println("str8 :" + str8); // str8: 3.14
		System.out.println("str9 :" + str9); // str9: false
	}

}
