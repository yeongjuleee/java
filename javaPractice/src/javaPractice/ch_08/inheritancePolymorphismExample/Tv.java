package javaPractice.ch_08.inheritancePolymorphismExample;

public class Tv extends Product {
	// 생성자
	Tv() {
		// 조상 클래스의 생성자 Product(int price)를 호출한다. 
		super(100); 		// Tv의 가격을 100 만원으로 한다.
	}

	@Override
	public String toString() {
		return "Tv";
	}
}
