package javaPractice.ch_09.abstractClass_innerclass;

interface Anony { // �������̽� 
	public void print();
}

public class AnonymousClass02 {
	public void printB(Anony a) {	// �������̽� AnonyŸ���� ��ü�� �Ű������� �޴� �޼ҵ�
		a.print();
		
	}
	
	/*
	�ʿ��� ������ �������̽��� ���� Ŭ������ �ν��Ͻ��� ���� �������� �߻� �޼ҵ带 ������ �� ���
	�ڹٳ� �ȵ���̵忡�� ������ ������� �͸��� ���� Ŭ������ �̿��Ͽ� ȭ�鿡�� �̺�Ʈ ó���� ��
	*/
	
	public static void main(String[] args) {
		AnonymousClass02 t= new AnonymousClass02();
		// AnonyŬ���� �ν��Ͻ��� �� �κп��� �Ͻ������� ����� ��
		
		t.printB(new Anony() { // �� ��ü�� public void print B�� ������ �Ǿ�����, �̸��� ����.. (?)

			@Override
			public void print() {
				System.out.println("�͸� Ŭ���� ��� ���Դϴ�.");
				
			}
			
		});
	}

}
