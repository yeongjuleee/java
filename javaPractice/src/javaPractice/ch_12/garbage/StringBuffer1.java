package javaPractice.ch_12.garbage;

public class StringBuffer1 {

	public static void main(String[] args) {
		/*
		StringBuffer �� StringBuilder Ŭ���� Ȱ��
		���α׷��� ����� ���� ���ڿ��� �����ϰų� �����ؾ� �ϴ� ��찡 ����
		������, String Ŭ������ �ѹ� �����Ǹ� �� ������ ���ڿ��� ���� X
		String Ŭ������ ����Ͽ� ��� ���ڿ��� �����ϰų� �����ϴ� ���α׷��� �ۼ��ϸ� �޸𸮰� ũ�� �����.
		=> �� ������ �ذ��ϱ� ���� ���� StringBuffer�� StringBuilder Ŭ����
		
		StringBuffer �� StringBuilder Ŭ������ ���ο� ���� ������(final X) char[] �� ������ ������ O
		�� Ŭ������ ����Ͽ� ���ڿ��� �����ϸ�, ���� ����ϴ� char[] �迭�� Ȯ��ǹǷ� �߰� �޸� ���X
		���� ���ڿ��� �����ϰų� ������ ��� StringBuffer �Ǵ� StringBuilder �� �� �ϳ��� ����ϸ� ��
		
		�� Ŭ������ ���̴� ���� �۾�(������)�� ���ÿ� ���ڿ��� �����Ϸ� �� �� ���ڿ��� �����ϰ� ����ǵ��� �������ִ°�, �׷��� ������ ����
		StringBuffer Ŭ������ ���ڿ��� �����ϰ� ����ǵ��� ����
		StringBuilder Ŭ������ ���ڿ��� �����ϰ� ����ǵ��� ���� X
		���� �����带 �����ϴ� ��Ƽ ������ ���α׷��� �ƴ϶�� StringBuilder ����ϴ� ���� ���� �ӵ��� �� ����
		*/
		
		String javaStr = new String("kkyu");
		System.out.println("javaStr ���ڿ� �ּ� : " + System.identityHashCode(javaStr));
		// javaStr ���ڿ� �ּ� : 1586600255  ó�� ������ �޸� �ּ�
		
		StringBuilder buffer = new StringBuilder(javaStr);	// String���� ��Ƽ StringBuilder ����
		System.out.println("���� �� buffer �޸� �ּ� : " + System.identityHashCode(buffer));
		// ���� �� buffer �޸� �ּ� : 474675244  buffer �޸� �ּ�
		buffer.append(" and"); 			// ���ڿ� �߰�
		buffer.append(" bbi");			// ���ڿ� �߰�
		buffer.append(" I like it!");	// ���ڿ� �߰�
		System.out.println("���� �� buffer �޸� �ּ� : " + System.identityHashCode(buffer));
		// ���� �� buffer �޸� �ּ� : 474675244 buffer �޸� �ּ�
		
		javaStr = buffer.toString();	// String Ŭ������ ��ȯ
		System.out.println(javaStr);	// kkyu and bbi I like it!
		System.out.println("���� ������� javaSTr ���ڿ� �ּ� : " + System.identityHashCode(javaStr));
		// ���� ������� javaSTr ���ڿ� �ּ� : 932583850 ���� ������ �޸� �ּ�
	}

}
