package javaPractice.ch_16.db;

class DBCreate extends DB {
	private void createTable(String tableName, String sql) {
		// 테이블을 생성하는 메소드
		// 생성할 테이블 이름과 생성하는 sql 문을 매개변수로 받음
		// 1. 테이블이 존재하는지 확인 후 
		// 2. 없으면 생성함
		
		try {
			// 테이블이 존재하는지 확인
			String tableSql = "show tables";
			boolean isTable = false;
			
			// 아래 두 항목은 부모 클래스에서 정의
			// SQL 문을 전송할 수 있는 PreeparedStatement 객체 생성
			preparedStatement = conn.prepareStatement(tableSql);	// 쿼리 실행 준비
			resultSet = preparedStatement.executeQuery();	// 쿼리 실행 후 결과를 받음
			while (resultSet.next()) {
				if(tableName.equals(resultSet.getString(1))) { // 동일한 테이블이 있는 경우,
					isTable = true;
				}
				// System.out.println(tableName);
				// System.out.println(resultSet.getString(1));
			}
			
			if (isTable == true) { // 테이블이 존재하는 경우 
				System.out.println(tableName + "이라는 이름의 테이블이 이미 존재합니다.");
			}
			else { // 테이블이 없는 경우 => 생성
				preparedStatement = conn.prepareStatement(sql);	// 쿼리 실행 준비
				resultSet = preparedStatement.executeQuery();	// 쿼리 실행 후 결과를 받음
				// System.out.println(resultSet);
				// org.mariadb.jdbc.client.result.CompleteResult@...
				if (resultSet != null) {
					System.out.println(tableName + "테이블 생성에 성공했습니다!");
				}
				else {
					System.out.println(tableName + "테이블 생성에 실패했습니다..");
				}
			}
		}	catch (Exception e) {
			System.out.println("db connect err : " + e);
			
		}
	}
	
	public void createTableUser() {
		String tableName = "tuser";
		String sql = "CREATE TABLE " + tableName + "(userID VARCHAR(100) PRIMARY KEY, " 
				+ "name VARCHAR(100), age INT, job VARCHAR(100))";
		createTable(tableName, sql);
	}
}


public class My_03_CreateTableUser {

	public static void main(String[] args) {
		DBCreate myDB = new DBCreate();
		myDB.connectDB();
		myDB.createTableUser();
		myDB.closeDB();

	}

}
