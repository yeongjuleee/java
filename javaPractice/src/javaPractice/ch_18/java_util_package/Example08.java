package javaPractice.ch_18.java_util_package;

import java.time.LocalDate;

public class Example08 {

	/*  java.time ��Ű��
	 	���߿� �߰��� ��Ű���� ������ Date �� Calendar ������
	 	
	 	java.time : ��¥�� �ð��� ��Ÿ���� LocalDate, LocalTime ���� ������ ��Ű��
	 	java.time.format: ��¥�� �ð��� �ǽ��ϰ� �������ϴ� API ����
	 	java.time.chrono: �������� �޷� �ý����� ����� �� �ִ� API ����
	 	java.time.temporal: ��¥�� �ð��� �����ϱ� ���� API ����
	 	java.time.zone: Ÿ������ �����ϴ� API ����
	 	
	 	java.time ��Ű������ ��¥�� �ð��� ������ �� O
	 	Ŭ�������� immutable(�Һ�ȯ) �Ӽ��� �ֱ⶧���� ��¥�� �ð��� �����ϰ� �Ǹ�
	 	�����δ� �����ϴ� ���� �ƴ϶� ���ο� ��ü�� ��ȯ��
	 */
	
	public static void main(String[] args) {
		/*  LocalDate Ŭ���� 
		 	��¥ ������ ����. ��¥ ������ �����ϴ� ���
		 	1. ���� ��¥�� �����ϴ� now() �޼ҵ� ��� 
		 	2. Ư�� ��¥�� �����ϴ� of() �޼ҵ� ���
		 	
		 	��¥�� ���ϰ� ���� �޼ҵ带 Ȯ���ϴ� �ڵ�
		 	�⵵ ���� : minusYears(long) 	<-> plusYear(long) 
		 	�� ���� : minusMonth(long)		<-> plusMonth(long)
		 	�� ���� : minusDays(long)		<-> plusDays(long)
		 	�� ���� : minusWeeks(long)		<-> plusWeeks(long)	 	
		 */
		
		LocalDate ld = LocalDate.now();	// ���� ��¥�� ����
		System.out.println(ld);	// 2022-12-16
		
		// 2���� ���� 3���� ���ϰ� 4���� ��
		LocalDate ld2 = ld.minusYears(2).plusMonths(3).minusDays(4);
		System.out.println(ld2);
		// 2021-03-12
		
		// �ڵ���ȯ
		LocalDate ld3 = ld2.minusDays(3);	//ld2���� 3���� ��
		System.out.println(ld3);
		// 2021-03-09
		
		// �� ���ϱ�
		LocalDate ld4 = ld3.plusWeeks(3);	// ld3���� 3�ָ� ����
		System.out.println(ld4);
		// 2021-03-30
	}

}
