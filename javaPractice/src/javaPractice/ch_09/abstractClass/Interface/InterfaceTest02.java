package javaPractice.ch_09.abstractClass.Interface;

interface DataAccessObjcet {
	void insert();
	void select();
	void update();
	void delete();
}

class OracleData implements DataAccessObjcet {

	@Override
	public void insert() {
		System.out.println("Oracle DB�� ����");
		
	}

	@Override
	public void select() {
		System.out.println("Oracle DB���� �˻�");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB�� ����");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB���� ����");
		
	}
	
}

class MySqlData implements DataAccessObjcet {

	@Override
	public void insert() {
		System.out.println("MySql DB�� ����");
		
	}

	@Override
	public void select() {
		System.out.println("MySql DB���� �˻�");
		
	}

	@Override
	public void update() {
		System.out.println("MySql DB�� ����");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql DB���� ����");
		
	}
	
	
}
public class InterfaceTest02 {
	/*
		DataAccessObject �������̽��� �� �������̽��� �����ϴ� OracleData, MySqlData Ŭ������ �ִ�.
		���� Ŭ������ ���� ��� ����� ������ ���� �� �������̽��� Ŭ������ ����� �ϼ��϶�
	*/
	
	public static void dbWork(DataAccessObjcet dao) {
		dao.insert();
		dao.select();
		dao.update();
		dao.delete();
	}
	
	
	
	public static void main(String[] args) {
		dbWork(new OracleData());
		dbWork(new MySqlData());
		
	/*
		Oracle DB�� ����
		Oracle DB���� �˻�
		Oracle DB�� ����
		Oracle DB���� ����
		
		MySql DB�� ����
		MySql DB���� �˻�
		MySql DB�� ����
		MySql DB���� ����
	*/

	}

}
