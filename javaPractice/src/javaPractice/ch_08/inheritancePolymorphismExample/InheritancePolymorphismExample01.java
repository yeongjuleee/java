package javaPractice.ch_08.inheritancePolymorphismExample;
// ������

class Parent {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent { 
	int x = 200;
	
	void method() {
		//System.out.println("Child Method");
		System.out.println("x= " + x); // this.x �� ����. �׳� x�� �������� ���� ������ ������
		System.out.println("super.x= " + super.x); // �θ� Parent �� x �� ����
		System.out.println("this.x= " + this.x); // Child �� x�� ����(= this.x)
	}
}

public class InheritancePolymorphismExample01 {

	public static void main(String[] args) {
	Parent parent = new Child();
	// Child ��� ��ü�� ����. => Child �� �θ� ��ü�� ������ ���� ???
	Child child = new Child();
	
	// ���� ���� �켱
	System.out.println("p.x= " + parent.x); 
	// p.x= 100
	
	// �������̵� �켱
	parent.method();
	// Child Method
	
	System.out.println();
	
	// ���� ���� �켱
	System.out.println("c.x= " + child.x); 
	// c.x= 200
	
	// �������̵� �켱
	child.method();
	// Parent Method

	}

}
