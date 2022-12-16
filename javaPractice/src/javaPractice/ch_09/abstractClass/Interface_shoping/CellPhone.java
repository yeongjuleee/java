package javaPractice.ch_09.abstractClass.Interface_shoping;

// Product 추상 클래스를 상속받아 구현한 Cellphone 클래스
public class CellPhone extends Product {
	String carrier; // 통신사
	String company; // 제조사
	
	public CellPhone (String pname, int price, String carrier, String company, int code) {
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
		this.company = company;
		this.code = code;
	}

	@Override
	public void printExtra() {
		System.out.println("통신사 : " + carrier);
		System.out.println("제조사 : " + company);
	}
	

}
