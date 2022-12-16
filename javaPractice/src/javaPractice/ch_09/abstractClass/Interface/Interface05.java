package javaPractice.ch_09.abstractClass.Interface;

// �������̽����� ������ ����� �� ����, ���(���� �� X)�� �� �� ����
interface Skinnable { // �������̽� ��� ��� ��
	int BLACK = 0;		// ����	// public static final
	int RED = 1;		// ����	
	int GREEN = 2;		// �ʷ�
	int BLUE = 3;		// �Ķ�
	int LEOPARD = 4;	// ǥ������
	
	void changeSkin(int skin);	// ��Ų ����	// public abstract
}

class PortablePlayer implements Player, Skinnable {
	private int skin = BLACK;

	public PortablePlayer() { }	// ������
	
	

	@Override
	public void play() {
		System.out.println("�� ��� ����!");
		
	}

	@Override
	public void stop() {
		System.out.println("�� ��� ����!");
		
	}
	
	@Override
	public void changeSkin(int skin) {
		System.out.print("��Ų�� ");
		switch(skin) {
		case BLACK: System.out.print("����");		break;
		case RED:	System.out.print("����");		break;
		case GREEN:	System.out.print("�ʷ�");		break;
		case BLUE:	System.out.print("�Ķ�");		break;
		case LEOPARD:	System.out.print("ǥ�� ����");		break;
		default:	System.out.print("�⺻��");		break;
		}
		System.out.println("(��)�� �����߽��ϴ�.");
		
	}
}

public class Interface05 {

	public static void main(String[] args) {
		PortablePlayer a = new PortablePlayer();
		a.play();			// ���
		a.stop(); 			// ����
		//System.out.println(Skinnable.LEOPARD);
		a.changeSkin(Skinnable.LEOPARD);	// ��Ų�� ǥ�� ���̷� ����
	}

}
