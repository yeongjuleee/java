package javaPractice.ch_09.abstractClass.Interface;

/*
	�������̽� interface�� Ŭ���� Ȥ�� ���α׷��� �����ϴ� ����� ��������� �����ϴ� ����
	�������̽��� �߻� �޼ҵ�� ����θ� �̷����
	������ �ڵ尡 ���� ������ �翬�� �������̽��� �ν��Ͻ��� ������ �� X
*/

public class Test {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substact(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		System.out.println("====================================");
		calc.showInfo();
		calc.description();
		System.out.println("====================================");
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
	}
}
