package javaPractice.ch_09.abstractClass.Interface_shoping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// IShop �������̽��� ������ MyShop Ŭ����
public class MyShop implements IShop {
	// ��� ȸ�� ���� �迭
	User[] users = new User[2];
	
	// ��� ��ǰ ���� �迭
	Product[] products = new Product[4];
	
	// ��ǰ �߰��� ���� ��ٱ���
	ArrayList<Product> cart = new ArrayList<Product>();
	
	// Ű���� �Է����� ���ڿ� �Է� �ޱ� ���� Scanner ��ü ����
	Scanner scan = new Scanner(System.in);
	
	// ���õ� ����� index ����
	int selUser;
	
	// ���θ� �̸�
	String title;
	
	@Override
	public void setTitle(String title) { // ���θ� ����(�̸�) ����
		this.title = title;
		
	}

	// ���α׷����� ����ϱ� ���� ���� ����� ��� �޼ҵ�
	@Override
	public void genUser() {
		// ���� ��
//		User user = new User("ȫ�浿", PayType.CARD);
//		users[0] = user;
//		user = new User("��ΰ�", PayType.CASH);
//		users[1] = user;
		
		// user  �� �Է� �޾� ����ϱ� 
	
		// ������� ���
		PayType[] payTypes = {PayType.CASH, PayType.CARD};
		System.out.print("����� �̸��� �Է��� �ּ��� : ");
		String userName = scan.next();
		System.out.println("���� ������ ������ �ּ���. CASH(0), CARD(1)");
		int payTypeInt = scan.nextInt();
		
		User user = new User(userName, payTypes[payTypeInt]);
		users[0] = user;
		
	}
	
	// ���α׷����� ����ϱ� ���� ���� ��ǰ ��� �޼ҵ�
	@Override
	public void genProduct() {
		CellPhone cellPhone = new CellPhone("������S22Ultra", 2000000, "KT", "�Ｚ", 20000909);
		products[0] = cellPhone;
		cellPhone = new CellPhone ("������ 13", 2100000, "SKT", "����", 20000314);
		products[1] = cellPhone;
		SmartTV smartTV = new SmartTV("�Ｚ 3D Smart TV", 5000000, "4k", 55, 19990421);
		products[2] = smartTV;
		smartTV = new SmartTV("LG Smart TV", 2500000, "Full HD", 32, 20031204);
		products[3] = smartTV;
		
	}

