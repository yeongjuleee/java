package javaPractice.ch_08.inheritancePolymorphismExample;

public class PetTest {

	public static void main(String[] args) {
		// �ֿϵ��� Ŭ������ �̿� ��(������ ����)
		// �������� �������̵�
		
		Pet kurt;
		kurt = new Pet("Kurt", "����");
		kurt.introduce();
		// �� �� �̸��� Kurt �Դϴ�! �� ���δ��� �����Դϴ�!
		System.out.println();
		
		RobotPet r2d2 = new RobotPet("R2D2", "��ũ");
		r2d2.introduce(); 
		// �� ���� �κ� �Դϴ�. �̸��� R2D2 �Դϴ�. �� ���δ��� ��ũ�Դϴ�!
		r2d2.work(0);
		System.out.println();
		
		Pet toy = new RobotPet("toy", "����2");
		toy.introduce();
		// �� ���� �κ� �Դϴ�. �̸��� toy �Դϴ�. �� ���δ��� ����2�Դϴ�!
		// toy.work(0);
		System.out.println();
		
		// ���� ����
		Pet p = r2d2;
		
		p.introduce(); 
		// �� ���� �κ� �Դϴ�. �̸��� R2D2 �Դϴ�. �� ���δ��� ��ũ�Դϴ�!
		
		System.out.println();
		r2d2.setName("���̷κ�");
		r2d2.introduce();
		// �� ���� �κ� �Դϴ�. �̸��� ���̷κ� �Դϴ�. �� ���δ��� ��ũ�Դϴ�!
		p.introduce();
		//  �� ���� �κ� �Դϴ�. �̸��� ���̷κ� �Դϴ�. �� ���δ��� ��ũ�Դϴ�!
	}

}
