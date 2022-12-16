package javaPractice.ch_04;

public class If01 {

	public static void main(String[] args) {
		// if 조건문
		// if ( 조건식 ) { 조건이 true 일 때 실행할 실행문 }
		
		int a = 3;
		
		if ( a> 3 ) { // if(조건식)
			
			//조건식이 참일 때 실행
			System.out.println("a는 3보다 큽니다.");
			
		} // if 구문 끝
		
		// 조건식과 상관 없이 무조건 실행
		System.out.println("검사가 끝났습니다.");
	}

}
