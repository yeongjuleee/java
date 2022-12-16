package javaPractice.ch_05;

public class Array01 {

	public static void main(String[] args) {
		// 배열: 동일한 데이터 타입만 묶을 수 있음 
		// 개수를 지정해야함.
		
		
		int [] student = new int [3]; // 길이가 3인 배열 생성. new : 새로 생성해 int : 한개의 칸이 메모리 공간임. [3] : 3개 만들어.
		System.out.println("현재 자동으로 초기화된 값: " + student[0]); // 처음 student를 부르면 저장된 값이 없어서 0으로 나옴(???)

		student[0] = 30; // 배열의 첫 번째 요소에 30을 저장
		student[1] = 20; // 배열의 두 번째 요소에 20을 저장
		student[2] = 10; // 배열의 세 번째 요소에 10을 저장
		
		System.out.println("현재 첫 번째 요소의 값: " + student[0]);
		
		for (int i: student) {
			System.out.println(i);
		}
	}

}
