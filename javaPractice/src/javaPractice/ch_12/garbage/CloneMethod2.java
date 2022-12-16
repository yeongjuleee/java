package javaPractice.ch_12.garbage;

//book1 ��ü�� book2�� ������ �� �ְ� clone() �޼ҵ带 �������̵� �϶�


class MyBook implements Cloneable { // 1. ���縦 �� ���� implements Cloneable ���
	String title;
	
	public MyBook(String title) {
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return title;
	}

	@Override // 2. �������̵�� clone Ŭ��
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}

public class CloneMethod2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		MyBook book1 = new MyBook("Ʈ����");
		MyBook book2 = (MyBook)book1.clone();
		
		//System.out.println(book1);
		System.out.println(book2.title);
		// System.out.println(book2.title);

	}

}
