package javaPractice.ch_09.abstractClass_innerclass;

/*
MyOuter2.test()�� ȣ���ؼ� �Ʒ��� ���� ����� �ǵ��� main() �޼ҵ� �ۼ�
'������: �̸�: ������, ����: 23, �ּ�: ����� ������'
*/

class MyOuter2 {	// �ܺ� Ŭ����
	// �ʵ�
	private String name;
	private int age;
	
	public MyOuter2 (String name, int age) {	// �ܺ� Ŭ������ ������
		this.name = name;
		this.age = age;
	}
	
	// �ܺ� Ŭ������ �޼ҵ�
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void test() {	// �Ϲ� �޼ҵ�
							// �޼ҵ带 ������ ������ Ŭ���� ����
		
		int num = 4; // local ���� => �޼ҵ� ������ ����Ǹ� �����
		
		class Inner {	// �޼ҵ� ���� ���� Ŭ����
			// �ʵ�
			private String address; 
			
			public Inner (String address) { // ���� Ŭ���� ������
				this.address = address;
			}
			
			// ���� Ŭ���� �޼ҵ�
			public String getCustomerInfo() {	
				System.out.println("inner_test() : " + num); // �Ϲ� �޼ҵ��� ���� ������. ���⸸ �����ϰ� ���� ����X ����� �Ǿ���.
				
				return "�̸� : " + name + ", ���� : " + age + ", �ּ� : " + address;
			}
		}// end Inner_class
		
		Inner inner = new Inner("����� ������"); // ���� �޸� ������. �޼ҵ尡 ����Ǿ ������� ����.
		System.out.println("�� ����: " + inner.getCustomerInfo());
	}
}

public class local02 {

	public static void main(String[] args) {
		MyOuter2 out = new MyOuter2("������", 23);
		out.test();
		
		

	}

}
