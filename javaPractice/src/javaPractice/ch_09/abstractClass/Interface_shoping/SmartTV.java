package javaPractice.ch_09.abstractClass.Interface_shoping;

// Product Ŭ������ ��ӹ޴� Ŭ������, ����Ʈ TV ��ǰ ������ ����ϴ� �� �ʿ�
public class SmartTV extends Product {
	String resolution;	// �ػ�
	double inch;		// ��ġ

	public SmartTV(String pname, int price, String resolution, double inch, int code) {
		// �����ڷ� ��ǰ�� �̸��� ����, �ػ� ������ �޾Ƽ� ó��
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
		this.inch = inch;
		this.code = code;
	}

	@Override
	public void printExtra() {
		// �߻� Ŭ������ ���ǵ� �߻� �޼ҵ� �������̵�
		// �߰� ������ �ػ� ������ ���
		System.out.println("�ػ� : " + resolution);
		System.out.println("��ġ : " + inch);
		
	}
	
	
	
	
}
