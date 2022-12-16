package javaPractice.ch_09.abstractClass.Interface_shoping;

// Product 클래스를 상속받는 클래스로, 스마트 TV 제품 정보를 등록하는 데 필요
public class SmartTV extends Product {
	String resolution;	// 해상도
	double inch;		// 인치

	public SmartTV(String pname, int price, String resolution, double inch, int code) {
		// 생성자로 상품의 이름과 가격, 해상도 정보를 받아서 처리
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
		this.inch = inch;
		this.code = code;
	}

	@Override
	public void printExtra() {
		// 추상 클래스에 정의된 추상 메소드 오버라이딩
		// 추가 정보인 해상도 정보를 출력
		System.out.println("해상도 : " + resolution);
		System.out.println("인치 : " + inch);
		
	}
	
	
	
	
}
