package testFromS;

public class Product { //상품 관련 클래스, 장바구느 사용전에 상품을 보여줌
	private final int productID; //상품코드
	private final String productName; //상품이름
	private final int price; //가격
	

	
	Product(int productID, String productName, int price){
		//생성자를 통해 입력
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
