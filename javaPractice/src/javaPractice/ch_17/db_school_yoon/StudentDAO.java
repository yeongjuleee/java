package javaPractice.ch_17.db_school_yoon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import account_1213.Account;
import book_1214.Book;


public class StudentDAO {
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
	
	public ArrayList<Student> selectStudent() {
		//학생 정보 전달
		Statement statement = null;
		ArrayList<Student> Studentlist = new ArrayList<>();
		try {
			String sql = "SELECT * FROM student ";
			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
	         
	         while(resultSet.next()) {
	            Student student = new Student(resultSet.getInt("StudentNumber"), resultSet.getString("name"), 
	            		resultSet.getString("phoneNumber"), resultSet.getString("memo"));
	            Studentlist.add(student);
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
	      return Studentlist;
	}	
	
	public Student selectOne(int studentNumber) {
		//학번을 받아서 정보 전달
		Statement statement = null;
		Student student = null;
		try {
			String sql = "SELECT * FROM student WHERE studentNumber = " +studentNumber+"";
			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			if(resultSet.next()) {
				student = new Student();
				student.setStudentNumber(resultSet.getInt("studentNumber"));
				student.setName(resultSet.getString("name"));
				student.setPhoneNumber(resultSet.getString("phoneNumber"));
				student.setMemo(resultSet.getString("Memo"));
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
		return student;
	}

	
	
	public boolean isStudent(int studentNumber) {
		//동일한 학번이 있는지
		int res = 0;		
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM student WHERE studentNumber ='" +studentNumber+"'";
			//System.out.println(sql);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			res = resultSet.getInt("cnt");
			//System.out.println(res);				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true: false;
	}
	
	public boolean insertStudent(Student student) {
		
		//등록 전에 동일한 학번이 존재하는지 확인 
		Statement statement = null;
		if(isStudent(student.getStudentNumber())) {
			System.out.println(student.getStudentNumber() + "동일한 학번이 존재합니다.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		try { 
			String sql = String.format("INSERT INTO student VALUES (%d, '%s', '%s', '%s')"
				,student.getStudentNumber(), student.getName(), student.getPhoneNumber(), student.getMemo());
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
	
	public boolean deleteStudent(Student student) {
		
		//등록 전에 동일한 학번이 존재하는지 확인 
		Statement statement = null;
		if(!isStudent(student.getStudentNumber())) {
			System.out.println(student.getStudentNumber() + " 학번의 학생이 존재하지 않습니다.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		try { 
			String sql = String.format("DELETE FROM student WHERE (studentNumber = %d)", student.getStudentNumber());
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
