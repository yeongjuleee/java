package javaPractice.ch_09.abstractClass.Interface;

/*
A ���α׷��ӿ� B ���α׷��Ӱ� �ϳ��� ������Ʈ�� �������� ��,
A ���α׷��ӿ� B ���α׷��Ӱ� ������ Ŭ������ �ϼ����� �ʾҾ,
�����ؾ� �� ��ɵ��� �̸� �����ϰ� ��ȯ Ÿ���� ���� ������ ������ �۾� �����ʹ� �����ϰ� ���� ����
�ٷ� �̷� ��Ӱ� ���� �� => "�������̽�"

�Ʒ� ���� KoreaTour, JapanTour, TorGuide Ŭ������
3���� ���� �۾��� �ϰ�, ���ÿ� ���߿� ���� ���� ���� �������̽��� �����ϱ� ����

�������̽��� �̸� ���� �����ϰ� ��

��, �۾� ������
1. �������̽�(������ ��� ����)
2. ���ÿ� 3���� Ŭ������ �۾�
*/

interface Providable { // �������̽�
	void leisureSports(); // public abstract�� �����ص� java�� �˾Ƽ� �־��� ����
	void sightseeing();
	void food();
}

class KoreaTour implements Providable { // Providable�� �ڼ� Ŭ���� KoreaTour (�ڼ����� �� �� �ִ� �ܼ�: implements)

	@Override
	public void leisureSports() {
		System.out.println("�Ѱ� �������� ������ Ÿ��");
		
	}

	@Override
	public void sightseeing() {
		System.out.println("������ ����");
		
	}

	@Override
	public void food() {
		System.out.println("�󳢵� ���� ����");
		
	} 
	
}

class TourGuide {
	private Providable tour; // �������̽��� Ÿ�� ����
	TourGuide (Providable providable) {
		tour = providable;
		// �������̽��� �������� ����� ��.
	}
	
	// �������̵� �ƴ�!!!
	public void leisureSports() {
		tour.leisureSports();
	}
	
	public void sightseeing() {
		tour.sightseeing();
	}
	
	public void food() {
		tour.food();
	}
}

public class Interface01 {

	public static void main(String[] args) {
		TourGuide guide = new TourGuide(new KoreaTour());
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
		System.out.println();

	}

}
