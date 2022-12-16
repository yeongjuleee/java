package javaPractice.ch_16.db_account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountDAO {
	/* DB ������ �����ϰ� ���ڵ带 ó���ϴ� ��� 
	   ������ ���̽����� ó���� ���� ��ɸ����� �����Ǵ� ��ü�� DAO Data Access Object ��ü��� �Ѵ�.
	 */
	
	// �ʵ�
	private Connection connection = null;
	
	// ������
	public AccountDAO() {
		getConnection();
	}
	
	// DB ���� ����
		private void getConnection() { // DB����
			try {
				String url = "jdbc:mariadb://localhost:3308/account"; // �п����� �� ��� account
				//String url = "jdbc:mariadb://localhost:3308/bank"; // ������ �� ��� bank
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
		
		// ���� ����. ���� ����� ���
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
			// �Ա�, ���
			// flag true : �Ա� / fasle : ���
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
		
		// ���� ��ȣ�� �޾� ���� ���� (�ϳ��� ã��)
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
			// ��ü ���� ����(��ü ���� ����ϱ� ����)
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
		
		public boolean isAccount(int id) { // ���� �ߺ� ��ȸ�̱� ������ account�� ���� X boolean ���� ����
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
			// ���� ����
			// ���� ���� ���� ������ ���� ��ȣ�� �����ϴ��� Ȯ��
			Statement statement = null;
			if(isAccount(account.getId())) {
				System.out.println(account.getId() + "���°� �����մϴ�.");
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
