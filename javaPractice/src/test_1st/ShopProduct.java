package test_1st;

/*  ShopProduct Ŭ������ �����ڿ��� ��ǰ�� �����ϰ�, ��ٱ��Ͽ� ��ǰ�� ������� � ��ǰ�� �ִ��� �����ִ� ��ɸ� ���� �˴ϴ�.
��ǰ�� ���� ���� ������ ��ǰ 3���� �Է��Ͻʽÿ�
*/

public class ShopProduct {
	Product[] md = new Product[3];
	
	ShopProduct() {
	md[0] = new Product(1, "���δ�", 10000);
	md[1] = new Product(2, "���� 1�� �ٹ�", 15000);
	md[2] = new Product(3, "Blu-ray", 80000);
	
	}

	public void printProduct() {
		for(Product p: md) {
			System.out.println("��ǰ �ڵ� : " + p.getProductID() + ", ��ǰ �̸�: " + p.getProductName() + ", ���� : " + p.getPrice()); 
		}
	}

	
	
}
