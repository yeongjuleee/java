package javaPractice.ch_15.design_patton.singleton;

public class MySingleton_01 {

	public static void main(String[] args) {
		// 4. �ܺο��� ����ϴ� �ڵ� �����
		// �ܺ� Ŭ�������� Company�� ���� X => static���� �����Ǵ� getInstance() �޼ҵ�� ȣ��
		Company company1 = Company.getInstance();
		// Ŭ���� �̸����� getInstance() ȣ���Ͽ� ���� ������ ����
		Company company2 = Company.getInstance();
//		Company company = new Company(); // Company Ŭ���� �ٱ��̱� ������ ������ �� X
		
		
		System.out.println(company1 == company2);	// true
		// �� ������ ���� �ּ����� Ȯ��
		System.out.println(company1);
		// javaPractice.ch_15.design_patton.singleton.Company@1c4af82c
		System.out.println(company2);
		// javaPractice.ch_15.design_patton.singleton.Company@1c4af82c
		
	}

}
