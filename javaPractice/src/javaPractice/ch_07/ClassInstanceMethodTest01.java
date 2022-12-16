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
		MyMath mm = new MyMath(); // 객체생성 => 인스턴스 메소드라는 것을 알려줌
		int result1 = mm.add(5, 3);
		int result2 = mm.subtract(5, 3);
		int result3 = mm.multiply(5, 3);
		double result4 = mm.divide(5, 3);
		
		// double 대신 int 값으로 호출. 이 값은 자동으로 double로 자동 형변환
		System.out.println("add(5, 3) = " + result1);
		System.out.println("subtract(5, 3) = " + result2);
		System.out.println("multiply(5, 3) = " + result3);
		System.out.println("divide(5, 3) = " + result4);

	}

}
