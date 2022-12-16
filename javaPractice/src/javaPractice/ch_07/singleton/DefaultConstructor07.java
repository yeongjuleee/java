package javaPractice.ch_07.singleton;

class ShopService {
	// ���� �ʵ�
	private static ShopService singleton = new ShopService();
	
	// ������
	private ShopService() {	}
	
	// ���� �޼ҵ�
	static ShopService getInstance() {
		return singleton;
	}
}

public class DefaultConstructor07 {

	// ShopService ��ü�� �̱������� ������� �Ѵ�.
	// ShopService�� getInstance() �޼ҵ�� �̱����� ���� �� �ֵ��� ShopService Ŭ������ 
	// �ۼ��϶�
	
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("���� ShopService ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� ShopServicer ��ü �Դϴ�.");
		}

	}

}
