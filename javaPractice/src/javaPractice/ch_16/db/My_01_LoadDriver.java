package javaPractice.ch_16.db;

/* JDBC를 이용하는 프로그램 작성 과정
	1. 사용하고자하는 RDBMS에서 제공하는 JDBC 드라이버를 설치
	2. JDBC 드라이버를 로딩
		드라이버를 로딩할 때는 클래스의 동적 바인딩을 제공하는 Class 클래스의 static 메소드인 formName() 메소드 사용
	3. DBMS와 연결 설정
		java.sql 패키지가 제공하는 Connection 객체를 사용
	4. SQL 실행
		select 구문을 실행할 때에는 java.sql 패키지가 제공하는 Statement 객체와 ResultSet 객체를 사용
		Statement 객체는 SQL 구문을 위한 것이고, ResultSet은 select 구문을 실행한 결과를 다루기 위한 객체 */


public class My_01_LoadDriver {
	// 드라이버 클래스를 로드
	public static void loadDriver() {
		try {
			// 연결 할 때 이렇게 합시다!
			Class.forName("org.mariadb.jdbc.Driver");
			// org.mariadb.jdbc.Driver 클래스를 메모리에 로딩
			System.out.println("Driver Load Success!");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		loadDriver();

	}

}
