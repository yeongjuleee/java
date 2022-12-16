package javaPractice.ch_18.java_util_package;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Example12 {
	/*  with() �޼ҵ�� TemporalAjusters Ÿ���� ���ڷ� ������ Ư�� ��¥�� �����Ѵ�
 	firstDayOfYear() : �⵵�� ù ��° ��
 	lastDayOfYear() : �⵵�� ������ ��
 	firstDayOfMonth() : ���� ù��° ��
 	lastDayOfMonth() : ���� ������ ��
 	firstInMonth(DayofWeek dayOf week) : ���� ù ��° ����
 	lastInMonth(DayOfWeek dayOfWeek) : ���� ������ ����
 	next(DayOfWeek dayOfWeek) : ���ƿ��� ���� 
 	nextOrSame(DayOfWeek dayOfWeek) : ������ ������ ���ƿ��� ����
 	previous(DayOfWeek dayOfWeek) : ���� ����
 	previouOrSame(DayOfWeek dayOfWeek) : ������ ������ ���� ����  
 */
	public static void main(String[] args) {
	LocalDateTime ldt = LocalDateTime.now();
	System.out.println(ldt);
	// 2022-12-16T15:15:43.551975400
	LocalDateTime new_ldt;
	
	new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear());	// �⵵�� ù ��° ��
	System.out.println("������ ù ��° ��: " + new_ldt);
	// ������ ù ��° ��: 2022-01-01T15:20:40.274279200
	
	new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear());	// �⵵�� ������ ��
	System.out.println("������ ������ �� : " + new_ldt);
	// ������ ������ �� : 2022-12-31T15:20:40.274279200
	
	new_ldt =ldt.with(TemporalAdjusters.firstDayOfMonth());	// ���� ù��° ��
	System.out.println("�̹� ���� ù��° �� : " + new_ldt);
	// �̹� ���� ù��° �� : 2022-12-01T15:20:40.274279200
	
	new_ldt =ldt.with(TemporalAdjusters.lastDayOfMonth());	// ���� ������ ��
	System.out.println("�̹� ���� ������ �� : " + new_ldt);
	// �̹� ���� ������ �� : 2022-12-31T15:20:40.274279200
	
	new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));	// ���� ù ��° ����
	System.out.println("�̹� ���� ù ������ : " + new_ldt);
	// �̹� ���� ù ������ : 2022-12-05T15:20:40.274279200
	
	new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));	// ���� ������ ����
	System.out.println("�̹� ���� ������ �Ͽ��� : " + new_ldt);
	// �̹� ���� ������ �Ͽ��� : 2022-12-25T15:20:40.274279200
	
	new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));	// ���ƿ��� ����
	System.out.println("���ƿ��� �ݿ��� : " + new_ldt);
	// ���ƿ��� �ݿ��� : 2022-12-23T15:20:40.274279200

	new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));	// ������ ������ ���ƿ��� ����
	System.out.println("������ ������ ���� �ݿ��� : " + new_ldt);
	// ������ ������ ���� �ݿ��� : 2022-12-18T15:20:40.274279200
	
	new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));	// ���� ����
	System.out.println("���� ������ : " + new_ldt);
	// ���� ������ : 2022-12-12T15:20:40.274279200
	
	new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));	// ������ ������ ���� ����
	System.out.println("������ ������ ���� ������ : " + new_ldt);
	// ������ ������ ���� ������ : 2022-12-12T15:20:40.274279200
	}

}
