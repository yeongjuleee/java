package test_1st;

public class Cart {
	// �ʵ�
	int prductID, cnt, price;	// ��ǰ �ڵ�, ����, ����
	String productName;	// ��ǰ �̸�
	
	// ������
	Cart(int prductID, int cnt, int price, String productName) {
		this.prductID = prductID;	// ��ǰ �ڵ�
		this.cnt = cnt;				// ���� ����
		this.price = price;			// ��ǰ ����
		this.productName = productName;	// ��ǰ �̸�
	}

	@Override
	public String toString() {
		return "��ǰ��ȣ : " + prductID + ", ��ǰ�̸� : " + productName + ", ���� : " + cnt + ", ��ǰ���� : " + price + " ( ��ǰ * ���� : " + (cnt * price)  + ")";
	}

	
	
}
