package javaPractice.ch_06;

public class CallByValue {
	// stack ���: �ڷ��� Ÿ���� �̿� ����. 
	// ���α׷� ���۰� �Բ� ȣ��Ǹ� ����Ǹ� �˾Ƽ� �޸�(����)�� �����. 
	
	// �޼ҵ� ȣ�� ���
	// 1. ���� ���� ȣ�� 
	// ���� ���� �޼ҵ� ȣ�� ����� �޼ҵ� ȣ��� ���� ���絵�� ����
	// �޼ҵ��� �Ű����� Ÿ���� �⺻�� �������϶� ���� ���� ȣ���� ��
	
	// �޼ҵ� increase() ȣ��� n�̶�� �Ű������� �޸𸮿� �����Ǿ�
	// var1�� ���� 100�� ����Ǿ� ó��
	// �޼ҵ� ������ ����Ǹ� �Ű����� n�� �޸𸮿��� �Ҹ�
	// ��ó�� ���� ���� ȣ���� ȣ��� �Ű������� ���޵Ǵ� ���� ����Ǿ� ����
	// ���� var1�� ���� ������ ����
	
	public int increase(int n) {
		++n;
		return n;
	}
	
	public static void main(String[] args) {
		// 
		int var1 = 100;
		CallByValue val = new CallByValue();
		int result = val.increase(var1);
		// val1 �� increase(int n) �� n�� ���� > int var1 = int 100�� ��. 
		// �׸��� increase �� �����Ͽ� ++1 �� ��. 
		// return �Ͽ� ������ ��(101)�� result�� ����. 
		
		System.out.println("var1: " + var1 + ", result: " + result);

	}

}
