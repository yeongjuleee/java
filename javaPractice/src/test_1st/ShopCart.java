package test_1st;

import java.util.Scanner;

/* 1. �⺻
    ��ٱ��Ͽ� ��ǰ�� �����ϰ� ����ϴ� ���
		���� ������ ��ǰ�ڵ带 �������� ��ǰ�� ����, �߰��� ��ǰ�� ���� ������ �Է� �ޱ�
			1. Y�� �Է��ϸ� �߰��� ��ٱ��Ͽ� ��ǰ�� ���, N�� �Է��ϸ� ���ݱ��� ������ ��ǰ�� ��ǰ�ڵ� ���� ���
			2. ��ٱ��Ͽ� ���� ������ �ִ� ������ 10��
*/

/*
	2. ���� 
	
		1) ��ٱ��� ��ǰ �߰� �ÿ� ������ ��ǰ ��ȣ�� �ִ� ��� ������ ���̵��� -> �ߺ� �����ϱ�. (O)
		2) ��ٱ��Ͽ� ���� ��ǰ ��� ��½ÿ� ��ǰ �̸��� ��������(O)
		-> ��ٱ��Ͽ� ���� �� ��ǰ �̸��� ����ǵ��� �� ������ OR ��½ÿ� �ҷ� �� ������ => ����ǵ��� ��
		3) ��ٱ��Ͽ� ���� ��ǰ ��� ��½� ���� ��ǰ�� �հ� �ݾ��� �������� (���� * ���ܰ�) (O)
		4) ��ٱ��Ͽ� ���� ��ǰ ��� ��½� ��ü ���� �ݾ��� ��������(O)
		5) ��ٱ��� ��ǰ �߰��� ���� ��ǰ ��ȣ�� �ִ� ��� ���Է� �޵���(O)
*/	

public class ShopCart {
	Scanner stdIn = new Scanner(System.in);
	Cart[] carts = new Cart[3]; // ��ٱ��� �ִ� ���� ���� 10�� => �迭 
	int cntCart = 0; // ��ǰ �Է� �ε���
	boolean run = true; // while �ݺ��� �ϱ� ���� boolean��
	
	
	public void selectProduct() {	// ��ǰ ����
		int prductID = 0, cnt, price;
		String productName;

		
		do {
			while (run) {
				System.out.println("������ ��ǰ�� ��ȣ�� �Է��� �ּ��� >> ");
				prductID = stdIn.nextInt();
				if(prductID > 0 && prductID <= carts.length ) {
					run = false;
				}
				
			}
			System.out.print("��ǰ�� ���� ������ �Է��� �ּ��� >> ");
			cnt = stdIn.nextInt();
			
			for (int i =0; i < carts.length; i++) { // 1) ��ٱ��� ��ǰ �߰� �ÿ� ������ ��ǰ ��ȣ�� �ִ� ��� ������ ���̵��� -> �ߺ� �����ϱ�.
				if(carts[i] == null) { // carts[i] �� �ƹ��͵� ������, carts �迭 ���� 
					if (prductID == 1) { 
						carts[i] = new Cart(prductID, cnt, 10000, "���δ�");
					}
					else if (prductID == 2 ) {
						carts[i] = new Cart(prductID, cnt, 15000, "���� 1�� �ٹ�");
					}
					else {
						carts[i] = new Cart(prductID, cnt, 80000, "Blu-ray");
					}
				break;
				}
				else { // carts[i] �� ��ǰ�� ���������
					if (carts[i].prductID == prductID) {
						carts[i].cnt += cnt;
						break;
					}
				}
			}
			
			
			// ���� ��
			//carts[cntCart] = new Cart(prductID, cnt, price, productName);
			//cntCart++;
		}
		while (confirmReShopping());
	
	}
	
	boolean confirmReShopping() {	// �籸�� ����
		while(true) {
			System.out.println("�������� ��ǰ�� �� ���� �Ͻðڽ��ϱ�?");
			System.out.println("�� ���Ÿ� ���Ͻø� Y, ������ ���߽÷��� N�� �Է��� �ּ��� >> ");
			
			
			String answer = stdIn.next();
			if (answer.equals("Y") || answer.equals("y")) {
				run = true; // �籸�� Y�� ������ selectProduct�� �ִ� while �� run ���� false > true�� �ٲ��ش�
				return true;
			}
			else if (answer.equals("N") || answer.equals("n")) {
				return false;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
	
	void printCart() {	// ��ٱ��Ͽ� ���� ��ǰ ���
		int i = 0; // ��ǰ ��ȣ(�ε��� ��ȣ)?
		int total = 0; // �� ���� �ݾ�
		
		for (Cart c: carts) {
			if (c != null) {
				total += c.price * c.cnt; // 4) ��ٱ��Ͽ� ���� ��ǰ ��� ��½� ��ü ���� �ݾ��� ��������
				System.out.println(c);
			}
		}
		System.out.println("�� ���� �ݾ��� " + total + "�� �Դϴ�."); // 4) ��ٱ��Ͽ� ���� ��ǰ ��� ��½� ��ü ���� �ݾ��� ��������

	} // prictCart ��ȣ
} // class ��ȣ
