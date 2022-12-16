package javaPractice.ch_07.singleton;

// 실무에서 자주 사용하는 singleton 모습 미리 보기

public class SingletonExample {
	// 정적필드 생성
	private static SingletonExample singleton = null;

	// 생성자 생성
	private SingletonExample() {}
	
	// 정적 메소드 생성
	static SingletonExample getInstance() {
		if(singleton == null) {
            singleton = new SingletonExample();
         }
         return singleton;

	}
}
