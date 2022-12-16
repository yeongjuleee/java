package javaPractice.ch_18.java_util_package;

// Ư¡
// 1. �� ���ڵ� ���ִ� ���
// 2. �迭 ��� Ȱ��. �迭�� �޸� ������ ũ�⸦ ���� ���� ����ϸ�, �÷����� ���Ѵ�� �����͸� ���� �� O 
// �迭���� ����, ������ ��
// 3. ��¥�� ������ �� �ִ�
//	 -Date, Calender, GregorianCalendar�� ���� ����� ���� ����Ѵ�
// 4. List �������̽��� ������ �� �ִ� 
//	  List �������̽��� �����ϴ� �͵��� ���� �� ������ ������ ������, �ʱ� �뷮�� ������� X ��
//	  List �������̽��� ������ ������ ������ �迭�� �����̶�� ������ �� O

// 1. �ð� ó��
// �ڹٿ��� �ð��� ���� ó���� �� �ִ� Ŭ������ ����
// �ð��� �ٷ�� �ڷ����� ���� long�̸�, java.util.Calendar Ŭ������ java.util.Date, SimpleDataFormat�� �ִ�.

public class Example01 {

	public static void main(String[] args) {
		// System.currentTimeMillis() : ���� �ü���� �ð��� long Ÿ������ ��ȯ
		// ��ȯ�� �ð��� 1970�� 1�� 1���� �������� ���� �� ��������� �ð��̸� 1/1000�� �������� ȯ���ؼ� ������
		// �޼ҵ尡 ����Ǵ� ������ �ü�� �ð��� ��ȯ�ϱ� ������ �̿��� �ϸ� �۾� �ҿ� �ð��� ����
		
		long start = System.currentTimeMillis();	// �۾��� �����ϱ� ���� �ð� ��ȯ
		System.out.println("���۽ð�: " + start);
		int a = 0;
		for (int i = 1; i < 100000000; i++) {
			a++;
		}
		
		long end = System.currentTimeMillis();	// �۾��� ���� ���� �ð� ��ȯ
		System.out.println("����ð�: " + end);
		System.out.println("�ɸ� �۾� �ð�: " + (end - start));
	}
	// ���۽ð�: 1671151472691
	// ����ð�: 1671151472695
	// �ɸ� �۾� �ð�: 4

}
