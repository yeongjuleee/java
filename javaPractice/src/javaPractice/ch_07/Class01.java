package javaPractice.ch_07;
// ��Ű������ ������ Ŭ���� 1���� �� �� ����. (??)
// ���� ��Ű�� ���� ���� �Ѵٸ� ���� �ҷ����� ������ �ʿ� X
// Ŭ������ ù ���ڸ� �� �빮�ڷ� �־�߸� ��! �׳� �׷�����

class Car1 {
	// �Ӽ�����
	boolean powerOn; // �ڵ��� �õ� ����. �õ� �ѱ�/�� �ѱ� 2���� ���� �����ϸ� �Ǵϱ� boolean
	String color; // ������ ����
	int wheel; // ������ ��. ���� ��κ� �����̴ϱ� int
	int speed; // �ӷ� ���� ���� Ȯ�� => int
	boolean wiperOn; // wiper�� �۵��ϰ� �� �ϰ� �� ���� 2���� ����� => boolean ���� 2���� ��� ��
	
	
	// �޼ҵ� ����
	void power() { // void = return ���� ������ �� �� ����
		powerOn = !powerOn; // �õ� �޼ҵ�. powerOn�� Ÿ���� boolean ��. �׷��� �� ���� ���� �� ���� 
	}
	void speedUp() {
		speed++; // ���� �޼ҵ�. speed�� �ӷ����� int Ÿ����. 
	}
	void speedDown() {
		speed--; // �극��ũ �޼ҵ�. 
	}
	void wiper() {
		wiperOn = !wiperOn; // ������ �޼ҵ�. 
	}
}

public class Class01 {

	public static void main(String[] args) {
		

	}

}
