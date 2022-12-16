package javaPractice.ch_10.exceptionHandling;

class IDFormatException extends Exception {
	public IDFormatException (String message) {
		super(message);
	}
}

public class MyException09 { 
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		// ���ܰ� �߻��ϸ� IDFormatException���� ����(=throws)
		
		if (userID == null) {
			throw new IDFormatException("���̵�� null�� �� �����ϴ�.");
		}
		else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������");
		}
		
		this.userID = userID;
	}

	public static void main(String[] args) {
		
		MyException09 test = new MyException09();
		String userID = null;
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}

		userID = "1234567";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
