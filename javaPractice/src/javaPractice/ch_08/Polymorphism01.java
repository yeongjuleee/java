package javaPractice.ch_08;

class A {
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A {
	void methodB() {
		System.out.println("methodB");
	}
}

public class Polymorphism01 {

	public static void main(String[] args) {
		A obj = new B();
		obj.methodA();
		//obj.methodB();  => ���� �߻�. �θ��� �͸� ��밡���ϱ� ����
		
		B obj1 = new B();
		obj1.methodB(); // ���� ����
		
		A obj2 = obj1; // A ������ Ÿ���� obj2�� obj1 ����
		// obj2.methodB() => ���� �߻�! A ������ Ÿ�Կ��� B ������ Ÿ���� ���� ����(?) ���� �������ε���

	}

}
