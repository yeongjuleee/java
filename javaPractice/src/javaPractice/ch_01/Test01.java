package javaPractice.ch_01;

public class Test01 {

	public static void main(String[] args) {
		// ����ȯ�� Ȱ���Ͽ� ���� Ǯ��
		
		/* int result = �� ���Ͽ� 
		 * 1. ���� 4���� ��� ����Ͽ� 
		 * 2. ��Ģ���� �� + �����ڸ� ����Ͽ� 
		 * 3. 9�� ������ �ڵ带 �ϼ��϶�.
		 */
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9"; // ��Ʈ! ���ڿ��� ���ڷ� ��ȯ�ؾ���
		
		// ����: int result = (int)var1 +  (int)var2 + (int)var3 + Integer.parseInt(var4);
		// ����: int result = (int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4);
		
		//int A = (int)var1;
		//int B = (int)var2;
		//int C = (int)var3;
		double d = Double.parseDouble(var4);
		System.out.println(d);
		
		double a = var2 + var3;
		System.out.println(a); // 4.29999
		
		int result = (int)var1 + (int)a + (int)d;
		
		System.out.println(result);

	}

}
