package testFromS;

public class Cart {
	// 필드
	ShopProduct p; 
	int productID, cnt;
	String productName;
	int price;
	
	// 생성자
	Cart(int productID, int cnt){
	
		this.productID=productID; //상품 코드
		this.cnt=cnt; //구매개수
	}
	
	// 생성자
	 Cart(int productID, int cnt, String productName) {
		
		p = new ShopProduct();
		this.productID=productID;
		this.cnt=cnt;
		this.productName=productName;  //상품이름
	}
	 
	 public String toString() {
		 //장바구니에 담은 상품 목록 출력시에 상품 이름이 나오도록
		 //-> 장바구니에 담을 때 상품 이름이 저장되도록 할 것인지 혹은 출력시에 불러 올 것인지 정해서 코드
		 //장바구니에 담은 상품 목록 출력시에 개별 상품의 합계 금액이 나오도록 (개수 * 단가)
		return  "상품번호: "+ productID + ", 개수: " + cnt +", 상품이름: "+ p.products[productID-1].getProductName()
				+"\n개별 총 가격 : " + (cnt *p.products[productID-1].getPrice()) ;
	 }
	 
	 
}
