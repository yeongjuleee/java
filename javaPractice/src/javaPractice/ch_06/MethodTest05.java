package javaPractice.ch_06;

public class MethodTest05 {

	// 1. abs() �޼ҵ� �ϼ�
	public static int abs(int value) {
		// value�� ���� 0 ���� ũ�� �״�� ���
		
		// ������� ��
		// 2���� ����� ���� ����. ���̱� ���� ���׿����� ���.
		return (value > 0) ? value : value * -1;
		
		
		//���� ��
		//if (value > 0) {
		//	return value; 
		//}
		//else {
		//	value*-1;
		//}
		// value�� ���� 0���� ������ ��ȣ ����
		
	}
	
	
	public static void main(String[] args) {
		int value = 5; 
		System.out.println(value + "�� ����: " + abs(value));
		value = -10;
		System.out.println(value + "�� ����: " + abs(value));

	}

}
