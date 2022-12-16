package javaPractice.ch_17.db_school_yoon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StdClassDAO {
private Connection connection = null;
	
	//��� ���� ���� - �л� ����
	public void getConnStudent() {
		try {
			String url = "jdbc:mariadb://localhost:3306/studentmanager";
			String user = "root";
			String password = "4481";
					
			try {
				Class.forName("org.mariadb.jdbc.Driver");		
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			this.connection = DriverManager.getConnection(url, user, password);				
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	//���� ����. ���� ���� �ÿ� ���
	public void disConnect() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isClass(int code, int studentNumber) {
		//������ ���� �ڵ�� �й��� �ִ���
		int res = 0;		
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM stdClass WHERE code ='" +code+"'AND studentNumber = '"+studentNumber+"'";
			//System.out.println(sql);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			res = resultSet.getInt("cnt");
			System.out.println(res);				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true: false;
	}
	
	//������û
	public boolean insertClass(StdClassDTO stdClassDTO) {
		
		//��� ���� ������ ���� �ڵ�� �й��� �����ϴ��� Ȯ�� 
		Statement statement = null;
		if(isClass(stdClassDTO.getCode(), stdClassDTO.getStudentNumber())) {
			System.out.println("������ ���� ������ �����մϴ�.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		try { 
			String sql = String.format("INSERT INTO stdClass VALUES (%d, %d)"
				,stdClassDTO.getCode(), stdClassDTO.getStudentNumber());
			//System.out.println(sql);
			statement = connection.createStatement();
			upd = statement.executeUpdate(sql);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (statement != null) {
					statement.close();
				} 
			} catch (SQLException e) {
					e.printStackTrace();
			}
		}
		res = (upd == 0) ? false : true;
		return res;		
	}
	
	//���� ���
	public boolean deleteClass(StdClassDTO stdClassDTO) {
		//��� ���� ������ �й��� �����ϴ��� Ȯ�� 
			Statement statement = null;
			if(!isClass(stdClassDTO.getCode(), stdClassDTO.getStudentNumber())) {
				System.out.println("���� ������ �������� �ʽ��ϴ�");
				return false;
			}
			
			boolean res = false;
			int upd = 0;
			try { 
				String sql = String.format("DELETE FROM stdClass WHERE (code = %d) AND (studentNumber = %d)" 
						,stdClassDTO.getCode(), stdClassDTO.getStudentNumber());
				//System.out.println(sql);
				statement = connection.createStatement();
				upd = statement.executeUpdate(sql);			
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					if (statement != null) {
						statement.close();
					} 
				} catch (SQLException e) {
						e.printStackTrace();
				}
			}
			res = (upd == 0) ? false : true;
			return res;		
	}
	
}
