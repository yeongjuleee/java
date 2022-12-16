package javaPractice.ch_15.design_patton.singleton;

public class MySingleton_01 {

	public static void main(String[] args) {
		// 4. 외부에서 사용하는 코드 만들기
		// 외부 클래스에서 Company를 생성 X => static으로 제공되는 getInstance() 메소드로 호출
		Company company1 = Company.getInstance();
		// 클래스 이름으로 getInstance() 호출하여 참조 변수에 대입
		Company company2 = Company.getInstance();
//		Company company = new Company(); // Company 클래스 바깥이기 때문에 생성할 수 X
		
		
		System.out.println(company1 == company2);	// true
		// 두 변수가 같은 주소인지 확인
		System.out.println(company1);
		// javaPractice.ch_15.design_patton.singleton.Company@1c4af82c
		System.out.println(company2);
		// javaPractice.ch_15.design_patton.singleton.Company@1c4af82c
		
	}

}
