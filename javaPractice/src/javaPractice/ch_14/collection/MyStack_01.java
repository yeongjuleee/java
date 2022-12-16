package javaPractice.ch_14.collection;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) { // 스택의 맨 뒤에 요소를 추가 
		arrayStack.add(data);
	}
	
	public String pop() {	
		int len = arrayStack.size();	// 저장된 개수. len : length (길이)
		if (len == 0) {	// 길이가 0이면, 
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return (arrayStack.remove(len - 1));	// 맨 뒤에 있는 자료 반환하고 배열에서 제거
								// -1인 이유 : 인덱스 번호로 하기 위함.
	}
	
	// push(E Item) : 주어진 객체를 스택에 넣음
	// peek() : 스택의 맨 위 객체를 가져옴. 객체를 스택에서 제거 X => get만 함
	// pop() : 스택의 맨 위의 객체를 가져옴. 객체를 스택에서 제거 O	=> remove 할 수 있음.
	
	// peek 구현
	public String peek() {
		int len = arrayStack.size();	// 저장된 개수
		if (len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return (arrayStack.get(len - 1));	// 맨 뒤에 있는 자료 반환
	}
}

public class MyStack_01 {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");	// 가장 위에 있어서 C만 보임. 
		
		System.out.println(stack.peek());	// C	peek으로 살아있음.
		
		
		System.out.println(stack.pop());	// C	C가 반환이 되고 pop이라서 제거됨 C 제거됨
		System.out.println(stack.pop());	// B	B가 반환되고 B가 제거됨
		System.out.println(stack.pop());	// A	
	}

}
