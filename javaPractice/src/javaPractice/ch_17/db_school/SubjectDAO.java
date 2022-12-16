package javaPractice.ch_17.db_school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SubjectDAO { // 수강신청 관리
	// 필드
	private Connection connection = null;
	
	
	public SubjectDAO() {
		getConnection();
	}
	
	
	private void getConnection() {	// DB 연결
		try {
			String url = "jdbc:mariadb://localhost:3308/school";
			String user = "root";
			String password = "0732";
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			this.connection = DriverManager.getConnection(url, user, password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	// DB 연결 종료. 서비스 종료시 사용
	public void disConnect() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 6. 수강과목 관리
	
	// 6-1. 과목 등록 전 중복 검사
	public boolean isSubject(int code) {
		int res = 0;
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM subject WHERE code = '" + code + "'";
			//System.out.println(sql);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			res = resultSet.getInt("cnt");
			// System.out.println(res);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true : false;
	}
	
	// 6. 과목 전체 출력
	public ArrayList<SubjectDTO> selectAll() {
		Statement statement = null;
		ArrayList<SubjectDTO> list = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM subject";
			//System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				SubjectDTO std = new SubjectDTO(resultSet.getInt("code"), resultSet.getString("subjectName"));
				list.add(std);
			}
 		} catch (Exception e) {
 			e.printStackTrace();
 		} finally {
 			try {
 				if(statement != null) {
 					statement.close();
 				}
 			} catch (SQLException e) {
 				e.printStackTrace();
 			}
 		}
		return list;
	}
	
	
	// 6-2. 과목 등록
	public boolean insertSubject(SubjectDTO subject) {
		Statement statement = null;
		if(isSubject (subject.getCode())) {
			System.out.println(subject.getCode() + "수강 코드가 존재합니다.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		
		try {
			String sql = String.format("INSERT INTO subject VALUES (%d, '%s')", 
					subject.getCode(), subject.getSubjectName());
			// System.out.println(sql);
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
	
	// 6-3. 수강과목 삭제
	public boolean deleteSubject(SubjectDTO subject) {
		Statement statement = null;
		if(!isSubject(subject.getCode())) {
			System.out.println(subject.getCode() + "과목 코드가 없습니다.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		
		try {
			String sql = String.format("DELETE FROM subject WHERE (code = %d)", subject.getCode());
			// System.out.println(sql);
			
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
