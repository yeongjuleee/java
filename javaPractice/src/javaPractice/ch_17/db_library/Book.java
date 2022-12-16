package javaPractice.ch_17.db_library;

public class Book {
	// �ʵ�(�Ӽ�)
	private int code; // å �ڵ�
	private String name; // å ����
	private String writer;	// �۰�
	private int count;	// ���
	
	// ������
	public Book() {}
	
	public Book (int code, String name, String writer, int count) {
		this.code = code;
		this.name = name;
		this.writer = writer;
		this.count = count;
	}
	
	// �޼ҵ� (getter, setter)
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	@Override
	public String toString() {
		return "�ڵ� :" + code + " / ���� : " + name + " / �۰� : " + writer + " / ��� : " + count + "��";
	}
	
}
