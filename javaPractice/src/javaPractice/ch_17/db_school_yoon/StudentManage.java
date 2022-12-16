package javaPractice.ch_17.db_school_yoon;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import account_1213.Account;

public class StudentManage {
	
	private ArrayList<Student> Studentlist;	
	private ArrayList<SubjectDTO> Subjectlist;
	private Scanner input;
	private StudentDAO studentDAO;
	private SubjectDAO subjectDAO;
	private StdClassDAO stdClassDAO;
	
	
	public StudentManage() {
		studentDAO = new StudentDAO();
		studentDAO.getConnStudent();
		
		subjectDAO = new SubjectDAO();
		subjectDAO.getConnStudent();
		
		stdClassDAO = new StdClassDAO();
		stdClassDAO.getConnStudent();

		
		Studentlist = new ArrayList<Student>();
		input = new Scanner(System.in);
	}
	
	//�л� ���� ã��
	public Student findStudentInform(int studentNumber) {
		for (Student student: Studentlist) {
			if(student.getStudentNumber() == studentNumber) {
				System.out.println("�ش� �л��� ������ ������ �����ϴ�");
				System.out.println("�̸� : " + student.getName());
				System.out.println("��ȭ��ȣ : " +student.getPhoneNumber());
				System.out.println("�޸� : "+student.getMemo());
				return student;			
			}
		}return null;
	}	

	private Student findAccount(int studentNumber) {
		//�Ա�, ���, ��ȸ �� ���� ã��
		Student student = findStudentInform(studentNumber);
		if (student == null) {
			System.out.println("�л��� ã�� �� �����ϴ�.");
		}
		return student;
	}
	
	
	
	//�л� �߰� �� ����..�� ����
	public void addStudent() {
		Student student = new Student();
		
		System.out.print("�л��� �й��� �Է��ϼ���. >>>");
		int studentNumber = input.nextInt();
		
		if(studentDAO.isStudent(studentNumber)) {
			System.out.println("�̹� �����ϴ� �й��Դϴ�.");			
		}
		else {
			student.setStudentNumber(studentNumber);
			
			System.out.print("�л��� �̸��� �Է��ϼ���. >>>");
			student.setName(input.next());
			System.out.print("�л��� ��ȭ��ȣ�� �Է��ϼ���. >>>");
			student.setPhoneNumber(input.next());
			System.out.print("�޸� �Է��ϼ���. >>>");
			student.setMemo(input.next());
			
			System.out.println("�л� �߰� �Ϸ� \n");			
			
			if(studentDAO.insertStudent(student)) {
				System.out.println("�л� ������ ��ϵǾ����ϴ�.");
					
			}
			else {
				System.out.println("�л� ���� ��Ͽ� �����߽��ϴ�.");
			}
		}
	}	
				
	//�л� ����
	public void removeStudent() {
		
		Student student = new Student();
		System.out.print("�л��� �й��� �Է��ϼ���. >>>");
		int studentNumber = input.nextInt();
		student.setStudentNumber(studentNumber);
		
		if(studentDAO.isStudent(studentNumber)) {
			studentDAO.deleteStudent(student);			
			System.out.println("�л� ������ �����߽��ϴ�.");
		}
		else {
			System.out.println("�й� ��ȸ�� �����߽��ϴ�.");
		}
		
		
	}		
	
	public void addClass() { // ���� ��û
		
      while(true) { // �޴� �ȿ� �޴�
          System.out.println("�޴��� �����ϼ���: 1. ������û / 2. ������� / 3. ����");
          int classMenu = input.nextInt();
          switch(classMenu) {
             case 1 :            	 
                setClass();                
                break;
             
             case 2 : 
                cancleClass();               
                break;
                
             case 3 :
                return;
          }
       }
   }
	
	public void setClass() {
		StdClassDTO stdClassDTO = new StdClassDTO();		
		
		System.out.println("���� ��û �� ������ �ڵ带 �Է��ϼ���. >>>");
   	 	stdClassDTO.setCode(input.nextInt());
   	 	System.out.println("������û�� �л��� �й��� �Է��ϼ���. >>>");   	 	
   	 	stdClassDTO.setStudentNumber(input.nextInt());

	
		if(stdClassDAO.insertClass(stdClassDTO)) {
			System.out.println("���� ��û�� �Ϸ�Ǿ����ϴ�.");						
		}
		else {
			System.out.println("���� ��û�� �����߽��ϴ�.");
		}		
					   	 	
	}
	
	public void cancleClass() {
		StdClassDTO stdClassDTO = new StdClassDTO();		
		
		System.out.println("���� ��� �� ������ �ڵ带 �Է��ϼ���. >>>");
   	 	stdClassDTO.setCode(input.nextInt());
   	 	System.out.println("���� ����� �л��� �й��� �Է��ϼ���. >>>");   	 	
   	 	stdClassDTO.setStudentNumber(input.nextInt());

	
		if(stdClassDAO.deleteClass(stdClassDTO)) {
			System.out.println("���� ��Ұ� �Ϸ�Ǿ����ϴ�.");						
		}
		else {
			System.out.println("���� ��ҿ� �����߽��ϴ�.");
		}		
	}


