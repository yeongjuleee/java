package javaPractice.ch_06;

public class Retrun02 {
	
	// 매개변수와 리턴 타입이 없는 메소드
	public void print() {
		System.out.println("메소드를 호출합니다.");
		//리턴 타입이 없더라도 retrun을 사용할 수 있음
		// 단, return 다음에 값이 없어야함
		// retrun의 의미는 이 부분에서 메소드 실행을 종료하고 복귀한다는 의미
		return;
	}

	public static void main(String[] args) {
		// 
		
		int a = 1;
		int b = 2;
		int result = 0;
		
		// 사용할 메소드가 있는 클래스의 인스턴스 선언
		Retrun02 method = new Retrun02();
		method.print();
		method.print();
		method.print();

	}
	// 이후 method에 리턴타입이 있는 것과 없는 것은 method03, 04 등 method 클래스로 함.
}
