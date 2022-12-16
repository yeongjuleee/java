package javaPractice.ch_08.inheritancePolymorphismExample;

class Animal {
	void breath() {
		System.out.println("�� ����");
	}
	
}

class Lion extends Animal {

	@Override
	public String toString() {
		return "����";
	}
	
}

class Rabbit extends Animal { // ���� Ŭ������ ����� �䳢 Ŭ����
	public String toString() {
		return "�䳢";
	}
}

class Monkey extends Animal { // ���� Ŭ������ ����� ������ Ŭ����
	public String toString() {
		return "������";
	}
}

class Zookeeper { // ������ Ŭ����
	/* ���������� �޼ҵ� �ִ� ��� 
	void feed(Lion lion) { // ���ڿ��� ���̸� �ִ� �޼ҵ�
						   // feed�� �Ű����� : Lion Ŭ������ lion ����
						   // lion : String toString ���� return ���� �� ��.
		System.out.println(lion + "���� ��� �ֱ�");
	}
	
	void feed(Rabbit rabbit) { // �䳢���� ���� �ִ� �޼ҵ�
		System.out.println(rabbit + "���� ���� �ֱ�");
	}
	
	void feed(Monkey monkey) { // �����̿��� ���� �ִ� �޼ҵ�
		System.out.println(monkey + "���� ���� �ֱ�");
	}
	*/
	
	// �����Ҹ� �̿��Ͽ� �����ִ� �޼ҵ� �����
	void feed(Animal animal) {  // ���� �ִ� �޼ҵ�
								// ������ Ÿ���� ����Ǵ� �θ� Ŭ����, Animal�� ���� 
								// Animal�� toString�� ������ �۵��ϴ� ���� : Animal �� ����� ���ִ� ���� �޴� ��ü�� X => Object��. 
								// Object�� ���� ��ü��, toString ���� ����� �� ����.
		System.out.println(animal + "���� ���� �ֱ�");
	}
}



public class Example02 {
	
	public static void main(String[] args) {
		Lion lion = new Lion(); // Lion �ν��Ͻ� ����
		Zookeeper james = new Zookeeper(); // james ��� �̸��� ������ �ν��Ͻ� ����
		james.feed(lion); // james�� lion���� ���̸� ��
		
		// ������ �߰��� �� �������� ���̸� �ִ� ��� (�������̳� �ʹ� ���ŷο�)
		//Rabbit rabbit = new Rabbit(); // Rabbit �ν��Ͻ� ����
		//james.feed(rabbit);
		
		//Monkey monkey = new Monkey(); // Monkey �ν��Ͻ� ����
		//james.feed(monkey);
		
		// ������ �߰��� �� �������� ���̸� �ִ� ���(�����Ҹ� �̿�����!)
		Animal rabbit = new Rabbit();
		james.feed(rabbit);
		
		Animal monkey = new Monkey();
		james.feed(monkey);

	}

}
