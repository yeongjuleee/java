package javaPractice.ch_16.db;

import java.sql.*;

/* DBMS�� �����ϱ�
	java.sql ��Ű���� �����ϴ� Connetion ��ü�� ���
	Connection ��ü�� ���� java.sql ��Ű���� ���ԵǾ� �ִ� DriverManager Ŭ������ getConnection() �޼ҵ带 �̿�
	getConnection(String url, String user, String password) �޼ҵ�� static �޼ҵ�ν�
	url�� ������ ������ ���̽� ��ġ�� ��Ÿ����, 
	user�� ����� ���� ���̵�,
	password�� ���� ��й�ȣ�� �����Ѵ�. */

class DB {
	Connection conn = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;	// �����ÿ� ����� �����ϴ� �뵵�� ���. 
								// select�� �ַ� �����
	
	public void connectDB() {
		final String driver = "org.mariadb.jdbc.Driver";
		final String DB_HOST = "127.0.0.1";
		final String DB_PORT = "3308";			
		final String DB_NAME = "sample_java";	// ������ ���̽� �̸�
		final String DB_URL = "jdbc:mariadb://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
		final String DB_USER = "root";
		final String DB_PASS = "0732";			// �޴��� �޹�ȣ 4�ڸ�!! �����ϱ�!
		
		// DB ����
		try {
			Class.forName(driver);	// JDBC ����̹� ���
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);	// DB����
			if (conn != null) {
				System.out.println("DB ���� ����!");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}
	}
	
	public void closeDB() {
		try {
			if (resultSet != null) { // ���� ��� ����
				resultSet.close();
			}
			if (preparedStatement != null) { // ���� ��� ����
				preparedStatement.close();
			}
			
			if (conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("DB ���� ����");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

public class My_02_LoadDriver {
	// Connection ��ü�� ������ DataBase �����ϱ�
	
	public static void main(String[] args) {
		DB myDB = new DB();
		myDB.connectDB();
		myDB.closeDB();

	}

}
