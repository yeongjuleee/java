package javaPractice.ch_07.singleton;

public class SingletonTest01 {

	public static void main(String[] args) {
		
		// �������� ���������ڰ� private���� ���� X
		//Singleton singleton1 = new Singleton(); // ������ ���� �߻�!
		//Singleton singleton2 = new Singleton(); // ������ ���� �߻�!

		
		//Singelton�� �������� ��ü�� ���� ����ϵ��� ��
		Singleton singleton1 = Singleton.getInstance(); 
		Singleton singleton2 = Singleton.getInstance();
		
		if (singleton1 == singleton2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		}
		else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
	
	}

}
