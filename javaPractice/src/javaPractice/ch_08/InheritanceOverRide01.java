package javaPractice.ch_08;

class Student2 {
	void learn() {
		System.out.println("����");
	}
	
	void eat() {
		System.out.println("��Ա�");
	}
	
	void say() {
		System.out.println("�ȳ��ϼ���, ������!"); // ������ �л�
	}
}

class Leader extends Student2 {
	void lead() {
		
	}

	// �������̵��� �ڼ� Ŭ�������� �θ� Ŭ�����κ��� �������� �޼ҵ带 �ٽ� �ۼ��ϴ� ��
	@Override   // �������̵� �ϴ� ��� : �ش� ��ġ�� ���콺 ���� => Source => Override/imp... ������
	void say() {
		System.out.println("�����Բ� �λ�!"); // �������̵�
		//super.say(); �θ� Ŭ������ �޼ҵ� ����.
	}
	
	
	
}





public class InheritanceOverRide01 {

	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.eat(); // ��ӹ��� �޼ҵ� ���
		leader.say(); // ���� ���̵��� �޼ҵ� ���

	}

}
