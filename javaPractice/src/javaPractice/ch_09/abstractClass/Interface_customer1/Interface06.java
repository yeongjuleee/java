package javaPractice.ch_09.abstractClass.Interface_customer1;

// 자바 8버전 이후로의 interface 

interface Buy {
	void buy();
	void info();
}

interface Sell {
	void sell();
	void info();
}

class Customer implements Buy, Sell {
	@Override
	public void buy() {
		System.out.println("구매하기");
		
	}

	
	@Override
	public void sell() {
		System.out.println("판매하기");
		
	}

	// 두 인터페이스에 이름이 같은 메소드가 선언되었다고 해도 구현은 클래스에서 이루어짐 
	// => 어떤 메소드를 호출해야 하는지 모호하지 X

	@Override
	public void info() {
		System.out.println("Customer 입니다.");
		
	}
	
}

/*
	한 클래스가 여러 인터페이스를 구현하는 경우,
	한 클래스가 여러 클래스를 상속 받으면 메소드 호출이 모호해지는 문제가 발생할 수 O
	하지만, 인터페이스는 한 클래스가 여러 인터페이스를 구현할 수 O
	인터페이스는 구현 코드나 멤버 변수를 가지지 않기 때문에 여러 개를 동시에 구현할 수 O
	두 인터페이스에 이름이 같은 메소드가 선언되었다고 해도 구현은 클래스에서 이루어짐 
	=> 어떤 메소드를 호출해야 하는지 모호하지 X
*/

public class Interface06 {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// Customer 클래스형인 customer를 Buy 인터페이스형인 buyer에 대입하여 형 변환
		// buyer는 Buy 인터페이스의 메소드만 호출 가능
		Buy buyer = customer;
		buyer.buy();
		//buyer.sell(); 
		// => buyer에는 sell이 없어서 사용할 수 없음.
		
		//Customer 클래스형인 customer를 Sell 인터페이스형인 seller에 대입하여 형 변환
		// seller는 Sell 인터페이스의 메소드만 호출 가능
		Sell seller = (Sell)customer;	// (Sell) 생략 가능 
					 // 명시적 형변환
		seller.sell();
		//seller.buy();
		
		if (seller instanceof Customer) { // seller는 Customer의 객체이다.
			// seller를 하위 클래스 형인 Customer로 다시 형 변환
			
			Customer customer2= (Customer)seller;
			customer2.buy();
			customer2.sell();
		}
		
	}

}
