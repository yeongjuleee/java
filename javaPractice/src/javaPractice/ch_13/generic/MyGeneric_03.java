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

class PairClass<K, V> { // 제네릭을 사용하지 않으면 위의 두 개의 클래스를 따로 만들어야 하지만, 제네릭을 이용하면 하나만 만들면 된다.
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
		PairClass<Integer, String> pairClass1 = new PairClass<>(1, "박지훈");
		PairClass<String, Double> pairClass2 = new PairClass<>("pi", 3.141592);
		pairClass1.display();	// key: 1, value: 박지훈
		pairClass2.display();	// key: pi, value: 3.141592
	}

}
