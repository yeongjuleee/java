package javaPractice.ch_18.java_util_package;

import java.time.LocalDate;

public class Example10 {

	public static void main(String[] args) {
		// Ŭ�������� ���� �� �����ϱ�
		// �� Ŭ�������� �ʵ� ������ Ư�� ������ ������ �� �ִ� �޼ҵ尡 �ִ�.
		// withYear(int)�� ����, withMonth(int) �� ����, withDayofYear(int) ���� �� ����
		// withDayOfMonth(int)���� �� ����
		
		// ��¥�� �����ϴ� �ڵ�
		LocalDate ld = LocalDate.now();
		System.out.println(ld);	
		// 2022-12-16
		
//		LocalDate new_ld = ld.withYear(1999).withMonth(8).withDayOfYear(33);
		// ���ο� ��ü�� ������. => ��� �� �� ����. (�� 3���� ������. withYear, withMonth, withDayOfYear
		// ���� 1999 ��, ���� 8��, ���� ���� 33�Ϸ� ����
		//System.out.println(new_ld);
		// 1999-02-02
		
		System.out.println(ld.withYear(1999).withMonth(8).withDayOfYear(33));
		// 1999-02-02 
		// �̷��� �ۼ��� ��� : ������ ���� �ʾ� ��¸� �ǰ� �ٽ� ���X

	}

}
