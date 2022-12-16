package test_1st;

public class Product {	// 상품 관련 클래스. 장바구니 사용전에 상품을 보여줌
	// 필드
	private final int productID; 		// 상품 코드
	private final String productName;	// 상품 이름
	private final int price;			// 가격
	
	// 생성자
	Product(int productID, String productName, int price) { // 생성자를 통해 입력
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}
	
	// 메소드
	int getProductID() { // private라서 바로 값을 저장 X => 값을 받아오는 메소드
		return productID;
	}
	
	String getProductName() {
		return productName;
	}
	
	int getPrice() {
		return price;
	}
}
