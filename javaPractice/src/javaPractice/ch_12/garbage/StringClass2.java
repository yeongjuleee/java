package javaPractice.ch_12.garbage;

public class StringClass2 {

	public static void main(String[] args) {
		/*
		�ٸ� ���α׷��� ���� ���ڿ��� ���� �� char[] �迭�� ���
		�ڹٴ� String Ŭ������ ������ char[] �迭�� ���� �������� X ���ڿ��� ��� O
		
		String Ŭ������ ���� ���� : 
		private final char value[] ��� ����� char �迭�� ����
		���α׷����� String s = new String("abc") ��� ���� abc�� String Ŭ������ vlaue ������ �����
		value ���� final�� ������ �Ǿ� �־ ���� ������ �� ���� 
		-> �Һ� immutable(�ڷ���) �̶�� �� ( <-> mutable �� ���� ������. (�ڷ�����)) 
		
		���α׷����� �� ���� ���ڿ��� �����ϸ�, �� �� �ϳ��� ���ڿ��� ���� �Ǵ� �� �ƴ϶� �� ���ڿ��� ����� ���ο� ���ڿ��� ����
		*/
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);	// java
		System.out.println("ó�� ���ڿ� �ּ� ��: " + System.identityHashCode(javaStr));	
		// ó�� ���ڿ� �ּ� ��: 1586600255
		
		javaStr = javaStr.concat(androidStr);	// java�� android ���ڿ��� ����
						// ������.concat(�����Һ�����) => concat : �����ض�~ �ǹ�
		
		System.out.println(javaStr);	// javaandroid
		System.out.println("����� ���ڿ� �ּ� ��: " + System.identityHashCode(javaStr));
		// ����� ���ڿ� �ּ� �� : 474675244
		
		// ���ڿ��� ���� �����ϴ� ��� : immutable�� ���� �ٲ� �� ���� ���ο� ��ü�� ������. 
		javaStr = "new java";
		System.out.println(javaStr);	// new java
		System.out.println("���� ������ ���ڿ� �ּ� ��: " + System.identityHashCode(javaStr));	
		//	���� ������ ���ڿ� �ּ� �� : 932583850
	}

}
