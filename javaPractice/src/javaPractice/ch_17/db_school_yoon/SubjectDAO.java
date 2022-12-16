package javaPractice.ch_17.db_school_yoon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SubjectDAO {
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
	
	//���� ���� ��ȸ
	public ArrayList<SubjectDTO> selectSubject() {
		//�л� ���� ����
		Statement statement = null;
		ArrayList<SubjectDTO> Subjectlist = new ArrayList<>();
		try {
			String sql = "SELECT * FROM subject ";
			//System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
	         
	         while(resultSet.next()) {
	        	 SubjectDTO subject = new SubjectDTO(resultSet.getInt("code"), resultSet.getString("subjectName"));
	            Subjectlist.add(subject);
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
	      return Subjectlist;
	}	
	
	public boolean isSubject(int code) {
		//������ �й��� �ִ���
		int res = 0;		
		try {
			String sql = "SELECT COUNT(*) AS cnt FROM subject WHERE code ='" +code+"'";
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
	
	public boolean insertSubject(SubjectDTO subjectDTO) {
		
		//��� ���� ������ �й��� �����ϴ��� Ȯ�� 
		Statement statement = null;
		if(isSubject(subjectDTO.getCode())) {
			System.out.println(subjectDTO.getCode() + "������ ���� �ڵ尡 �����մϴ�.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		try { 
			String sql = String.format("INSERT INTO subject VALUES (%d, '%s')"
				,subjectDTO.getCode(), subjectDTO.getSubjectName());
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
	
	public boolean deleteSubject(SubjectDTO subjectDTO) {
		//��� ���� ������ �й��� �����ϴ��� Ȯ�� 
			Statement statement = null;
			if(!isSubject(subjectDTO.getCode())) {
				System.out.println("������ �������� �ʽ��ϴ�.");
				return false;
			}
			
			boolean res = false;
			int upd = 0;
			try { 
				String sql = String.format("DELETE FROM subject WHERE (code = %d)", subjectDTO.getCode());
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
