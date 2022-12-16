package javaPractice.ch_08.inheritancePolymorphismExample;
// 다형성

class Parent {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent { 
	int x = 200;
	
	void method() {
		//System.out.println("Child Method");
		System.out.println("x= " + x); // this.x 와 같음. 그냥 x라서 지역변수 가장 가까운걸 가져옴
		System.out.println("super.x= " + super.x); // 부모 Parent 의 x 와 같음
		System.out.println("this.x= " + this.x); // Child 의 x와 같음(= this.x)
	}
}

public class InheritancePolymorphismExample01 {

	public static void main(String[] args) {
	Parent parent = new Child();
	// Child 라는 객체를 생성. => Child 는 부모 객체와 결합한 애임 ???
	Child child = new Child();
	
	// 참조 변수 우선
	System.out.println("p.x= " + parent.x); 
	// p.x= 100
	
	// 오버라이딩 우선
	parent.method();
	// Child Method
	
	System.out.println();
	
	// 참조 변수 우선
	System.out.println("c.x= " + child.x); 
	// c.x= 200
	
	// 오버라이딩 우선
	child.method();
	// Parent Method

	}

}
