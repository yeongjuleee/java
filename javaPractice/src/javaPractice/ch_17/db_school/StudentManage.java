package javaPractice.ch_17.db_school;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
		// �ʵ�
		private ArrayList<Person> list; // �л� 
		private Scanner input;	// �Է�
		private StudentDAO studentDAO;	// �л� ���� ����
		//private ArrayList<SubjectDAO> sub;	// ���� ������ ���̽�
		private SubjectDAO subjectDAO;	// ���� ������ ���̽�
		//private ArrayList<StudentDAO> stdC;	// �л� ���� ����
		private StdClassDAO stdClassDAO;	// �л� ���� ����
		
		
		// ������
		public StudentManage() {
			studentDAO = new StudentDAO();
			subjectDAO = new SubjectDAO();
			list = new ArrayList<Person>();
			input = new Scanner(System.in);
			//sub = new ArrayList<SubjectDAO>();
			//stdC = new ArrayList<StudentDAO>();
			stdClassDAO = new StdClassDAO();
		}
		
		// DB ���� ����
		public void disConnect() {
			studentDAO.disConnect();
		}
		
		// 0. �л� ��ȸ
		private Person findStudentTraverse(int stdNum) {
			// �ش� �ڵ� ã��
			for (Person std : list) {
				if(std.getStudentNumber() == stdNum) {
					return std;
				}
			}
			return null;
		}
		
		// 0. �ߺ� �й� ã��
		private boolean isStudent(int stdNum) {
			return (findStudentTraverse(stdNum) == null) ? false : true;
		}
		
		// 0. �й� �Է��ϱ�
 		public int stdNum() { 
			System.out.print("�л��� �й��� �Է��ϼ��� >> ");
			int studentNumber = input.nextInt();
			return studentNumber;
		}
		

		// 1. �л� �߰�
		public void addStudent() { 		
			Person std = new Person();
			int studentNumber = stdNum();	
			
			// �Է��� �й����� ���ο� �л��� �����ϱ�
			if(studentDAO.isStudent(studentNumber)) {
				System.out.print("\n�̹� �����ϴ� �й��Դϴ�. \n�ٸ� ��ȣ�� �Է��� �ּ���. \n \n");
			}
			else {
				std.setStudentNumber(studentNumber);
				System.out.print("�̸��� �Է��ϼ��� >> ");
				std.setName(input.next());	// ���ڿ� �Է� �޾� setName�� ����
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� >> ");
				std.setPhoneNumber(input.next());
				System.out.print("�޸� �Է��ϼ��� >> ");
				std.setMemo(input.next());
				studentDAO.insertStudent(std);
				
				System.out.println("�л� �߰��� �Ϸ�Ǿ����ϴ�." + "\n");
			}
			
		}
		
		// 2. �л� ���� 
		public void removeStudent() { 
			Person std = new Person();
			int studentNumber = stdNum();
			std.setStudentNumber(studentNumber);
			
			// �Է��� �й����� �л� �����ϱ� 
			if(!studentDAO.isStudent(studentNumber)) {
				System.out.println("Error: �������� �ʴ� �й��Դϴ�!!");
			}
			else {
				studentDAO.deleteStudent(std);
				System.out.println("�л� ������ �Ϸ�Ǿ����ϴ�. \n");
			}
		}
