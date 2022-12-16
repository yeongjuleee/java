package javaPractice.ch_08;

/*
�Ϲ����� �簢���� ��Ÿ���� Rectangle Ŭ������ �ִ�
Rectangle Ŭ������ ��ӹ޾Ƽ� ���� �ִ� �簢���� ��Ÿ���� ColorRectangle Ŭ������ �����Ѵ�
ColorRectangle Ŭ������ ������ ��Ÿ���� �ʵ� color�� �߰��ȴ�
ColorRectangle Ŭ������ �����ڸ� �ۼ��϶�
*/

class Rectangle {
	int width;
	int height;
	
	// ��������: 1. public Rectangle() {} ���� ��,
	// �ϴ� ���
	//public Rectangle(int width) {
	//	this.width = width;
	//}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
}

class ColorRectangle extends Rectangle {
	String color;
	
	// ��������: 2. public ColorRectangle(int width, int height, String color) {
	// super (width); super(height); �� �ϴ� ���}

	//public ColorRectangle(int width, String color) {
	//	super(width);
	//	this.color = color;
	//}
	
	public ColorRectangle(int width, int height, String color) {
		super(width, height);		
		
		this.color = color;
		
	}
	
	
}

public class InheritanceTest04 {

	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(100, 100, "blue");
		System.out.println("����: " + obj.width); 
		// ����: 100
		System.out.println("����: " + obj.height);
		// ����: 100
		System.out.println("����: " + obj.color);
	}

}
