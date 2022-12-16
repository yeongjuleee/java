package javaPractice.ch_09.abstractClass;

/*
������ �ʵ� num1, num2 �� �ִ�.
num1, num2�� ����Ͽ� Ư�� ����� �����ϴ� int calc() �޼ҵ带 �߻� �޼ҵ�� �����Ѵ�.
void printResult() �޼ҵ�� 
�Ϲ� �޼ҵ�� calce() �޼ҵ� ���� ��� ������ �޾� ����ϵ��� �̸� �����Ѵ�.

1. �� �䱸 ������ �����ϴ� �߻� Ŭ���� Calculator �� �ۼ��϶�.

2. Calculator �߻� Ŭ������ ��ӹ޴� MyCalculator Ŭ������ �����϶�.
*/

abstract class Calculator {
	// �ʵ�
	int num1, num2;
	
	// �߻� �޼ҵ�
	abstract int calc();
	
	// �Ϲ� �޼ҵ�
	void printResult() {
		System.out.println("calc() ���� ����� ���� " + calc() + "�Դϴ�." );
	}
}

class MyCalculator extends Calculator {

	@Override
	int calc() {
		return this.num1 + this.num2;
	}
	
}

public class AbstractMethod04 {

	public static void main(String[] args) {
		
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.num1 = 10;
		myCalculator.num2 = 20;
		myCalculator.printResult(); // calc() ������ ����� 30 �Դϴ�.
	}

}
