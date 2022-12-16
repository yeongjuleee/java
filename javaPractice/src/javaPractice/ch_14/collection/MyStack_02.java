package javaPractice.ch_14.collection;

import java.util.Stack;

// Stack 을 이용한 동전 케이스
class Coin { // 동전 케이스를 구현한 클래스
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

public class MyStack_02 {
	// Stack을 이용한 동전 케이스
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// 동전을 끼움
		coinBox.push(new Coin(100)); 
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while (!coinBox.isEmpty()) { // 동전 케이스가 비어있는지 확인 => 동전 케이스가 비어있지 않다면
			Coin coin = coinBox.pop();	// 동전 케이스에서 제일 위의 동전을 꺼냄 
										// 제일 위에 있는 동전이 반환되고 삭제됨. => pop임
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
//		꺼내온 동전 : 10원
//		꺼내온 동전 : 500원
//		꺼내온 동전 : 50원
//		꺼내온 동전 : 100원

	}

}
