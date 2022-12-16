package javaPractice.ch_07;

class Person {
	// �Ӽ� (�ʵ�)
	private String name;
	private String mobile;
	private String office;
	private String email;
	
	// ��� (�޼ҵ�)
	Person(String name, String moblie, String office, String email) { // �⺻ ������
		this.name = name;
		this.mobile = mobile;
		this.office = office;
		this.email = email;
	}
	
	public String toString() { // ���� �޾ƿ���(=��������) ������ �Ű����� X => return�ؾ���.
		return "Person [name =" + name + ", mobile=" + mobile + ", office = " + office + ", email =" + email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) { // ���� �����ϱ� ������ �Ű����� O => return X 
		this.name = name; // �� ������ �����ϱ� ���� return (��ȯ)�� �ʿ� X �׷��� void�� ������ ������.
	}
	
	public void setMobile(String moblie) {
		this.mobile = mobile;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}

public class DefaultConstructor04 {

	// Ŭ���� �ۼ� �� ���� ����
	// Person �̶�� Ŭ������ �ۼ��ϰ� �׽�Ʈ �϶�
	// Person �̶�� Ŭ������ ������ ���� �ʵ�� �޼ҵ带 ������.
	// #�ʵ�
	// name : �̸�(private)
	// mobile : �ڵ��� ��ȣ (private)
	// office : ���� ��ȭ��ȣ (private)
	// email : �̸��� �ּ� (private)
	
	// #�޼ҵ�
	// Person(n, m, oi, e) : ������ �޼ҵ�
	// toString() : �ﰢ���� ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	// setName(), getName()... : �� �Ӽ��� ���� �����ڿ� ������ �޼ҵ�
	
	public static void main(String[] args) {
		Person person = new Person("������", "010-1999-0421", "02-199-0421", "treasure@leader.com");
		System.out.println(person);
		
		// Person{name='������', moblie='010-1999-0421', office='02-199-0421', email='treasure@leader.com'}
		person.setEmail("treasure@leader.com");
		person.setMobile("010-1999-0421");
		System.out.println(person);
		// Person{name='������', moblie='010-1999-0421', office='02-199-0421', email='treasure@leader.com'}

	}

}
