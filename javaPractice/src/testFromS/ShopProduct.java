package testFromS;

/*
 * 5. ShopProduct Ŭ������ �����ڿ��� ��ǰ�� �����ϰ�, 
 * ��ٱ��Ͽ� ��ǰ�� ������� � ��ǰ�� �ִ��� �����ִ� ��ɸ� ���� �˴ϴ�.
    ��ǰ�� ���� ���� ������ ��ǰ 3���� �Է��Ͻʽÿ�. */

public class ShopProduct {
	Product[] products = new Product[3]; 
	
	ShopProduct() {
		products[0] = new Product(1, "���� Ŀ��", 5000);
	    products[1] = new Product(2, "�ĳ��� ���̻�", 15000);
	    products[2] = new Product(3, "�̵���Ǿ�Ŀ��", 10000);
	}
	
	public void printProduct() {
		
		
	 for (int i =0; i < products.length; i++) {
		 
            System.out.println("��ǰ �ڵ�: " +products[i].getProductID()
                    + ", ��ǰ�̸�: " + products[i].getProductName() + ", ����: " + products[i].getPrice());
        }
	}
	
	
	
	

}
