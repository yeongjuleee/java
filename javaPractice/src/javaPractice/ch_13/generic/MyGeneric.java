package javaPractice.ch_13.generic;

// ���׸��� C++�� ���ø��� ������ ����
// C++���� �޸� ���׸� ��� Object�� ����ϸ� ��� ������ Ÿ���� ����� �� ������, 
// ��쿡 ���� ����ȯ�� ����� ��
// ������ ���׸��� ��ȣ

class ObjectData {
	private Object data;	// Ŭ���� ������ Ÿ���� Object�� ��� ������ Ÿ�� ��� ����
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
}

public class MyGeneric {

	public static void main(String[] args) {
		ObjectData stringCommonData = new ObjectData(); // StringŸ�Ը� �����Ұ���
		ObjectData integerCommonData = new ObjectData();// intŸ�Ը� �����Ұ���
		
		stringCommonData.setData("abc"); 
		// Ŭ������ ������ Ÿ���� Object�� ��� ������ Ÿ�� ��� ����
		integerCommonData.setData(100);
		
		System.out.println("stringCommonData : " + stringCommonData.getData());
		// stringCommonData : abc
		System.out.println("integerCommonData : " + integerCommonData.getData());
		// integerCommonData : 100
	}

}
