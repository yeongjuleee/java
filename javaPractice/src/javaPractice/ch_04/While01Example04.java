package javaPractice.ch_04;

public class While01Example04 {

	public static void main(String[] args) {
		// 중첩 while을 사용하여 구구단 출력하기
		
		int i = 2;
		while ( i <= 19) {
			System.out.println("***" + i + "단 ***");
			
			int j = 1;
			while(j <= 19) {
				System.out.println(i + " * " + j + " = " + i*j);
				j++;
			}
			System.out.println();
			i++;
		} // end of while(i <=19)

	}

}
