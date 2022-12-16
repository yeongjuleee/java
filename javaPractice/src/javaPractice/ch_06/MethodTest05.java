package javaPractice.ch_06;

public class MethodTest05 {

	// 1. abs() 메소드 완성
	public static int abs(int value) {
		// value의 값이 0 보다 크면 그대로 출력
		
		// 강사님의 답
		// 2개의 경우의 수가 나옴. 줄이기 위해 삼항연산자 사용.
		return (value > 0) ? value : value * -1;
		
		
		//나의 답
		//if (value > 0) {
		//	return value; 
		//}
		//else {
		//	value*-1;
		//}
		// value의 값이 0보다 작으면 부호 변경
		
	}
	
	
	public static void main(String[] args) {
		int value = 5; 
		System.out.println(value + "의 절댓값: " + abs(value));
		value = -10;
		System.out.println(value + "의 절댓값: " + abs(value));

	}

}
