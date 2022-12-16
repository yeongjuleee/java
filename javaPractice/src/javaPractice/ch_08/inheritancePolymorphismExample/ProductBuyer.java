package javaPractice.ch_08.inheritancePolymorphismExample;

/*
���̾ Tv�� ��� Computer�� �絵�� �ϱ�
*/

public class ProductBuyer {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		Tv tv = new Tv();
		Computer computer = new Computer();
		Audio audio = new Audio();
		
		buyer.buy(tv);
		buyer.buy(computer);
		buyer.buy(audio);
		buyer.summary();
		System.out.println();
		buyer.refund(computer);
		buyer.summary();
		
		System.out.println("���� ���� ���� " + buyer.money + "���� �Դϴ�.");
		System.out.println("���� ���ʽ� ������ " + buyer.bonusPoint + "�� �Դϴ�.");

	}

}
