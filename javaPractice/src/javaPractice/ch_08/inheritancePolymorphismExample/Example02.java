package javaPractice.ch_08.inheritancePolymorphismExample;

class Animal {
	void breath() {
		System.out.println("숨 쉬기");
	}
	
}

class Lion extends Animal {

	@Override
	public String toString() {
		return "사자";
	}
	
}

class Rabbit extends Animal { // 동물 클래스를 상속한 토끼 클래스
	public String toString() {
		return "토끼";
	}
}

class Monkey extends Animal { // 동물 클래스를 상속한 원숭이 클래스
	public String toString() {
		return "원숭이";
	}
}

class Zookeeper { // 사육사 클래스
	/* 각각씩으로 메소드 주는 방법 
	void feed(Lion lion) { // 사자에게 먹이를 주는 메소드
						   // feed의 매개변수 : Lion 클래스의 lion 생성
						   // lion : String toString 으로 return 사자 를 함.
		System.out.println(lion + "에게 고기 주기");
	}
	
	void feed(Rabbit rabbit) { // 토끼에게 먹이 주는 메소드
		System.out.println(rabbit + "에게 먹이 주기");
	}
	
	void feed(Monkey monkey) { // 원숭이에게 먹이 주는 메소드
		System.out.println(monkey + "에게 먹이 주기");
	}
	*/
	
	// 공통요소를 이용하여 먹이주는 메소드 만들기
	void feed(Animal animal) {  // 먹이 주는 메소드
								// 데이터 타입을 공통되는 부모 클래스, Animal로 잡음 
								// Animal에 toString이 없지만 작동하는 이유 : Animal 은 상속을 해주는 애지 받는 객체는 X => Object임. 
								// Object는 조상 객체로, toString 등을 사용할 수 있음.
		System.out.println(animal + "에게 먹이 주기");
	}
}



public class Example02 {
	
	public static void main(String[] args) {
		Lion lion = new Lion(); // Lion 인스턴스 생성
		Zookeeper james = new Zookeeper(); // james 라는 이름의 사육사 인스턴스 생성
		james.feed(lion); // james가 lion에게 먹이를 줌
		
		// 동물이 추가될 때 동물에게 먹이를 주는 방법 (기초적이나 너무 번거로움)
		//Rabbit rabbit = new Rabbit(); // Rabbit 인스턴스 생성
		//james.feed(rabbit);
		
		//Monkey monkey = new Monkey(); // Monkey 인스턴스 생성
		//james.feed(monkey);
		
		// 동물이 추가될 때 동물에게 먹이를 주는 방법(공통요소를 이용하자!)
		Animal rabbit = new Rabbit();
		james.feed(rabbit);
		
		Animal monkey = new Monkey();
		james.feed(monkey);

	}

}
