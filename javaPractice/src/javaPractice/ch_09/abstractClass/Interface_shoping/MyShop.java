package javaPractice.ch_09.abstractClass.Interface_shoping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// IShop 인터페이스를 구현한 MyShop 클래스
public class MyShop implements IShop {
	// 등록 회원 정보 배열
	User[] users = new User[2];
	
	// 등록 상품 정보 배열
	Product[] products = new Product[4];
	
	// 상품 추가를 위한 장바구니
	ArrayList<Product> cart = new ArrayList<Product>();
	
	// 키보드 입력으로 문자열 입력 받기 위한 Scanner 객체 생성
	Scanner scan = new Scanner(System.in);
	
	// 선택된 사용자 index 보관
	int selUser;
	
	// 쇼핑몰 이름
	String title;
	
	@Override
	public void setTitle(String title) { // 쇼핑몰 제목(이름) 설정
		this.title = title;
		
	}

	// 프로그램에서 사용하기 위한 예제 사용자 등록 메소드
	@Override
	public void genUser() {
		// 기존 것
//		User user = new User("홍길동", PayType.CARD);
//		users[0] = user;
//		user = new User("블로거", PayType.CASH);
//		users[1] = user;
		
		// user  를 입력 받아 사용하기 
	
		// 강사님의 방법
		PayType[] payTypes = {PayType.CASH, PayType.CARD};
		System.out.print("사용자 이름을 입력해 주세요 : ");
		String userName = scan.next();
		System.out.println("결제 수단을 선택해 주세요. CASH(0), CARD(1)");
		int payTypeInt = scan.nextInt();
		
		User user = new User(userName, payTypes[payTypeInt]);
		users[0] = user;
		
	}
	
	// 프로그램에서 사용하기 위한 예제 상품 등록 메소드
	@Override
	public void genProduct() {
		CellPhone cellPhone = new CellPhone("갤럭시S22Ultra", 2000000, "KT", "삼성", 20000909);
		products[0] = cellPhone;
		cellPhone = new CellPhone ("아이폰 13", 2100000, "SKT", "애플", 20000314);
		products[1] = cellPhone;
		SmartTV smartTV = new SmartTV("삼성 3D Smart TV", 5000000, "4k", 55, 19990421);
		products[2] = smartTV;
		smartTV = new SmartTV("LG Smart TV", 2500000, "Full HD", 32, 20031204);
		products[3] = smartTV;
		
	}

	// 프로그램 메인 시작 메소드
	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("==================================");
		int i = 0;
		
		// 등록된 사용자 정보 출력
		for(User user : users) {
			// 기존
			// System.out.printf("[%d]%s(%s)\n", i++, user.getName(), user.getPayType()); => 원래는 C 언어에서 어쩌고 안 해도 됨
			//System.out.println("[" + i++ + "]" + user.getName() + "(" + user.getPayType() + ")");
			
			// user를 입력받아서 사용하기 (강사님의 방법)
			if (user != null) { // 배열 값이 차있으면, 인덱스 번호 i에 입력받은 이름과 결제방법을 출력함.
				System.out.println("[" + i++ + "]" + user.getName() + "(" + user.getPayType() + ")");
			}
		}
		
		System.out.println("[x]종 료");
		System.out.print("선택 : ");
		String sel = scan.next();
		System.out.println("## " + sel + "선택 ##");
		
