package javaPractice.ch_11.objcet;

class Book {
	int bookNumber;		// å ��ȣ
	String bookTitle;	// å ����
	
	Book(int bookNumber, String bookTitle) {	// å ��ȣ�� ������ �Ű������� �Է¹޴� ������
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	// toString() �޼ҵ带 ���� �������ϸ� ��ü�� ���� ������ �̿��� ���ϴ� ���ڿ��� ǥ��
	//@Override
	//public String toString() { // toString() �޼ҵ� ������
	//	return bookTitle + ", " + bookNumber; 
	//}
	
	
}

public class D_01 {
	
	// Object Ŭ������ toString() �޼ҵ� �̿��ϱ�
	
	public static void main(String[] args) {
		Book book1 = new Book(200, "����");
		
		// String toString() : ��ü�� ���ڿ��� ǥ���Ͽ� ��ȯ. �������Ͽ� ��ü�� ���� �����̳� Ư�� ��� ������ ��ȯ
		System.out.println(book1);	// �ν��Ͻ� ���� (Ŭ���� �̸�, �ּ� ��)
		System.out.println(book1.toString());	// toString �޼ҵ�� �ν��Ͻ� ����(Ŭ���� �̸�, �ּ� ��)�� ������

	}

}
