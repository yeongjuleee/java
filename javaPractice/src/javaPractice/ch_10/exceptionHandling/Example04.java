package javaPractice.ch_10.exceptionHandling;

public class Example04 {
	
	// throw : ���Ƿ� ���ܸ� ����
	
	public static void main(String[] args) {
		// ���� Ŭ������ �ν��Ͻ��� ������ ���� Ű���� throw�� �̿��ϸ� ���� ���ܸ� �߻���ų �� �ִ�
		try {
			Exception e = new Exception ("���� ����");	// ���� Ŭ������ �ν��Ͻ� ������. �����ڿ� ���� ���� ����
			throw e;	// ���ܸ� ����
		// throw new Exception("���� ����"); // ���� �� ���� �� �ٷ� �ٿ� �� �� O
			
		}
		catch (Exception e) {
			System.out.println("���ܹ߻�");
			System.out.println(e.getMessage());	
							// e.getMessage() : �����ڿ��� ������ ���� ���� ���
		
		}

	}

}
