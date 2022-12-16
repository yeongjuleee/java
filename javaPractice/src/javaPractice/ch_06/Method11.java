package javaPractice.ch_06;

public class Method11 {

	// 메소드 내에서 메소드 호출
	// 메소드에서 다른 메소드를 호출하면 메소드는 동작을 멈추고, 다른 메소드가 종료될 때까지 기다림
	// 호출한 메소드가 종료가 되면 나머지 코드 실행.
	
	//진행순서
	// main() => firstMethod() => secondMethod()
	
	// main method에서 firstmethod를 호출 => main method 대기 => firstmethod란으로 이동 => firstmethod에서 secondmethod 호출 
	// => firstmethod 대기 => secondmethod 시작 => secondmethod 종료 => firstmethod 진행  => firstmethod 종료 => main method 진행
	// => mainmethod 종료
	
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음");
		firstMethod();
		System.out.println("main(String[] args)이 끝났음");

	}
	
	static void firstMethod() {
		System.out.println("firstMethod()이 시작되었음");
		secondMethod();
		System.out.println("firstMethod()이 끝났음");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()이  시작되었음");
		System.out.println("secondMethod()이 끝났음");
	}

}
