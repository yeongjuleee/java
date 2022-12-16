package javaPractice.ch_09.abstractClass.Interface;

/*
문제, 
주어진 코드를 바탕으로 이전 문제에서 만든 MyWeapon을 사용하는 
GameUnit 클래스의 생성자와 attack() 메소드를 완성하라!

1. GameUnit 인스턴스 두 개 생성한다. 
2. unitPower는 각 유닛에 공급되는 기본 Power로 무기를 사용할 때 차감된다.
3. bossPower는 클래스 변수로 생성되는 GameUnit 인스턴스에 공유한다.
4. 두 유닛에서의 공격으로 bossPower가 0 이하가 되면 게임은 끝난다. 
	(System.exit(1))
5. 생성자에서는 파라미터로 각 유닛의 이름을 받아 초기화하고 무기 인스턴스를 만들어 unitPower로 무기 충전을 한다.
*/

public class GameUnit {
	// 필드
	static int bossPower = 1000;	// 보스 파워 1000
									// unit1과 unit2에게 맞으면 파워가 공격받은 파워만큼 감소
	
	private int unitPower = 500;	// 기본 파워 500
	private MyWeapon weapon;
	private String name;
	
	// 생성자
	public GameUnit(String name) {
		this.name = name;
		this.weapon = new MyWeapon();
		this.weapon.charge(unitPower);
	}
	
	// 메소드
	private void attack (int power) { // attack 구현
		GameUnit.bossPower -= power;
		System.out.println("현재 bossPower : " + GameUnit.bossPower);
		
		if (GameUnit.bossPower < 0) {
			System.exit(1);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		GameUnit unit1 = new GameUnit("unit1");
		GameUnit unit2 = new GameUnit("unit2");
		
		while(true) {
			unit1.attack(500);
			unit2.attack(50);
		}
	}


}
