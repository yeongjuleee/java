package javaPractice.ch_13.generic;

// Generic MethodTest
// ���׸� Ÿ�� �޼ҵ� : �޼ҵ忡 Ÿ�� �Ű� ������ ����Ͽ� �����ϴ� ��
// �Ű� ������ ����ϴ� Ÿ�� �Ű������� ��ȯ�� �տ� ����

class GenMethod {
	public <K, V> boolean compare(K fKey, V fValue, K sKey, V sValue) { // ��ȯ�� ����
		if (fKey.equals(sKey) && fValue.equals(sValue)) {
			return true;
		}
		return false;
	}
}

public class MyGeneric_04 {

	public static void main(String[] args) {
		GenMethod genMethod = new GenMethod();
		
		// �޼ҵ��� ȣ��ÿ��� ��ü.<Ŭ��������>�޼ҵ��̸�(�Ű�������) �������� ���
		// <Ŭ��������>�� ���� ����. �����Ϸ��� �Ű������� �ʿ��� Ÿ���� �߷�
		boolean check = genMethod.<Integer, String>compare(1, "������", 1, "������");
		// <Integer : K , String : V > �� . ���⼭ Ÿ���� ��� ���� ��! �Ű������� ���� �����Ϸ��� �߷��� �����ϱ� ����
		System.out.println("check: " + check);	// true;

	}

}
