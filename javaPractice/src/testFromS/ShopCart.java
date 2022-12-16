package testFromS;

import java.util.Scanner;
/*
 * 6. ShopCart 클래스는 고객이 선택한 상품코드를 기준으로 상품을 저장하고, 
 * 추가로 상품을 선택 받을지 입력을 받아
"Y"를 입력하면 추가로 장바구니에 상품을 담고, 
"N"을 입력하면 지금까지 선택한 상품의 상품코드와 갯수를 출력합니다.
(상품 이름과 가격은 출력하지 않습니다.)
장바구니에 저장 가능한 최대 개수는 10개입니다. */

public class ShopCart {
	
	ShopProduct spc; 
	Cart[] carts = new Cart[10]; 
	int count=0;
	int productID; int cnt;
	String productName;
	
	public void printCart() {
		for (int i = 0; i < carts.length; i++) {
	
			if(carts[i]!=null) {
				System.out.println(carts[i]);
			}
		}
	}
		/*for(Cart cart:carts) {
			System.out.println(1);
			if(cart !=null) {
				System.out.println(cart);
			}
		}*/
//	private String findName(int productID) {
//		ShopProduct spr = new ShopProduct();
//		String productName=spr.products[productID-1].getProductName();
//		for(Product p : spr.products) {
//			if(productID == p.getProductID()) {
//				productName= p.getProductName();
//			}
//		}
//		return productName;
//	}
	public void selectProduct() {
		spc = new ShopProduct();
		while(true) {

		System.out.println("구매할 번호를 입력해 주십시오.>>");
		Scanner scanner = new Scanner(System.in);
		productID = Integer.parseInt(scanner.nextLine());
		System.out.println("상품의 구매 개수를 입력해 주십시오.>>");
		cnt = Integer.parseInt(scanner.nextLine());
//		String productName = findName(productID);
		
		//spc.products[productID-1].equals(null)
		
		//장바구니 상품 추가시 없는 상품 번호가 있는 경우 재입력 받는 코
		boolean ck=false;
		for (int i = 0; i < spc.products.length; i++) {
			if(spc.products[i].getProductID()==productID) {
				ck=true;
				carts[count]=new Cart(productID, cnt, productName); //배열에 상품저장
				count++; //배열 index번호 증
				break;
			}
		}
		if(!ck) {
			System.out.println("없는 상품 번호입니다 다시 입력해주세요.");
			continue;
		}
		else {
		System.out.println("상점에서 상품을 더 구매 하시겠습니까?");
		System.out.println("더 구매를 원하시면 Y, 그만 쇼핑하실려면 N을 입력해 주십시요.>>>");
		String bb =scanner.nextLine();
		
			if(bb.equals("Y")) {
				continue; //Y라면 while문 돌아
			}
			else if(bb.equals("N")){ //N라면 while문 브레이크
				break;
			}
		}
		}
	}
	

}
