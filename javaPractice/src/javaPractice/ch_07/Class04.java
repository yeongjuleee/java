package javaPractice.ch_07;

//����(�Լ�=�޼ҵ�)�� ���� �Ӽ��� �ִ� class
class MyStudent { // �޼ҵ� ���� Ŭ����
	String name; // �̸�
	int grade; // �г�
	int kor; // ���� ����
	int eng; // ���� ����
	int math; // ���� ����
	
	void printStudent() { 
		// �Ű� ���� X, ���� �ϳ��� �л� �� ���� ���� ������ ������ �� �ִ�.
		System.out.println(name + "��/�� " + grade + "�г��̰�, ���� ������ " + kor + "�� �Դϴ�.");
		
	}
}

public class Class04 {

	public static void main(String[] args) {
		MyStudent student1 = new MyStudent(); // class �� �𵨷� �ϴ� ��ü ����
		// �Ϲ����� �����Ϳ� Ÿ���� �޶� ��ü��� ��.
		// ���� �ϳ��� �л� �� ���� ���� ������ ������ �� ����
		
		student1.name = "���ر�";
		student1.grade = 2;
		student1.kor = 100;
		student1.eng = 99;
		student1.math = 80;
		
		MyStudent student2 = new MyStudent(); // class�� �𵨷� �ϴ� ��ü ����
		student2.name = "������";
		student2.grade = 2;
		student2.kor = 100;
		student2.eng = 100;
		student2.math = 99;
		
		//printStudent(student1); // ���رԴ� 2�г��̰�, ���� ������ 100�� �Դϴ�. 
		//printStudent(student2); // �������� 2�г��̰�, ���� ������ 100�� �Դϴ�.
		student1.printStudent();
		student2.printStudent();
	}


}
