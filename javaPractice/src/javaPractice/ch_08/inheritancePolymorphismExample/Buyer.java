package javaPractice.ch_08.inheritancePolymorphismExample;

import java.util.ArrayList;

// 수정사항 : 
// 1. 구매한 물품을 저장하는 기능 추가
// 2. 구매한 물품에 대한 정보를 요약해서 보여주는 기능 추가

public class Buyer { // 고객, 물건을 사는 사람
	int money = 1000; 		// 소지 금액
	int bonusPoint = 0; 	// 보너스 점수
	
	// 환불 기능을 추가하기 위해 배열 ArrayList로 저장되는 데이터 타입 변경
	ArrayList item = new ArrayList(); 		// 구입한 제품을 저장하는데 사용될 ArrayList 객체
	
	
	
	// 추가된 제품 저장 기능
	//Product[] item = new Product[10];		// 구입한 제품을 저장하기 위한 배열 생성
	//int i = 0;								// Product 배열에 사용될 카운터
	
	
	void buy(Product p) { // 부모 클래스 타입으로 매개 변수를 받음
		// 부모 클래스의 필드 사용. price, bonusPoint
		
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;			// 가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
		//System.out.println(p.bonusPoint);
		
		// 추가된 제품 저장 기능 
		//item[i++] = p;				// 제품을 Product[] item에 저장한다.
		
		// 환불 기능을 추가하기 위해 배열 ArrayList로 저장되는 데이터 타입 변경
		item.add(p);
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void refund(Product p) { // 구입한 제품을 환불한다.
		if(item.remove(p)) { // 제품을 ArrayList에서 제거한다.
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		}
		else { // 제거에 실패한 경우
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	
	// 추가된 제품 저장 기능 메소드
	void summary() {				// 구매한 물품에 대한 정보를 요약해서 보여줌
		int sum = 0;				// 구입한 물품의 가격 합계
		String itemList ="";		// 구입한 물품 목록
		
		
		if(item.isEmpty()) { // Vector가 비어있는지 확인함
							 // is~ 가 비어있음 => true; <-> 차있음 false (?)
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		// Vector의 i번째에 있는 객체를 얻어옴
		for(int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p;
		}
		
		/*
		// for문을 이용하여 summary 의 금액 알아내기 (환불 기능 있기 전)
		for (i=0; i < item.length; i++) { // i 가 0부터, 추가된 제품 저장기능의 길이까지, i를 ++ ..?
			if (item[i] == null) 
				break;
			sum += item[i].price;
			itemList += item[i] + "," ;
			
		}
		
		// forEach로 작성하기
		for (Product p : item) {
			if (p == null) {
				break;
			}
			sum += p.price;
			itemList += p + ", ";
		}
		
		for(int i = 0; i < this.i; i++) { i 가 0 부터, item 의 index까지! 라는 뜻 같음. 
										// 만약에 인덱스번호가 3 까지면 index 3 까지 로 해석해서 반복을 한번 더 하지 않음.
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		*/
		
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만 원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}

}
