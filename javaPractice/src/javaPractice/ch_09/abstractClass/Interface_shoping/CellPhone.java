package javaPractice.ch_09.abstractClass.Interface_shoping;

// Product �߻� Ŭ������ ��ӹ޾� ������ Cellphone Ŭ����
public class CellPhone extends Product {
	String carrier; // ��Ż�
	String company; // ������
	
	public CellPhone (String pname, int price, String carrier, String company, int code) {
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
		this.company = company;
		this.code = code;
	}

	@Override
	public void printExtra() {
		System.out.println("��Ż� : " + carrier);
		System.out.println("������ : " + company);
	}
	

}
