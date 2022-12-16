package javaPractice.ch_17.db_school_yoon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StdClassDAO {
private Connection connection = null;
	
	//디비 관련 시작 - 학생 정보
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
	
	
	
	//연결 해제. 서비스 종료 시에 사용
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
		//동일한 과목 코드와 학번이 있는지
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
	
	//수강신청
	public boolean insertClass(StdClassDTO stdClassDTO) {
		
		//등록 전에 동일한 과목 코드와 학번이 존재하는지 확인 
		Statement statement = null;
		if(isClass(stdClassDTO.getCode(), stdClassDTO.getStudentNumber())) {
			System.out.println("동일한 수강 과목이 존재합니다.");
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
	
	//수강 취소
	public boolean deleteClass(StdClassDTO stdClassDTO) {
		//등록 전에 동일한 학번이 존재하는지 확인 
			Statement statement = null;
			if(!isClass(stdClassDTO.getCode(), stdClassDTO.getStudentNumber())) {
				System.out.println("수강 내역이 존재하지 않습니다");
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
