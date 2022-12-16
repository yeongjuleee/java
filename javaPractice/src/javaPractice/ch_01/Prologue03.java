package javaPractice.ch_01;

public class Prologue03 {

	public static void main(String[] args) {
		// �ڵ��� ��ȯ
		
		byte a = 127; // byte�� ���� �� �ִ� �ִ밪
		int b = a; // �ڵ��� ��ȯ (byte => int)
		System.out.println(b); // 127
		
		float c = b; // �ڵ��� ��ȯ (int => float)
		System.out.println(c); // 127.0
		
		// int d =c ; �� �� ��� float �ڷ����� int ������ �����ϸ� �ڵ�����ȯ�� �ȵ�. ���� �սǵǱ� ����

		// ����� ����ȯ : �����ڰ� ������ �ڷ����� "������" �ٲٴ� �� 
		// ����: (��ȯ�ϰ��� �ϴ� Ÿ��)������
		
		int e = 263;
		System.out.println(e);
		
		byte f = (byte) e; // ����� ����ȯ 263 - 256 = 7
		System.out.println(f);
		
		/* ���ڿ��� �⺻ Ÿ������ ���� Ÿ�� ��ȯ
		 * String�� int�� char ó�� �⺻ �ڷ� Ÿ���� �ƴ϶� Ŭ������ ��ü ���·� �Ϲ��� ����ȯ�� �ٸ� 
		 * ȥ���� 83p
		 * */
		
		String str = "1a";
		//int value = Integer.parseInt(str); // ���ڿ��� ���� ���� ���ڰ� ������ ��ȯ�� ���� ����!!! 
		
		//String => byte
		String str1 = "10";
		byte value1 = Byte.parseByte(str1);
		System.out.println(value1); // 10
		
		//String => short
		String str2 = "200";
		short value2 = Short.parseShort(str2);
		System.out.println(value2); // 200
		
		// String => int
		String str3 = "30000";
		int value3 = Integer.parseInt(str3);
		System.out.println(value3); // 30000
		
		//String => long
		String str4 = "4000000";
		long value4 = Long.parseLong(str4);
		System.out.println(value4); // 4000000
		
		//String => float 
		String str5 = "12.345";
		float value5 = Float.parseFloat(str5);
		System.out.println(value5); // 12.345
		
		//String => double
		String str6 = "12.345";
		double value6 = Double.parseDouble(str6);
		System.out.println(value6); // 12.345
		
		//�⺻ Ÿ���� ���ڿ��� ��ȯ
		String str7 = String.valueOf(10);
		String str8 = String.valueOf(3.14);
		String str9 = String.valueOf(false);
		
		System.out.println("str7 :" + str7); // str7: 10
		System.out.println("str8 :" + str8); // str8: 3.14
		System.out.println("str9 :" + str9); // str9: false
	}

}
