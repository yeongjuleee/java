package javaPractice.ch_17.db_school;

import java.sql.Connection;

public class SubjectDTO {
	// 필드
	private int code;	// 과목 코드
	private String subjectName;	// 과목 이름

	
	// 생성자
	public SubjectDTO() {
	}
	
	public SubjectDTO(int code, String subjectName) {
		this.code = code;
		this.subjectName = subjectName;
	}
	
	// 메소드 (getter, setter)
		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}

		public String getSubjectName() {
			return subjectName;
		}

		public void setSubjectName(String subjectName) {
			this.subjectName = subjectName;
		}
		
}
