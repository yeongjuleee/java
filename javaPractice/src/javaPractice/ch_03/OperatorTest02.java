package javaPractice.ch_03;

public class OperatorTest02 {

	public static void main(String[] args) {
		//����, 534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ ������ �� ��
		// 1. �л��� �� ���� ���� �� �ְ�
		// 2. ���������� ��� ������ ���ϴ� �ڵ带 int pencilsLeft = �� ���Ͻÿ�.
		
		int pencils = 534;
		int students = 30;
		
		// �л� �Ѹ��� ������ ���� ��
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		//���� ���� ��
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}

}
