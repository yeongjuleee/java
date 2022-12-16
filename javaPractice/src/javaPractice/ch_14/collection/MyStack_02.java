package javaPractice.ch_14.collection;

import java.util.Stack;

// Stack �� �̿��� ���� ���̽�
class Coin { // ���� ���̽��� ������ Ŭ����
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

public class MyStack_02 {
	// Stack�� �̿��� ���� ���̽�
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// ������ ����
		coinBox.push(new Coin(100)); 
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while (!coinBox.isEmpty()) { // ���� ���̽��� ����ִ��� Ȯ�� => ���� ���̽��� ������� �ʴٸ�
			Coin coin = coinBox.pop();	// ���� ���̽����� ���� ���� ������ ���� 
										// ���� ���� �ִ� ������ ��ȯ�ǰ� ������. => pop��
			System.out.println("������ ���� : " + coin.getValue() + "��");
		}
//		������ ���� : 10��
//		������ ���� : 500��
//		������ ���� : 50��
//		������ ���� : 100��

	}

}
