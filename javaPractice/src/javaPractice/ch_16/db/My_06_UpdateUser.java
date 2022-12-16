package javaPractice.ch_16.db;
// user ���� update �ϱ�

import java.sql.SQLException;
import java.util.Scanner;

// update 
class DBUpdate extends DBSelect {
	protected User modifyUser() {
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		
		boolean validate = false;
		String validateTemp;
		
		do {
			System.out.println("���� ���� �� ȸ���� ���̵� �Է��ϼ��� : ");
			user.userID = scanner.nextLine();
			System.out.println("ȸ���� �̸��� �Է��ϼ��� : ");
			user.name = scanner.nextLine();
			System.out.println("ȸ���� ���̸� �Է��ϼ��� : ");
			user.age = Integer.parseInt(scanner.nextLine());
			System.out.println("ȸ���� ������ �Է��ϼ��� : ");
			user.job = scanner.nextLine();
			
			System.out.println("���� �� ȸ�� : " + user.userID + " / " + user.name + " / " + 
			user.age + " / " + user.job + "��/�� �½��ϱ�? (y/n)");
			validateTemp = scanner.nextLine();
			
			// �Է� ���� y�� �ƴ� ��� true, ���� ��� false ��ȯ
			validate = !validateTemp.equals("y");
		} while (validate);
		
		scanner.close();
		return user;
	}
	
	public void updateUser() throws SQLException {
		User user = modifyUser();
		String updateSQL = " UPDATE tUser SET name = ?, age = ?, job = ? WHERE userID = ? ";
		// System.out.println(updateSQL);
		
		preparedStatement = conn.prepareStatement(updateSQL);	// ���� ���� �غ�
		preparedStatement.setString(1, user.name);
		preparedStatement.setInt(2, user.age);
		preparedStatement.setString(3, user.job);
		preparedStatement.setString(4, user.userID);
		int cnt = preparedStatement.executeUpdate();	// ������ ���� ������ ���� ��ȯ
		// pstmt.excuteQuery() : select
		// pstmt.excuteUpdate() : insert, update, delete..
		
		if (cnt > 0 ) {
			System.out.println("���� ���� ������ : : " + cnt);
			System.out.println("������ ������ �����߽��ϴ�.");
		}
		else {
			System.out.println("������ ������ �����߽��ϴ�.");
		}
	}
}

public class My_06_UpdateUser {

	public static void main(String[] args) throws SQLException {
		DBUpdate myDB = new DBUpdate();
		myDB.connectDB();
		myDB.getAllUser();
		myDB.updateUser();
		myDB.getAllUser();
		myDB.closeDB();
		

	}

}
