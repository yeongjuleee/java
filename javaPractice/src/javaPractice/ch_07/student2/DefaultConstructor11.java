package javaPractice.ch_07.student2;

class Student2 {
	// �Ӽ� ����(����, ���)
	String name; // �̸�
	int ban; // ��
	int no; // ��ȣ
	int kor; // ���� 
	int eng; // ����
	int math; // ����
	int total; // ����
	double average; // ���
	
	
	// �⺻�����ڿ� �޼ҵ��� ��������?
	
	// �⺻ ������ ���� 
	public Student2 (String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		
	}
	
	// ���(�޼ҵ� ����)
	public String toString() {
		return "�̸� : " + name + ", �� : " + ban + ", ��ȣ : " + no;
	}
	
	public void updateRecord (int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return (kor + eng + math);
	}
	
	public double getAverage() {
		return getTotal() / 3.0;
	}
	
	
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBan (int ban) {
		this.ban = ban;
	}
	
	public int getBan() {
		return ban;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public int getNo () {
		return no;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getEng() {
		return eng;
	}
	
}

public class DefaultConstructor11 {

	/*
	Student Ŭ������ �����Ͻÿ�
	�̸��� name, �� ban, ��ȣ no �� �Է¹޴� �����ڸ� ����ÿ�.
	���� kor, ���� eng, ���� math ������ �Է¹޴� updateRecord() �޼ҵ带 �ۼ��Ͻÿ�.
	�л��� �̸��� ��ȯ�ϴ� getName(), �Է¹��� ������ �հ踦 ���ϴ� getTotal(), 
	����� ��ȯ�ϴ� getAverage()�� �ۼ��Ͻÿ�.
	*/
	
	public static void main(String[] args) {
		Student2 s = new Student2 ("ȫ�浿", 1, 1);
		s.updateRecord(100, 60, 76);
		System.out.println(s);
		
		System.out.println("�̸�: " + s.getName());
		System.out.println("����: " + s.getTotal());
		System.out.println("���: " + s.getAverage());
		

	}

}
