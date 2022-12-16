package javaPractice.ch_18.java_util_package;

import java.time.LocalDate;

public class Example11 {

	public static void main(String[] args) {
		// 1900�� ���� 2100�� ���� ������ ���� �ִ���, ������� �˾ƺ��� �ڵ�
		LocalDate localDate = LocalDate.now();
		LocalDate localDate1;
		int count = 0;	// ������ Ƚ�� ����
		
		for (int i = 1900; i <= 2100; i++) {
			localDate1 = localDate.withYear(i);	// ���� i�� ����
			if(localDate1.isLeapYear()) { // isLeapYear() �޼ҵ� : �����̸� true ��ȯ
				System.out.println(localDate1.getYear() + "�� �����Դϴ�.");
				count++;	// ������ ��� 1 ����
			}
		}
		
		System.out.println("1900����� 2100�� ���� ������ �� " + count + "�� �ֽ��ϴ�." );
		// 2088�� �����Դϴ�.
		// 2092�� �����Դϴ�.
		// 2096�� �����Դϴ�.
		// 1900����� 2100�� ���� ������ �� 49�� �ֽ��ϴ�.
		
	}

}
