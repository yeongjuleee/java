package javaPractice.ch_13.generic;

import java.util.ArrayList;

/* 요즘은 제네릭을 쓰지만 동적 배열인 ArrayList를 타입 인수 없이 사용해보면
다른 자료형인 정수와 문자열을 저장하지만, 다 Object의 후손임으로 저장에 문제 X
하지만, 요소를 꺼낼 때는 일일이 캐스팅을 해야함 */


public class Test {

	public static void main(String[] args) {
		ArrayList arNum = new ArrayList(); // 타입 지정 X => Object타입이 됨.
		arNum.add(1); 		// add를 이용하여 0번 idx에 1을 저장함
		arNum.add("문자열"); // add를 이용하여 1번 idx에 "문자열" 이 저장됨
		int value = (int)arNum.get(0); 	// Object 타입의 문제점 : 들고 나올 때 형변환을 해줘야함.
		// int temp = (imt)arNum.get(1);
		System.out.println(value);

		// ArrayList 에 타입을 지정하지 않고 저장할 경우, 저장은 잘 되지만,
		// 저장한 요소를 꺼낼 때 형변환을 하지 않으면 꺼낼 수 없음
		// 이 과정에서 시간이 오래 걸리는 불편함을 초래
		// 실행하기 전까지는 에러가 발생했는지 알 수 없음
	}

}
