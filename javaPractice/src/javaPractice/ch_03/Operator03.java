package javaPractice.ch_03;

public class Operator03 {

	public static void main(String[] args) {
		// �� ������: ���� ������. 
		//���� boolean ���̸� ��� ���� boolean
		
		//���� : �ΰ� �� ���� ��� true 
		System.out.println(true && true); // true 1*1 = 1 . �ΰ� �� ���� ��� true
		System.out.println(true && false); // false  1*0 = 0.  
		System.out.println(false && true); // false 0*1 = 0.
		System.out.println(false && false); // false 0*0 = 0.
		
		//����: �ΰ��� �� �ϳ��� ���̸� true
		System.out.println(true || true); // true 1+1 = 2
		System.out.println(true || false); // true 1+0 = 1
		System.out.println(false || true); // true 0+1 = 1
		System.out.println(false || false ); // false 0+0 = 0
		
		//�� ������ Ȱ���غ���
		int a = 10;
		System.out.println(5 < a && a < 15); // true && true �� true��
		System.out.println((5 < a && a < 15) && a % 2 == 0); // true && true�� true ��. (10 % 2 �� 10�� 2�� �������� �� ������ �� 0 �ΰ��� ���� �������� true)
		
		a = 4;
		System.out.println((5 < a && a < 15) && a % 2 == 0); // 5< a �� false ������ false.
		System.out.println((5  < a && a < 15) || a % 2 == 0); // 5 < a �� false �̰� a % 2 �� ��� �������� 0 �� �Ǿ� true �̱� ������ true
	}

}
