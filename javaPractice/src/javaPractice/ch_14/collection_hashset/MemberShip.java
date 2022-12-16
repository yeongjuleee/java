package javaPractice.ch_14.collection_hashset;

/*
	Member ��ü�� �ߺ� ���� �����ϴ� HashSet
	hashCode()�� equals() �޼ҵ带 ������ ���� ������ ����� ��ü�� 2�� 
*/

public class MemberShip {
	// hashCode() �� equals() �޼ҵ� ������
	public String name;
	public int age;
	
	public MemberShip(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// hashCode()�� equals() �޼ҵ� ������

	@Override
	public boolean equals(Object obj) { // name�� age���� ������ true ����
		if (obj instanceof MemberShip) { // ���� ��ü�� MemberShip�� ��ü�̸�,
			MemberShip memberShip = (MemberShip)obj; // obj�� MemberShip���� ����ȯ
			return memberShip.name.equals(name) && (memberShip.age == age);			
			
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// name�� age ���� ������ ������ hashCode ��ȯ
		return name.hashCode() + age;	// String�� hashCode() �̿�
		// �ʵ�.hashCode() 
	}
	
	
}
