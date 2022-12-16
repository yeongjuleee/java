package javaPractice.ch_07;

class Area {
	static void manual() { // static�� ���� => Ŭ���� �޼ҵ�
		System.out.println("���� ��� ������ �Լ� ���");
		System.out.println("triangle : �ﰢ�� ����");
		System.out.println("rectangle : �簢�� ����");
		System.out.println("�Դϴ�.");
	}
	
	double triangle(int a, int b) { // �ﰢ�� ���̸� ��ȯ�ϴ� �޼ҵ�
		return (double) a * b / 2;
	}
	
	int rectangle(int a, int b) { // �簢�� ���̸� ��ȯ�ϴ� �޼ҵ�
		return a * b;
	}
}

public class InstanceMethod01 {
	// Ŭ���� �޼ҵ�� ��ü�� �������� �ʾƵ� ȣ�� ����
	// �ν��Ͻ� �޼ҵ�� ��ü�� �����ؾ߸� ȣ���� ����,
	// �ֳ��ϸ� �ν��Ͻ� �޼ҵ� ��ü�� �����Ǿƾ� �޸𸮻� ������ �����ϰ�
	// Ŭ���� �޼ҵ�� Ŭ������ �޸𸮿� �ö� �� �����Ǳ� ����

	public static void main(String[] args) {
		Area.manual(); // Ŭ���� �޼ҵ� ���� ����
		
		// Area.triangle(3, 5); // ���� �߻�!
		// Area.rectangle(3, 5); // ���� �߻�!
			// => ���� �̷��� ����ϰ� �ʹٸ�, 
			// 1. ��ü�� ������ �Ŀ� ����ϴ���
			// 2. Ŭ���� �޼ҵ忡�� �ﰢ��/�簢�� ���̸� ��ȯ�ϴ� �޼ҵ� �տ� static ���̱�.
			
		Area cal = new Area();
		cal.manual();
		System.out.println(cal.triangle(3, 5));
		System.out.println(cal.rectangle(3, 5));

	}

}
