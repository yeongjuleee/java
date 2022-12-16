package javaPractice.ch_17.db_library;

public class Book {
	// 필드(속성)
	private int code; // 책 코드
	private String name; // 책 제목
	private String writer;	// 작가
	private int count;	// 재고
	
	// 생성자
	public Book() {}
	
	public Book (int code, String name, String writer, int count) {
		this.code = code;
		this.name = name;
		this.writer = writer;
		this.count = count;
	}
	
	// 메소드 (getter, setter)
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
		return "코드 :" + code + " / 제목 : " + name + " / 작가 : " + writer + " / 재고 : " + count + "권";
	}
	
}
