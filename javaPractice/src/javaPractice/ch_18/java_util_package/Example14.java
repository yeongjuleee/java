package javaPractice.ch_18.java_util_package;

import java.math.BigDecimal;

public class Example14 {
	// BigDecimal : ��Ȯ�� �Ҽ��� ������ �ؾ��� �� BigDecimal Ŭ������ ���
	// double, long ���� �Ҽ��� ������ �� �� ������ ���� �κ��� �����Ѵ�.
			
	public static void main(String[] args) {
		double a = 24.3953;
		double b = 50.343998;
		System.out.println(a + b);
		// 74.73929799999999
		
		
		BigDecimal number = new BigDecimal(String.valueOf(a));
		// double�� �ڷḦ ���ڿ��� ��ȯ �� BigDecimal�� ��ü ����
		
		BigDecimal number2 = new BigDecimal(String.valueOf(b));
		// add() �޼ҵ带 Ȱ���Ͽ� ��Ȯ�� ��� ���� ��ȯ
		System.out.println(number.add(number2));
		// 74.739298
		

	}

}
