package javaPractice.ch_07.singleton;

class ShopService {
	// 정적 필드
	private static ShopService singleton = new ShopService();
	
	// 생성자
	private ShopService() {	}
	
	// 정적 메소드
	static ShopService getInstance() {
		return singleton;
	}
}

public class DefaultConstructor07 {

	// ShopService 객체를 싱글톤으로 만드려고 한다.
	// ShopService의 getInstance() 메소드로 싱글턴을 얻을 수 있도록 ShopService 클래스를 
	// 작성하라
	
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("다른 ShopServicer 객체 입니다.");
		}

	}

}
