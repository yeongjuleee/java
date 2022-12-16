package javaPractice.ch_07.singleton;

// �ǹ����� ���� ����ϴ� singleton ��� �̸� ����

public class SingletonExample {
	// �����ʵ� ����
	private static SingletonExample singleton = null;

	// ������ ����
	private SingletonExample() {}
	
	// ���� �޼ҵ� ����
	static SingletonExample getInstance() {
		if(singleton == null) {
            singleton = new SingletonExample();
         }
         return singleton;

	}
}
