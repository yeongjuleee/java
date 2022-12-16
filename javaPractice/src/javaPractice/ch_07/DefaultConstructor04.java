package javaPractice.ch_07;

class Person {
	// 속성 (필드)
	private String name;
	private String mobile;
	private String office;
	private String email;
	
	// 기능 (메소드)
	Person(String name, String moblie, String office, String email) { // 기본 생성자
		this.name = name;
		this.mobile = mobile;
		this.office = office;
		this.email = email;
	}
	
	public String toString() { // 값을 받아오기(=가져오기) 때문에 매개변수 X => return해야함.
		return "Person [name =" + name + ", mobile=" + mobile + ", office = " + office + ", email =" + email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) { // 값을 설정하기 때문에 매개변수 O => return X 
		this.name = name; // 값 설정을 변경하기 위해 return (반환)할 필요 X 그래서 void로 설정만 변경함.
	}
	
	public void setMobile(String moblie) {
		this.mobile = mobile;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}

public class DefaultConstructor04 {

	// 클래스 작성 및 접근 제어
	// Person 이라는 클래스를 작성하고 테스트 하라
	// Person 이라는 클래스를 다음과 같은 필드와 메소드를 가진다.
	// #필드
	// name : 이름(private)
	// mobile : 핸드폰 번호 (private)
	// office : 직장 전화번호 (private)
	// email : 이메일 주소 (private)
	
	// #메소드
	// Person(n, m, oi, e) : 생성자 메소드
	// toString() : 삼각형의 정보를 문자열로 변환하는 메소드
	// setName(), getName()... : 각 속성에 대한 접근자와 설정자 메소드
	
	public static void main(String[] args) {
		Person person = new Person("최현석", "010-1999-0421", "02-199-0421", "treasure@leader.com");
		System.out.println(person);
		
		// Person{name='최현석', moblie='010-1999-0421', office='02-199-0421', email='treasure@leader.com'}
		person.setEmail("treasure@leader.com");
		person.setMobile("010-1999-0421");
		System.out.println(person);
		// Person{name='최현석', moblie='010-1999-0421', office='02-199-0421', email='treasure@leader.com'}

	}

}
