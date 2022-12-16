package javaPractice.ch_08;

/*
�Ϲ� ������ Employee Ŭ������ �𵨸��Ѵ�.
Employee Ŭ������ ��ӹ޾Ƽ� �����ڸ� ��Ÿ���� Manager Ŭ������ 
Employee Ŭ���� �ȿ� ������ ����ϴ� getSalary() �޼ҵ尡 �ִ�
�� �޼ҵ带 Manager Ŭ������ Programer Ŭ�������� �������̵��ؼ� �� ���غ��� �ٸ� ������ ��ȯ�ϵ��� �Ѵ�
�������̵��� �� �� Employee Ŭ������ baseSalary�� ����϶�
*/

class Employee {
	public int baseSalary = 3000000; // �⺻��
	int getSalary() {
		return baseSalary;
	}
}

class Manager extends Employee {
	// int salary = 2000000;
	// �������̵� �ؼ�
	// return (super.getSalary() + salary);
	
	@Override
	int getSalary() {
		return (baseSalary + 2000000);
	}
	
}

class Programer extends Employee {

	
	@Override
	int getSalary() {
		return (baseSalary + 3000000);
	}
	
	
}

public class InheritanceTest01 {

	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println("�������� ����: " + manager.getSalary());
		// �������� ����: 5000000
		
		Programer programer = new Programer();
		System.out.println("���α׷����� ����: " + programer.getSalary());
		// ���α׷����� ����: 6000000
	}

}
