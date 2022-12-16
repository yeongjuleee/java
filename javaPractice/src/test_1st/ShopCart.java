package test_1st;

import java.util.Scanner;

/* 1. 기본
    장바구니에 상품을 저장하고 출력하는 기능
		고객이 선택한 상품코드를 기준으로 상품을 저장, 추가로 상품을 선택 받을지 입력 받기
			1. Y를 입력하면 추가로 장바구니에 상품을 담고, N을 입력하면 지금까지 선택한 상품의 상품코드 갯수 출력
			2. 장바구니에 저장 가능한 최대 개수는 10개
*/

/*
	2. 응용 
	
		1) 장바구니 상품 추가 시에 동일한 상품 번호가 있는 경우 갯수만 늘이도록 -> 중복 제거하기. (O)
		2) 장바구니에 담은 상품 목록 출력시에 상품 이름이 나오도록(O)
		-> 장바구니에 담을 때 상품 이름이 저장되도록 할 것인지 OR 출력시에 불러 올 것인지 => 저장되도록 함
		3) 장바구니에 담은 상품 목록 출력시 개별 상품의 합계 금액이 나오도록 (갯수 * 객단가) (O)
		4) 장바구니에 담은 상품 목록 출력시 전체 결제 금액이 나오도록(O)
		5) 장바구니 상품 추가시 없는 상품 번호가 있는 경우 재입력 받도록(O)
*/	

public class ShopCart {
	Scanner stdIn = new Scanner(System.in);
	Cart[] carts = new Cart[3]; // 장바구니 최대 저장 개수 10개 => 배열 
	int cntCart = 0; // 제품 입력 인덱스
	boolean run = true; // while 반복을 하기 위한 boolean값
	
	
	public void selectProduct() {	// 상품 선택
		int prductID = 0, cnt, price;
		String productName;

		
		do {
			while (run) {
				System.out.println("구매할 상품의 번호를 입력해 주세요 >> ");
				prductID = stdIn.nextInt();
				if(prductID > 0 && prductID <= carts.length ) {
					run = false;
				}
				
			}
			System.out.print("상품의 구매 갯수를 입력해 주세요 >> ");
			cnt = stdIn.nextInt();
			
			for (int i =0; i < carts.length; i++) { // 1) 장바구니 상품 추가 시에 동일한 상품 번호가 있는 경우 갯수만 늘이도록 -> 중복 제거하기.
				if(carts[i] == null) { // carts[i] 에 아무것도 없으면, carts 배열 생성 
					if (prductID == 1) { 
						carts[i] = new Cart(prductID, cnt, 10000, "바인더");
					}
					else if (prductID == 2 ) {
						carts[i] = new Cart(prductID, cnt, 15000, "정규 1집 앨범");
					}
					else {
						carts[i] = new Cart(prductID, cnt, 80000, "Blu-ray");
					}
				break;
				}
				else { // carts[i] 에 상품이 들어있으면
					if (carts[i].prductID == prductID) {
						carts[i].cnt += cnt;
						break;
					}
				}
			}
			
			
			// 기존 것
			//carts[cntCart] = new Cart(prductID, cnt, price, productName);
			//cntCart++;
		}
		while (confirmReShopping());
	
	}
	
	boolean confirmReShopping() {	// 재구매 여부
		while(true) {
			System.out.println("상점에서 상품을 더 구매 하시겠습니까?");
			System.out.println("더 구매를 원하시면 Y, 쇼핑을 멈추시려면 N을 입력해 주세요 >> ");
			
			
			String answer = stdIn.next();
			if (answer.equals("Y") || answer.equals("y")) {
				run = true; // 재구매 Y를 누르면 selectProduct에 있는 while 의 run 값을 false > true로 바꿔준다
				return true;
			}
			else if (answer.equals("N") || answer.equals("n")) {
				return false;
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	void printCart() {	// 장바구니에 담은 상품 출력
		int i = 0; // 상품 번호(인덱스 번호)?
		int total = 0; // 총 결제 금액
		
		for (Cart c: carts) {
			if (c != null) {
				total += c.price * c.cnt; // 4) 장바구니에 담은 상품 목록 출력시 전체 결제 금액이 나오도록
				System.out.println(c);
			}
		}
		System.out.println("총 결제 금액은 " + total + "원 입니다."); // 4) 장바구니에 담은 상품 목록 출력시 전체 결제 금액이 나오도록

	} // prictCart 괄호
} // class 괄호
