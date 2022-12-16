package javaPractice.ch_09.abstractClass.Interface;

/*
����,
���� ���α׷����� �־��� ���� �������̽��� �̿��Ͽ�
�ڽŸ��� ���� Ŭ���� (MyWeapon)�� �������϶�

��, 
1. ���� Ŭ�������� int curPower �ʵ尡 �ְ�
2. fire() �� curPower���� power��ŭ �����ϰ�
3. charge()�� power��ŭ curPower�� ���� ��Ų��.
*/


interface Weapon {
	public void fire(int power);	//�Ķ���� �Ŀ��� ���� �߻�
	public int getRestPower();		// ���� ���� �ִ� �Ŀ� ����
	public void charge(int power);	// �Ķ���͸�ŭ ���� �Ŀ� ����
}

class MyWeapon implements Weapon {
	// �ʵ�
	private int curPower = 0;
	
	// �޼ҵ�
	@Override
	public void fire(int power) {
		this.curPower -= power;
		
	}

	@Override
	public int getRestPower() {
		return curPower;
	}

	@Override
	public void charge(int power) {
		 this.curPower += power;
	}
	
	
	
}

public class InterfaceTest01 {

	public static void main(String[] args) {
		MyWeapon myWeapon = new MyWeapon();
		

	}

}
