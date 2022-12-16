package javaPractice.ch_09.abstractClass;

/*
�߻� �޼ҵ�� ����θ� �����ϰ� ��ü���� ������ ������� �޼ҵ�
��ü���� ������ ���� �ʾұ� ������ �̸� ��ӹ��� ���� Ŭ���������� ����Ϸ��� �ݵ�� �����϶�� �ǹ�
�߻� �޼ҵ带 �����ϴ� ����� '�߻�����' �̶�� ���� ������, abstract�� �޼ҵ� �� �տ� �ٿ���
=> abstract class Ŭ������ { }

�߻� Ŭ������ �߻� �޼ҵ带 �⺸�� ������ Ŭ����
�߻� Ŭ������ �Ϲ����� �޼ҵ嵵 ���� �� ������, �߻� �޼ҵ带 �ϳ��� �����ϴ� Ŭ����.
*/

abstract class Pokemon { // ���ϸ� �߻� Ŭ����
	//�ʵ�
	String name;
	
	//�޼ҵ�
	abstract void attack(); // ���� �߻� �޼ҵ�. 
							// ��ü���� ���� X => { } �� �����ϰ� �����ݷ� ';' �� �ٿ��ش�.
	abstract void sound();	// �Ҹ� �߻� �޼ҵ�
	
	
	public String getName() { // ���ϸ��� �̸��� �����ϴ� �޼ҵ�
		return this.name;
	}
	
}

class Pikachu extends Pokemon { // ���ϸ� Ŭ������ �ڳ� Ŭ����, ��ī�� Ŭ����
		Pikachu() { // �̸��� �����ϴ� ������
			this.name = "��ī��";
		}

		@Override
		void attack() {
			System.out.println("�鸸��Ʈ!");
			
		}

		@Override
		void sound() {
			System.out.println("��ī ��ī!");
			
		}
}

class Squirtle extends Pokemon { // ��ī�� Ŭ����
	Squirtle() { // �̸��� �����ϴ� ������
		this.name = "���α�";
	}
	
	void attack() { // ��ü������ ����
		System.out.println("������!");
	}
	
	void sound() {
		System.out.println("���� ����!");
	}
}

public class AbstractMethod01 {

	public static void main(String[] args) {
		Pikachu pikachu1 = new Pikachu();
		System.out.println("�� ���ϸ��� " + pikachu1.getName());
		pikachu1.attack();
		pikachu1.sound();
		
		Squirtle squritle1 = new Squirtle();
		System.out.println("�� ���ϸ��� " + squritle1.getName());
		squritle1.attack();
		squritle1.sound();

	}

}
