package javaPractice.ch_18.java_util_package;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* java.util.Calendar : ������ �ٷ�� Ŭ����
	Calendar�� �߻� Ŭ�����̹Ƿ� ���� ��ü ����X 
	getInstance() �޼ҵ带 ���� GregorianCalendar �ν��Ͻ��� �����ؾ���
	�� ����� �̱��� ���� Singleton Pattern �̶�� �ϴµ�, �̱��� ������
	��ü�� ����� �� ���� �ν��Ͻ��� �����ؼ� ����ϴ� ���� X �ϳ��� �ν��Ͻ��� ������ ����ϴ� ���
	Calendar Ŭ������ �̱��� �������� ������� ��ǥ���� Ŭ����
	
	�̱��� ������ ������� �ʴ� ������δ� ���� GregorianCalendar �ν��Ͻ� ���� */

public class Example02 {

	public static void main(String[] args) {
		Calendar a = Calendar.getInstance();	// �̱��� ����
		Calendar b = new GregorianCalendar();	// GregorianCalendar �ν��Ͻ� ����
		
		// ������ ��� ���� ����
		System.out.println(a.toString());
		System.out.println(b.toString());

	}

}
