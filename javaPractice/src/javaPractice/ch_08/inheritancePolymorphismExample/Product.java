package javaPractice.ch_08.inheritancePolymorphismExample;

public class Product {
	// 필드
	int price; 			// 제품의 가격
	int bonusPoint;		// 제품 구매 시 제공하는 보너스 점수
	
	// 생성자
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0); // 보너스 점수는 제품 가격의 10%
		
	}
	

}
