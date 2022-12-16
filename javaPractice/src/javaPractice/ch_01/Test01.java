package javaPractice.ch_01;

public class Test01 {

	public static void main(String[] args) {
		// 형변환을 활용하여 문제 풀기
		
		/* int result = 에 대하여 
		 * 1. 변수 4개를 모두 사용하여 
		 * 2. 사칙연산 중 + 연산자만 사용하여 
		 * 3. 9가 나오는 코드를 완성하라.
		 */
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9"; // 힌트! 문자열을 숫자로 변환해야함
		
		// 오답: int result = (int)var1 +  (int)var2 + (int)var3 + Integer.parseInt(var4);
		// 정답: int result = (int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4);
		
		//int A = (int)var1;
		//int B = (int)var2;
		//int C = (int)var3;
		double d = Double.parseDouble(var4);
		System.out.println(d);
		
		double a = var2 + var3;
		System.out.println(a); // 4.29999
		
		int result = (int)var1 + (int)a + (int)d;
		
		System.out.println(result);

	}

}
