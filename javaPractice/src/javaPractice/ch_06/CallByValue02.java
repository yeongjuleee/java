package javaPractice.ch_06;

public class CallByValue02 {
	
	// ��(������)�� �����ϴ� ���. �ڷ��� Ÿ���� �����
	//���ڿ��� ���� ȣ�� ���
	// ���������� ���ڿ��� �����Ϸ��� ������ �����Ͷ� ���� ���� ȣ���� ��
	
	public void setAddress (String addr) {
		addr = "��⵵ ������ ��ȱ�";
	}

	public static void main(String[] args) {
		String address = "����� ������ ������";
		
		CallByValue02 st = new CallByValue02();
		System.out.println("�޼ҵ� ȣ�� ��");
		System.out.println("adress: " + address); // adress : ���� ������ ������
		
		st.setAddress(address);
		
		System.out.println("�޼ҵ� ȣ�� ��");
		System.out.println("adress: " + address); // adress : ����� ������ ������

	}

}
