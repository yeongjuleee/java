package javaPractice.ch_03;

public class Operator03 {

	public static void main(String[] args) {
		// 논리 연산자: 이항 연산자. 
		//항은 boolean 값이며 결과 또한 boolean
		
		//논리곱 : 두개 다 참일 경우 true 
		System.out.println(true && true); // true 1*1 = 1 . 두개 다 참일 경우 true
		System.out.println(true && false); // false  1*0 = 0.  
		System.out.println(false && true); // false 0*1 = 0.
		System.out.println(false && false); // false 0*0 = 0.
		
		//논리합: 두가지 중 하나라도 참이면 true
		System.out.println(true || true); // true 1+1 = 2
		System.out.println(true || false); // true 1+0 = 1
		System.out.println(false || true); // true 0+1 = 1
		System.out.println(false || false ); // false 0+0 = 0
		
		//논리 연산자 활용해보기
		int a = 10;
		System.out.println(5 < a && a < 15); // true && true 로 true임
		System.out.println((5 < a && a < 15) && a % 2 == 0); // true && true로 true 임. (10 % 2 는 10을 2로 나누었을 때 나머지 값 0 인가를 묻는 것임으로 true)
		
		a = 4;
		System.out.println((5 < a && a < 15) && a % 2 == 0); // 5< a 가 false 임으로 false.
		System.out.println((5  < a && a < 15) || a % 2 == 0); // 5 < a 가 false 이고 a % 2 의 경우 나머지가 0 이 되어 true 이기 때문에 true
	}

}
