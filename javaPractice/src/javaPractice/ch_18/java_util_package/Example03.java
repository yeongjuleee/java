package javaPractice.ch_18.java_util_package;

import java.util.Calendar;

public class Example03 {
	// get() �޼ҵ�� ���� ��������!
	
	public static String getDayToStr(int day) {
		String[] days = {"��", "��", "ȭ", "��", "��", "��", "��"
				+ ""};
		return days [day - 1];
	}
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		// Calendar Ŭ�������� �����͸� �������� get() �޼ҵ带 ���
		// get() �޼ҵ��� ��ȯ Ÿ���� int�̸�, ������ ���� ��(MONTH) ��ȯ �� ���� ������ 1 ���� ���� ��ȯ
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; 	// ���� ������ 1 ���� ���� ��ȯ��.
		int date = calendar.get(Calendar.DATE);
		
		System.out.println(year + "��" + month + "��" + date + "��");	// ���� ��¥ ��ȯ
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));	// ������ ��ȯ�ϴµ� ��ȯ Ÿ���� ����
		// 6 
		// 1 = �Ͽ���, 2 = ������, 3 = ȭ����, 4 = ������, 5 = �����, 6 = �ݿ���, 7 = �����
		
		System.out.println("������ " + getDayToStr(calendar.get(Calendar.DAY_OF_WEEK)) + "���� �Դϴ�.");
		// ������ �ݿ��� �Դϴ�.
		
		System.out.println("�̹� �⵵���� ������ �� ��° �ΰ�?");
		// 350
		
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));	// �̹� �⵵�� ��ĥ����
		
		System.out.println("�̹� ���� ��ĥ���� �ִ°�? \n");
		System.out.println(calendar.getActualMaximum(Calendar.DATE));
		// 31
	}

}
