package javaPractice.ch_13.generic;

/*  01. GenericType Test
 	���׸�(Generic) : �Ϲ�ȭ, ����ȭ ��� �ǹ�
 	Ŭ������ �޼ҵ忡�� ����ϴ� �ʵ峪 �Ű� ������ �ڷ���(Ŭ������)�� ȣ���ϴ� �ʿ��� �����ϵ��� �ϴ� ���
 
 	� ���ڸ� ����ص� ������, �̸� ������ Ÿ�Ե��� �ִ�.
 	E: Element �� ����. �÷��� �����ӿ�ũ�� ����� �� �� ��ü�� ��Ī�ϴ� �ǹ̷� ���
 	K: Key �� ����. Ű�� ���̶�� ������ �̷���� ���¿��� 'Ű'�� �ǹ̷� ���
 	V: Value �� ����. Ű�� ���̶�� ������ �̷���� ���¿��� '��' �ǹ̷� ���
 	T: Type �� ����. �ڷ����̳� Ŭ������ �ǹ̷� ���
 	N: Number �� ����. ��ġ �迭�� �ǹ̷� ���. ���� ���� ����� ��� �� Ÿ�� �Ű� ���� �ڿ� 2, 3, 4 ���� ���ڸ� �ٿ� ���
 	���׸������� �⺻ �ڷ���(boolean, byte, char, int ��) Ÿ������ ����� �� ��� ���⼭�� WrapperŬ������ �ǹ���.
 */

class CommonData<T> { // �Ϲ����� ������δ� Ŭ�������� �̸� ������ Ÿ���� �����ؾ� ������, ���׸��� ����ϸ� ȣ���ϴ� �ʿ��� ������ Ÿ���� ����
					 // < > �ȿ� �������� �� �� ����.  
	private T data;	// ������ Ÿ������ T�� ����. Type�� ����. Ŭ���� ���𿡼� < > ���̿� �ٸ� ���ڸ� �־ ��. 
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}

public class MyGeneric_02 {

	public static void main(String[] args) {
		ObjectData stringCommonData = new ObjectData(); // ȣ���ϴ� �ʿ��� Ÿ���� ����
		ObjectData integerCommonData = new ObjectData();// �����ϸ鼭 Ÿ���� �����ϸ� �����ڿ����� Ÿ�� ���� ����
		
		stringCommonData.setData("abc"); 
		// Ŭ������ ������ Ÿ���� Object�� ��� ������ Ÿ�� ��� ����
		integerCommonData.setData(100);
		
		System.out.println("stringCommonData : " + stringCommonData.getData());
		// stringCommonData : abc
		System.out.println("integerCommonData : " + integerCommonData.getData());
		// integerCommonData : 100
		
	}

}
