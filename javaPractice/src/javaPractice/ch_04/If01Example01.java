package javaPractice.ch_04;

public class If01Example01 {

	public static void main(String[] args) {
		// If 조건문을 삼항연산자로 바꿔 출력하기
		// 삼항연산자 (조건식?항목1:항목2)로 조건만들어 해보기.
		
		int age = 15;
		String a = "성인입니다. \n성인요금이 적용됩니다.";
		String b = "청소년입니다 \n청소년 요금이 적용됩니다.";
		
		System.out.println( age > 19? a:b  );
		System.out.println("결제를 진행해 주세요.");
		
		// 강사님의 답: 
		// System.out.println(age > 19 ? "성인입니다. \n성인요금이 적용됩니다." : "청소년입니다. \n청소년 요금이 적용됩니다.");
		// System.out.println("결제를 진행해 주세요.");
	}

}
