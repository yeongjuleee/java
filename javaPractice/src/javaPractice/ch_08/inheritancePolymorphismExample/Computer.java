package javaPractice.ch_08.inheritancePolymorphismExample;

public class Computer extends Product {
	Computer() {
		// 조상 클래스의 생성자 Product(int price)를 호출한다.
		super(200); 	// Computer의 가격을 200만원으로 한다.
	}
	
	@Override
	public String toString() {
		return "Computer";
	}

}
