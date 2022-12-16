package javaPractice.ch_08.inheritancePolymorphismExample;

public class Pet {
	private String name;		// 애완동물의 이름
	private String masterName;	// 주인의 이름
	
	
	//자동 생성자 만드는 방법
	// 1. 마우스 우클릭
	// 2. Source 클릭 => Generate usig construct... 어쩌고 누르기
	
	public Pet(String name, String masterName) { 
		this.name = name;
		this.masterName = masterName;
	}
	
	// 메소드
	// getter, setter 자동으로 만드는 방법
	// 1. 마우스 우클릭
	// 2. Source 클릭 => Generate Getter 어쩌고 누르기
	public String getName() {
		return name;
	}
	
	public void setName(String name) { this.name = name; }
	
	public String getMasterName() {
		return masterName;
	}
	
	public void introduce() {
		System.out.println("■ 내 이름은 " + name + "입니다!");
		System.out.println("■ 주인님은 " + masterName + "입니다!");
	}
	
}
