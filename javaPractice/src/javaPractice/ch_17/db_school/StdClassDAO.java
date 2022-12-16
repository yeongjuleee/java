package javaPractice.ch_17.db_school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StdClassDAO {
	// �ʵ�
	private Connection connection = null;
	
	
	public StdClassDAO() {
		getConnection();
	}
	
	
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
/*	
	// 3. ������û
	// 3-1. ���� ���� �ߺ� Ȯ��
	public boolean isClass(int subjectCode, int studentNumber) {
		int res = 0;
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM studentpick WHERE subjectCode = '" + subjectCode + "' AND studentNumber = '" + studentNumber + "'";
			System.out.println(sql);
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
	
	// 3-2. ���� ��û ���
	public boolean insertClass(StdClassDTO stdClassDTO) {
		// ��� �� ������ ���� �ڵ�� �й��� �����ϴ��� Ȯ��
		Statement statement = null;
		if(isClass (stdClassDTO.getSubjectCode(), stdClassDTO.getStudentNumber())) {
			System.out.println("������ ���� ������ �����մϴ�.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		
		try {
			String sql = String.format("INSERT INTO studentpick VALUES (%d, %d)", 
					stdClassDTO.getSubjectCode(), stdClassDTO.getStudentNumber());
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
	
	// 3-3. ���� ���
	public boolean deleteSubject(StdClassDTO stdClassDTO) {
		Statement statement = null;
		if(!isClass(stdClassDTO.getSubjectCode(), stdClassDTO.getStudentNumber())) {
			System.out.println("���� �ڵ尡 �����ϴ�.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		
		try {
			String sql = String.format("DELETE FROM studentpick WHERE (subjectCode = %d) AND (studentNumber = %d)", stdClassDTO.getSubjectCode(), stdClassDTO.getStudentNumber());
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
*/
	
	// 3. ������û
	boolean insertCourse(StdClassDTO course) {
        Statement statement =null;
//        if(isCourse(/*course.getCode(),*/ course.getStudentNumber())) {
//           System.out.println(course.getCode() + " ���� �ڵ尡  �����մϴ�.");
//           return false;
//        }
        boolean res = false;
        int upd = 0;
        try {
           String sql = String.format("INSERT INTO course VALUES (%d, %d, %d)",
                 course.getSubjectCode(), course.getStudentNumber(), course.getScore());
        //System.out.println(sql);
           statement = connection.createStatement();
           upd=statement.executeUpdate(sql);
        }catch(Exception e) {
           e.printStackTrace();
        }finally {
           try {
              if(statement!=null) {
                 statement.close();
              }
           }catch (SQLException e) {
              e.printStackTrace();
           }
        }
        res=(upd==0) ? false : true;
        return res;
     }
     
     boolean deleteCourse(int code) {
        boolean res = false;
        Statement statement =null;
        int upd = 0;
        try {
           String sql = "DELETE FROM studentpick WHERE subjectCode ='"+ code +"' ";
        //System.out.println(sql);
           statement = connection.createStatement();
           upd=statement.executeUpdate(sql);
        }catch(Exception e) {
           e.printStackTrace();
        }finally {
           try {
              if(statement!=null) {
                 statement.close();
              }
           }catch (SQLException e) {
              e.printStackTrace();
           }
        }
        res=(upd==0) ? false : true;
        return res;
     }
     
     // 6. ���� ��û�� ���� ��ü ���
     public ArrayList<StdClassDTO> selectAll() {
 		Statement statement = null;
 		ArrayList<StdClassDTO> list = new ArrayList<>();
 		
 		try {
 			String sql = "SELECT * FROM studentpick";
 			//System.out.println(sql);
 			statement = connection.createStatement();
 			ResultSet resultSet = statement.executeQuery(sql);
 			
 			while (resultSet.next()) {
 				StdClassDTO std = new StdClassDTO(resultSet.getInt("subjectCode"), resultSet.getInt("studentNumber"), resultSet.getInt("score"));
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
