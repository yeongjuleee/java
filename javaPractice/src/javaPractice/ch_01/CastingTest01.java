package javaPractice.ch_01;

public class CastingTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//정수와 정수의 연산 결과 값은 정수
		//정수와 실수의 연산 값은 실수
		
		byte kor, math, eng;
		kor = 55;
		math = 99;
		eng = 87;
		
		int sum = kor + math + eng;
		System.out.println("총점 : " + sum ); // 총점 : 241
		
		int avg_01 = sum / 3;
		System.out.println("평균 : " + avg_01); // 평균 : 80

		double avg_02 = sum / 3; //정수 / 정수
		System.out.println("평균 : " + avg_02); // 평균 : 80.0 => 정수 연산으로 값을 나눈 후에 실수에 저장했기 때문.
		
		double avg_03 = (double)sum / 3;  // 실수 / 정수
		System.out.println("평균 : " + avg_03); // 평균 : 80.333333... 
		
		double avg_04 = sum / 3.0; // 정수 / 실수
		System.out.println("평균 : " + avg_04); // 평균: 80.333333...
		
		double avg_05 = (double)sum / 3.0; // 실수 / 실수
		System.out.println("평균 : " + avg_05); // 평균 : 80.3333333...
	}

}
