package javaPractice.ch_01;

public class Prologue02 {

	public static void main(String[] args) {
		/* + ���꿡���� ���ڿ� �ڵ� ��ȯ
		 * + �����ڴ� �� ���� ����� ����
		 * 1. �ǿ����ڰ� ������ ��쿡�� ���� ����
		 * 2. �ǿ����� �� �ϳ��� ���ڿ��̶�� ������ �ǿ��� ���� ���ڿ��� �ڵ� ��ȯ �Ǿ� ���ڿ� ���� ���� ����  */
		
		//���� ���� ����
		int value = 10 + 2 + 8;
		System.out.println("value : " + value); // 20
		
		//���� ���� ����
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1); // 128
		//�����ڴ� ���ʿ��� ���������� ������� ����Ǳ� ������
		//12 + "8" �� �Ǿ� 128
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2); // 1028
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3 :" + str3); //1028 : "102" + 8 
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4 :" + str4); // 1010: "10" + 10 ( ��ȣ�� ���� ����)
		
		// �����غ��� 
		String a = 7 + " "; //7 
		String b = " " + 7; // 7
		String c = 7 + ""; //7
		String d = "" + 7; //7
		String e = "" + ""; // 
		String f = 7 + 7 + ""; // 14
		String g = "" + 7 + 7; // 77
		
		System.out.println(a); //���: 7
		System.out.println(b); //���:  7
		System.out.println(c); //���: 7
		System.out.println(d); //���: 7
		System.out.println(e); //���:
		System.out.println(f); //���: 14
		System.out.println(g); //���: 77 : "7" + 7 �̵Ǿ 77
		
	}

}
