package javaPractice.ch_17.db_school;

import java.sql.Connection;

public class SubjectDTO {
	// �ʵ�
	private int code;	// ���� �ڵ�
	private String subjectName;	// ���� �̸�

	
	// ������
	public SubjectDTO() {
	}
	
	public SubjectDTO(int code, String subjectName) {
		this.code = code;
		this.subjectName = subjectName;
	}
	
	// �޼ҵ� (getter, setter)
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
