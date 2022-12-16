package javaPractice.ch_12.garbage;

//book1 객체를 book2에 복사할 수 있게 clone() 메소드를 오버라이딩 하라


class MyBook implements Cloneable { // 1. 복사를 할 때는 implements Cloneable 사용
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

	@Override // 2. 오버라이드로 clone 클릭
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}

public class CloneMethod2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		MyBook book1 = new MyBook("트레저");
		MyBook book2 = (MyBook)book1.clone();
		
		//System.out.println(book1);
		System.out.println(book2.title);
		// System.out.println(book2.title);

	}

}
