package javaPractice.ch_07;

class MyMath {
	int add (int a, int b) {
		return (a+b);
	}
	int subtract (int a, int b) {
		return (a-b);
	}
	int multiply (int a, int b) {
		return (a*b);
	}
	double divide (double a, double b) {
		return a / b;
	}
}

public class ClassInstanceMethodTest01 {

	public static void main(String[] args) {
		MyMath mm = new MyMath(); // ��ü���� => �ν��Ͻ� �޼ҵ��� ���� �˷���
		int result1 = mm.add(5, 3);
		int result2 = mm.subtract(5, 3);
		int result3 = mm.multiply(5, 3);
		double result4 = mm.divide(5, 3);
		
		// double ��� int ������ ȣ��. �� ���� �ڵ����� double�� �ڵ� ����ȯ
		System.out.println("add(5, 3) = " + result1);
		System.out.println("subtract(5, 3) = " + result2);
		System.out.println("multiply(5, 3) = " + result3);
		System.out.println("divide(5, 3) = " + result4);

	}

}
