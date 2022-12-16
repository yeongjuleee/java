package javaPractice.ch_08.inheritancePolymorphismExample;

import java.util.ArrayList;

// �������� : 
// 1. ������ ��ǰ�� �����ϴ� ��� �߰�
// 2. ������ ��ǰ�� ���� ������ ����ؼ� �����ִ� ��� �߰�

public class Buyer { // ��, ������ ��� ���
	int money = 1000; 		// ���� �ݾ�
	int bonusPoint = 0; 	// ���ʽ� ����
	
	// ȯ�� ����� �߰��ϱ� ���� �迭 ArrayList�� ����Ǵ� ������ Ÿ�� ����
	ArrayList item = new ArrayList(); 		// ������ ��ǰ�� �����ϴµ� ���� ArrayList ��ü
	
	
	
	// �߰��� ��ǰ ���� ���
	//Product[] item = new Product[10];		// ������ ��ǰ�� �����ϱ� ���� �迭 ����
	//int i = 0;								// Product �迭�� ���� ī����
	
	
	void buy(Product p) { // �θ� Ŭ���� Ÿ������ �Ű� ������ ����
		// �θ� Ŭ������ �ʵ� ���. price, bonusPoint
		
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;			// ���� ������ ������ ��ǰ�� ������ ����
		bonusPoint += p.bonusPoint; // ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		//System.out.println(p.bonusPoint);
		
		// �߰��� ��ǰ ���� ��� 
		//item[i++] = p;				// ��ǰ�� Product[] item�� �����Ѵ�.
		
		// ȯ�� ����� �߰��ϱ� ���� �迭 ArrayList�� ����Ǵ� ������ Ÿ�� ����
		item.add(p);
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void refund(Product p) { // ������ ��ǰ�� ȯ���Ѵ�.
		if(item.remove(p)) { // ��ǰ�� ArrayList���� �����Ѵ�.
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		}
		else { // ���ſ� ������ ���
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	
	
	// �߰��� ��ǰ ���� ��� �޼ҵ�
	void summary() {				// ������ ��ǰ�� ���� ������ ����ؼ� ������
		int sum = 0;				// ������ ��ǰ�� ���� �հ�
		String itemList ="";		// ������ ��ǰ ���
		
		
		if(item.isEmpty()) { // Vector�� ����ִ��� Ȯ����
							 // is~ �� ������� => true; <-> ������ false (?)
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		// Vector�� i��°�� �ִ� ��ü�� ����
		for(int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p;
		}
		
		/*
		// for���� �̿��Ͽ� summary �� �ݾ� �˾Ƴ��� (ȯ�� ��� �ֱ� ��)
		for (i=0; i < item.length; i++) { // i �� 0����, �߰��� ��ǰ �������� ���̱���, i�� ++ ..?
			if (item[i] == null) 
				break;
			sum += item[i].price;
			itemList += item[i] + "," ;
			
		}
		
		// forEach�� �ۼ��ϱ�
		for (Product p : item) {
			if (p == null) {
				break;
			}
			sum += p.price;
			itemList += p + ", ";
		}
		
		for(int i = 0; i < this.i; i++) { i �� 0 ����, item �� index����! ��� �� ����. 
										// ���࿡ �ε�����ȣ�� 3 ������ index 3 ���� �� �ؼ��ؼ� �ݺ��� �ѹ� �� ���� ����.
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		*/
		
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "�� ���Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}

}
