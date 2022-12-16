package javaPractice.ch_18.java_util_package;

import java.time.LocalDateTime;

public class Example13 {

	public static void main(String[] args) {
		// Ŭ�������� ���� �� ���ϱ�
		// time ��Ű������ �� �ʵ� ���� ���ϴ� �޼ҵ带 ��� ����
		// isAfter() : ������ ��¥���� ���Ͽ� boolean �� ��ȯ
		// isBefore() : ������ ��¥���� ���Ͽ� boolean �� ��ȯ
		// isEqual() : ���� ��¥���� ���Ͽ� boolean �� ��ȯ
		// until() : ��¥�� �ð��� ���̸� ��ȯ
		// between() : ��ü ��¥�� �ð��� ���̸� ��ȯ

		LocalDateTime ldt1 = LocalDateTime.of(2010, 1, 1, 12, 23, 23, 444);
		System.out.println(ldt1);
		// 2010-01-01T12:23:23.000000444
		
		LocalDateTime ldt2 = LocalDateTime.of(2010, 12, 25, 1, 12, 2, 232);
		System.out.println(ldt2);
		// 2010-12-25T01:12:02.000000232
		
		// ldt1�� ldt2���� ������ ��¥�ΰ�?
		System.out.println(ldt1.isAfter(ldt2));
		// false
		
		// ldt1�� ldt2 ������ ��¥�ΰ�?
		System.out.println(ldt1.isBefore(ldt2));
		// true
		
		// ���� ��¥�ΰ�?
		System.out.println(ldt1.isEqual(ldt2));
		// false
	}

}
