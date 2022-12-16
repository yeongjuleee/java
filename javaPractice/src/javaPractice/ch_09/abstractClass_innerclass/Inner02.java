package javaPractice.ch_09.abstractClass_innerclass;
/*
	�ν��Ͻ� ���� Ŭ������ ���ǿ� ����
	�ܺ� Ŭ������ ���ó�� ���ǵ� Ŭ����
	���� Ŭ������ ����Ϸ��� ���� �ܺ� Ŭ������ �ν��Ͻ��� ������ �� �����ؾ� ��
	
	Inner.getCustomerInfo()�� ȣ���ؼ� �Ʒ� ������ �������� main() �޼ҵ� �ۼ�
	'������ >> �̸�: ���ر�, ����: 23, �ּ�: ����Ư���� ������'
*/

class MyOuter1 {
	// �ʵ� (�ܺ�) Ŭ����
	private String name;
	private int age;
	
	public MyOuter1 (String name, int age) {	// �ܺ� Ŭ���� ������
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// ���� Ŭ������ �����Ѵ�
	public class Inner { // ���� Ŭ����
		private String address; // ���� Ŭ���� �ʵ�
		public Inner (String address) { // ���� Ŭ���� ������
			this.address = address;
		}
		
		public String  getCustomerInfo() { // ���� Ŭ���� �޼ҵ�
			return "�̸� : " + name + ", ���� : " + age + ", �ּ� : " + address;
		}
	}
}


public class Inner02 {

	public static void main(String[] args) {
		MyOuter1 outClass = new MyOuter1("���ر�", 23); // �ܺ� Ŭ���� ����
		MyOuter1.Inner inClass = outClass.new Inner("����Ư���� ������"); // �ܺ� Ŭ���� ������ �̿��Ͽ� ���� Ŭ���� ����
		
		System.out.println("������ >> " + inClass.getCustomerInfo());	// ���� Ŭ������ �޼ҵ� ���

	}

}
