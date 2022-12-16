package javaPractice.ch_13.generic;

class IntString {
	private Integer key;
	private String value;
	
	public IntString(Integer key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public void display() {
		System.out.println("key : " + key + ", value : " + value);
	}
}

class StringDouble {
	private String key;
	private Double value;
	
	public StringDouble(String key, Double value) {
		this.key = key;
		this.value = value;
	}
	
	public void display() {
		System.out.println("key : " + key + ", value : " + value );
	}
}

class PairClass<K, V> { // ���׸��� ������� ������ ���� �� ���� Ŭ������ ���� ������ ������, ���׸��� �̿��ϸ� �ϳ��� ����� �ȴ�.
	private K key;
	private V value;
	
	public PairClass(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public void display() {
		System.out.println("key : " + key + ", value : " + value);
	}
}
public class MyGeneric_03 {

	public static void main(String[] args) {
		PairClass<Integer, String> pairClass1 = new PairClass<>(1, "������");
		PairClass<String, Double> pairClass2 = new PairClass<>("pi", 3.141592);
		pairClass1.display();	// key: 1, value: ������
		pairClass2.display();	// key: pi, value: 3.141592
	}

}
