package javaPractice.ch_08;

/*
일반적인 사각형을 나타내는 Rectangle 클래스가 있다
Rectangle 클래스를 상속받아서 색이 있는 사각형을 나타내는 ColorRectangle 클래스를 정의한다
ColorRectangle 클래스는 색상을 나타내는 필드 color가 추가된다
ColorRectangle 클래스와 생성자를 작성하라
*/

class Rectangle {
	int width;
	int height;
	
	// 질문사항: 1. public Rectangle() {} 생성 후,
	// 하는 방법
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
	
	// 질문사항: 2. public ColorRectangle(int width, int height, String color) {
	// super (width); super(height); 를 하는 방법}

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
		System.out.println("가로: " + obj.width); 
		// 가로: 100
		System.out.println("세로: " + obj.height);
		// 세로: 100
		System.out.println("색상: " + obj.color);
	}

}
