package javaPractice.ch_06;

public class Method08 {
	// �޼ҵ� �����ε�
	// �Ű������� Ÿ�� Ȥ�� ������ �ٸ��� ���� �̸��� ���� �޼ҵ带 ������ �� �� �ִ�. 
	// ��, C�� ���̽㿡�� �ش� ����� ����.
	
	
	public static void main(String[] args) {
		printGreet(); //�ȳ��ϼ���
		printGreet("�ȳ�~!"); // �ȳ�~!
		printGreet("�ر�", "��ƴ� ����?"); // �رԾ� ��ƴ� ����?
		printGreet(3); // �ȳ��ϼ��� 3��° ���°ų׿�.

	}
	
	public static void printGreet() {
		
		System.out.println("printGreet() �޼ҵ尡 ����˴ϴ�.");
		System.out.println("�ȳ��ϼ���");
	}
	
	public static void printGreet(String greeting) {
		// ���� �̸��� �޼ҵ尡 ������ �Ű������� ����
		System.out.println("printGreet(String greeting) �޼ҵ尡 ����˴ϴ�.");
		System.out.println(greeting);
	}
	
	public static void printGreet(String name, String greeting) {
		// �Ű������� ���ڿ��� �޼ҵ尡 ������ ������ �ٸ���
		System.out.println("printGreet(String name, String greeting) �޼ҵ尡 ����˴ϴ�.");
		System.out.println(name + "�� " + greeting);
	}
	
	public static void printGreet(int cnt) {
		// �Ű������� �ϳ��� �޼ҵ尡 ������ ������ Ÿ���� �ٸ�
		System.out.println("printGreet(int cat) �޼ҵ尡 ����˴ϴ�.");
		System.out.println("�ȳ��ϼ���" + cnt + "��° ���°Գ׿�.");
	}

}
