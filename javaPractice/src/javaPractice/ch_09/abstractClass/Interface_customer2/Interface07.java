package javaPractice.ch_09.abstractClass.Interface_customer2;

// �ڹ� 8 ���ķ��� �������̽�
// customer1�� �ٸ� �� : �������̽� �ȿ� �޼ҵ尡 �� 

interface Buy {
	void buy();
	
	default void order() {
		System.out.println("���� �ֹ�");
	}
}

interface Sell {
	void sell();
	
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
}

class Customer implements Buy, Sell {
	// Duplicate default methods named order 
	// with the parameters () and () are inherited 
	// from the types Sell and Buy
	// => default �޼ҵ��� �̸��� ���� ���� �ִٰ� �ߴ� ���� �߻�.
	
	@Override
	public void buy() {
		System.out.println("�����ϱ�");
		
	}
	
	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
		
	}
	
	// ����Ʈ �޼ҵ尡 �ߺ��� �Ǿ����� �� �������̽��� �����ϴ� Customer Ŭ�������� �����Ǹ� �ؾ���
	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}

}
/*
	1. �� �������̽��� ����Ʈ �޼ҵ尡 �ߺ��� �Ǵ� ���,
	2. �� Ŭ������ ���� ������ �������̽��� ������ ����Ʈ �޼ҵ尡 �ִ� ��� 
	=> �������̵��� �ؾ���
*/

public class Interface07 {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();	// �� �Ǹ� �ֹ�
		
		Sell seller = customer;
		seller.sell();
		buyer.order();	// �� �Ǹ� �ֹ�
		
		if(seller instanceof Customer) { // seller�� Customer�� ��ü�̴�.
			// seller�� ���� Ŭ���� ���� Customer�� �ٽ� �� ��ȯ.
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
			
		}
		customer.order();	// �� �Ǹ� �ֹ�
	}

}
