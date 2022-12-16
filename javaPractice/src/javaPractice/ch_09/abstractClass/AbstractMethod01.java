package javaPractice.ch_09.abstractClass;

/*
추상 메소드는 선언부만 정의하고 구체적인 내용은 비워놓은 메소드
구체적인 내용을 적지 않았기 때문에 이를 상속받은 하위 클래스에서는 사용하려면 반드시 구현하라는 의미
추상 메소드를 선언하는 방법은 '추상적인' 이라는 뜻의 제어자, abstract를 메소드 명 앞에 붙여줌
=> abstract class 클래스명 { }

추상 클래스는 추상 메소드를 멤보로 가지는 클래스
추상 클래스는 일반적인 메소드도 가질 수 있지만, 추상 메소드를 하나라도 포함하는 클래스.
*/

abstract class Pokemon { // 포켓몬 추상 클래스
	//필드
	String name;
	
	//메소드
	abstract void attack(); // 공격 추상 메소드. 
							// 구체적인 내용 X => { } 를 생략하고 세미콜론 ';' 을 붙여준다.
	abstract void sound();	// 소리 추상 메소드
	
	
	public String getName() { // 포켓몬의 이름을 리턴하는 메소드
		return this.name;
	}
	
}

class Pikachu extends Pokemon { // 포켓몬 클래스의 자녀 클래스, 피카츄 클래스
		Pikachu() { // 이름을 지정하는 생성자
			this.name = "피카츄";
		}

		@Override
		void attack() {
			System.out.println("백만볼트!");
			
		}

		@Override
		void sound() {
			System.out.println("피카 피카!");
			
		}
}

class Squirtle extends Pokemon { // 피카츄 클래스
	Squirtle() { // 이름을 지정하는 생성자
		this.name = "꼬부기";
	}
	
	void attack() { // 구체적으로 구현
		System.out.println("물대포!");
	}
	
	void sound() {
		System.out.println("꼬북 꼬북!");
	}
}

public class AbstractMethod01 {

	public static void main(String[] args) {
		Pikachu pikachu1 = new Pikachu();
		System.out.println("이 포켓몬은 " + pikachu1.getName());
		pikachu1.attack();
		pikachu1.sound();
		
		Squirtle squritle1 = new Squirtle();
		System.out.println("이 포켓몬은 " + squritle1.getName());
		squritle1.attack();
		squritle1.sound();

	}

}
