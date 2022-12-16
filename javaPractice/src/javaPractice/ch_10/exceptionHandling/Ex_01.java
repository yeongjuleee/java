package javaPractice.ch_10.exceptionHandling;

public class Ex_01 {
	
	// 비정상 종료를 하는데, try ~ catch 를 이용해서
	// 예외를 안전하게 처리하도록 코드를 수정할 것
	
	public static void main(String[] args) {
		int[] arr = new int[10];
	
		for(int i = 0; i < 10; i++) {
			arr[i] = i;
		}
		try {
			for (int i = 0; i < 11; i++) {
				System.out.println(arr[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
