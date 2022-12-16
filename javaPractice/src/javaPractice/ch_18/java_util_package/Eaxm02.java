package javaPractice.ch_18.java_util_package;

import java.text.SimpleDateFormat;
import java.util.Date;

/*  Date�� SimpleDateFormat Ŭ������ �̿��ؼ� 
 	���� ��¥�� �Ʒ��� ���� ����ϴ� ���α׷��� �ۼ��϶�
 	
 	������: 
 	2022�� 12�� 16�� ������ 12�� ... ��
 */

public class Eaxm02 {

	public static void main(String[] args) {
		Date day = new Date();
		String pattern = "yyyy�� MM�� dd�� E���� HH�� mm��";
		
		SimpleDateFormat p1 = new SimpleDateFormat(pattern);
		
		System.out.println(p1.format(day));

	}

}
