package javaPractice.ch_09.abstractClass_innerclass;

/*
static ���� Ŭ������ ����
���� Ŭ������ static���� ������ Ŭ����
���� Ŭ������ ����� static���� �����Ǿ����� ���� Ŭ������ �ݵ�� static���� �����ؾ� ��

MyOuter3.Inner.getUserInfo()�� ȣ���ؼ� �Ʒ� ������ ��µǵ��� main() �޼ҵ� �ۼ�
'������ >> �ּ�: ����� ������, ��ȭ��ȣ: 010-2000-0909'
*/

class MyOuter3 {	// �ܺ� Ŭ����
	// �ʵ�
	private String name;
	private int age;
	
	public MyOuter3(String name, int age) { // �ܺ� Ŭ���� ������
		this.name = name;
		this.age = age;
	}
	
	public String getName() { return name; }
	public int getAge() { return age; }
	
	static class Inner { // ���� ����ƽ Ŭ����
		// �ʵ�
		private String address;
		static String tel = "010-2000-0909";
		
		public Inner (String address) { // ���� Ŭ���� ������
			this.address = address;
		}
	
	public String getUserInfo() {
		// static ���� Ŭ�������� �ܺ� Ŭ������ ��� ������ ������ �Ұ����ϴ�.
		// return name + " "  + age;
		return "�ּ�: " + address + " , ��ȭ��ȣ : " + tel;
		}
	
	}	// end Inner_class
	
}	// end Outer_class

public class Inner04 {

	public static void main(String[] args) {
		MyOuter3.Inner inner = new MyOuter3.Inner("����� ������");
		System.out.println("������ >> " + inner.getUserInfo());
	}

}
