package javaPractice.ch_06;

public class CallByRef {

	// ������ ���� ȣ�� ���
	// �Ű� ������ Ÿ���� ������ Ÿ���� �� ���
	// ������ ���� ȣ���� �޼ҵ� ȣ��� ���� �������� ��ġ�� �Ű������� ������ ��
	
	// ���� ���� ȣ���� �޸𸮿� ������ ���� ������ �� ���
	// ������ ���� ȣ���� �޸��� �ּҸ� �ѱ�� ������ ���� �������� ����. 
	
	// ���ڿ��� ���� ȣ�� ���: ���������� ���ڿ��� �����Ϸ��� ������ �����Ͷ� ���� ���� ȣ���� �� 
	
	public void increase(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		int[] refArray = {100, 800, 1000};
		
		CallByRef ref = new CallByRef();
		
		System.out.println("�޼ҵ� ȣ�� ��");
		for (int i=0; i < refArray.length; i++) {
			System.out.println("refArray[" + i + "]: " + refArray[i]);
		}
		
		

	}

}
