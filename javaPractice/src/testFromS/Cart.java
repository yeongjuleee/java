package testFromS;

public class Cart {
	// �ʵ�
	ShopProduct p; 
	int productID, cnt;
	String productName;
	int price;
	
	// ������
	Cart(int productID, int cnt){
	
		this.productID=productID; //��ǰ �ڵ�
		this.cnt=cnt; //���Ű���
	}
	
	// ������
	 Cart(int productID, int cnt, String productName) {
		
		p = new ShopProduct();
		this.productID=productID;
		this.cnt=cnt;
		this.productName=productName;  //��ǰ�̸�
	}
	 
	 public String toString() {
		 //��ٱ��Ͽ� ���� ��ǰ ��� ��½ÿ� ��ǰ �̸��� ��������
		 //-> ��ٱ��Ͽ� ���� �� ��ǰ �̸��� ����ǵ��� �� ������ Ȥ�� ��½ÿ� �ҷ� �� ������ ���ؼ� �ڵ�
		 //��ٱ��Ͽ� ���� ��ǰ ��� ��½ÿ� ���� ��ǰ�� �հ� �ݾ��� �������� (���� * �ܰ�)
		return  "��ǰ��ȣ: "+ productID + ", ����: " + cnt +", ��ǰ�̸�: "+ p.products[productID-1].getProductName()
				+"\n���� �� ���� : " + (cnt *p.products[productID-1].getPrice()) ;
	 }
	 
	 
}
