package javaPractice.ch_08;

/*
final ���� : ���� �� �̻� ���� X ���
final �޼ҵ� : ������ �� �̻� ���� X �޼ҵ�. �������̵� X
final Ŭ���� : ������ �� �̻� ���� X Ŭ����. ��� X
*/

final class FinalClass {
	final int number = 4; // ��� 
	
}

class Parents { // extends FinalClass ���� �߻�
	final void finalMethod() { // �������̵� �Ұ��� �޼ҵ�
		System.out.println("��� �Ұ����� �޼ҵ�");
	}
}

class Son extends Parents {
	// void finalMethod() ���� �߻�
}

public class InheritanceFinal01 {

	public static void main(String[] args) {
		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
		// member1.number = 5; // ����� ���� X

	}

}
