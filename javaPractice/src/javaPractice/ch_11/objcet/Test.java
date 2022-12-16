package javaPractice.ch_11.objcet;

/*
	Member Ŭ�������� id�� �̸�, ����ó�� �����ϴ� �ʵ尡 �ִ�.
	Member Ŭ������ �ۼ�ȭ��, Objcet�� toString() �޼ҵ带 �������ؼ� �Ʒ��� ���� �������� �ۼ��϶�.

	������ :
	blue : ���Ķ�
*/


class Member {
	// �ʵ�
	String id;		// ���̵�
	String name; 	// �̸�
	String phone;	// �޴���
	
	Member(String id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}


	@Override
	public String toString() {
		return  id +  " : " + name;
	}

	
}

public class Test {

	public static void main(String[] args) {
		Member member = new Member("blue", "���Ķ�", "010-1234-5678");
		System.out.println(member);

	}

}
