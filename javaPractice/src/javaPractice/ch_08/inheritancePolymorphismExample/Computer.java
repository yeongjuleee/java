package javaPractice.ch_08.inheritancePolymorphismExample;

public class Computer extends Product {
	Computer() {
		// ���� Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
		super(200); 	// Computer�� ������ 200�������� �Ѵ�.
	}
	
	@Override
	public String toString() {
		return "Computer";
	}

}
