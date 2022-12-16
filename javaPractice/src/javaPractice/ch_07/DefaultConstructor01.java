package javaPractice.ch_07;

class Cellphone {
	String model = "Galaxy 22";
	String color;
	int capacity;

	// ������ Ư¡
	// 1. Ŭ���� �̸��� ����
	// 2. ��ȯ�� X
	// 3. �ν��Ͻ� ������ �� �ѹ��� �ڵ� �����

	// ������ ���� X => void �����ڰ� �⺻���� ���� = �⺻������
	// ������ ���� O => �ڹٿ��� �����Ǵ� void ������ �����
	// void �����ڸ� ����Ϸ��� ���� ���Ǹ� ���������.

	Cellphone(String color, int capacity) { // �Ű� ������ �ִ� ������
											// �����ڴ� ��������� ��ܿ� ������.
		this.color = color; // this : ��ü������ ����. �׷��� Ŭ���� Cellphone �� color�� ��Ī.
		this.capacity = capacity;
	}

}
public class DefaultConstructor01 {

	public static void main(String[] args) {
		//Cellphone myphone1 = new Cellphone(); // ���� �߻�! => �ذ� ���: �� �����ڸ� ����� �ֱ�
		Cellphone myphone = new Cellphone("Silver", 64);
		
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);

	}

}
