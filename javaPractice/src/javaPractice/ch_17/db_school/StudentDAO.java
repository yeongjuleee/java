package javaPractice.ch_17.db_school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {
	// �ʵ�(�Ӽ�)
	private Connection connection = null;
	
	// ������ 
	public StudentDAO() {
		getConnection();
	}
	
	// DB ���� ����
	private void getConnection() {	// DB ����
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
	
	// DB ���� ����. ���� ����� ���
	public void disConnect() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 1. �л� ���
	// �л� ��� �� ������ �й��� �ִ��� Ȯ��
	public boolean isStudent(int stdNum) { // �й��� �ߺ� => ����X
		int res = 0;
		
		try {
			String sql = " SELECT COUNT(*) AS cnt FROM studentinfo WHERE studentNumber = '" + stdNum + "'";
			//System.out.println(sql);
			
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			res = resultSet.getInt("cnt");
			//System.out.println(res);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true : false;
	}
	
	public boolean insertStudent(Person student) {
		Statement statement = null;
		if(isStudent(student.getStudentNumber())) {
			System.out.println(student.getStudentNumber() + "�й��� �����մϴ�.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		
		try {
			String sql = String.format("INSERT INTO studentinfo VALUES (%d, '%s', '%s', '%s')", 
					student.getStudentNumber(), student.getName(), student.getPhoneNumber(), student.getMemo());
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
	
	// 2. �л� ����
	public boolean deleteStudent(Person student) {
		Statement statement = null;
		if(!isStudent(student.getStudentNumber())) {
			System.out.println(student.getStudentNumber() + "�й��� �����ϴ�.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		
		try { 
			String sql = String.format("DELETE FROM studentinfo WHERE (studentNumber = %d)", 
					student.getStudentNumber());
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
	
	// 5. �л� ���� ��ȸ
	
	// 5-1. �� �� ��ȸ�ϱ�
	public Person selectOne(int studentNumber) {
		Statement statement = null;
		Person std = new Person();
		
		try {
			String sql = "SELECT * FROM studentinfo WHERE studentNumber = '" + studentNumber +"'";
			//System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			if(resultSet.next()) {
				std = new Person();
				std.setStudentNumber(resultSet.getInt("studentNumber"));
				std.setName(resultSet.getString("name"));
				std.setPhoneNumber(resultSet.getString("phoneNumber"));
				std.setMemo(resultSet.getString("memo"));
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
		return std;
	}
	
	// 5-2. ��ü ����ϱ�
	public ArrayList<Person> selectAll() {
		Statement statement = null;
		ArrayList<Person> list = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM studentinfo";
			//System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				Person std = new Person(resultSet.getInt("studentNumber"), resultSet.getString("name"), resultSet.getString("phoneNumber"), 
						resultSet.getString("memo"));
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
	
}
