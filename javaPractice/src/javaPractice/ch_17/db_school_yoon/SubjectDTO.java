package javaPractice.ch_17.db_school_yoon;

import java.sql.Connection;

public class SubjectDTO {
	
	
	private int code;
	private String subjectName;
	
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
	
	public SubjectDTO () {
		
	}
	public SubjectDTO(int code, String subjectName) {
	
		this.code = code;
		this.subjectName = subjectName;
	}
	
	
	
	
	
}
