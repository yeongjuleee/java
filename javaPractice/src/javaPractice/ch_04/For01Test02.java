package javaPractice.ch_04;

public class For01Test02 {

	public static void main(String[] args) {
		
		// for문을 이용하여 * 만들기. 
		
		for(int i= 1; i<6; i++ ) {
			System.out.println();
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
		}

	}

}
