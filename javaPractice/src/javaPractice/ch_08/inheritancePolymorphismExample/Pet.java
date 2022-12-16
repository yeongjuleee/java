package javaPractice.ch_08.inheritancePolymorphismExample;

public class Pet {
	private String name;		// �ֿϵ����� �̸�
	private String masterName;	// ������ �̸�
	
	
	//�ڵ� ������ ����� ���
	// 1. ���콺 ��Ŭ��
	// 2. Source Ŭ�� => Generate usig construct... ��¼�� ������
	
	public Pet(String name, String masterName) { 
		this.name = name;
		this.masterName = masterName;
	}
	
	// �޼ҵ�
	// getter, setter �ڵ����� ����� ���
	// 1. ���콺 ��Ŭ��
	// 2. Source Ŭ�� => Generate Getter ��¼�� ������
	public String getName() {
		return name;
	}
	
	public void setName(String name) { this.name = name; }
	
	public String getMasterName() {
		return masterName;
	}
	
	public void introduce() {
		System.out.println("�� �� �̸��� " + name + "�Դϴ�!");
		System.out.println("�� ���δ��� " + masterName + "�Դϴ�!");
	}
	
}
