package javaPractice.ch_03;

public class OperatorTest03 {

	public static void main(String[] args) {
		//문제, 십의 자리 이하는 버리는 코드
		//변수 value의 값이 356이라면 300이 나올수 있도록 코드 작성. 
		//산술 연산자만 사용 가능!
		
		int value = 356;
		int b = 100;
		System.out.println((value / b) * 100);

	}

}
