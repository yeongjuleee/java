package javaPractice.ch_07;


public class ClassTest01 {

	public static void main(String[] args) {
		Student s = new Student(); //�������� s ����
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸� : " + s.name);
		System.out.println("���� : " + s.getTotal());
		System.out.println("��� : " + s.getAverage());

	}
	

}

class Student {
	String name; // �̸� 
	int ban; // ��
	int no; // ��ȣ
	int kor; // ��������
	int eng; // ��������
	int math; // ��������
	
	//����Ÿ���� �־����. void�ƴ� 
	int getTotal() {
		return (kor + eng + math);
	}
	double getAverage() {
		return (getTotal()) / 3;
		// ����� : return (double)this.getTota() / 3;
	}
	
}
