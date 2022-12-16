package javaPractice.ch_18.java_util_package;

import java.util.Calendar;

/*  Calendar Ŭ������ �޷��� ǥ���� Ŭ�����̴�.
 	Calendar Ŭ������ �̿��Ͽ� ���� �ð��� �������� �����϶�
 	���� ��� : 
 	2022�� 12�� 16��
 	�ݿ��� ���� 11�� .. ��
 */

public class Exam01 {
	public static String getDayToStr(int day) {
		String[] days = {"��", "��", "ȭ", "��", "��", "��", "��"
				+ ""};
		return days [day - 1];
	}
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);	// ��
		int month = now.get(Calendar.MONTH) + 1;	// ��
		int day = now.get(Calendar.DATE);	// ��
		String strWeek = getDayToStr(now.get(Calendar.DAY_OF_WEEK));	// ����
		String strAmPm = null;	// ���� / ����
		int hour = now.get(Calendar.HOUR_OF_DAY);	// ��
		int minute = now.get(Calendar.MINUTE);	// ��
		int second = now.get(Calendar.SECOND);	// ��
		
		int amPm = now.get(Calendar.AM_PM);
		if (amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		
		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.print(day + "�� ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.print(second + "�� ");
	}

}
