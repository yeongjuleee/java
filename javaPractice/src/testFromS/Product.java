package testFromS;

public class Product { //��ǰ ���� Ŭ����, ��ٱ��� ������� ��ǰ�� ������
	private final int productID; //��ǰ�ڵ�
	private final String productName; //��ǰ�̸�
	private final int price; //����
	

	
	Product(int productID, String productName, int price){
		//�����ڸ� ���� �Է�
		this.productID=productID;
		this.productName=productName;
		this.price=price;
	}
	int getProductID() {
		return productID;
	}
	String getProductName() {
		return productName;
	}
	int getPrice() {
		return price;
	}
	
	
	
}
