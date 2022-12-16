package javaPractice.ch_12.garbage;

public class StringClass1 {

	public static void main(String[] args) {
		
		/* String Ŭ����
			String�� �����ϴ� �� ���� ���
			1. �������� �Ű� ������ ���ڿ� ����
			String str1 = new String("abc");
			new ���� ����ؼ� ��ü�� �����ϴ� ���� "abc" ���ڿ��� ���� �޸𸮰� �Ҵ�ǰ� ���ο� ��ü�� ����
			
			2. ���ڿ� ����� ����Ű�� ���
			String str3 = "abc";
			�����ڸ� �̿����� �ʰ� �ٷ� ���ڿ� ����� ����Ű�� ��� ������ ������� �ִ� ���ڿ� ����� �޸� ���� ����Ű�� ��
			���α׷����� ���Ǵ� ��� ���� �����ϴ� ������ ��� Ǯ constant pool �̶�� ��
		*/
		
		String str1 = new String("abc");// �������� �Ű� ������ ���ڿ� ����
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);		// false. �ν��Ͻ��� �Ź� ���� ���� => str1 �� str2�� �ּҰ� �ٸ�
		System.out.println(str1.equals(str2));	// true. ���ڿ��� ���� ����
		
		String str3 = "abc";	// ��� Ǯ�� ����� �ּ� ���� ����
		String str4 = "abc";	
		
		System.out.println(str3 == str4);		// true. ���ڿ� abc�� ��� Ǯ�� ����Ǿ� ���� => str3 �� str4�� ����Ű�� �ּ� �� ����
		System.out.println(str3.equals(str4));	// true. ���ڿ��� ���� ����
	}

}
