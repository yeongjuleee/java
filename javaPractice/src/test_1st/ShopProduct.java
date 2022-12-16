package test_1st;

/*  ShopProduct 클래스는 생성자에서 상품을 저장하고, 장바구니에 상품을 담기전에 어떤 상품이 있는지 보여주는 기능만 들어가면 됩니다.
상품은 실행 예에 나오는 상품 3개만 입력하십시요
*/

public class ShopProduct {
	Product[] md = new Product[3];
	
	ShopProduct() {
	md[0] = new Product(1, "바인더", 10000);
	md[1] = new Product(2, "정규 1집 앨범", 15000);
	md[2] = new Product(3, "Blu-ray", 80000);
	
	}

	public void printProduct() {
		for(Product p: md) {
			System.out.println("상품 코드 : " + p.getProductID() + ", 상품 이름: " + p.getProductName() + ", 가격 : " + p.getPrice()); 
		}
	}

	
	
}
