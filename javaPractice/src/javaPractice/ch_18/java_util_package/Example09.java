package javaPractice.ch_18.java_util_package;

import java.time.LocalDateTime;

public class Example09 {

	public static void main(String[] args) {
		// �ð��� ���ϰ� ���� �޼ҵ带 Ȯ���ϴ� �ڵ�
		// �ð� ���� : minusHours(long) <-> plusHours(long)
		// �� ���� : minusMinutes(long) <-> plusMinutes(long)
		// �� ���� : minusSeconds(long) <-> plusSeconds(long)
		// ���� �� ���� : minusNanos(long) <-> plusNanos(long)
		
		LocalDateTime localDateTime = LocalDateTime.now();	
		// ���� �ð�: 2022-12-16T14:12:34.194750800
		System.out.println("���� �ð�: " + localDateTime);	
		LocalDateTime localDateTime1 = localDateTime.minusHours(5).plusMinutes(30).minusSeconds(4);
		// 5�ð��� ���� 30���� ���ϰ� 4�ʸ� ��
		
		System.out.println("���� �ð� : " + localDateTime1);	
		// ���� �ð� : 2022-12-16T09:42:30.194750800
		
		LocalDateTime localDateTime2 = localDateTime1.minusHours(24);
		// 1d2 ������ 24�ð��� ��
		System.out.println("�ڵ� ���� �ð�: " + localDateTime2);
		// �ڵ� ���� �ð�: 2022-12-15T09:42:30.194750800

	}

}
