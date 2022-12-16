package javaPractice.ch_09.abstractClass_innerclass;

interface Anony { // 인터페이스 
	public void print();
}

public class AnonymousClass02 {
	public void printB(Anony a) {	// 인터페이스 Anony타입의 객체를 매개변수로 받는 메소드
		a.print();
		
	}
	
	/*
	필요할 때마다 인터페이스를 내부 클래스의 인스턴스로 만들어서 동적으로 추상 메소드를 구현한 후 사용
	자바나 안드로이드에서 동일한 방식으로 익명의 내부 클래스를 이용하여 화면에서 이벤트 처리를 함
	*/
	
	public static void main(String[] args) {
		AnonymousClass02 t= new AnonymousClass02();
		// Anony클래스 인스턴스는 이 부분에서 일시적으로 사용이 됨
		
		t.printB(new Anony() { // 이 객체는 public void print B로 전달이 되었지만, 이름이 없음.. (?)

			@Override
			public void print() {
				System.out.println("익명 클래스 사용 중입니다.");
				
			}
			
		});
	}

}
