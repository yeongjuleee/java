package javaPractice.ch_10.exceptionHandling;
// ����� ���� ����ó��

class AgeException extends Exception {
	// ��� Ŭ������ Exception�� ����� ���� �� ����
	
	// ������
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
	
	public void printStackTrace() {
		System.out.println(getMessage());
		super.printStackTrace();
	}
}


public class Example06 {
	public static void ticketing(int age) throws AgeException {
		// Ƽ������ �Ű����� int age 
		// AgeException(������)�� �ش�Ǵ� ���ܸ� throws(����)
		
		if(age < 0) {
			throw new AgeException("���� �Է��� �߸��Ǿ����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		// throws �� ���ܸ� �޴� ��
		int age = -19;
		try {
			ticketing(age);
		}
		catch (AgeException e) {
			e.printStackTrace();
		}

	}

}
