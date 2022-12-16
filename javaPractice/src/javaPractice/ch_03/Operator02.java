package javaPractice.ch_03;

public class Operator02 {

	public static void main(String[] args) {
		// 비교 연산자 
		// 변수를 비교해서 참인지 거짓인지 확인하는 것이 목적
		//결과 값은 true or false.
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a < b); // true
		System.out.println(a > b); // false
		System.out.println(a + b <= c); // true
		System.out.println(a + b >= c); // true
		
		// 비교 연산자에서 문자열의 경우 
		// equals() 메소드를 이용하여 값을 비교.
		
		String c1 = "Hello JAVA!";  // 여기서 c1은 객체임. (변수아닌데 일단 변수라고 하자.)
		
		System.out.println(c1.equals("Hello java!")); // false
		System.out.println(c1.equals("Hello JAVA!")); // true
		
		// == 은 객체의 주소값을 비교함. (c1 이라는 객체가 가진 문자열을 비교 하는 것이 아님. 이후 class 에서 상세 설명.)
		System.out.println(c1 == "Hello java!"); // false
		System.out.println(c1 == "Hello JAVA!"); //true
		

	}

}
