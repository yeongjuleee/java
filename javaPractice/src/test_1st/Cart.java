package test_1st;

public class Cart {
	// 필드
	int prductID, cnt, price;	// 상품 코드, 개수, 가격
	String productName;	// 상품 이름
	
	// 생성자
	Cart(int prductID, int cnt, int price, String productName) {
		this.prductID = prductID;	// 상품 코드
		this.cnt = cnt;				// 구매 개수
		this.price = price;			// 상품 가격
		this.productName = productName;	// 상품 이름
	}

	@Override
	public String toString() {
		return "상품번호 : " + prductID + ", 상품이름 : " + productName + ", 갯수 : " + cnt + ", 상품가격 : " + price + " ( 제품 * 가격 : " + (cnt * price)  + ")";
	}

	
	
}
