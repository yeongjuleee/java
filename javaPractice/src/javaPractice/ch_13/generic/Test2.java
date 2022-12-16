package javaPractice.ch_13.generic;

import java.util.ArrayList;

/*  타입 불일치에 의한 캐스팅의 불편과 잘못된 캐스팅으로 인한 위험을 제거하기 위해
	자바 5에서 등장한 개념 : 제네릭
	제네릭은 클래스를 인수화하여 임의의 타입에 대해 동작하는 일반적인 알고리즘을 구현
	
	저장하려는 자료형이 제네릭으로 지정된 자료형이 아니면 컴파일 에러 발생
	컴파일 중 실수를 미리 알 수 있다는 것은 중요한 장점. 코드의 안정성 및 생산성 향상에 큰 기여를 함
	
	제네릭의 장점
	1. 컴파일 시 타입을 체크할 수 있음 ( ArrayList 의 경우 타입 선언 X로 할 경우 Object 타입이 되어 다 저장이 되지만, 꺼낼 때 형변환을 해야함)
	2. 캐스팅할 필요가 없어 편의성과 안전성이 향상됨 
	
	제네릭의 단점
	1. 타입이 지정되어 있어 타입대로만 저장할 수 잇음.	*/

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Integer> arNum = new ArrayList<Integer>();
		arNum.add(1);
		//리스트에는 정수형만 저장 가능하고 다른 자료형을 저장하면 컴파일에서 에러 처리
		// arNum.add("문자열");
		int value = arNum.get(0);
		System.out.println(value);

	}

}
