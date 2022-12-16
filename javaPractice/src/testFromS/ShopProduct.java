package testFromS;

/*
 * 5. ShopProduct 클래스는 생성자에서 상품을 저장하고, 
 * 장바구니에 상품을 담기전에 어떤 상품이 있는지 보여주는 기능만 들어가면 됩니다.
    상품은 실행 예에 나오는 상품 3개만 입력하십시요. */

public class ShopProduct {
	Product[] products = new Product[3]; 
	
	ShopProduct() {
		products[0] = new Product(1, "블랜딩 커피", 5000);
	    products[1] = new Product(2, "파나마 게이샤", 15000);
	    products[2] = new Product(3, "이디오피아커피", 10000);
	}
	
	public void printProduct() {
		
		
	 for (int i =0; i < products.length; i++) {
		 
            System.out.println("상품 코드: " +products[i].getProductID()
                    + ", 상품이름: " + products[i].getProductName() + ", 가격: " + products[i].getPrice());
        }
	}
	
	
	
	

}
