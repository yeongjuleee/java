package javaPractice.ch_09.abstractClass.Interface_customer1;

// �ڹ� 8���� ���ķ��� interface 

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
		System.out.println("�����ϱ�");
		
	}

	
	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
		
	}

	// �� �������̽��� �̸��� ���� �޼ҵ尡 ����Ǿ��ٰ� �ص� ������ Ŭ�������� �̷���� 
	// => � �޼ҵ带 ȣ���ؾ� �ϴ��� ��ȣ���� X

	@Override
	public void info() {
		System.out.println("Customer �Դϴ�.");
		
	}
	
}

/*
	�� Ŭ������ ���� �������̽��� �����ϴ� ���,
	�� Ŭ������ ���� Ŭ������ ��� ������ �޼ҵ� ȣ���� ��ȣ������ ������ �߻��� �� O
	������, �������̽��� �� Ŭ������ ���� �������̽��� ������ �� O
	�������̽��� ���� �ڵ峪 ��� ������ ������ �ʱ� ������ ���� ���� ���ÿ� ������ �� O
	�� �������̽��� �̸��� ���� �޼ҵ尡 ����Ǿ��ٰ� �ص� ������ Ŭ�������� �̷���� 
	=> � �޼ҵ带 ȣ���ؾ� �ϴ��� ��ȣ���� X
*/

public class Interface06 {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// Customer Ŭ�������� customer�� Buy �������̽����� buyer�� �����Ͽ� �� ��ȯ
		// buyer�� Buy �������̽��� �޼ҵ常 ȣ�� ����
		Buy buyer = customer;
		buyer.buy();
		//buyer.sell(); 
		// => buyer���� sell�� ��� ����� �� ����.
		
		//Customer Ŭ�������� customer�� Sell �������̽����� seller�� �����Ͽ� �� ��ȯ
		// seller�� Sell �������̽��� �޼ҵ常 ȣ�� ����
		Sell seller = (Sell)customer;	// (Sell) ���� ���� 
					 // ����� ����ȯ
		seller.sell();
		//seller.buy();
		
		if (seller instanceof Customer) { // seller�� Customer�� ��ü�̴�.
			// seller�� ���� Ŭ���� ���� Customer�� �ٽ� �� ��ȯ
			
			Customer customer2= (Customer)seller;
			customer2.buy();
			customer2.sell();
		}
		
	}

}
