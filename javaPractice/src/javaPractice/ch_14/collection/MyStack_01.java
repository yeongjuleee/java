package javaPractice.ch_14.collection;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) { // ������ �� �ڿ� ��Ҹ� �߰� 
		arrayStack.add(data);
	}
	
	public String pop() {	
		int len = arrayStack.size();	// ����� ����. len : length (����)
		if (len == 0) {	// ���̰� 0�̸�, 
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return (arrayStack.remove(len - 1));	// �� �ڿ� �ִ� �ڷ� ��ȯ�ϰ� �迭���� ����
								// -1�� ���� : �ε��� ��ȣ�� �ϱ� ����.
	}
	
	// push(E Item) : �־��� ��ü�� ���ÿ� ����
	// peek() : ������ �� �� ��ü�� ������. ��ü�� ���ÿ��� ���� X => get�� ��
	// pop() : ������ �� ���� ��ü�� ������. ��ü�� ���ÿ��� ���� O	=> remove �� �� ����.
	
	// peek ����
	public String peek() {
		int len = arrayStack.size();	// ����� ����
		if (len == 0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return (arrayStack.get(len - 1));	// �� �ڿ� �ִ� �ڷ� ��ȯ
	}
}

public class MyStack_01 {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");	// ���� ���� �־ C�� ����. 
		
		System.out.println(stack.peek());	// C	peek���� �������.
		
		
		System.out.println(stack.pop());	// C	C�� ��ȯ�� �ǰ� pop�̶� ���ŵ� C ���ŵ�
		System.out.println(stack.pop());	// B	B�� ��ȯ�ǰ� B�� ���ŵ�
		System.out.println(stack.pop());	// A	
	}

}
