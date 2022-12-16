package javaPractice.ch_07.singleton;

// 싱글톤 (Singleton) :
// 전체 프로그램에서 "!!!단 하나의 객체만!!!" 만들어서 보장해야하는 경우에 사용
// 생성자를 호출한 만큼 객체가 생성되기 때문에
//  !!!싱글턴을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야 함!!!
// 외부에서 생성자를 호출할 수 없도록 생성자가 앞에 private 접근제한자를 풀어줌

// 또한 자신의 타입인 정적 필드를 하나 선언하고 자신의 객체를 생성해 초기화함
// 생성자가 private이지만, 클래스 내부에서는 호출 O
// 정적 필드도 private 접근 제한자를 붙여 외부에서 필드값ㅇ르 변경하지 못하도록 막음

// 대신 !!!외부에서 호출할 수 있는 정적 메소드인 getInstance()를 선언!!!하고,
// 정적 필드에서 참조하고 있는 자신의 객체를 리턴

class Singleton {
	// singleton 만드는 방법
	// 1. 정적필드 생성
	// private static 클래스명 singleton = new 클래스명();
	// 2. 생성자 생성
	// private 클래스명() {}
	// 3. 정적 메소드 생성
	// static 클래스명 getInstance(){
	// return singleton;
	// }
	
	private static Singleton singleton = new Singleton();
	// 제 자신이 객체를 하나 만들어두고, 변경 못하도록 private를 함. 
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
		// 얘로 값을 받아서 변경을 함.. (?)
	}
	
}

public class Singleton01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
