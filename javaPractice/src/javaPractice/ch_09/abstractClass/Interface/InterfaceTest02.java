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
		System.out.println("Oracle DB에 삽입");
		
	}

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
		
	}
	
}

class MySqlData implements DataAccessObjcet {

	@Override
	public void insert() {
		System.out.println("MySql DB에 삽입");
		
	}

	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
		
	}

	@Override
	public void update() {
		System.out.println("MySql DB를 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
		
	}
	
	
}
public class InterfaceTest02 {
	/*
		DataAccessObject 인터페이스와 이 인터페이스를 구현하는 OracleData, MySqlData 클래스가 있다.
		메인 클래스를 보고 출력 결과가 다음과 같을 때 인터페이스와 클래스를 만들어 완성하라
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
		Oracle DB에 삽입
		Oracle DB에서 검색
		Oracle DB를 수정
		Oracle DB에서 삭제
		
		MySql DB에 삽입
		MySql DB에서 검색
		MySql DB를 수정
		MySql DB에서 삭제
	*/

	}

}
