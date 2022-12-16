package javaPractice.ch_09.abstractClass.Interface;


interface Player { // �÷��̾� �������̽�
	void play();
	void stop();
}

class VideoPlayer implements Player { // ���� �÷��̾�
	private int id; // ������ȣ
	private static int count = 0; // ������� �Ҵ�� ���� ��ȣ.
								  // static ��� => ��ü ���� �ʿ� X
	
	public VideoPlayer() {	// ������
		id = ++count;
	}

	@Override
	public void play() {
		System.out.println("�� ���� ��� ����!");
		
	}

	@Override
	public void stop() {
		System.out.println("�� ���� ��� ����!");
		
	}
	
	public void printInfo() { // ���� ��ȣ ǥ��
		System.out.println("�� ����� ���� ��ȣ�� [" + id + "] �Դϴ�.");
	}
	
	
}

class CDPlayer implements Player { // CD�÷��̾�

	@Override
	public void play() {
		System.out.println("�� CD ��� ����!");
		
	}

	@Override
	public void stop() {
		System.out.println("�� CD ��� ����!");
		
	} 
	
	public void cleaning( ) { // ��� û��
		System.out.println("��带 û���߽��ϴ�.");
	}
	
}

public class interface04 {

	public static void main(String[] args) {
		Player[] a = new Player[2];	// �������̽��� ������ Ÿ������ �ϴ� �迭 ����
									// �������̽��� ��ü�� �� �������� ������ Ÿ������ ���� �� ����
		a[0] = new VideoPlayer();	// ���� �÷��̾�
		a[1] = new CDPlayer();		// CD �÷��̾�
		
		for(Player p : a) {			// for(������Ÿ�� ���� : �迭 a(�긦 ���� => a�� ������ŭ �ݺ���))
			p.play();	// ���
			p.stop();	// ����
			System.out.println();
		}
		
		VideoPlayer[] b = new VideoPlayer[4];	// 0 1 2 3 4 => 5��
		for(int i = 0; i < b.length; i++) {	// i�� 0����, b�� ���̱��� �ݺ�. �ѹ� �ݺ� �� �� ���� i++
			b[i] = new VideoPlayer();
		}
		b[b.length -1].printInfo();	// �� ����� ���� ��ȣ�� [5]�Դϴ�.
		// 5�� ���� -1 �Ǿ� 4�� ���� �� ������, ���� Player p ��� ��ü�� �ϳ� �� �����صξ��� ������ 5��(?)
	}

}
