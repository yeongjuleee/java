package javaPractice.ch_13.generic;

// ���׸��� ���� ����
// ���׸� Ÿ���� Ư�� ������ �����ؼ� Ÿ���� �Ű� ������ �������� ��� :extends" ���� ����Ͽ� ������ ����
// extends �ڿ� Ŭ������ �ϳ��� �� �� �ְ� �������̽��� ���� �� ��� ����. Ŭ���� ���� �������̽��� ����� ���� ����

interface First {}
interface Second {}
class Third {}
class Fourth implements First {}
class Fifth implements Second {}
class Sixth extends Third {}
class Seventh extends Third implements First, Second {}
class MyBox <T extends Third & First & Second> {} // Third Ŭ������ ��� �ް�, First, Second �������̽��� �����ϴ� ����

class NumberBox<T extends Number> {
	private T number;
	public NumberBox(T number) {
		this.number = number;
	}
	
	public boolean compare (T otherNumber) {
		return number.equals(otherNumber);
	}
}


public class MyGeneric_05 {

	public static void main(String[] args) {
		// MyBox<Fourth> myBox1 = new MyBox<>();	// Compile Error(X)
		// MyBox<Fifth> myBox2 = new MyBox<>();	// Compile Error(X)
		// MyBox<Sixth> myBox3 = new MyBox<>();	// Compile Error(X)
		MyBox<Seventh> myBox4 = new MyBox<>(); // Seventh Ŭ������ Third Ŭ������ ��� �ް�, First, Second �������̽��� �����ϴ� Ŭ����
		
		NumberBox<Integer> nBox = new NumberBox<> (100);
		System.out.println("check = " + nBox.compare(120));
		// NumberBox<String> nBox2 = new NumberBox<>("������"); 
		// String�� Number Ŭ������ ��� X => ��� X
		
	}

}
