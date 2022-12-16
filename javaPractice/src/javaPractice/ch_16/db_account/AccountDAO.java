package javaPractice.ch_16.db_account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountDAO {
	/* DB 서버와 접속하고 레코드를 처리하는 기능 
	   데이터 베이스에서 처리에 관한 기능만으로 구성되는 객체를 DAO Data Access Object 객체라고 한다.
	 */
	
	// 필드
	private Connection connection = null;
	
	// 생성자
	public AccountDAO() {
		getConnection();
	}
	
	// DB 관련 시작
		private void getConnection() { // DB연결
			try {
				String url = "jdbc:mariadb://localhost:3308/account"; // 학원에서 할 경우 account
				//String url = "jdbc:mariadb://localhost:3308/bank"; // 집에서 할 경우 bank
				String user = "root";
				String password = "0732";
				
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
		
		// 연결 해제. 서비스 종료시 사용
		public void disConnect() { 
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public boolean updateBalance(int id, long money, boolean flag) {
			// 입금, 출금
			// flag true : 입금 / fasle : 출금
			Statement statement = null;
			boolean res = false;
			int upd = 0;
			
			try {
				String sql;
				if(flag) {
					sql = String.format("UPDATE account SET balance = balance + %d WHERE (id = %d)", money, id);
				}
				else {
					sql = String.format("UPDATE account SET balance = balance - %d WHERE (id = %d)", money, id);
				}
				// System.out.println(sql);
				statement = connection.createStatement();
				upd = statement.executeUpdate(sql);
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(statement != null) {
						statement.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			res = (upd == 0) ? false : true;
			return res;
		}
		
		// 계좌 번호를 받아 정보 전달 (하나만 찾기)
		public Account selectOne(int id) {
			Statement statement = null;
			Account account = new Account();
			
			try {
				String sql = "SELECT * FROM account WHERE id = '" + id + "'";
				//System.out.println(sql);
				statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);
				
				if (resultSet.next()) {
					account = new Account();
					account.setId(resultSet.getInt("id"));
					account.setName(resultSet.getString("name"));
					account.setBalance(resultSet.getInt("balance"));
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
			return account;
			
		}
		
		public ArrayList<Account> selectAll() {
			// 전체 정보 전달(전체 계좌 출력하기 위한)
			Statement statement = null;
			ArrayList<Account> list = new ArrayList<>();
			try {
				String sql = "SELECT * FROM account";
				System.out.println(sql);
				statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);
				
				while(resultSet.next()) {
					Account account = new Account(resultSet.getInt("id"), resultSet.getString("name"), 
							resultSet.getInt("balance"));
					list.add(account);
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
		
		public boolean isAccount(int id) { // 계좌 중복 조회이기 때문에 account를 리턴 X boolean 값을 리턴
			int res = 0;
			
			try {
				String sql = " SELECT COUNT(*) AS cnt FROM account WHERE id = '" + id +"'";
				// System.out.println(sql);
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
		
		public boolean insertAccount(Account account) {
			// 계좌 생성
			// 계좌 생성 전에 동일한 계좌 번호가 존재하는지 확인
			Statement statement = null;
			if(isAccount(account.getId())) {
				System.out.println(account.getId() + "계좌가 존재합니다.");
				return false;
			}
			
			boolean res = false;
			int upd = 0;
			try {
				String sql = String.format("INSERT INTO account VALUES (%d, '%s', %d)", 
						account.getId(), account.getName(), account.getBalance());
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
