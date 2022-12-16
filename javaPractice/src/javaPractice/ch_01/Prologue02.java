package javaPractice.ch_01;

public class Prologue02 {

	public static void main(String[] args) {
		/* + 연산에서의 문자열 자동 변환
		 * + 연산자는 두 가지 기능이 있음
		 * 1. 피연산자가 숫자일 경우에는 덧셈 연산
		 * 2. 피연산자 중 하나라도 문자열이라면 나머지 피연산 또한 문자열로 자동 변환 되어 문자열 결합 연산 수행  */
		
		//숫자 결합 연산
		int value = 10 + 2 + 8;
		System.out.println("value : " + value); // 20
		
		//문자 결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1); // 128
		//연산자는 왼쪽에서 오른쪽으로 순서대로 실행되기 때문에
		//12 + "8" 이 되어 128
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2); // 1028
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3 :" + str3); //1028 : "102" + 8 
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4 :" + str4); // 1010: "10" + 10 ( 괄호가 먼저 계산됨)
		
		// 예상해보기 
		String a = 7 + " "; //7 
		String b = " " + 7; // 7
		String c = 7 + ""; //7
		String d = "" + 7; //7
		String e = "" + ""; // 
		String f = 7 + 7 + ""; // 14
		String g = "" + 7 + 7; // 77
		
		System.out.println(a); //결과: 7
		System.out.println(b); //결과:  7
		System.out.println(c); //결과: 7
		System.out.println(d); //결과: 7
		System.out.println(e); //결과:
		System.out.println(f); //결과: 14
		System.out.println(g); //결과: 77 : "7" + 7 이되어서 77
		
	}

}
