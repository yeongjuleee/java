package javaPractice.ch_07.student2;


class StudentRecord {
	final int MAX_STUDENT_CNT = 3;
	StudentData[] students = new StudentData[MAX_STUDENT_CNT];
	int index = 0;
	
	void insertStudent(String name, int ban, int no, int kor, int eng, int math) {
		if (index < MAX_STUDENT_CNT) {			
			students[index] = new StudentData(name, ban, no);
			students[index].setKor(kor);
			students[index].setEng(eng);
			students[index].setMath(math);
			index++;
		}
	}
	void printTotal() {
		for (StudentData s : students) {
			System.out.println(s.getName() + "ÃÑÁ¡: " + (s.getKor() + s.getEng() + s.getMath()));
		}
	}
}


class StudentData { // ÇÐ»ý ¸ðµ¨
	private String name;
	private int ban, no, kor, eng, math;
	int total;
	
	StudentData(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
}



public class DefaultConstructor12 {

	public static void main(String[] args) {
		// 
		StudentRecord sr = new StudentRecord();
		sr.insertStudent("Ã¶¼ö",1, 1, 90, 80, 90);
		sr.insertStudent("Â¯±¸",1, 2, 100, 70, 70);
		sr.insertStudent("ÈÆÀÌ",1, 3, 80, 70, 100);

		
		sr.printTotal();
	}

}
