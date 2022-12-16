package javaPractice.ch_15.design_patton.singleton;

public class Company {
	// 1. �����ڸ� private�� �����ϱ�
	// �������� ���� �����ڰ� private�̹Ƿ� �ܺ� Ŭ�������� ������� company �ν��Ͻ��� ������ �� X
	// ��, Company Ŭ���� ���ο����� �� Ŭ������ ������ ������ �� O
	
	private Company() {}
	
	// 2. Ŭ���� ���ο� static���� ������ �ν��Ͻ� �����ϱ�
	// private �����Ͽ� �ܺο��� �� �ν��Ͻ��� ���� X �����ؾ� �ν��Ͻ� ������ ���� �� �� O
	private static Company instance = new Company();
	
	// 3. �ܺο��� ������ �� �ִ� public �޼ҵ� �����
	// �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�� �ݵ�� static���� �����ؾ� �Ѵ�
	// getIntance() �޼ҵ�� �ν��Ͻ� ������ ���X ȣ���� �� �־�� �ϱ� ����
	// setter�� �ܺο���.. getter�� ����� ��
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;	// �����ϰ� ������ �ν��Ͻ� ��ȯ
	}
}
