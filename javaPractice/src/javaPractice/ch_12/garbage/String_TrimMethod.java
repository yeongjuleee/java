package javaPractice.ch_12.garbage;

public class String_TrimMethod {

	public static void main(String[] args) {
		/* ���ڿ� �� �� ���� �߶󳻴� �޼ҵ� 
		trim() �޼ҵ�� ���ڿ� �� �� ������ ������ ���ο� ���ڿ��� ���� & ���� */
		
		String tel1 = "      20";
		String tel2 = "000     ";
		String tel3 = "  0909  ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);

	}

}
