package javaPractice.ch_07.singleton;

public class SingletonTest01 {

	public static void main(String[] args) {
		
		// 생성자의 접근제한자가 private여서 실행 X
		//Singleton singleton1 = new Singleton(); // 컴파일 에러 발생!
		//Singleton singleton2 = new Singleton(); // 컴파일 에러 발생!

		
		//Singelton이 스스로의 객체를 만들어서 사용하도록 함
		Singleton singleton1 = Singleton.getInstance(); 
		Singleton singleton2 = Singleton.getInstance();
		
		if (singleton1 == singleton2) {
			System.out.println("같은 Singleton 객체입니다.");
		}
		else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	
	}

}
