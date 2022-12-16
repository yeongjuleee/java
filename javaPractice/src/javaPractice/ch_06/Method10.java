package javaPractice.ch_06;

public class Method10 {
	// 가변 길이 인자와 일반 인자를 혼합 사용
	// 사용시 주의사항 
	// 1. 가변 길이 인자가 제일 오른쪽에 있어야함
	// 2. 동시에 2개의 가변 길이 인사 사용 X

	static void test(String name, int ... v) {
		System.out.print(name + " : ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		test("신짱구", 98, 85, 88);
		test("흰둥이", 90, 95, 92);
		test("신짱아", 80, 98, 95);

	}

}
