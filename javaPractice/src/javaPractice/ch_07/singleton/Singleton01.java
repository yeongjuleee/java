package javaPractice.ch_07.singleton;

// �̱��� (Singleton) :
// ��ü ���α׷����� "!!!�� �ϳ��� ��ü��!!!" ���� �����ؾ��ϴ� ��쿡 ���
// �����ڸ� ȣ���� ��ŭ ��ü�� �����Ǳ� ������
//  !!!�̱����� ������� Ŭ���� �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���ƾ� ��!!!
// �ܺο��� �����ڸ� ȣ���� �� ������ �����ڰ� �տ� private ���������ڸ� Ǯ����

// ���� �ڽ��� Ÿ���� ���� �ʵ带 �ϳ� �����ϰ� �ڽ��� ��ü�� ������ �ʱ�ȭ��
// �����ڰ� private������, Ŭ���� ���ο����� ȣ�� O
// ���� �ʵ嵵 private ���� �����ڸ� �ٿ� �ܺο��� �ʵ尪���� �������� ���ϵ��� ����

// ��� !!!�ܺο��� ȣ���� �� �ִ� ���� �޼ҵ��� getInstance()�� ����!!!�ϰ�,
// ���� �ʵ忡�� �����ϰ� �ִ� �ڽ��� ��ü�� ����

class Singleton {
	// singleton ����� ���
	// 1. �����ʵ� ����
	// private static Ŭ������ singleton = new Ŭ������();
	// 2. ������ ����
	// private Ŭ������() {}
	// 3. ���� �޼ҵ� ����
	// static Ŭ������ getInstance(){
	// return singleton;
	// }
	
	private static Singleton singleton = new Singleton();
	// �� �ڽ��� ��ü�� �ϳ� �����ΰ�, ���� ���ϵ��� private�� ��. 
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
		// ��� ���� �޾Ƽ� ������ ��.. (?)
	}
	
}

public class Singleton01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
