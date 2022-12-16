package javaPractice.ch_09.abstractClass.Interface_shoping;

public class User {
	/*
		���θ� ������� �⺻���� ������ �����ϰ� �����ϴ� ���
		���� User Ŭ������ �پ��� ȸ�� ������ �����Ǿ�� ������,
		���⼭�� �̸��� ���� �������� ����� ����
	*/
	
	private String name;		// ����� �̸�
	
	private PayType payType;	// ���� ���� - enum
	
	// �̸��� ���� ������ �Ķ���ͷ� ������ ������
	// �����ڷ� �̸��� ���� ������ �޾� ����
	public User(String name, PayType payType) {
		this.name = name;
		this.payType = payType;
	}
	
	public String getName() { // ������� �̸� ������ ����
		return name;
	}
	
	public void setName(String name) { // ������� �̸� ������ ����
		this.name = name;
	}
	
	public PayType getPayType() { // ������� ���� ������ ����
		return payType;
	}
	
	public void setPayType(PayType payType) { // ������� ���� ������ ����
		this.payType = payType;
	}
}
