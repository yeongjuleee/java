package javaPractice.ch_17.db_library2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDAO {
	// �ʵ�(�Ӽ�)
	private Connection connection = null;
	
	// ������ 
	public BookDAO() {
		getConnection();
	}

	// DB ���� ����
	private void getConnection() {	// DB ����
		try {
			String url = "jdbc:mariadb://localhost:3308/book";
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
	
	public boolean isBook(int code) { // å �ڵ尡 �ߺ� => ���� X 
		int res = 0;
		
		try {
			String sql = " SELECT COUNT(*) AS cnt FROM book WHERE code = '" + code + "'";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			res = resultSet.getInt("cnt");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res != 0 ? true : false;
	}
	
	// å ���
	// å ��� �� ������ å �ڵ尡 �ִ��� Ȯ��
	public boolean insertBook(Book book) { 
		Statement statement = null;
		if(isBook(book.getCode())) {
			System.out.println(book.getCode() + "å�� �����մϴ�.");
			return false;
		}
		
		boolean res = false;
		int upd = 0;
		
		try {
			String sql = String.format("INSERT INTO book VALUES (%d, '%s', '%s', %d)", 
					book.getCode(), book.getName(), book.getWriter(), book.getCount());
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
	
	// å �˻�
	public ArrayList<Book> searchBook (String name) {
		Statement statement = null;
		ArrayList<Book> books = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM book WHERE name LIKE '%" + name + "%'";
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
		
			while(resultSet.next()) {
				Book book = new Book();
				book.setCode(resultSet.getInt("code"));
				book.setName(resultSet.getString("name"));
				book.setWriter(resultSet.getString("writer"));
				book.setCount(resultSet.getInt("count"));
				books.add(book);
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
		return books;
	}
	
	
	// �뿩, �ݳ� 
	public boolean updateCount(int code, int count, boolean flag) {
		// flag true : �ݳ� / false : �뿩
		Statement statement = null;
		boolean res = false;
		int upd = 0;
		
		try {
			String sql;
			if(flag) {
				sql = String.format("UPDATE book SET count = count + %d WHERE (code = %d)", count, code);
			}
			else {
				sql = String.format("UPDATE book SET count = count - %d WHERE (code = %d)", count, code);
			}
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
	
	// å �ѱ� ��ȸ
	public Book selectOne(int code) {
		Statement statement = null;
		Book book = new Book();
		
		try {
			String sql = "SELECT * FROM book WHERE code ='" + code + "'";
			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			if(resultSet.next()) {
				book = new Book();
				book.setCode(resultSet.getInt("code"));
				book.setName(resultSet.getString("name"));
				book.setCount(resultSet.getInt("count"));
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
		return book;
	}
	
	// ��ü ���� ����(��ü å ����)
	public ArrayList<Book> selectAll() {
		Statement statement = null;
		ArrayList<Book> list = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM book";
			System.out.println(sql);
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				Book book = new Book(resultSet.getInt("code"), resultSet.getString("name"), resultSet.getString("writer"),
						resultSet.getInt("count"));
				list.add(book);
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
