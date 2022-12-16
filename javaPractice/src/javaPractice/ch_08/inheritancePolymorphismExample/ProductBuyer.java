package javaPractice.ch_08.inheritancePolymorphismExample;

/*
바이어가 Tv도 사고 Computer도 사도록 하기
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
		
		System.out.println("현재 남은 돈은 " + buyer.money + "만원 입니다.");
		System.out.println("현재 보너스 점수는 " + buyer.bonusPoint + "점 입니다.");

	}

}
