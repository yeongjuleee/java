package javaPractice.ch_08;

/*
일반 직원은 Employee 클래스로 모델링한다.
Employee 클래스를 상속받아서 관리자를 나타내는 Manager 클래스와 
Employee 클래스 안에 월급을 계산하는 getSalary() 메소드가 있다
이 메소드를 Manager 클래스와 Programer 클래스에서 오버라이딩해서 각 직극별로 다른 월급을 반환하도록 한다
오버라이딩을 할 때 Employee 클래스의 baseSalary를 사용하라
*/

class Employee {
	public int baseSalary = 3000000; // 기본급
	int getSalary() {
		return baseSalary;
	}
}

class Manager extends Employee {
	// int salary = 2000000;
	// 오버라이딩 해서
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
		System.out.println("관리자의 월급: " + manager.getSalary());
		// 관리자의 월급: 5000000
		
		Programer programer = new Programer();
		System.out.println("프로그래머의 월급: " + programer.getSalary());
		// 프로그래머의 월급: 6000000
	}

}
