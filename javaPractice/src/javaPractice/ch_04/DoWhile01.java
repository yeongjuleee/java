package javaPractice.ch_04;

public class DoWhile01 {

	public static void main(String[] args) {
		
		// Do~while문 기초
		
		int num = 100;
		
		do { 
			System.out.println("적어도 한번은 출력되는 문장");
			// 먼저 do를 최초 한번은 실행하고 그 다음 while의 조건을 비교.
			// 조건이 참이면 다시 do 로 올라와 실행 > while 조건비교  순으로 반복함.
		} while(num < 10);

	}

}
