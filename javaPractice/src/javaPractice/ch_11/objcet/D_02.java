package javaPractice.ch_11.objcet;

class Comp {
	String name;
	Comp(String name) {
		this.name = name;
	}
}


public class D_02 {

	public static void main(String[] args) {
		
		/*
		boolean equals(Object obj) : �� �ν��Ͻ��� �������� ���θ� ��ȯ
		�������Ͽ� �������� ������ �ν��Ͻ����� ������ �� ����
		
		equals() �޼ҵ��� ���� ����� �� �ν��Ͻ��� �ּҰ��� ���Ͽ� boolean �� (true / false)�� ��ȯ���ִ� ��
		���� ������ ���ϼ�(�ν��Ͻ��� �޸� �ּҰ� ����)�� �ƴ϶� ���� ���ϼ�(�������� �� �ν��Ͻ��� ����)�� 
		������ ���� equals() �޼ҵ带 �������Ͽ� ���
		*/
		
		Comp comp1 = new Comp("��1");
		Comp comp2 = new Comp("��2");
		System.out.println(comp1 == comp2);		// false. �� �ν��Ͻ��� �ּ� ���� �ٸ�
		System.out.println(comp1.equals(comp2));// false. equals �޼ҵ嵵 �ּ� ���� ��.
		
		// String, Integer Ŭ������ equals() �޼ҵ� ������
		// String�� �ּҰ� �񱳰� �ʿ�X ���� �񱳰� �ʿ�. �׷��� equals�� �������ؼ� �ּҰ� ������ �� �ƴ� ���ڰ� ������ ���ϰԵ�.
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);		// false. ��  ��Ʈ�� �ν��Ͻ��� �ּ� ���� �ٸ�
		System.out.println(str1.equals(str2));	// true. String Ŭ������ equals �޼ҵ尡 �����ǵ�
		
		
		// Integer ���� �ּҰ� �� �ʿ� X ���� �񱳰� �ʿ�.
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);			// false. �� ���� �ν��Ͻ��� �ּ� ���� �ٸ�.
		System.out.println(i1.equals(i2));		// true. Integer Ŭ������ equals �޼ҵ尡 �����ǵ�
	}

}
