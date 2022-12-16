package javaPractice.ch_09.abstractClass.Interface_customer2;

// 자바 8 이후로의 인터페이스
// customer1과 다른 점 : 인터페이스 안에 메소드가 들어감 

interface Buy {
	void buy();
	
	default void order() {
		System.out.println("구매 주문");
	}
}

interface Sell {
	void sell();
	
	default void order() {
		System.out.println("판매 주문");
	}
}

class Customer implements Buy, Sell {
	// Duplicate default methods named order 
	// with the parameters () and () are inherited 
	// from the types Sell and Buy
	// => default 메소드의 이름이 같은 것이 있다고 뜨는 오류 발생.
	
	@Override
	public void buy() {
		System.out.println("구매하기");
		
	}
	
	@Override
	public void sell() {
		System.out.println("판매하기");
		
	}
	
	// 디폴트 메소드가 중복이 되었으니 두 인터페이스를 구현하는 Customer 클래스에서 재정의를 해야함
	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}

}
/*
	1. 두 인터페이스의 디폴트 메소드가 중복이 되는 경우,
	2. 한 클래스가 다중 구현한 인터페이스에 동일한 디폴트 메소드가 있는 경우 
	=> 오버라이딩을 해야함
*/

public class Interface07 {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();	// 고객 판매 주문
		
		Sell seller = customer;
		seller.sell();
		buyer.order();	// 고객 판매 주문
		
		if(seller instanceof Customer) { // seller는 Customer의 객체이다.
			// seller를 하위 클래스 형인 Customer로 다시 형 변환.
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
			
		}
		customer.order();	// 고객 판매 주문
	}

}
