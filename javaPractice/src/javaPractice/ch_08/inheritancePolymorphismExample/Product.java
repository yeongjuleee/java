package javaPractice.ch_08.inheritancePolymorphismExample;

public class Product {
	// �ʵ�
	int price; 			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ ���� �� �����ϴ� ���ʽ� ����
	
	// ������
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0); // ���ʽ� ������ ��ǰ ������ 10%
		
	}
	

}
