package javaPractice.ch_13.generic;

import java.util.ArrayList;

/* ������ ���׸��� ������ ���� �迭�� ArrayList�� Ÿ�� �μ� ���� ����غ���
�ٸ� �ڷ����� ������ ���ڿ��� ����������, �� Object�� �ļ������� ���忡 ���� X
������, ��Ҹ� ���� ���� ������ ĳ������ �ؾ��� */


public class Test {

	public static void main(String[] args) {
		ArrayList arNum = new ArrayList(); // Ÿ�� ���� X => ObjectŸ���� ��.
		arNum.add(1); 		// add�� �̿��Ͽ� 0�� idx�� 1�� ������
		arNum.add("���ڿ�"); // add�� �̿��Ͽ� 1�� idx�� "���ڿ�" �� �����
		int value = (int)arNum.get(0); 	// Object Ÿ���� ������ : ��� ���� �� ����ȯ�� �������.
		// int temp = (imt)arNum.get(1);
		System.out.println(value);

		// ArrayList �� Ÿ���� �������� �ʰ� ������ ���, ������ �� ������,
		// ������ ��Ҹ� ���� �� ����ȯ�� ���� ������ ���� �� ����
		// �� �������� �ð��� ���� �ɸ��� �������� �ʷ�
		// �����ϱ� �������� ������ �߻��ߴ��� �� �� ����
	}

}
