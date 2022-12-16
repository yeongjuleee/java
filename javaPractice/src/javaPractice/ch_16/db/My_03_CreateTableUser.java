package javaPractice.ch_16.db;

class DBCreate extends DB {
	private void createTable(String tableName, String sql) {
		// ���̺��� �����ϴ� �޼ҵ�
		// ������ ���̺� �̸��� �����ϴ� sql ���� �Ű������� ����
		// 1. ���̺��� �����ϴ��� Ȯ�� �� 
		// 2. ������ ������
		
		try {
			// ���̺��� �����ϴ��� Ȯ��
			String tableSql = "show tables";
			boolean isTable = false;
			
			// �Ʒ� �� �׸��� �θ� Ŭ�������� ����
			// SQL ���� ������ �� �ִ� PreeparedStatement ��ü ����
			preparedStatement = conn.prepareStatement(tableSql);	// ���� ���� �غ�
			resultSet = preparedStatement.executeQuery();	// ���� ���� �� ����� ����
			while (resultSet.next()) {
				if(tableName.equals(resultSet.getString(1))) { // ������ ���̺��� �ִ� ���,
					isTable = true;
				}
				// System.out.println(tableName);
				// System.out.println(resultSet.getString(1));
			}
			
			if (isTable == true) { // ���̺��� �����ϴ� ��� 
				System.out.println(tableName + "�̶�� �̸��� ���̺��� �̹� �����մϴ�.");
			}
			else { // ���̺��� ���� ��� => ����
				preparedStatement = conn.prepareStatement(sql);	// ���� ���� �غ�
				resultSet = preparedStatement.executeQuery();	// ���� ���� �� ����� ����
				// System.out.println(resultSet);
				// org.mariadb.jdbc.client.result.CompleteResult@...
				if (resultSet != null) {
					System.out.println(tableName + "���̺� ������ �����߽��ϴ�!");
				}
				else {
					System.out.println(tableName + "���̺� ������ �����߽��ϴ�..");
				}
			}
		}	catch (Exception e) {
			System.out.println("db connect err : " + e);
			
		}
	}
	
	public void createTableUser() {
		String tableName = "tuser";
		String sql = "CREATE TABLE " + tableName + "(userID VARCHAR(100) PRIMARY KEY, " 
				+ "name VARCHAR(100), age INT, job VARCHAR(100))";
		createTable(tableName, sql);
	}
}


public class My_03_CreateTableUser {

	public static void main(String[] args) {
		DBCreate myDB = new DBCreate();
		myDB.connectDB();
		myDB.createTableUser();
		myDB.closeDB();

	}

}
