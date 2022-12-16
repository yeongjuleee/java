package javaPractice.ch_07;

class Check {
	// �ν��Ͻ� ���� instanceVariable : iv
	// Ŭ���� ���� classVariable : cv
	// �ν��Ͻ� �޼ҵ� instanceMethod : im
	// Ŭ���� �޼ҵ� classMethod : cm
	
	static int cv = 5; // Ŭ���� ����
	int iv = 4; // �ν��Ͻ� ����
	
	static void cm() { // Ŭ���� �޼ҵ� : �ܼ� static
		
	}
	
	void im() { // �ν��Ͻ� �޼ҵ�
		
	}
	
	static void cm_Imember() { // Ŭ���� �޼ҵ尡 �ν��Ͻ� ������� ����
		// System.out.println(iv); //���� �߻�!
		// im(); // ���� �߻�
	}
	
	void im_Cmember() {
		// �ν��Ͻ� �޼ҵ尡 Ŭ���� ������� ����
		System.out.println(cv);
		cm();
	}
	
	static void cm_Cmemrber() {
		// Ŭ���� �޼ҵ尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}
	
	void im_Imember() {
		// �ν��Ͻ� �޼ҵ尡 �ν��Ͻ� ����� ����
		System.out.println(iv);
		im();
	}
}

public class ClassInstanceMethod01 {

	public static void main(String[] args) {
		//Check.cm_Imember(); // ����
		Check.cm_Cmemrber(); // ����
		
		Check myinstance = new Check();
		myinstance.im_Cmember(); // ����
		myinstance.im_Imember(); // ����

	}

}