	//���� �Է�		
	/*public void setScore() {
		System.out.print("�л��� �й��� �Է��ϼ���. >>>");
		int studentNumber = input.nextInt();
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {
			//���� ������ �л��� ������ ���ٸ�
			System.out.println("Error : �л��� �������� �ʽ��ϴ�!");
			return;
		}
		while(true) {
			System.out.println("������ �����ϼ���: " +className.toString()+ "����");
			int classMenu = input.nextInt();
			if(classMenu == 4) {
				break;
			}
			if(!newStudent.getClassCheck()[classMenu-1]) {
				System.out.println(className.get(classMenu-1)+"�� �̽�û �����Դϴ�");
				continue;	//�̽�û �����̱� ������ ó������ ���ư�
			}
			System.out.print("������ �Է��ϼ���. >>>");
			int score = input.nextInt();
			if(score < 0 || score >100) {
				System.out.println("Error : ������ 0~100������ �Է��� �� �ֽ��ϴ�");
				continue;
			}
			//�������� ����� ������ �Էµ� ���
			newStudent.setClassScore(classMenu-1,score);
			//�ش� �л��� score�� ������Ʈ
			System.out.println(className.get(classMenu-1)+"�� ���� �Է��� �Ϸ�Ǿ����ϴ�.");
		}
						
	}
	*/
	
	public void subjectManage() {
		
		System.out.println("�޴��� �������ּ��� >> 1. ���� ��� / 2. ���� ���� / 3. ���� �޴���");		
		int sub = input.nextInt();
		
		SubjectDTO subjectDTO = new SubjectDTO();
		switch(sub) {
		case 1:
			addSubject();
			break;
		case 2:
			removeSubject();
			break;
		case 3:
			return;
		default :
		    System.out.print( "�߸� �Է��Ͽ����ϴ�." ) ;
		
		}
	}
	
	public void addSubject() {
		SubjectDTO subjectDTO = new SubjectDTO();
		
		System.out.print("����� ���� �ڵ带 �Է��ϼ���. >>>");
		int code = input.nextInt();
		
		if(subjectDAO.isSubject(code)) {
			System.out.println("�̹� �����ϴ� �й��Դϴ�.");			
		}
		else {
			subjectDTO.setCode(code);
			
			System.out.print("������ �̸��� �Է��ϼ���. >>>");
			subjectDTO.setSubjectName(input.next());			
								
			if(subjectDAO.insertSubject(subjectDTO)) {
				System.out.println("������ ��ϵǾ����ϴ�.");
					
			}
			else {
				System.out.println("���� ��Ͽ� �����߽��ϴ�.");
			}
		}
	}	
	
	public void removeSubject() {
		
		SubjectDTO subjectDTO = new SubjectDTO();
		System.out.print("���� �ڵ带 �Է��ϼ���. >>>");
		int code = input.nextInt();
		subjectDTO.setCode(code);
		
		if(subjectDAO.isSubject(code)) {
			subjectDAO.deleteSubject(subjectDTO);			
			System.out.println("�ش� ������ �����߽��ϴ�.");
		}
		else {
			System.out.println("���� ��ȸ�� �����߽��ϴ�.");
		}
		
		
	}		
	
	//�л� ���� ��ȸ
	public void informStudent() {
		System.out.println("�޴��� �������ּ��� >> 1. Ư�� �л��� / 2. ��ü �л�");
		int menu = input.nextInt();
		switch(menu) {
		case 1:
			One();
			break;
		case 2:
			All();
			break;
		
		}
	}
	
	//���� ��ȸ
	public void One() {
		System.out.print("�л��� �й��� �Է��ϼ���. >>>");
		int studentNumber = input.nextInt();
		
		Student student = studentDAO.selectOne(studentNumber);
		if(student != null) {
			printStudent(student);
		}
		else {
			System.out.println("�й� ��ȸ�� �����߽��ϴ�.");
		}
			
	}
	//��ü ��ȸ
	public void All() {
		ArrayList<Student> Studentlist = studentDAO.selectStudent();
		for (Student student : Studentlist) {
			printStudent(student);
		}		
	}
	
	//����Ʈ �޼ҵ�
	private void printStudent(Student student) {
		System.out.println("�й� : "+student.getStudentNumber());
		System.out.println("�̸� : "+student.getName());
		System.out.println("��ȭ��ȣ : "+student.getPhoneNumber());
		System.out.println("�޸� : "+student.getMemo());
		
		}	
	
	private void printSubject(SubjectDTO subjectDTO) {
		System.out.println("���� �ڵ� : "+subjectDTO.getCode());
		System.out.println("���� �̸� : "+subjectDTO.getSubjectName());
	}
}

