package javaPractice.ch_08.inheritancePolymorphismExample;

public class Tv extends Product {
	// ������
	Tv() {
		// ���� Ŭ������ ������ Product(int price)�� ȣ���Ѵ�. 
		super(100); 		// Tv�� ������ 100 �������� �Ѵ�.
	}

	@Override
	public String toString() {
		return "Tv";
	}
}
