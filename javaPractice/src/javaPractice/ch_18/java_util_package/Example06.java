package javaPractice.ch_18.java_util_package;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example06 {
	/*  SimpleDateFormat : ������ ����ȭ �ϴ� Ŭ���� 
	 	Date�� Calendar�� �ִ� ��� ���� �ܿ� ���ϴ� ���·� ����ϱ� ���� Ŭ����
	 	y: ��, M: ��, d: ��, E: ����
	 	a: ����/����, H: �ð�, m: ��, s:��
	 */
	
	public static void main(String[] args) {
		Date day = new Date();
		// �ѱ�, �̱�, �������� ����ϴ� ��¥�� �⺻ ������ �ٸ� => ���Ŀ� ���� ���
		String patternKorea = "yyyy-MM-dd";
		String patternUSA = "MM-dd-yyyy";
		String patternUK = "dd-MM-yyyy";
		String pattern1 ="E���� HH�� mm�� ss��";
		
		// ������ �������� SimpleDateFormat ��ü ����
		SimpleDateFormat p1 = new SimpleDateFormat(patternKorea);
		SimpleDateFormat p2 = new SimpleDateFormat(patternUSA);
		SimpleDateFormat p3 = new SimpleDateFormat(patternUK);
		SimpleDateFormat p4 = new SimpleDateFormat(pattern1);
		
		System.out.println("���糯¥ " + day);
		System.out.println("�ѱ� ���� (��, ��, ��) : " + p1.format(day));
		System.out.println("�̱� ���� (��, ��, ��) : " + p2.format(day));
		System.out.println("���� ���� (��, ��, ��) : " + p3.format(day));
		System.out.println(p4.format(day));
		System.out.println(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()));
		
		// css �Ǵ� js ����, �̹����� ��� ���������� ĳ�ð� ������ �����ص� �ٷ� ������� ����
		// �׷��� ������ main.js ��� �ϴ� ���  main.js?20221216115108508 / product.jpg?2022... �� ���� 
	}

}