		// 선택된 메뉴에 따라 처리
		switch(sel) {
			case "x" : 
				System.exit(0);
				break;
			
			default:
				selUser = Integer.parseInt(sel); 
				// 문자열로 다 입력을 받은 후에, 숫자로 형변환
				// 처음부터 숫자로 받으면 x를 입력받을 수 없음.
				productList();
		}
	}
		// 상품 목록을 보고 상품을 선택해 장바구니에 넣기 위한 메소드
		public void productList() {
			System.out.println(title + " : 상품 목록 - 상품 선택");
			System.out.println("==================================");
			int i = 0;
			
			// 등록된 상품 정보 출력
			for (Product product : products) {
				System.out.print("[" + i + "]");
				product.printDetail();
				i++;
			}
			
			System.out.println("[h]메인화면");
			System.out.println("[c]체크아웃");
			System.out.print("선택 : ");
			String sel = scan.next();
			System.out.println("##" + sel + "선택 ##");
			
			// 선택된 메뉴에 따라 처리
			switch (sel) {
				case "h":
					start();
					break;
				
				case "c":
					checkOut();
					break;
				
				default:
					int psel = Integer.parseInt(sel);
					cart.add(products[psel]);
					productList();
					
			}
		}
		
		// 결제 진행을 위한 체크아웃 처리 메소드
		public void checkOut() {
			System.out.println(title + " : 체크아웃");
			System.out.println("==================================");
			int total = 0;
			int i = 0;
			
			// 장바구니에 등록된 상품 정보 출력
			for (Product p : cart) {
				//System.out.printf("[%d]%s(%s)\n",i++, p.pname, p.price); => C언어를 println으로 바꾸기
				System.out.println("[" + i++ + "]" + p.pname + "(" + p.price + ")");
				total +=  p.price;
			}
			System.out.println("==================================");
			

			
			// 1. 배열 이용 
			// 중복 상품 없이 출력을 위해 임시 저장
			System.out.println("배열 사용");
			int maxIdx = 10;
			int curIdx = 0; // 현재 저장된 개수 & 앞으로 저장될 요소의 idx
			
			int [] cnts = new int[maxIdx]; // 제품의 개수
			Product[] productsTmp = new Product[maxIdx];
			// 여쭤보기
			for (Product p: cart) {
				boolean isDup = false;  //  중복 여부를 알기위한 변수. isDup = false : 중복이 없는 상태
				int idxDup = 0; // 중복이 있을 경우, 해당되는 idx 번호
				
				for (int j = 0; j < curIdx; j++) { // j가 curIdx 보다 작을때 까지  저장된 범위 만큼만 보기
					if (productsTmp[j].code == p.code) { // 상품이 담겨져 있으면
						isDup = true; // isDup의 값을 true로 변경 > 중복이 있음
						idxDup = j;
						break;
					}
				}
				
				if (!isDup) { // 중복 없는 경우. isDup = false (장바구니 등록 코드)
					cnts[curIdx] = 1; // 중복이 없을 경우 개수 저장 (새로 생성)
					productsTmp[curIdx] = p;	// 임시 저장소의 cart 객체, product를 넣는다. 
					
					// System.out.println(curIdx + " 인덱스에 상품 처리");
					curIdx++; 
				}
				else { // 중복이 있는 경우. (선택한 상품이 이미 장바구니에 들어있을 경우)
					cnts[idxDup] += 1;
					//	cnts = 제품 개수를 세는 변수. 
				}
			}
			for (int j = 0; j < productsTmp.length; j++) {
				if(productsTmp[j] != null ) {
					System.out.println("[" + j + "]" + productsTmp[j].code + ", " + productsTmp[j].pname + ", " 
							+ productsTmp[j].price + ", 갯수 : " + cnts[j]);
				}
			}
			
			// 2. ArrayList 이용 : ArrayList의 길이를 구하려면 size() 메소드를 사용해야 함! 
			// 중복 여부만 확인할거면 ArrayList.contains()을 사용하면 되는데,
			//									-> contains() : 리스트 안에 어떤 객체가 있는지 확인하는 메소드. 리스트에 그 객체가 존재하면 true를 리턴.
			// 반환형이 boolean 이랑 중복된 값을 가지고 있는 요소의 인덱스 번호를 알 수 없음
			// 중복이 될 경우에 해당 요소의 값을 1 증가 해야되서 ArrayList.contains()으로 부족
			
//			System.out.println("ArrayList 컬렉션 사용");
//			curIdx = 0;
//			ArrayList<Integer> cartCntTmp = new ArrayList<Integer>(); // 숫자를 넣는 배열
//			ArrayList<Product> cartTmp = new ArrayList<Product>();	// 상품이 있는 배열
			
//			for (Product product : cart) {
//				boolean isDup = false; // 중복O (선택한 상품이 이미 장바구니에 들어 있는 경우)
//				int idxDup = 0; // Dup의 index번호?
			
//				for (int k = 0; k < cartTmp.size(); k++) {
//					if (product.code == cartTmp.get(k).code) {
//						
//					isDup = true;
//					idxDup = k;
//					break;
//				}
//			}
//			if (!isDup) { // 선택한 상품이 장바구니에 없는 경우
//				cartTmp.add(product);
//				cartCntTmp.add(1);
//			} else {
//				cartCntTmp.set(idxDup, cartCntTmp.get(idxDup) + 1);
//			}
//				
//		}
//		i = 0; // index 번호? 그런데 어떤 것?? 상품의 index? 
			
//		for (int k= 0; k < cartTmp.size(); k++) { // 상품이 존재하면, for문을 돌림.  
															// ArrayList의 배열에 접근하기 위해서는 get() 메소드를 이용해야함. get(인덱스번호)
//			System.out.println("[" + i++ + "]" + cartTmp.get(k).code + ", " + cartTmp.get(k).pname + ", "
//					+ cartTmp.get(k).price + ", 갯수 : " + cartCntTmp.get(k));
//		}
//		
//		// 3. Map 컬렉션 사용
//		System.out.println("Map 컬렉션 사용");
//		i = 0;
//		Map<Product, Integer> map = new HashMap<Product, Integer>();
//		for(Product product:cart) {
//			if(map.containsKey(product)) { // 중복이있는 경우
//				map.put(product, map.get(product) + 1);
//			}
//			else {
//				map.put(product, 1);
//			}
//		}
//		for (Map.Entry<Product, Integer> entry : map.entrySet()) {
//			System.out.println("[" + i++ + "]" + entry.getKey().code + ", " + entry.getKey().pname + "," 
//					+ entry.getKey().price + ", 갯수 : " + entry.getValue());
//		}
		
		// 선택한 사용자의 결제 방법 출력 기본
		System.out.println("결제 방법 : " + users[selUser].getPayType());
		
		// 합계 출력
		System.out.println("합계 : " + total + " 원 입니다.");
		System.out.println("[p]이전, [q] 결제 완료");
		System.out.print("선택 : ");
		String sel = scan.next();
		
		// 선택된 메뉴에 따라 처리
		switch(sel) {
			case "q":System.out.println("## 결제가 완료 되었습니다. 종료합니다 ##");
				System.exit(0); break;
			
			case "p":productList(); break;
			default: checkOut();
		}
	}
	
	
}
