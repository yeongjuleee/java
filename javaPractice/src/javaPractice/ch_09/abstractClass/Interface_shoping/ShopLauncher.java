package javaPractice.ch_09.abstractClass.Interface_shoping;

// ���θ��� �����ϱ� ���� ��ó ���α׷�, IShop �������̽��� �����ϴ� �ٸ� ���θ� Ŭ������ �̰����� ���� ����
public class ShopLauncher {

	// ���α׷� ����
	public static void main(String[] args) {
		
		IShop shop = new MyShop();
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();

	}

}