	// ���α׷� ���� ���� �޼ҵ�
	@Override
	public void start() {
		System.out.println(title + " : ����ȭ�� - ���� ����");
		System.out.println("==================================");
		int i = 0;
		
		// ��ϵ� ����� ���� ���
		for(User user : users) {
			// ����
			// System.out.printf("[%d]%s(%s)\n", i++, user.getName(), user.getPayType()); => ������ C ���� ��¼�� �� �ص� ��
			//System.out.println("[" + i++ + "]" + user.getName() + "(" + user.getPayType() + ")");
			
			// user�� �Է¹޾Ƽ� ����ϱ� (������� ���)
			if (user != null) { // �迭 ���� ��������, �ε��� ��ȣ i�� �Է¹��� �̸��� ��������� �����.
				System.out.println("[" + i++ + "]" + user.getName() + "(" + user.getPayType() + ")");
			}
		}
		
		System.out.println("[x]�� ��");
		System.out.print("���� : ");
		String sel = scan.next();
		System.out.println("## " + sel + "���� ##");
		
		// ���õ� �޴��� ���� ó��
		switch(sel) {
			case "x" : 
				System.exit(0);
				break;
			
			default:
				selUser = Integer.parseInt(sel); 
				// ���ڿ��� �� �Է��� ���� �Ŀ�, ���ڷ� ����ȯ
				// ó������ ���ڷ� ������ x�� �Է¹��� �� ����.
				productList();
		}
	}
		// ��ǰ ����� ���� ��ǰ�� ������ ��ٱ��Ͽ� �ֱ� ���� �޼ҵ�
		public void productList() {
			System.out.println(title + " : ��ǰ ��� - ��ǰ ����");
			System.out.println("==================================");
			int i = 0;
			
			// ��ϵ� ��ǰ ���� ���
			for (Product product : products) {
				System.out.print("[" + i + "]");
				product.printDetail();
				i++;
			}
			
			System.out.println("[h]����ȭ��");
			System.out.println("[c]üũ�ƿ�");
			System.out.print("���� : ");
			String sel = scan.next();
			System.out.println("##" + sel + "���� ##");
			
			// ���õ� �޴��� ���� ó��
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
		
		// ���� ������ ���� üũ�ƿ� ó�� �޼ҵ�
		public void checkOut() {
			System.out.println(title + " : üũ�ƿ�");
			System.out.println("==================================");
			int total = 0;
			int i = 0;
			
			// ��ٱ��Ͽ� ��ϵ� ��ǰ ���� ���
			for (Product p : cart) {
				//System.out.printf("[%d]%s(%s)\n",i++, p.pname, p.price); => C�� println���� �ٲٱ�
				System.out.println("[" + i++ + "]" + p.pname + "(" + p.price + ")");
				total +=  p.price;
			}
			System.out.println("==================================");
			

			
			// 1. �迭 �̿� 
			// �ߺ� ��ǰ ���� ����� ���� �ӽ� ����
			System.out.println("�迭 ���");
			int maxIdx = 10;
			int curIdx = 0; // ���� ����� ���� & ������ ����� ����� idx
			
			int [] cnts = new int[maxIdx]; // ��ǰ�� ����
			Product[] productsTmp = new Product[maxIdx];
			// ���庸��
			for (Product p: cart) {
				boolean isDup = false;  //  �ߺ� ���θ� �˱����� ����. isDup = false : �ߺ��� ���� ����
				int idxDup = 0; // �ߺ��� ���� ���, �ش�Ǵ� idx ��ȣ
				
				for (int j = 0; j < curIdx; j++) { // j�� curIdx ���� ������ ����  ����� ���� ��ŭ�� ����
					if (productsTmp[j].code == p.code) { // ��ǰ�� ����� ������
						isDup = true; // isDup�� ���� true�� ���� > �ߺ��� ����
						idxDup = j;
						break;
					}
				}
				
				if (!isDup) { // �ߺ� ���� ���. isDup = false (��ٱ��� ��� �ڵ�)
					cnts[curIdx] = 1; // �ߺ��� ���� ��� ���� ���� (���� ����)
					productsTmp[curIdx] = p;	// �ӽ� ������� cart ��ü, product�� �ִ´�. 
					
					// System.out.println(curIdx + " �ε����� ��ǰ ó��");
					curIdx++; 
				}
				else { // �ߺ��� �ִ� ���. (������ ��ǰ�� �̹� ��ٱ��Ͽ� ������� ���)
					cnts[idxDup] += 1;
					//	cnts = ��ǰ ������ ���� ����. 
				}
			}
			for (int j = 0; j < productsTmp.length; j++) {
				if(productsTmp[j] != null ) {
					System.out.println("[" + j + "]" + productsTmp[j].code + ", " + productsTmp[j].pname + ", " 
							+ productsTmp[j].price + ", ���� : " + cnts[j]);
				}
			}
			
			// 2. ArrayList �̿� : ArrayList�� ���̸� ���Ϸ��� size() �޼ҵ带 ����ؾ� ��! 
			// �ߺ� ���θ� Ȯ���ҰŸ� ArrayList.contains()�� ����ϸ� �Ǵµ�,
			//									-> contains() : ����Ʈ �ȿ� � ��ü�� �ִ��� Ȯ���ϴ� �޼ҵ�. ����Ʈ�� �� ��ü�� �����ϸ� true�� ����.
			// ��ȯ���� boolean �̶� �ߺ��� ���� ������ �ִ� ����� �ε��� ��ȣ�� �� �� ����
			// �ߺ��� �� ��쿡 �ش� ����� ���� 1 ���� �ؾߵǼ� ArrayList.contains()���� ����
			
//			System.out.println("ArrayList �÷��� ���");
//			curIdx = 0;
//			ArrayList<Integer> cartCntTmp = new ArrayList<Integer>(); // ���ڸ� �ִ� �迭
//			ArrayList<Product> cartTmp = new ArrayList<Product>();	// ��ǰ�� �ִ� �迭
			
//			for (Product product : cart) {
//				boolean isDup = false; // �ߺ�O (������ ��ǰ�� �̹� ��ٱ��Ͽ� ��� �ִ� ���)
//				int idxDup = 0; // Dup�� index��ȣ?
			
//				for (int k = 0; k < cartTmp.size(); k++) {
//					if (product.code == cartTmp.get(k).code) {
//						
//					isDup = true;
//					idxDup = k;
//					break;
//				}
//			}
//			if (!isDup) { // ������ ��ǰ�� ��ٱ��Ͽ� ���� ���
//				cartTmp.add(product);
//				cartCntTmp.add(1);
//			} else {
//				cartCntTmp.set(idxDup, cartCntTmp.get(idxDup) + 1);
//			}
//				
//		}
//		i = 0; // index ��ȣ? �׷��� � ��?? ��ǰ�� index? 
			
//		for (int k= 0; k < cartTmp.size(); k++) { // ��ǰ�� �����ϸ�, for���� ����.  
															// ArrayList�� �迭�� �����ϱ� ���ؼ��� get() �޼ҵ带 �̿��ؾ���. get(�ε�����ȣ)
//			System.out.println("[" + i++ + "]" + cartTmp.get(k).code + ", " + cartTmp.get(k).pname + ", "
//					+ cartTmp.get(k).price + ", ���� : " + cartCntTmp.get(k));
//		}
//		
//		// 3. Map �÷��� ���
//		System.out.println("Map �÷��� ���");
//		i = 0;
//		Map<Product, Integer> map = new HashMap<Product, Integer>();
//		for(Product product:cart) {
//			if(map.containsKey(product)) { // �ߺ����ִ� ���
//				map.put(product, map.get(product) + 1);
//			}
//			else {
//				map.put(product, 1);
//			}
//		}
//		for (Map.Entry<Product, Integer> entry : map.entrySet()) {
//			System.out.println("[" + i++ + "]" + entry.getKey().code + ", " + entry.getKey().pname + "," 
//					+ entry.getKey().price + ", ���� : " + entry.getValue());
//		}
		
		// ������ ������� ���� ��� ��� �⺻
		System.out.println("���� ��� : " + users[selUser].getPayType());
		
		// �հ� ���
		System.out.println("�հ� : " + total + " �� �Դϴ�.");
		System.out.println("[p]����, [q] ���� �Ϸ�");
		System.out.print("���� : ");
		String sel = scan.next();
		
		// ���õ� �޴��� ���� ó��
		switch(sel) {
			case "q":System.out.println("## ������ �Ϸ� �Ǿ����ϴ�. �����մϴ� ##");
				System.exit(0); break;
			
			case "p":productList(); break;
			default: checkOut();
		}
	}
	
	
}
