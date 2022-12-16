package javaPractice.ch_08.inheritancePolymorphismExample;

public class RobotPet02 {
	// p�� �����ϴ� �ν��Ͻ��� �ڱ�Ұ��� ��Ų��.
	static void intro(Pet p) {
		p.introduce();
	}
	
	public static void main(String[] args) {
		// �迭�� Ȱ���Ͽ� �ֿϵ��� Ŭ������ �̿�
		// ����: �޼ҵ��� �μ��� �������� ����
		Pet[] a = {
				new Pet("����", "�ر�"),
				new RobotPet("����", "��ȯ"),
				new Pet("����", "����"),
		};
		
		for(Pet p : a) { // forEach�� �̿� �տ� ���, �ڿ� �ε���? 
						// forEach(���,�ε���,...)
			
			intro(p);		// p�� �����ϴ� �ν��Ͻ��� �ڱ�Ұ��� ��Ų��
			System.out.println();
		}
	}

}
