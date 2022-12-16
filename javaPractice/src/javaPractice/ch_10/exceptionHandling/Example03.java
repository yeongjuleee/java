package javaPractice.ch_10.exceptionHandling;

//finally문 
// 외부와의 연결을 할 때 사용함.

public class Example03 {

	public static void main(String[] args) {
		// 외부로 연결
		int a = 0;
		int b = 2;
		
		try {
			System.out.println("외부로 연결");
			int c = b / a;
			System.out.println("연결 해제");
		}
		catch (ArithmeticException e) {
			System.out.println("오류가 발생했습니다.");
		}
		finally {
			System.out.println("연결 해제");
		}
		System.out.println("여기도 수행됩니다.");
	}

}
