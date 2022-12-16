package javaPractice.ch_09.abstractClass.Interface;

/*
����, 
�־��� �ڵ带 �������� ���� �������� ���� MyWeapon�� ����ϴ� 
GameUnit Ŭ������ �����ڿ� attack() �޼ҵ带 �ϼ��϶�!

1. GameUnit �ν��Ͻ� �� �� �����Ѵ�. 
2. unitPower�� �� ���ֿ� ���޵Ǵ� �⺻ Power�� ���⸦ ����� �� �����ȴ�.
3. bossPower�� Ŭ���� ������ �����Ǵ� GameUnit �ν��Ͻ��� �����Ѵ�.
4. �� ���ֿ����� �������� bossPower�� 0 ���ϰ� �Ǹ� ������ ������. 
	(System.exit(1))
5. �����ڿ����� �Ķ���ͷ� �� ������ �̸��� �޾� �ʱ�ȭ�ϰ� ���� �ν��Ͻ��� ����� unitPower�� ���� ������ �Ѵ�.
*/

public class GameUnit {
	// �ʵ�
	static int bossPower = 1000;	// ���� �Ŀ� 1000
									// unit1�� unit2���� ������ �Ŀ��� ���ݹ��� �Ŀ���ŭ ����
	
	private int unitPower = 500;	// �⺻ �Ŀ� 500
	private MyWeapon weapon;
	private String name;
	
	// ������
	public GameUnit(String name) {
		this.name = name;
		this.weapon = new MyWeapon();
		this.weapon.charge(unitPower);
	}
	
	// �޼ҵ�
	private void attack (int power) { // attack ����
		GameUnit.bossPower -= power;
		System.out.println("���� bossPower : " + GameUnit.bossPower);
		
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