/*		
		// 3. ���� ��û
		public void addClass() {
			
			while(true) { // �޴� �ȿ� �޴�
				System.out.println("�޴��� ������ �ּ���. 1. ���� ��û / 2. ���� ��� / 3. ��������");
				int subjectMenu = input.nextInt();
				
				switch(subjectMenu) {
					case 1: // 1. ���� ���
						setClass();
						break;
					
					case 2: // 2. ���� ���
						cancleClass();
						break;
						
					case 3: // 3. ��������
						return;
						
					default:
						System.out.println("�߸��� �Է��Դϴ�.");
				}
			}
			
		}
		
		// ������û 3-1. ���� ��û
		public void setClass() {
			StdClassDTO stdClassDTO = new StdClassDTO();
			
			System.out.println("���� ��û �� ������ �ڵ带 �Է��ϼ���: ");
	          stdClassDTO.setSubjectCode(input.nextInt());
	          System.out.println("������û�� �л��� �й��� �Է��ϼ���: ");          
	          stdClassDTO.setStudentNumber(input.nextInt());
	          
	          if(stdClassDAO.insertClass(stdClassDTO)) {
	        	  System.out.println("������û�� �Ϸ� �Ǿ����ϴ�.");
	          }
	          else {
	        	  System.out.println("���� ��û�� �����߽��ϴ�.");
	          }
		}
		
		// ������û 3-2. ���� ���
		public void cancleClass() {
			StdClassDTO stdDTO = new StdClassDTO();
			
			System.out.println("���� ����� ���� ��ȣ�� �Է����ּ���: ");
			stdDTO.setSubjectCode(input.nextInt());
			System.out.println("���� ����� �л��� �й��� �Է����ּ���: ");
			stdDTO.setSubjectCode(input.nextInt());
			
			if(stdClassDAO.deleteSubject(stdDTO)) {
				System.out.println("���� ��Ұ� �Ϸ�Ǿ����ϴ�.");
			}
			else {
				System.out.println("���� ��ҿ� �����߽��ϴ�.");
			}
		}
		
*/
		// 3. ������û
		// 3-1. ���� ��� ���
	   private void printSubject() {
	      SubjectDTO subject = new SubjectDTO();
	      ArrayList<SubjectDTO> list = subjectDAO.selectAll();
	      
	      for(SubjectDTO subject3 : list) {
	         System.out.println("�����ڵ� : " + subject3.getCode() + " " + "�����̸� : " + subject3.getSubjectName() );
	      }
	   }
	   private void printCourse() {
	      StdClassDTO course = new StdClassDTO();
	      ArrayList<StdClassDTO> list = stdClassDAO.selectAll();
	      for(StdClassDTO course2 : list) {
	         System.out.println("�����ڵ� : " + course2.getSubjectCode() + " " + "�����̸�: " + course2.getStudentNumber());
	      }
	      
	   }
		
		
		// 3-2. ������û
		public  void addClass() {
	 		System.out.println("�л��� �й��� �Է��ϼ���. >>>");
	 		int studentNumber = input.nextInt(); //�й� �Է¹���

	 		while(true) {
	 			System.out.println("�޴��� �����ϼ��� : 1. ������û / 2. �������� / 3. ����");
	 			int classMenu = input.nextInt();
	 			switch(classMenu){
	 				case 1:
	 				    printSubject();
	 					System.out.println("������û �� ���� �ڵ带 �����ϼ��� : ");

	 					int code =input.nextInt();
	 					StdClassDTO course = new StdClassDTO();
	 					course.setSubjectCode(code);
	 					course.setStudentNumber(studentNumber);
	 					stdClassDAO.insertCourse(course);

	 					System.out.println("�й� " + studentNumber+ " �л��� " + code + " ������ ������û�Ϸ��߽��ϴ�.");
	 					break;
	 				case 2:
	 					System.out.println("���� ���� �� �����ڵ带 �����ϼ��� : ");
	 					int code2 = input.nextInt();
	 						stdClassDAO.deleteCourse(code2);
	 						System.out.println("������ �����߽��ϴ�.");
	 					break;
	 				case 3:
	 					return;
	 			}
	 		}
	 	}
		
		// 4. ���� �Է�
		public void setScore() { 
			int studentNumber = stdNum();
			
			Person newStudent = findStudentInform(studentNumber);
			if(newStudent == null) { // ���� ���� �л� ������ ���ٸ�,
				System.out.println("Error: �л��� �������� �ʽ��ϴ�.");
				return;	// �޼ҵ� ����
			}
			
			while(true) { // ������ �Է��ϱ� ���� ������ ���� ����.
				System.out.println("������ �Է�/���� �� ������ �����ϼ��� " + toString() + " / 5. ����");
				int classMenu = input.nextInt();
				if(classMenu == 5) { // ���� üũ
					break; // while�� ����
				}
				

				System.out.print("������ �Է��ϼ���. >>> ");
				int score = input.nextInt();
				if(score < 0 || score > 100) { // ������ 0 ~ 100 �������� Ȯ��
					System.out.println("Error: ������ 0���� 100 ������ ���ڸ� �Է��� �ּ���!");
					continue;	// ó������ ���ư�
				}
				
			}
		}
		
		// 5. �л� ���� ��ȸ (�� �ܰ�)
		public Person findStudentInform(int studentNumber) {
			for (Person student : list) {
				if (student.getStudentNumber() == studentNumber) {
					System.out.println("�ش� �л��� ������ ������ �����ϴ�.");
					System.out.println("�̸�: " + student.getName());
					System.out.println("��ȭ��ȣ: " + student.getPhoneNumber());
					System.out.println("�޸�: " + student.getMemo());
					return student;
				}
			} return null;
		}
		
		// 5. ���� ��ȸ
		public void infoStudent() { 
			System.out.println("�޴��� ������ �ּ��� 1. Ư�� �л��� / 2. ��ü �л�");
			int menu = input.nextInt();
			switch(menu) {
				case 1 : // Ư�� �л��� ���� ����
					One();
					break;
					
				case 2 : // ��ü �л��� ���� ����
					All();
					break;
			}
		}
		
		private void One() {
			int studentNumber = stdNum();
			
			Person std = studentDAO.selectOne(studentNumber);
			if(std != null ) { // ���� ���� �л��� ������ �ִٸ�
				printStudent(std);
			}
			else {
				System.out.println("�й� ��ȸ�� �����߽��ϴ�.");
			}
		}
		
		private void All() {
			ArrayList<Person> Studentlist = studentDAO.selectAll();
		      for (Person student : Studentlist) {
		         printStudent(student);
		      }      
		}
		
		private void printStudent(Person student) { // ������ȸ ��� �޼ҵ�
			System.out.println("�й�: " + student.getStudentNumber());
			System.out.println("�̸�: " + student.getName());
			System.out.println("��ȭ��ȣ: " + student.getPhoneNumber());
			System.out.println("�޸�: " + student.getMemo());
			System.out.println("���� �������� ����� ���� >>> ");
			
		}
		
		// 6. �������� ����
		public void subjectInfo() {
			
			while(true) { // �޴� �ȿ� �޴�
				System.out.println("�޴��� ������ �ּ���. 1. ���� ��� / 2. ���� ���� / 3. ��������");
				int subjectMenu = input.nextInt();
				
				switch(subjectMenu) {
					case 1: // 1. ���� ���
						addSubject();
						break;
					
					case 2: // 2. ���� ����
						removeSubject();
						break;
						
					case 3: // 3. ��������
						return;
						
					default:
						System.out.println("�߸��� �Է��Դϴ�.");
				}
			}
			
		}
		
		// 6-1. ���� ���
		private void addSubject() {
			SubjectDTO subject = new SubjectDTO();
			System.out.println("����� ���� ��ȣ�� �Է��� �ּ���: ");
			int code = input.nextInt();
			
	
			if(subjectDAO.isSubject(code)) {
				System.out.println("\n�̹� �����ϴ� ���ǹ�ȣ �Դϴ�. \n�ٸ� ��ȣ�� �Է��� �ּ���. \n \n");
			}
			else {
				subject.setCode(code);
				System.out.println("���� �̸��� �Է��ϼ��� >>> ");
				subject.setSubjectName(input.next());
				
				if(subjectDAO.insertSubject(subject)) {
					System.out.println("������ ��� �Ǿ����ϴ�.");
				}
				else {
					System.out.println("���� ��Ͽ� �����߽��ϴ�.");
				}
			}
			
		}
		
		// 6-2. ���� ����
		private void removeSubject() {
			SubjectDTO subject = new SubjectDTO();
			System.out.println("������ ���� ��ȣ�� �Է��� �ּ���: ");
			int code = input.nextInt();
			
			subject.setCode(code);
			
			if(!subjectDAO.isSubject(code)) {
				System.out.println("Error: �������� �ʴ� ���� ��ȣ �Դϴ�!!");
			}
			else {
				subjectDAO.deleteSubject(subject);
				System.out.println("����  ������ �Ϸ� �Ǿ����ϴ�.");
			}
		}

}
