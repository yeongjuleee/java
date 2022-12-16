package javaPractice.ch_17.db_school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StdClassDAO {
	// 필드
	private Connection connection = null;
	
	
	public StdClassDAO() {
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
/*	
	// 3. 수강신청
	// 3-1. 수강 과목 중복 확인
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
	
	// 3-2. 수강 신청 등록
	public boolean insertClass(StdClassDTO stdClassDTO) {
		// 등록 전 동일한 과목 코드와 학번이 존재하는지 확인
		Statement statement = null;
		if(isClass (stdClassDTO.getSubjectCode(), stdClassDTO.getStudentNumber())) {
			System.out.println("동일한 수강 과목이 존재합니다.");
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
	
	// 3-3. 수강 취소
	public boolean deleteSubject(StdClassDTO stdClassDTO) {
		Statement statement = null;
		if(!isClass(stdClassDTO.getSubjectCode(), stdClassDTO.getStudentNumber())) {
			System.out.println("과목 코드가 없습니다.");
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
	
	// 3. 수강신청
	boolean insertCourse(StdClassDTO course) {
        Statement statement =null;
//        if(isCourse(/*course.getCode(),*/ course.getStudentNumber())) {
//           System.out.println(course.getCode() + " 과목 코드가  존재합니다.");
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
     
     // 6. 수강 신청한 과목만 전체 출력
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
