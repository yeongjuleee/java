package javaPractice.ch_08.car;

public class Polymorphism03 {

	public static void main(String[] args) {
		// instanceof ������
		// a instanceof B : a �� B�� ��ü�̴�.
		
		FireEngine fe = new FireEngine();
		
		if (fe instanceof FireEngine) { // fe�� FireEngine�� ��ü�̴�.
			System.out.println("This is a FireEngine instance");
		}
		
		if (fe instanceof Car) { // fe �� Car �� ��ü�̴�.
			System.out.println("This is a Car instance");
		}
		
		if (fe instanceof Object) { // fe�� Object�� ��ü�̴�.
			System.out.println("This is an Object instance");
		}
		System.out.println();
		
		Car polyFe = new FireEngine(); // ������ ����ؼ� ���� ���� ����.
		if (polyFe instanceof FireEngine) { // polyFe�� FireEngine �� ��ü��
			System.out.println("This is a FireEngine instance");
		}
		
		if (polyFe instanceof Car) { // polyFe�� Car�� ��ü��
			System.out.println("This is a Car instance");
		}
		
		if (polyFe instanceof Object) { // polyFe�� Object�� ��ü�̴�.
			System.out.println("This is an Object instance");
		}
		System.out.println();
		
		Car car = new Car(); // �θ� Ŭ������ ��ü ����
		if(car instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		
		if (car instanceof Car) { // car�� Car�� ��ü�̴�.
			System.out.println("This is a Car instnace");
		}
		
		if (car instanceof Object) { // car�� Object�� ��ü�̴�.
			System.out.println("This is an Object instance");
		}
		

	}

}
